// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotfixTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If <code>code</code> is <code>Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. If the authorization fails, check the <code>message</code> field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetHotfixTaskResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code</code> is <code>Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHotfixTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotfixTaskResponseBody self = new GetHotfixTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotfixTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotfixTaskResponseBody setData(GetHotfixTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotfixTaskResponseBodyData getData() {
        return this.data;
    }

    public GetHotfixTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotfixTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHotfixTaskResponseBodyDataJobs extends TeaModel {
        /**
         * <p>The unified error code.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE_NOT_EXISTS</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified instance does not exist</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The hotfix status.</p>
         * 
         * <strong>example:</strong>
         * <p>CONFLICT</p>
         */
        @NameInMap("hotfixStatus")
        public String hotfixStatus;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zehme0rs1tc090fdl3n</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The status of the instance task.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static GetHotfixTaskResponseBodyDataJobs build(java.util.Map<String, ?> map) throws Exception {
            GetHotfixTaskResponseBodyDataJobs self = new GetHotfixTaskResponseBodyDataJobs();
            return TeaModel.build(map, self);
        }

        public GetHotfixTaskResponseBodyDataJobs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetHotfixTaskResponseBodyDataJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetHotfixTaskResponseBodyDataJobs setHotfixStatus(String hotfixStatus) {
            this.hotfixStatus = hotfixStatus;
            return this;
        }
        public String getHotfixStatus() {
            return this.hotfixStatus;
        }

        public GetHotfixTaskResponseBodyDataJobs setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public GetHotfixTaskResponseBodyDataJobs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetHotfixTaskResponseBodyDataJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetHotfixTaskResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-13T08:14:40</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>CVE ID</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2026-31431</p>
         */
        @NameInMap("cveId")
        public String cveId;

        /**
         * <p>The time when the task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-13T08:14:40</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <p>The list of instance tasks.</p>
         */
        @NameInMap("jobs")
        public java.util.List<GetHotfixTaskResponseBodyDataJobs> jobs;

        /**
         * <p>The operation type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Install</p>
         */
        @NameInMap("operation")
        public String operation;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>hotfix-da3dcc0b-5019-4b59-b12f-2e500da9083c</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static GetHotfixTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotfixTaskResponseBodyData self = new GetHotfixTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotfixTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetHotfixTaskResponseBodyData setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public GetHotfixTaskResponseBodyData setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetHotfixTaskResponseBodyData setJobs(java.util.List<GetHotfixTaskResponseBodyDataJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<GetHotfixTaskResponseBodyDataJobs> getJobs() {
            return this.jobs;
        }

        public GetHotfixTaskResponseBodyData setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetHotfixTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetHotfixTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
