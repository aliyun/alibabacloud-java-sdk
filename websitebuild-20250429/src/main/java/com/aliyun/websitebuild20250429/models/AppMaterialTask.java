// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppMaterialTask extends TeaModel {
    /**
     * <p>Job completion time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-26 11:30:05</p>
     */
    @NameInMap("CompleteTime")
    public String completeTime;

    /**
     * <p>Completion time display format</p>
     * 
     * <strong>example:</strong>
     * <p>1分钟前</p>
     */
    @NameInMap("CompleteTimeFormat")
    public String completeTimeFormat;

    /**
     * <p>Reason for failure</p>
     * 
     * <strong>example:</strong>
     * <p>参数不合规</p>
     */
    @NameInMap("FailReason")
    public String failReason;

    /**
     * <p>List of final files</p>
     */
    @NameInMap("FinalFileUrls")
    public java.util.List<String> finalFileUrls;

    /**
     * <p>Task Status</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Job substatus</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("SubStatus")
    public String subStatus;

    /**
     * <p>Submitted At.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-26 11:30:05</p>
     */
    @NameInMap("SubmitTime")
    public String submitTime;

    /**
     * <p>Job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81d04d62c3483b32bacf1d306d2622b2</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Job parameter</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;brandName&quot;: &quot;品牌名称&quot;,
     *     &quot;direction&quot;: &quot;HORIZONTAL&quot;,
     *     &quot;userPrompt&quot;: &quot;设计要求&quot;
     * }</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>Task Type.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_LOGO</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static AppMaterialTask build(java.util.Map<String, ?> map) throws Exception {
        AppMaterialTask self = new AppMaterialTask();
        return TeaModel.build(map, self);
    }

    public AppMaterialTask setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }
    public String getCompleteTime() {
        return this.completeTime;
    }

    public AppMaterialTask setCompleteTimeFormat(String completeTimeFormat) {
        this.completeTimeFormat = completeTimeFormat;
        return this;
    }
    public String getCompleteTimeFormat() {
        return this.completeTimeFormat;
    }

    public AppMaterialTask setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public AppMaterialTask setFinalFileUrls(java.util.List<String> finalFileUrls) {
        this.finalFileUrls = finalFileUrls;
        return this;
    }
    public java.util.List<String> getFinalFileUrls() {
        return this.finalFileUrls;
    }

    public AppMaterialTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppMaterialTask setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

    public AppMaterialTask setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public AppMaterialTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AppMaterialTask setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public AppMaterialTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
