// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppMaterialTask extends TeaModel {
    @NameInMap("CompleteTime")
    public String completeTime;

    @NameInMap("CompleteTimeFormat")
    public String completeTimeFormat;

    @NameInMap("FailReason")
    public String failReason;

    @NameInMap("FinalFileUrls")
    public java.util.List<String> finalFileUrls;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubStatus")
    public String subStatus;

    @NameInMap("SubmitTime")
    public String submitTime;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskParam")
    public String taskParam;

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
