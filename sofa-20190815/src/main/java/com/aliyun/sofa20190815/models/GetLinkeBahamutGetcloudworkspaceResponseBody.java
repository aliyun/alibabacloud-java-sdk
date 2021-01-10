// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetcloudworkspaceResponseBody extends TeaModel {
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
    public GetLinkeBahamutGetcloudworkspaceResponseBodyResult result;

    public static GetLinkeBahamutGetcloudworkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetcloudworkspaceResponseBody self = new GetLinkeBahamutGetcloudworkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutGetcloudworkspaceResponseBody setResult(GetLinkeBahamutGetcloudworkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutGetcloudworkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutGetcloudworkspaceResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutGetcloudworkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutGetcloudworkspaceResponseBodyResult self = new GetLinkeBahamutGetcloudworkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setCloudTenant(String cloudTenant) {
            this.cloudTenant = cloudTenant;
            return this;
        }
        public String getCloudTenant() {
            return this.cloudTenant;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setCrossCloud(Boolean crossCloud) {
            this.crossCloud = crossCloud;
            return this;
        }
        public Boolean getCrossCloud() {
            return this.crossCloud;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setDefaultUse(Boolean defaultUse) {
            this.defaultUse = defaultUse;
            return this;
        }
        public Boolean getDefaultUse() {
            return this.defaultUse;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setLinkETenant(String linkETenant) {
            this.linkETenant = linkETenant;
            return this;
        }
        public String getLinkETenant() {
            return this.linkETenant;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setUse(String use) {
            this.use = use;
            return this;
        }
        public String getUse() {
            return this.use;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetLinkeBahamutGetcloudworkspaceResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
