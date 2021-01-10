// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateGWAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateGWAppResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateGWAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGWAppResponseBody self = new CreateGWAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGWAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGWAppResponseBody setData(CreateGWAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGWAppResponseBodyData getData() {
        return this.data;
    }

    public CreateGWAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateGWAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateGWAppResponseBodyDataEncryptConfig extends TeaModel {
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("EncryptionStatus")
        public String encryptionStatus;

        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("PrivateKey")
        public String privateKey;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("KeyPair")
        public String keyPair;

        @NameInMap("PubKey")
        public String pubKey;

        public static CreateGWAppResponseBodyDataEncryptConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGWAppResponseBodyDataEncryptConfig self = new CreateGWAppResponseBodyDataEncryptConfig();
            return TeaModel.build(map, self);
        }

        public CreateGWAppResponseBodyDataEncryptConfig setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public CreateGWAppResponseBodyDataEncryptConfig setEncryptionStatus(String encryptionStatus) {
            this.encryptionStatus = encryptionStatus;
            return this;
        }
        public String getEncryptionStatus() {
            return this.encryptionStatus;
        }

        public CreateGWAppResponseBodyDataEncryptConfig setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public CreateGWAppResponseBodyDataEncryptConfig setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public CreateGWAppResponseBodyDataEncryptConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateGWAppResponseBodyDataEncryptConfig setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public CreateGWAppResponseBodyDataEncryptConfig setPubKey(String pubKey) {
            this.pubKey = pubKey;
            return this;
        }
        public String getPubKey() {
            return this.pubKey;
        }

    }

    public static class CreateGWAppResponseBodyDataAuthenticationConfig extends TeaModel {
        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("AccessKey")
        public String accessKey;

        public static CreateGWAppResponseBodyDataAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGWAppResponseBodyDataAuthenticationConfig self = new CreateGWAppResponseBodyDataAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public CreateGWAppResponseBodyDataAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public CreateGWAppResponseBodyDataAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

    }

    public static class CreateGWAppResponseBodyData extends TeaModel {
        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("EncryptConfig")
        public CreateGWAppResponseBodyDataEncryptConfig encryptConfig;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("AuthenticationConfig")
        public CreateGWAppResponseBodyDataAuthenticationConfig authenticationConfig;

        @NameInMap("TenantId")
        public String tenantId;

        public static CreateGWAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGWAppResponseBodyData self = new CreateGWAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGWAppResponseBodyData setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public CreateGWAppResponseBodyData setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public CreateGWAppResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateGWAppResponseBodyData setEncryptConfig(CreateGWAppResponseBodyDataEncryptConfig encryptConfig) {
            this.encryptConfig = encryptConfig;
            return this;
        }
        public CreateGWAppResponseBodyDataEncryptConfig getEncryptConfig() {
            return this.encryptConfig;
        }

        public CreateGWAppResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public CreateGWAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateGWAppResponseBodyData setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public CreateGWAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateGWAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateGWAppResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateGWAppResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateGWAppResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public CreateGWAppResponseBodyData setAuthenticationConfig(CreateGWAppResponseBodyDataAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public CreateGWAppResponseBodyDataAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

        public CreateGWAppResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
