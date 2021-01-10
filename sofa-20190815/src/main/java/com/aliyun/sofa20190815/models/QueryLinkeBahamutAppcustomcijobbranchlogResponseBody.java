// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcijobbranchlogResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult> result;

    public static QueryLinkeBahamutAppcustomcijobbranchlogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcijobbranchlogResponseBody self = new QueryLinkeBahamutAppcustomcijobbranchlogResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody setResult(java.util.List<QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("CommitMessage")
        public String commitMessage;

        @NameInMap("Context")
        public String context;

        @NameInMap("Created")
        public Long created;

        @NameInMap("CustomCIId")
        public String customCIId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ExecutionDate")
        public Long executionDate;

        @NameInMap("ExecutionId")
        public Long executionId;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsLatest")
        public Boolean isLatest;

        @NameInMap("LastCommitId")
        public String lastCommitId;

        @NameInMap("LastExecuted")
        public Long lastExecuted;

        @NameInMap("LastExecuteCost")
        public Long lastExecuteCost;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("PipelineInstanceId")
        public Long pipelineInstanceId;

        @NameInMap("PipelineTemplateId")
        public Long pipelineTemplateId;

        @NameInMap("PipelineTemplateName")
        public String pipelineTemplateName;

        @NameInMap("Quality")
        public String quality;

        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult self = new QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setCommitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            return this;
        }
        public String getCommitMessage() {
            return this.commitMessage;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setCustomCIId(String customCIId) {
            this.customCIId = customCIId;
            return this;
        }
        public String getCustomCIId() {
            return this.customCIId;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setExecutionDate(Long executionDate) {
            this.executionDate = executionDate;
            return this;
        }
        public Long getExecutionDate() {
            return this.executionDate;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setExecutionId(Long executionId) {
            this.executionId = executionId;
            return this;
        }
        public Long getExecutionId() {
            return this.executionId;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setIsLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setLastCommitId(String lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }
        public String getLastCommitId() {
            return this.lastCommitId;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setLastExecuted(Long lastExecuted) {
            this.lastExecuted = lastExecuted;
            return this;
        }
        public Long getLastExecuted() {
            return this.lastExecuted;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setLastExecuteCost(Long lastExecuteCost) {
            this.lastExecuteCost = lastExecuteCost;
            return this;
        }
        public Long getLastExecuteCost() {
            return this.lastExecuteCost;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setPipelineInstanceId(Long pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public Long getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setPipelineTemplateId(Long pipelineTemplateId) {
            this.pipelineTemplateId = pipelineTemplateId;
            return this;
        }
        public Long getPipelineTemplateId() {
            return this.pipelineTemplateId;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setPipelineTemplateName(String pipelineTemplateName) {
            this.pipelineTemplateName = pipelineTemplateName;
            return this;
        }
        public String getPipelineTemplateName() {
            return this.pipelineTemplateName;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setQuality(String quality) {
            this.quality = quality;
            return this;
        }
        public String getQuality() {
            return this.quality;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutAppcustomcijobbranchlogResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
