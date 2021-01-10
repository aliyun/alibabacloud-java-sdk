// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdminworkspaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public SaveLinkeBahamutAdminworkspaceResponseBodyResult result;

    public static SaveLinkeBahamutAdminworkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdminworkspaceResponseBody self = new SaveLinkeBahamutAdminworkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveLinkeBahamutAdminworkspaceResponseBody setResult(SaveLinkeBahamutAdminworkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SaveLinkeBahamutAdminworkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public static class SaveLinkeBahamutAdminworkspaceResponseBodyResult extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AccessSecret")
        public String accessSecret;

        @NameInMap("CloudTenant")
        public String cloudTenant;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Created")
        public Long created;

        @NameInMap("CrossCloud")
        public Boolean crossCloud;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("DefaultUse")
        public Boolean defaultUse;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("LinkETenant")
        public String linkETenant;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Type")
        public String type;

        @NameInMap("Use")
        public String use;

        @NameInMap("WorkspaceGroupId")
        public String workspaceGroupId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static SaveLinkeBahamutAdminworkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SaveLinkeBahamutAdminworkspaceResponseBodyResult self = new SaveLinkeBahamutAdminworkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setCloudTenant(String cloudTenant) {
            this.cloudTenant = cloudTenant;
            return this;
        }
        public String getCloudTenant() {
            return this.cloudTenant;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setCrossCloud(Boolean crossCloud) {
            this.crossCloud = crossCloud;
            return this;
        }
        public Boolean getCrossCloud() {
            return this.crossCloud;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setDefaultUse(Boolean defaultUse) {
            this.defaultUse = defaultUse;
            return this;
        }
        public Boolean getDefaultUse() {
            return this.defaultUse;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setLinkETenant(String linkETenant) {
            this.linkETenant = linkETenant;
            return this;
        }
        public String getLinkETenant() {
            return this.linkETenant;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setUse(String use) {
            this.use = use;
            return this;
        }
        public String getUse() {
            return this.use;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public SaveLinkeBahamutAdminworkspaceResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
