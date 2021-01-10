// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWorkspacewithoutakResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutWorkspacewithoutakResponseBodyResult> result;

    public static QueryLinkeBahamutWorkspacewithoutakResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWorkspacewithoutakResponseBody self = new QueryLinkeBahamutWorkspacewithoutakResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponseBody setResult(java.util.List<QueryLinkeBahamutWorkspacewithoutakResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutWorkspacewithoutakResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutWorkspacewithoutakResponseBodyResult extends TeaModel {
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

        public static QueryLinkeBahamutWorkspacewithoutakResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkspacewithoutakResponseBodyResult self = new QueryLinkeBahamutWorkspacewithoutakResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setCloudTenant(String cloudTenant) {
            this.cloudTenant = cloudTenant;
            return this;
        }
        public String getCloudTenant() {
            return this.cloudTenant;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setCrossCloud(Boolean crossCloud) {
            this.crossCloud = crossCloud;
            return this;
        }
        public Boolean getCrossCloud() {
            return this.crossCloud;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setDefaultUse(Boolean defaultUse) {
            this.defaultUse = defaultUse;
            return this;
        }
        public Boolean getDefaultUse() {
            return this.defaultUse;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setLinkETenant(String linkETenant) {
            this.linkETenant = linkETenant;
            return this;
        }
        public String getLinkETenant() {
            return this.linkETenant;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setUse(String use) {
            this.use = use;
            return this;
        }
        public String getUse() {
            return this.use;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryLinkeBahamutWorkspacewithoutakResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
