// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobItem extends TeaModel {
    /**
     * <p>The algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>grpo</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>swebench-lite-grpo-qwen27b</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The creation time in UTC RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T07:00:00Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The end time in the UTC RFC 3339 format. This is consistent with the DLC GetJob operation. The job end time is used first. If the job end time is missing, the stop time is used. If both are missing, this field is not returned. The same value rule applies to sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T09:30:00Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <p>The start time in UTC RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T07:05:00Z</p>
     */
    @NameInMap("GmtRunningTime")
    public String gmtRunningTime;

    /**
     * <p>The RLJob ID. This field is required and always returned.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc5yfk7eyg95lac</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The job type. Valid value: Train.</p>
     * 
     * <strong>example:</strong>
     * <p>Train</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The model names and in-container paths associated with the job.</p>
     */
    @NameInMap("Models")
    public java.util.List<RLJobModelConfig> models;

    /**
     * <p>The reason code. This is an independent field and must not be parsed from the ReasonMessage text.</p>
     * 
     * <strong>example:</strong>
     * <p>JobStoppedByUser</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The reason description.</p>
     * 
     * <strong>example:</strong>
     * <p>Job is stopped by user.</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The job-level resource group or quota ID persisted in the current job record. This is consistent with DLC GetJob and GetRLJob, and is not the original request value. It is returned from the job record even if the execution snapshot is unreadable.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-quota</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The job configuration summary. Uses a supported subset of DLC JobSettings fields. The list returns only the current job tags in Settings.Tags. For the complete configuration, call GetRLJob.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Tags&quot;:{&quot;rls.scene&quot;:&quot;code-rl&quot;}}</p>
     */
    @NameInMap("Settings")
    public RLJobSettings settings;

    /**
     * <p>The job status. Uses the same vocabulary as DLC ValidJobStatus: Creating, Queuing, Running, Stopping, Succeeded, Failed, or Stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The substatus. Examples include Evaluating, WritingResults, EarlyStopped, Validating, Deleting, and Archived.</p>
     * 
     * <strong>example:</strong>
     * <p>Evaluating</p>
     */
    @NameInMap("SubStatus")
    public String subStatus;

    /**
     * <p>The training and sampling execution mode that takes effect for the job. Valid values: ColocateSync and DisaggregateAsync.</p>
     * 
     * <strong>example:</strong>
     * <p>ColocateSync</p>
     */
    @NameInMap("TrainerMode")
    public String trainerMode;

    /**
     * <p>The ID of the user who submitted the job. This has the same meaning as UserId in DLC.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RLJobItem build(java.util.Map<String, ?> map) throws Exception {
        RLJobItem self = new RLJobItem();
        return TeaModel.build(map, self);
    }

    public RLJobItem setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public RLJobItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RLJobItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public RLJobItem setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public RLJobItem setGmtRunningTime(String gmtRunningTime) {
        this.gmtRunningTime = gmtRunningTime;
        return this;
    }
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    public RLJobItem setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RLJobItem setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public RLJobItem setModels(java.util.List<RLJobModelConfig> models) {
        this.models = models;
        return this;
    }
    public java.util.List<RLJobModelConfig> getModels() {
        return this.models;
    }

    public RLJobItem setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public RLJobItem setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public RLJobItem setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public RLJobItem setSettings(RLJobSettings settings) {
        this.settings = settings;
        return this;
    }
    public RLJobSettings getSettings() {
        return this.settings;
    }

    public RLJobItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RLJobItem setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

    public RLJobItem setTrainerMode(String trainerMode) {
        this.trainerMode = trainerMode;
        return this;
    }
    public String getTrainerMode() {
        return this.trainerMode;
    }

    public RLJobItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RLJobItem setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
