// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBatchJobsRequest extends TeaModel {
    /**
     * <p>The description of the batch job.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("BatchJobDescription")
    public String batchJobDescription;

    /**
     * <p>The name of the batch job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>First job group</p>
     */
    @NameInMap("BatchJobName")
    public String batchJobName;

    /**
     * <p>The list of calling numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;95187&quot;]</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

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
     * <p>The URL to download the Excel file for the batch job.</p>
     * <blockquote>
     * <p>You can obtain this parameter from the Folder response parameter of the GetJobDataUploadParams operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>52e80b02-0126-4556-a1e6-ef5b3747ed53/a9a3ddc7-d7d7-48cd-82b5-b31bb5510e71_2a66f8ad-dfbb-4980-9b84-439171295a11.xlsx</p>
     */
    @NameInMap("JobFilePath")
    public String jobFilePath;

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
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The JSON string of the job execution strategy. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxAttemptsPerDay&quot;:2,&quot;name&quot;:&quot;Strategy name&quot;,&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;12:00:00&quot;},{&quot;beginTime&quot;:&quot;13:00:00&quot;,&quot;endTime&quot;:&quot;18:30:00&quot;}],&quot;minAttemptInterval&quot;:60}</p>
     */
    @NameInMap("StrategyJson")
    public String strategyJson;

    /**
     * <p>Specifies whether the job is submitted. Valid values:</p>
     * <ul>
     * <li>true: The job is saved as a draft.</li>
     * <li>false: The job is submitted.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Submitted")
    public Boolean submitted;

    public static CreateBatchJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchJobsRequest self = new CreateBatchJobsRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchJobsRequest setBatchJobDescription(String batchJobDescription) {
        this.batchJobDescription = batchJobDescription;
        return this;
    }
    public String getBatchJobDescription() {
        return this.batchJobDescription;
    }

    public CreateBatchJobsRequest setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
        return this;
    }
    public String getBatchJobName() {
        return this.batchJobName;
    }

    public CreateBatchJobsRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public CreateBatchJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBatchJobsRequest setJobFilePath(String jobFilePath) {
        this.jobFilePath = jobFilePath;
        return this;
    }
    public String getJobFilePath() {
        return this.jobFilePath;
    }

    public CreateBatchJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public CreateBatchJobsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateBatchJobsRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public CreateBatchJobsRequest setSubmitted(Boolean submitted) {
        this.submitted = submitted;
        return this;
    }
    public Boolean getSubmitted() {
        return this.submitted;
    }

}
