// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class RetryFailedContextDatabaseSyncRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RetryFailedContextDatabaseSyncRunResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RetryFailedContextDatabaseSyncRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryFailedContextDatabaseSyncRunResponseBody self = new RetryFailedContextDatabaseSyncRunResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryFailedContextDatabaseSyncRunResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetryFailedContextDatabaseSyncRunResponseBody setData(RetryFailedContextDatabaseSyncRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetryFailedContextDatabaseSyncRunResponseBodyData getData() {
        return this.data;
    }

    public RetryFailedContextDatabaseSyncRunResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RetryFailedContextDatabaseSyncRunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryFailedContextDatabaseSyncRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryFailedContextDatabaseSyncRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetryFailedContextDatabaseSyncRunResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("RetryOfRunId")
        public String retryOfRunId;

        /**
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("RunId")
        public String runId;

        public static RetryFailedContextDatabaseSyncRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetryFailedContextDatabaseSyncRunResponseBodyData self = new RetryFailedContextDatabaseSyncRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetryFailedContextDatabaseSyncRunResponseBodyData setRetryOfRunId(String retryOfRunId) {
            this.retryOfRunId = retryOfRunId;
            return this;
        }
        public String getRetryOfRunId() {
            return this.retryOfRunId;
        }

        public RetryFailedContextDatabaseSyncRunResponseBodyData setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

    }

}
