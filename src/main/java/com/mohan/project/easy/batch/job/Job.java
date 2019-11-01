package com.mohan.project.easy.batch.job;

/**
 * @author mohan
 */
public interface Job {

    JobInstance doJob(JobParameter jobParameter);
}
