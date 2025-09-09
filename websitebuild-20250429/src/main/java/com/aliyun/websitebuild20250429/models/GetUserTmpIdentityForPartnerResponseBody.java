// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetUserTmpIdentityForPartnerResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetUserTmpIdentityForPartnerResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>aliuid:1998006665794443 assumeRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetUserTmpIdentityForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserTmpIdentityForPartnerResponseBody self = new GetUserTmpIdentityForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserTmpIdentityForPartnerResponseBody setData(GetUserTmpIdentityForPartnerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserTmpIdentityForPartnerResponseBodyData getData() {
        return this.data;
    }

    public GetUserTmpIdentityForPartnerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserTmpIdentityForPartnerResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetUserTmpIdentityForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserTmpIdentityForPartnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserTmpIdentityForPartnerResponseBodyDataCredentials extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7t2Rzt37ND7-xxx</p>
         */
        @NameInMap("EncryptedAccessKeyId")
        public String encryptedAccessKeyId;

        /**
         * <strong>example:</strong>
         * <p>7t2Rzt37ND7-xxx</p>
         */
        @NameInMap("EncryptedAccessKeySecret")
        public String encryptedAccessKeySecret;

        /**
         * <strong>example:</strong>
         * <p>7t2Rzt37ND7-xxx</p>
         */
        @NameInMap("EncryptedSecurityToken")
        public String encryptedSecurityToken;

        /**
         * <strong>example:</strong>
         * <p>2025-04-29T14:00:00Z</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        public static GetUserTmpIdentityForPartnerResponseBodyDataCredentials build(java.util.Map<String, ?> map) throws Exception {
            GetUserTmpIdentityForPartnerResponseBodyDataCredentials self = new GetUserTmpIdentityForPartnerResponseBodyDataCredentials();
            return TeaModel.build(map, self);
        }

        public GetUserTmpIdentityForPartnerResponseBodyDataCredentials setEncryptedAccessKeyId(String encryptedAccessKeyId) {
            this.encryptedAccessKeyId = encryptedAccessKeyId;
            return this;
        }
        public String getEncryptedAccessKeyId() {
            return this.encryptedAccessKeyId;
        }

        public GetUserTmpIdentityForPartnerResponseBodyDataCredentials setEncryptedAccessKeySecret(String encryptedAccessKeySecret) {
            this.encryptedAccessKeySecret = encryptedAccessKeySecret;
            return this;
        }
        public String getEncryptedAccessKeySecret() {
            return this.encryptedAccessKeySecret;
        }

        public GetUserTmpIdentityForPartnerResponseBodyDataCredentials setEncryptedSecurityToken(String encryptedSecurityToken) {
            this.encryptedSecurityToken = encryptedSecurityToken;
            return this;
        }
        public String getEncryptedSecurityToken() {
            return this.encryptedSecurityToken;
        }

        public GetUserTmpIdentityForPartnerResponseBodyDataCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

    }

    public static class GetUserTmpIdentityForPartnerResponseBodyData extends TeaModel {
        @NameInMap("Credentials")
        public GetUserTmpIdentityForPartnerResponseBodyDataCredentials credentials;

        @NameInMap("HasCustomRoleAuth")
        public Boolean hasCustomRoleAuth;

        public static GetUserTmpIdentityForPartnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserTmpIdentityForPartnerResponseBodyData self = new GetUserTmpIdentityForPartnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserTmpIdentityForPartnerResponseBodyData setCredentials(GetUserTmpIdentityForPartnerResponseBodyDataCredentials credentials) {
            this.credentials = credentials;
            return this;
        }
        public GetUserTmpIdentityForPartnerResponseBodyDataCredentials getCredentials() {
            return this.credentials;
        }

        public GetUserTmpIdentityForPartnerResponseBodyData setHasCustomRoleAuth(Boolean hasCustomRoleAuth) {
            this.hasCustomRoleAuth = hasCustomRoleAuth;
            return this;
        }
        public Boolean getHasCustomRoleAuth() {
            return this.hasCustomRoleAuth;
        }

    }

}
