// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.speechfiletranscriberlite20211221.models;

import com.aliyun.tea.*;

public class SubmitTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusCode")
    public Long statusCode;

    @NameInMap("StatusText")
    public String statusText;

    @NameInMap("TaskId")
    public String taskId;

    public static SubmitTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTaskResponseBody self = new SubmitTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTaskResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public SubmitTaskResponseBody setStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }
    public String getStatusText() {
        return this.statusText;
    }

    public SubmitTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
