// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateMiningTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateMiningTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateMiningTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMiningTaskResponseBody self = new CreateMiningTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMiningTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMiningTaskResponseBody setData(CreateMiningTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMiningTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateMiningTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMiningTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMiningTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMiningTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateMiningTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7C1DEF5F-2C18-4D36-99C6-8C27*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateMiningTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMiningTaskResponseBodyData self = new CreateMiningTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMiningTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
