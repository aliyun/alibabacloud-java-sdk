// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncConnectionCredentialResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateContextDatabaseSyncConnectionCredentialResponseBodyData data;

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

    public static UpdateContextDatabaseSyncConnectionCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncConnectionCredentialResponseBody self = new UpdateContextDatabaseSyncConnectionCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncConnectionCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateContextDatabaseSyncConnectionCredentialResponseBody setData(UpdateContextDatabaseSyncConnectionCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateContextDatabaseSyncConnectionCredentialResponseBodyData getData() {
        return this.data;
    }

    public UpdateContextDatabaseSyncConnectionCredentialResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateContextDatabaseSyncConnectionCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContextDatabaseSyncConnectionCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContextDatabaseSyncConnectionCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateContextDatabaseSyncConnectionCredentialResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        public static UpdateContextDatabaseSyncConnectionCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextDatabaseSyncConnectionCredentialResponseBodyData self = new UpdateContextDatabaseSyncConnectionCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateContextDatabaseSyncConnectionCredentialResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
