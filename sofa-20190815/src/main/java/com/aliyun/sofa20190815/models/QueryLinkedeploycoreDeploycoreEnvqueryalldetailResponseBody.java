// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData> data;

    public static QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody self = new QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBody setData(java.util.List<QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DevStage")
        public String devStage;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceGroupId")
        public String workspaceGroupId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData self = new QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
