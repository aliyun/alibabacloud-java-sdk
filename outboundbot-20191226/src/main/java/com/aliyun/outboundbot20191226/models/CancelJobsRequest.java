// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CancelJobsRequest extends TeaModel {
    /**
     * <p>Specifies whether to cancel all jobs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A filter condition. The task group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9f84892d-721a-4069-9975-668c8164d64e</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>A filter condition. The job ID.</p>
     * <blockquote>
     * <p>The JobId parameter is required when the All parameter is set to false.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>edf45790-7200-4cbc-b157-8c0a5f400b75</p>
     */
    @NameInMap("JobId")
    public java.util.List<String> jobId;

    /**
     * <p>A filter condition. The reference ID of the job.</p>
     * <blockquote>
     * <p>This is the ReferenceId that you specified when you uploaded the contact list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4a875676-b136-4087-88b4-de67c61fed69</p>
     */
    @NameInMap("JobReferenceId")
    public java.util.List<String> jobReferenceId;

    /**
     * <p>A filter condition. The scenario ID.</p>
     * <blockquote>
     * <p>Obtain this ID by calling the DescribeJobGroup operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>35641113-b2f6-464e-a772-25c25554798b</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    public static CancelJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelJobsRequest self = new CancelJobsRequest();
        return TeaModel.build(map, self);
    }

    public CancelJobsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public CancelJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public CancelJobsRequest setJobId(java.util.List<String> jobId) {
        this.jobId = jobId;
        return this;
    }
    public java.util.List<String> getJobId() {
        return this.jobId;
    }

    public CancelJobsRequest setJobReferenceId(java.util.List<String> jobReferenceId) {
        this.jobReferenceId = jobReferenceId;
        return this;
    }
    public java.util.List<String> getJobReferenceId() {
        return this.jobReferenceId;
    }

    public CancelJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

}
