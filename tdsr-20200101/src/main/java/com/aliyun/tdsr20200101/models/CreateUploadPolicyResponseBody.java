// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateUploadPolicyResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public CreateUploadPolicyResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CreateUploadPolicyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B28A2ECB-AB29-1E01****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadPolicyResponseBody self = new CreateUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadPolicyResponseBody setAccessDeniedDetail(CreateUploadPolicyResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CreateUploadPolicyResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateUploadPolicyResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateUploadPolicyResponseBody setData(CreateUploadPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateUploadPolicyResponseBodyData getData() {
        return this.data;
    }

    public CreateUploadPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateUploadPolicyResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static CreateUploadPolicyResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateUploadPolicyResponseBodyAccessDeniedDetail self = new CreateUploadPolicyResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CreateUploadPolicyResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CreateUploadPolicyResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public CreateUploadPolicyResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public CreateUploadPolicyResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CreateUploadPolicyResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CreateUploadPolicyResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CreateUploadPolicyResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class CreateUploadPolicyResponseBodyData extends TeaModel {
        /**
         * <p>accessId</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5t9k9****</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <strong>example:</strong>
         * <p>dir/</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <strong>example:</strong>
         * <p>1658812297</p>
         */
        @NameInMap("Expire")
        public String expire;

        /**
         * <strong>example:</strong>
         * <p>oss.aliyun.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMj****</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>KdnPJFIG25SM****</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static CreateUploadPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateUploadPolicyResponseBodyData self = new CreateUploadPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateUploadPolicyResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateUploadPolicyResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public CreateUploadPolicyResponseBodyData setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public CreateUploadPolicyResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public CreateUploadPolicyResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateUploadPolicyResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateUploadPolicyResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
