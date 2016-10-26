#!/bin/bash

rm ~/.ssh/known_hosts -f
rm ~/.ssh/config -f

cat << EOF > ~/.ssh/config
Host bw
  User $DEPLOY_ERRORCANT_USER
  HostName $DEPLOY_ERRORCANT_HOST
  Port $DEPLOY_ERRORCANT_PORT
EOF

cat << EOF > /tmp/expect.sh
#!/usr/bin/expect -f
spawn /usr/bin/rsync -auv errorcant-web/build/libs/errorcant-*.jar bw:/var/errorcant/errorcant-web.jar
expect "(yes/no)"
send "yes\n"
expect "assword:"
send "$DEPLOY_ERRORCANT_PASSWORD\n"
interact
EOF

expect /tmp/expect.sh

cat << EOF > /tmp/expect.sh
#!/usr/bin/expect -f
spawn /usr/bin/rsync -auv  errorcant-api/build/libs/errorcant-api-*.jar bw:/var/errorcant/errorcant-api.jar
expect "assword:"
send "$DEPLOY_ERRORCANT_PASSWORD\n"
interact
EOF

expect /tmp/expect.sh

rm ~/.ssh/config -f
rm /tmp/expect.sh -f