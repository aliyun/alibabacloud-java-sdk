// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAifgResultResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data details.</p>
     */
    @NameInMap("data")
    public GetAifgResultResponseBodyData data;

    /**
     * <p>The message content.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Execution succeeded&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAifgResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAifgResultResponseBody self = new GetAifgResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAifgResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAifgResultResponseBody setData(GetAifgResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAifgResultResponseBodyData getData() {
        return this.data;
    }

    public GetAifgResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAifgResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAifgResultResponseBodyData extends TeaModel {
        /**
         * <p>The diagnostic results.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("result")
        public Object result;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>user-service</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>The root data status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The data creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01T00:00:00Z</p>
         */
        @NameInMap("submitTime")
        public String submitTime;

        /**
         * <p>The unique identifier of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The training task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-as2993fsx</p>
         */
        @NameInMap("traceTaskId")
        public String traceTaskId;

        public static GetAifgResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAifgResultResponseBodyData self = new GetAifgResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAifgResultResponseBodyData setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

        public GetAifgResultResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetAifgResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAifgResultResponseBodyData setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetAifgResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAifgResultResponseBodyData setTraceTaskId(String traceTaskId) {
            this.traceTaskId = traceTaskId;
            return this;
        }
        public String getTraceTaskId() {
            return this.traceTaskId;
        }

    }

}
