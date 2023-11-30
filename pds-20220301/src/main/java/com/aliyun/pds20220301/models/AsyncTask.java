// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AsyncTask extends TeaModel {
    @NameInMap("async_task_id")
    public String asyncTaskId;

    @NameInMap("category")
    public String category;

    @NameInMap("consumed_process")
    public Long consumedProcess;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_message")
    public String errorMessage;

    @NameInMap("finished_at")
    public String finishedAt;

    @NameInMap("started_at")
    public String startedAt;

    @NameInMap("state")
    public String state;

    @NameInMap("task_type")
    public String taskType;

    @NameInMap("total_process")
    public Long totalProcess;

    @NameInMap("user_id")
    public String userId;

    public static AsyncTask build(java.util.Map<String, ?> map) throws Exception {
        AsyncTask self = new AsyncTask();
        return TeaModel.build(map, self);
    }

    public AsyncTask setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public AsyncTask setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public AsyncTask setConsumedProcess(Long consumedProcess) {
        this.consumedProcess = consumedProcess;
        return this;
    }
    public Long getConsumedProcess() {
        return this.consumedProcess;
    }

    public AsyncTask setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AsyncTask setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AsyncTask setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AsyncTask setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public AsyncTask setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public AsyncTask setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AsyncTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public AsyncTask setTotalProcess(Long totalProcess) {
        this.totalProcess = totalProcess;
        return this;
    }
    public Long getTotalProcess() {
        return this.totalProcess;
    }

    public AsyncTask setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
