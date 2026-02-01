// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetAgentTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
     */
    @NameInMap("message")
    public String message;

    public static GetAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentTaskResponseBody self = new GetAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentTaskResponseBody setData(GetAgentTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentTaskResponseBodyData getData() {
        return this.data;
    }

    public GetAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetAgentTaskResponseBodyDataJobs extends TeaModel {
        @NameInMap("error")
        public String error;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("instance")
        public String instance;

        @NameInMap("params")
        public Object params;

        @NameInMap("region")
        public String region;

        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static GetAgentTaskResponseBodyDataJobs build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResponseBodyDataJobs self = new GetAgentTaskResponseBodyDataJobs();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResponseBodyDataJobs setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetAgentTaskResponseBodyDataJobs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetAgentTaskResponseBodyDataJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetAgentTaskResponseBodyDataJobs setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public GetAgentTaskResponseBodyDataJobs setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public GetAgentTaskResponseBodyDataJobs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAgentTaskResponseBodyDataJobs setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAgentTaskResponseBodyDataJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetAgentTaskResponseBodyData extends TeaModel {
        @NameInMap("jobs")
        public java.util.List<GetAgentTaskResponseBodyDataJobs> jobs;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        public static GetAgentTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResponseBodyData self = new GetAgentTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResponseBodyData setJobs(java.util.List<GetAgentTaskResponseBodyDataJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<GetAgentTaskResponseBodyDataJobs> getJobs() {
            return this.jobs;
        }

        public GetAgentTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAgentTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
