// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class BasicResourceSetting extends TeaModel {
    /**
     * <p>The resource configuration of the JobManager.</p>
     */
    @NameInMap("jobmanagerResourceSettingSpec")
    public BasicResourceSettingSpec jobmanagerResourceSettingSpec;

    /**
     * <p>The parallelism for a deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("parallelism")
    public Long parallelism;

    /**
     * <p>The resource configuration of a TaskManager.</p>
     */
    @NameInMap("taskmanagerResourceSettingSpec")
    public BasicResourceSettingSpec taskmanagerResourceSettingSpec;

    public static BasicResourceSetting build(java.util.Map<String, ?> map) throws Exception {
        BasicResourceSetting self = new BasicResourceSetting();
        return TeaModel.build(map, self);
    }

    public BasicResourceSetting setJobmanagerResourceSettingSpec(BasicResourceSettingSpec jobmanagerResourceSettingSpec) {
        this.jobmanagerResourceSettingSpec = jobmanagerResourceSettingSpec;
        return this;
    }
    public BasicResourceSettingSpec getJobmanagerResourceSettingSpec() {
        return this.jobmanagerResourceSettingSpec;
    }

    public BasicResourceSetting setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public BasicResourceSetting setTaskmanagerResourceSettingSpec(BasicResourceSettingSpec taskmanagerResourceSettingSpec) {
        this.taskmanagerResourceSettingSpec = taskmanagerResourceSettingSpec;
        return this;
    }
    public BasicResourceSettingSpec getTaskmanagerResourceSettingSpec() {
        return this.taskmanagerResourceSettingSpec;
    }

}
