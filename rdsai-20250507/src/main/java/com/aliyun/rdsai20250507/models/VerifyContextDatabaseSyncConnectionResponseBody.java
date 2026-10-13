// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class VerifyContextDatabaseSyncConnectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public VerifyContextDatabaseSyncConnectionResponseBodyData data;

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
     * <p>Sample value</p>
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

    public static VerifyContextDatabaseSyncConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyContextDatabaseSyncConnectionResponseBody self = new VerifyContextDatabaseSyncConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyContextDatabaseSyncConnectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyContextDatabaseSyncConnectionResponseBody setData(VerifyContextDatabaseSyncConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyContextDatabaseSyncConnectionResponseBodyData getData() {
        return this.data;
    }

    public VerifyContextDatabaseSyncConnectionResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public VerifyContextDatabaseSyncConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyContextDatabaseSyncConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyContextDatabaseSyncConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyContextDatabaseSyncConnectionResponseBodyData extends TeaModel {
        /**
         * <p>The authorization status.</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        @NameInMap("AuthState")
        public String authState;

        /**
         * <p>The connection ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        public static VerifyContextDatabaseSyncConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyContextDatabaseSyncConnectionResponseBodyData self = new VerifyContextDatabaseSyncConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyContextDatabaseSyncConnectionResponseBodyData setAuthState(String authState) {
            this.authState = authState;
            return this;
        }
        public String getAuthState() {
            return this.authState;
        }

        public VerifyContextDatabaseSyncConnectionResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
