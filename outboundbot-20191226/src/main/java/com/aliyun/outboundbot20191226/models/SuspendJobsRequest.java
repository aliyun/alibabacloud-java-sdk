// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SuspendJobsRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobId")
    public java.util.List<String> jobId;

    @NameInMap("JobReferenceId")
    public java.util.List<String> jobReferenceId;

    @NameInMap("ScenarioId")
    public String scenarioId;

    public static SuspendJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendJobsRequest self = new SuspendJobsRequest();
        return TeaModel.build(map, self);
    }

    public SuspendJobsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public SuspendJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SuspendJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public SuspendJobsRequest setJobId(java.util.List<String> jobId) {
        this.jobId = jobId;
        return this;
    }
    public java.util.List<String> getJobId() {
        return this.jobId;
    }

    public SuspendJobsRequest setJobReferenceId(java.util.List<String> jobReferenceId) {
        this.jobReferenceId = jobReferenceId;
        return this;
    }
    public java.util.List<String> getJobReferenceId() {
        return this.jobReferenceId;
    }

    public SuspendJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

}
