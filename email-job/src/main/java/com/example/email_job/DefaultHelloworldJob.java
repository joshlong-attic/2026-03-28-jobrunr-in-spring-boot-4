package com.example.email_job;

import org.jobrunr.jobs.annotations.Job;
import org.jobrunr.jobs.annotations.Recurring;
import org.springframework.stereotype.Service;

@Service
public class DefaultHelloworldJob
        implements HelloworldJob {

    @Recurring(id = "my-recurring-job", cron = "0 0/15 * * *")
    @Job(name = "My recurring job")
    public void doRecurringJob() {
        IO.println("Doing some work without arguments");
    }


}
