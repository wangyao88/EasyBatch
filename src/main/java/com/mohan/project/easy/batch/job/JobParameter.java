package com.mohan.project.easy.batch.job;

import com.google.common.collect.Maps;
import lombok.Data;

import java.util.Map;

/**
 * @author mohan
 */
@Data
public class JobParameter {

    private JobLauncher jobLauncher;
    private Map<String, Object> parameters = Maps.newConcurrentMap();
}
