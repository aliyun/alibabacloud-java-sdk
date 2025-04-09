// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CancelJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>9f84892d-721a-4069-9975-668c8164d64e</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>edf45790-7200-4cbc-b157-8c0a5f400b75</p>
     */
    @NameInMap("JobId")
    public java.util.List<String> jobId;

    /**
     * <strong>example:</strong>
     * <p>4a875676-b136-4087-88b4-de67c61fed69</p>
     */
    @NameInMap("JobReferenceId")
    public java.util.List<String> jobReferenceId;

    /**
     * <strong>example:</strong>
     * <p>9cef0dd3-b9d6-4748-9a6f-77a8c3402bb1</p>
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
