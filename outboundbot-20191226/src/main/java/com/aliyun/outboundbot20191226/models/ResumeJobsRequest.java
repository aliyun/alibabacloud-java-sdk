// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ResumeJobsRequest extends TeaModel {
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

    public static ResumeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeJobsRequest self = new ResumeJobsRequest();
        return TeaModel.build(map, self);
    }

    public ResumeJobsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ResumeJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResumeJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public ResumeJobsRequest setJobId(java.util.List<String> jobId) {
        this.jobId = jobId;
        return this;
    }
    public java.util.List<String> getJobId() {
        return this.jobId;
    }

    public ResumeJobsRequest setJobReferenceId(java.util.List<String> jobReferenceId) {
        this.jobReferenceId = jobReferenceId;
        return this;
    }
    public java.util.List<String> getJobReferenceId() {
        return this.jobReferenceId;
    }

    public ResumeJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

}
