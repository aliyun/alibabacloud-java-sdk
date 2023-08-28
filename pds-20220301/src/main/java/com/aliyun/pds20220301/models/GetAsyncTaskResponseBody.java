// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetAsyncTaskResponseBody extends TeaModel {
    @NameInMap("async_task_id")
    public String asyncTaskId;

    @NameInMap("category")
    public String category;

    @NameInMap("consumed_process")
    public Long consumedProcess;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("err_code")
    public Long errCode;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_message")
    public String errorMessage;

    @NameInMap("finished_at")
    public String finishedAt;

    @NameInMap("message")
    public String message;

    @NameInMap("started_at")
    public String startedAt;

    @NameInMap("state")
    public String state;

    @NameInMap("status")
    public String status;

    @NameInMap("total_process")
    public Long totalProcess;

    @NameInMap("uncompress_file_list")
    public java.util.List<UncompressedFileInfo> uncompressFileList;

    @NameInMap("url")
    public String url;

    public static GetAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskResponseBody self = new GetAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public GetAsyncTaskResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetAsyncTaskResponseBody setConsumedProcess(Long consumedProcess) {
        this.consumedProcess = consumedProcess;
        return this;
    }
    public Long getConsumedProcess() {
        return this.consumedProcess;
    }

    public GetAsyncTaskResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetAsyncTaskResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetAsyncTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAsyncTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAsyncTaskResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public GetAsyncTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncTaskResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public GetAsyncTaskResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetAsyncTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAsyncTaskResponseBody setTotalProcess(Long totalProcess) {
        this.totalProcess = totalProcess;
        return this;
    }
    public Long getTotalProcess() {
        return this.totalProcess;
    }

    public GetAsyncTaskResponseBody setUncompressFileList(java.util.List<UncompressedFileInfo> uncompressFileList) {
        this.uncompressFileList = uncompressFileList;
        return this;
    }
    public java.util.List<UncompressedFileInfo> getUncompressFileList() {
        return this.uncompressFileList;
    }

    public GetAsyncTaskResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
