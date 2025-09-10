// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteLogStoreLogsTask extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("from")
    public Integer from;

    @NameInMap("progress")
    public Integer progress;

    @NameInMap("query")
    public String query;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("to")
    public Integer to;

    public static DeleteLogStoreLogsTask build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogStoreLogsTask self = new DeleteLogStoreLogsTask();
        return TeaModel.build(map, self);
    }

    public DeleteLogStoreLogsTask setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DeleteLogStoreLogsTask setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteLogStoreLogsTask setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public DeleteLogStoreLogsTask setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DeleteLogStoreLogsTask setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DeleteLogStoreLogsTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DeleteLogStoreLogsTask setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
