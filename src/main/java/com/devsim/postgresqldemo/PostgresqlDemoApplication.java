package com.devsim.postgresqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PostgresqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlDemoApplication.class, args);
	}

}
