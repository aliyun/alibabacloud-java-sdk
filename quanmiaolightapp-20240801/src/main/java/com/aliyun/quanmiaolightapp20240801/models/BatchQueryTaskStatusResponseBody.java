// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class BatchQueryTaskStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchQueryTaskStatusResponseBodyData data;

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

    public static BatchQueryTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryTaskStatusResponseBody self = new BatchQueryTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryTaskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryTaskStatusResponseBody setData(BatchQueryTaskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchQueryTaskStatusResponseBodyData getData() {
        return this.data;
    }

    public BatchQueryTaskStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchQueryTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchQueryTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchQueryTaskStatusResponseBodyDataTaskStatusList extends TeaModel {
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static BatchQueryTaskStatusResponseBodyDataTaskStatusList build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryTaskStatusResponseBodyDataTaskStatusList self = new BatchQueryTaskStatusResponseBodyDataTaskStatusList();
            return TeaModel.build(map, self);
        }

        public BatchQueryTaskStatusResponseBodyDataTaskStatusList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public BatchQueryTaskStatusResponseBodyDataTaskStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryTaskStatusResponseBodyDataTaskStatusList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class BatchQueryTaskStatusResponseBodyData extends TeaModel {
        @NameInMap("taskStatusList")
        public java.util.List<BatchQueryTaskStatusResponseBodyDataTaskStatusList> taskStatusList;

        public static BatchQueryTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryTaskStatusResponseBodyData self = new BatchQueryTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchQueryTaskStatusResponseBodyData setTaskStatusList(java.util.List<BatchQueryTaskStatusResponseBodyDataTaskStatusList> taskStatusList) {
            this.taskStatusList = taskStatusList;
            return this;
        }
        public java.util.List<BatchQueryTaskStatusResponseBodyDataTaskStatusList> getTaskStatusList() {
            return this.taskStatusList;
        }

    }

}
