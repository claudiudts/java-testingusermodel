package com.lambdaschool.usermodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the application.
 */
// @EnableJpaAuditing
@SpringBootApplication
public class UserModelApplicationTesting
{
    /**
     * Main method to start the application.
     *
     * @param args Not used in this application.
     */
    public static void main(String[] args)
    {
        SpringApplication.run(UserModelApplicationTesting.class,
            args);
    }
    // this is a copy of the main application
    // the naming is using Test or Testing, for this project its called UserModelApplicaitonTESTING, we could of used TEST as well
    // we do not want to test auditing, that is why we turn it OFF


}
