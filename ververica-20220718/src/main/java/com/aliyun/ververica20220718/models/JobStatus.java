// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobStatus extends TeaModel {
    /**
     * <p>The status of the current job. Valid values:</p>
     * <ul>
     * <li>STARTING</li>
     * <li>RUNNING</li>
     * <li>CANCELLING</li>
     * <li>FAILED</li>
     * <li>CANCELLED</li>
     * <li>FINISHED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("currentJobStatus")
    public String currentJobStatus;

    /**
     * <p>The information about the job failure. This parameter is valid when the value of the currentJobStatus parameter is FAILED.</p>
     */
    @NameInMap("failure")
    public JobFailure failure;

    @NameInMap("healthScore")
    public Integer healthScore;

    @NameInMap("riskLevel")
    public String riskLevel;

    /**
     * <p>The details of the job. This parameter is valid when the value of the currentJobStatus parameter is RUNNING.</p>
     */
    @NameInMap("running")
    public JobStatusRunning running;

    public static JobStatus build(java.util.Map<String, ?> map) throws Exception {
        JobStatus self = new JobStatus();
        return TeaModel.build(map, self);
    }

    public JobStatus setCurrentJobStatus(String currentJobStatus) {
        this.currentJobStatus = currentJobStatus;
        return this;
    }
    public String getCurrentJobStatus() {
        return this.currentJobStatus;
    }

    public JobStatus setFailure(JobFailure failure) {
        this.failure = failure;
        return this;
    }
    public JobFailure getFailure() {
        return this.failure;
    }

    public JobStatus setHealthScore(Integer healthScore) {
        this.healthScore = healthScore;
        return this;
    }
    public Integer getHealthScore() {
        return this.healthScore;
    }

    public JobStatus setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public JobStatus setRunning(JobStatusRunning running) {
        this.running = running;
        return this;
    }
    public JobStatusRunning getRunning() {
        return this.running;
    }

}
