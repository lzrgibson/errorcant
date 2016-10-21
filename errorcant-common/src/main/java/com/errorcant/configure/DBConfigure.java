package com.errorcant.configure;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by yel on 10/20/16.
 */
@SpringBootApplication
@EnableMongoAuditing
@EnableMongoRepositories("com.errorcant.dao")
public class DBConfigure {
}
