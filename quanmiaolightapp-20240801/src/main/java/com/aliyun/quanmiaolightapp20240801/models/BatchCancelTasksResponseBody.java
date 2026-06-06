// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class BatchCancelTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchCancelTasksResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-GHIJ-KLMNOPQRST</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static BatchCancelTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCancelTasksResponseBody self = new BatchCancelTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCancelTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCancelTasksResponseBody setData(BatchCancelTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchCancelTasksResponseBodyData getData() {
        return this.data;
    }

    public BatchCancelTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchCancelTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCancelTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCancelTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCancelTasksResponseBodyDataResults extends TeaModel {
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static BatchCancelTasksResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            BatchCancelTasksResponseBodyDataResults self = new BatchCancelTasksResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public BatchCancelTasksResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public BatchCancelTasksResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchCancelTasksResponseBodyDataResults setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class BatchCancelTasksResponseBodyData extends TeaModel {
        @NameInMap("results")
        public java.util.List<BatchCancelTasksResponseBodyDataResults> results;

        public static BatchCancelTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCancelTasksResponseBodyData self = new BatchCancelTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCancelTasksResponseBodyData setResults(java.util.List<BatchCancelTasksResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<BatchCancelTasksResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
