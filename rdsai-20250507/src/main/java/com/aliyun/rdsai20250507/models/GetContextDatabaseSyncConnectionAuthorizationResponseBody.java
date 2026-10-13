// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncConnectionAuthorizationResponseBody extends TeaModel {
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
    public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData data;

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
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetContextDatabaseSyncConnectionAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncConnectionAuthorizationResponseBody self = new GetContextDatabaseSyncConnectionAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponseBody setData(GetContextDatabaseSyncConnectionAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseSyncConnectionAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContextDatabaseSyncConnectionAuthorizationResponseBodyData extends TeaModel {
        /**
         * <p>The authorization method. Valid values: app, pasted-url, static-secret, and none.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("AuthKind")
        public String authKind;

        /**
         * <p>The authorization status.</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        @NameInMap("AuthState")
        public String authState;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D team DingTalk data source</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The connection ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The plugin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>The remediation suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Re-authorize the data source</p>
         */
        @NameInMap("Remediation")
        public String remediation;

        /**
         * <p>The authorization scope report.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScopeReport")
        public java.util.Map<String, ?> scopeReport;

        /**
         * <p>The credential fingerprint.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:4b3b7b2e5f6a1c9d8e0f1234567890abcdef1234567890abcdef1234567890ab</p>
         */
        @NameInMap("SecretFingerprint")
        public String secretFingerprint;

        /**
         * <p>The credential update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("SecretUpdatedAt")
        public String secretUpdatedAt;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        /**
         * <p>The verification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("VerifiedAt")
        public String verifiedAt;

        public static GetContextDatabaseSyncConnectionAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncConnectionAuthorizationResponseBodyData self = new GetContextDatabaseSyncConnectionAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setAuthKind(String authKind) {
            this.authKind = authKind;
            return this;
        }
        public String getAuthKind() {
            return this.authKind;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setAuthState(String authState) {
            this.authState = authState;
            return this;
        }
        public String getAuthState() {
            return this.authState;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setRemediation(String remediation) {
            this.remediation = remediation;
            return this;
        }
        public String getRemediation() {
            return this.remediation;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setScopeReport(java.util.Map<String, ?> scopeReport) {
            this.scopeReport = scopeReport;
            return this;
        }
        public java.util.Map<String, ?> getScopeReport() {
            return this.scopeReport;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setSecretFingerprint(String secretFingerprint) {
            this.secretFingerprint = secretFingerprint;
            return this;
        }
        public String getSecretFingerprint() {
            return this.secretFingerprint;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setSecretUpdatedAt(String secretUpdatedAt) {
            this.secretUpdatedAt = secretUpdatedAt;
            return this;
        }
        public String getSecretUpdatedAt() {
            return this.secretUpdatedAt;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBodyData setVerifiedAt(String verifiedAt) {
            this.verifiedAt = verifiedAt;
            return this;
        }
        public String getVerifiedAt() {
            return this.verifiedAt;
        }

    }

}
