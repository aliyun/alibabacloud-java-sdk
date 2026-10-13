// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CancelContextDatabaseSyncRunResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CancelContextDatabaseSyncRunResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CancelContextDatabaseSyncRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelContextDatabaseSyncRunResponseBody self = new CancelContextDatabaseSyncRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelContextDatabaseSyncRunResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelContextDatabaseSyncRunResponseBody setData(CancelContextDatabaseSyncRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelContextDatabaseSyncRunResponseBodyData getData() {
        return this.data;
    }

    public CancelContextDatabaseSyncRunResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CancelContextDatabaseSyncRunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelContextDatabaseSyncRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelContextDatabaseSyncRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelContextDatabaseSyncRunResponseBodyData extends TeaModel {
        /**
         * <p>The run ID, a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The run status after the cancellation request is submitted. For runs in the queued or running state, the operation immediately returns cancelling.</p>
         * 
         * <strong>example:</strong>
         * <p>cancelling</p>
         */
        @NameInMap("Status")
        public String status;

        public static CancelContextDatabaseSyncRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelContextDatabaseSyncRunResponseBodyData self = new CancelContextDatabaseSyncRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelContextDatabaseSyncRunResponseBodyData setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public CancelContextDatabaseSyncRunResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
