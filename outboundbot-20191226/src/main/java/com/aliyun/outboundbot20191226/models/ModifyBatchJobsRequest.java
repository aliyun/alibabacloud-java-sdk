// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBatchJobsRequest extends TeaModel {
    /**
     * <p>The job name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>催收作业组</p>
     */
    @NameInMap("BatchJobName")
    public String batchJobName;

    /**
     * <p>The calling numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;95187&quot;]</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>The description of the job group.</p>
     * 
     * <strong>example:</strong>
     * <p>这是催收作业组-01</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The download URL of the Excel file for the job.</p>
     * 
     * <strong>example:</strong>
     * <p>52e80b02-0126-4556-a1e6-ef5b3747ed53/a9a3ddc7-d7d7-48cd-82b5-b31bb5510e71_2a66f8ad-dfbb-4980-9b84-439171295a11.xlsx</p>
     */
    @NameInMap("JobFilePath")
    public String jobFilePath;

    /**
     * <p>The job group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c6a668d1-3145-4048-9101-cb3678bb8884</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c6a668d1-3145-4048-9101-cb3678bb8884</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>The script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7d820242-f4f0-4d2e-ae35-b424c41cbc5b</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The policy in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxAttemptsPerDay&quot;:2,&quot;name&quot;:&quot;策略名字&quot;,&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;12:00:00&quot;},{&quot;beginTime&quot;:&quot;13:00:00&quot;,&quot;endTime&quot;:&quot;18:30:00&quot;}],&quot;minAttemptInterval&quot;:60}</p>
     */
    @NameInMap("StrategyJson")
    public String strategyJson;

    /**
     * <p>Specifies whether to submit the job. \<code>false\\</code> submits the job. \<code>true\\</code> saves the job as a draft.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Submitted")
    public Boolean submitted;

    public static ModifyBatchJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBatchJobsRequest self = new ModifyBatchJobsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBatchJobsRequest setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
        return this;
    }
    public String getBatchJobName() {
        return this.batchJobName;
    }

    public ModifyBatchJobsRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public ModifyBatchJobsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyBatchJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBatchJobsRequest setJobFilePath(String jobFilePath) {
        this.jobFilePath = jobFilePath;
        return this;
    }
    public String getJobFilePath() {
        return this.jobFilePath;
    }

    public ModifyBatchJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public ModifyBatchJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public ModifyBatchJobsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyBatchJobsRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public ModifyBatchJobsRequest setSubmitted(Boolean submitted) {
        this.submitted = submitted;
        return this;
    }
    public Boolean getSubmitted() {
        return this.submitted;
    }

}
