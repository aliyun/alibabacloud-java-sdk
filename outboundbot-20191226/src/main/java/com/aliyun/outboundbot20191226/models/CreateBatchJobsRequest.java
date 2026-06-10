// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBatchJobsRequest extends TeaModel {
    /**
     * <p>Description of the batch job.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("BatchJobDescription")
    public String batchJobDescription;

    /**
     * <p>Name of the batch job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>第一个作业组</p>
     */
    @NameInMap("BatchJobName")
    public String batchJobName;

    /**
     * <p>List of caller numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;95187&quot;]</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Path to the Excel file that contains the batch job data.</p>
     * <blockquote>
     * <p>Get this value from the Folder parameter in the response of the GetJobDataUploadParams operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>52e80b02-0126-4556-a1e6-ef5b3747ed53/a9a3ddc7-d7d7-48cd-82b5-b31bb5510e71_2a66f8ad-dfbb-4980-9b84-439171295a11.xlsx</p>
     */
    @NameInMap("JobFilePath")
    public String jobFilePath;

    /**
     * <p>ID of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>c6a668d1-3145-4048-9101-cb3678bb8884</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>ID of the script.</p>
     * 
     * <strong>example:</strong>
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>JSON string that defines the job execution policy. Required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxAttemptsPerDay&quot;:2,&quot;name&quot;:&quot;策略名字&quot;,&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;12:00:00&quot;},{&quot;beginTime&quot;:&quot;13:00:00&quot;,&quot;endTime&quot;:&quot;18:30:00&quot;}],&quot;minAttemptInterval&quot;:60}</p>
     */
    @NameInMap("StrategyJson")
    public String strategyJson;

    /**
     * <p>Indicates whether the job is submitted. Set to false to submit the job. Set to true to save it as a draft.</p>
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
