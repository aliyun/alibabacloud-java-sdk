// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ResumeJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>de48407d-309e-451a-81ec-6fb11f8fdbf3</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
     */
    @NameInMap("JobId")
    public java.util.List<String> jobId;

    /**
     * <strong>example:</strong>
     * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
     */
    @NameInMap("JobReferenceId")
    public java.util.List<String> jobReferenceId;

    /**
     * <strong>example:</strong>
     * <p>b016fbdb-b81c-4c06-8870-cb36b8783b6d</p>
     */
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
