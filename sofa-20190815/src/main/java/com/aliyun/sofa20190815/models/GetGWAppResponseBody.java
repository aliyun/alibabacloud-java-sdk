// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetGWAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetGWAppResponseBodyData data;

    public static GetGWAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGWAppResponseBody self = new GetGWAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGWAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGWAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGWAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetGWAppResponseBody setData(GetGWAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGWAppResponseBodyData getData() {
        return this.data;
    }

    public static class GetGWAppResponseBodyDataAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static GetGWAppResponseBodyDataAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetGWAppResponseBodyDataAuthenticationConfig self = new GetGWAppResponseBodyDataAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public GetGWAppResponseBodyDataAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetGWAppResponseBodyDataAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class GetGWAppResponseBodyDataEncryptConfig extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("EncryptionStatus")
        public String encryptionStatus;

        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("KeyPair")
        public String keyPair;

        @NameInMap("PrivateKey")
        public String privateKey;

        @NameInMap("PubKey")
        public String pubKey;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetGWAppResponseBodyDataEncryptConfig build(java.util.Map<String, ?> map) throws Exception {
            GetGWAppResponseBodyDataEncryptConfig self = new GetGWAppResponseBodyDataEncryptConfig();
            return TeaModel.build(map, self);
        }

        public GetGWAppResponseBodyDataEncryptConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetGWAppResponseBodyDataEncryptConfig setEncryptionStatus(String encryptionStatus) {
            this.encryptionStatus = encryptionStatus;
            return this;
        }
        public String getEncryptionStatus() {
            return this.encryptionStatus;
        }

        public GetGWAppResponseBodyDataEncryptConfig setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public GetGWAppResponseBodyDataEncryptConfig setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public GetGWAppResponseBodyDataEncryptConfig setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public GetGWAppResponseBodyDataEncryptConfig setPubKey(String pubKey) {
            this.pubKey = pubKey;
            return this;
        }
        public String getPubKey() {
            return this.pubKey;
        }

        public GetGWAppResponseBodyDataEncryptConfig setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetGWAppResponseBodyData extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("AuthenticationConfig")
        public GetGWAppResponseBodyDataAuthenticationConfig authenticationConfig;

        @NameInMap("EncryptConfig")
        public GetGWAppResponseBodyDataEncryptConfig encryptConfig;

        public static GetGWAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGWAppResponseBodyData self = new GetGWAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGWAppResponseBodyData setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public GetGWAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetGWAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetGWAppResponseBodyData setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public GetGWAppResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetGWAppResponseBodyData setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public GetGWAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGWAppResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGWAppResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGWAppResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetGWAppResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetGWAppResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetGWAppResponseBodyData setAuthenticationConfig(GetGWAppResponseBodyDataAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public GetGWAppResponseBodyDataAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

        public GetGWAppResponseBodyData setEncryptConfig(GetGWAppResponseBodyDataEncryptConfig encryptConfig) {
            this.encryptConfig = encryptConfig;
            return this;
        }
        public GetGWAppResponseBodyDataEncryptConfig getEncryptConfig() {
            return this.encryptConfig;
        }

    }

}
