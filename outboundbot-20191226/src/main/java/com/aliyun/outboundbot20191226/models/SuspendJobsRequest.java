// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SuspendJobsRequest extends TeaModel {
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
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>6b3ea2a1-32b3-4041-842b-9bde5de9dda0</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>11994321-e6bc-47bb-8b1c-8eef8f2f768b</p>
     */
    @NameInMap("JobId")
    public java.util.List<String> jobId;

    /**
     * <strong>example:</strong>
     * <p>de3ab269-6746-477c-b13d-bd49f13202c2</p>
     */
    @NameInMap("JobReferenceId")
    public java.util.List<String> jobReferenceId;

    /**
     * <strong>example:</strong>
     * <p>4b6dd926-3cc3-4111-a333-15d9b006fe81</p>
     */
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
