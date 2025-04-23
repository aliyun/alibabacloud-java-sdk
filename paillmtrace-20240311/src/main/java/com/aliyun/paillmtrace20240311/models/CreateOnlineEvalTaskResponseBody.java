// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class CreateOnlineEvalTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>EvaluationConfig.Answer.SpanName is required.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>711ef9112343286810abbfce04e161ee</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateOnlineEvalTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineEvalTaskResponseBody self = new CreateOnlineEvalTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOnlineEvalTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOnlineEvalTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOnlineEvalTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOnlineEvalTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
