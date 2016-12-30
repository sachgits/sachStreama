
quartz {
    autoStartup = true
    jdbcStore = true
    waitForJobsToCompleteOnShutdown = true
    exposeSchedulerInRepository = true

    props {
        scheduler.skipUpdateCheck = true
    }
}

environments {
    test {
        quartz {
            autoStartup = false
        }
    }
}
