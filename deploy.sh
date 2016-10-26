#!/bin/bash

rm ~/.ssh/known_hosts -f
rm ~/.ssh/config -f

cat << EOF > ~/.ssh/config
Host bw
  User $DEPLOY_ERRORCANT_USER
  HostName $DEPLOY_ERRORCANT_HOST
  Port $DEPLOY_ERRORCANT_PORT
EOF

ERRORCANT_WEB_JAR=`ls errorcant-web/build/libs/errorcant-*.jar`

expect << EOF
#!/usr/bin/expect -f
spawn /usr/bin/rsync -auv $ERRORCANT_WEB_JAR bw:/var/errorcant/errorcant-web.jar
expect "(yes/no)"
send "yes\n"
expect "assword:"
send "$DEPLOY_ERRORCANT_PASSWORD\n"
interact
EOF

ERRORCANT_API_JAR=`ls errorcant-api/build/libs/errorcant-api-*.jar`

expect << EOF
#!/usr/bin/expect -f
spawn /usr/bin/rsync -auv $ERRORCANT_API_JAR bw:/var/errorcant/errorcant-api.jar
expect "assword:"
send "$DEPLOY_ERRORCANT_PASSWORD\n"
interact
EOF

