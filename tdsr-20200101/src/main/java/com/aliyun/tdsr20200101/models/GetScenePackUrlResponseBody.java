// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePackUrlResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetScenePackUrlResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetScenePackUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A8CD0AD9-8A92-455A-A984-A7E4B76****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetScenePackUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenePackUrlResponseBody self = new GetScenePackUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenePackUrlResponseBody setAccessDeniedDetail(GetScenePackUrlResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetScenePackUrlResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetScenePackUrlResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetScenePackUrlResponseBody setData(GetScenePackUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScenePackUrlResponseBodyData getData() {
        return this.data;
    }

    public GetScenePackUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScenePackUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenePackUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScenePackUrlResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static GetScenePackUrlResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetScenePackUrlResponseBodyAccessDeniedDetail self = new GetScenePackUrlResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetScenePackUrlResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetScenePackUrlResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetScenePackUrlResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetScenePackUrlResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetScenePackUrlResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetScenePackUrlResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetScenePackUrlResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetScenePackUrlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-05-17 11:00:17</p>
         */
        @NameInMap("Expire")
        public String expire;

        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Valid")
        public Boolean valid;

        public static GetScenePackUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScenePackUrlResponseBodyData self = new GetScenePackUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScenePackUrlResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetScenePackUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetScenePackUrlResponseBodyData setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
