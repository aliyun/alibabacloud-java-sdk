// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaOutdatedtaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public QueryLinkeLinkaOutdatedtaskResponseBodyResult result;

    public static QueryLinkeLinkaOutdatedtaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaOutdatedtaskResponseBody self = new QueryLinkeLinkaOutdatedtaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaOutdatedtaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaOutdatedtaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaOutdatedtaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaOutdatedtaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaOutdatedtaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaOutdatedtaskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaOutdatedtaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaOutdatedtaskResponseBody setResult(QueryLinkeLinkaOutdatedtaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeLinkaOutdatedtaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaOutdatedtaskResponseBodyResult extends TeaModel {
        @NameInMap("AciConsoleUrl")
        public String aciConsoleUrl;

        @NameInMap("AciMode")
        public Boolean aciMode;

        @NameInMap("AciTenant")
        public String aciTenant;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("CallbackUrl")
        public String callbackUrl;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("CustomToken")
        public String customToken;

        @NameInMap("CustomUser")
        public String customUser;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("DiffOverflow")
        public Boolean diffOverflow;

        @NameInMap("DiffToolarge")
        public Boolean diffToolarge;

        @NameInMap("Encode")
        public String encode;

        @NameInMap("EndAt")
        public Long endAt;

        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("GitUrl")
        public String gitUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("LocalPath")
        public String localPath;

        @NameInMap("Message")
        public String message;

        @NameInMap("ParentTaskId")
        public String parentTaskId;

        @NameInMap("RuleSetName")
        public String ruleSetName;

        @NameInMap("ScanKind")
        public String scanKind;

        @NameInMap("StartedAt")
        public Long startedAt;

        @NameInMap("StartCommitId")
        public String startCommitId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Excludes")
        public java.util.List<String> excludes;

        @NameInMap("RuleSets")
        public java.util.List<String> ruleSets;

        @NameInMap("SubTasks")
        public java.util.List<String> subTasks;

        public static QueryLinkeLinkaOutdatedtaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaOutdatedtaskResponseBodyResult self = new QueryLinkeLinkaOutdatedtaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setAciConsoleUrl(String aciConsoleUrl) {
            this.aciConsoleUrl = aciConsoleUrl;
            return this;
        }
        public String getAciConsoleUrl() {
            return this.aciConsoleUrl;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setAciMode(Boolean aciMode) {
            this.aciMode = aciMode;
            return this;
        }
        public Boolean getAciMode() {
            return this.aciMode;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setAciTenant(String aciTenant) {
            this.aciTenant = aciTenant;
            return this;
        }
        public String getAciTenant() {
            return this.aciTenant;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setCustomToken(String customToken) {
            this.customToken = customToken;
            return this;
        }
        public String getCustomToken() {
            return this.customToken;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setCustomUser(String customUser) {
            this.customUser = customUser;
            return this;
        }
        public String getCustomUser() {
            return this.customUser;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setDiffOverflow(Boolean diffOverflow) {
            this.diffOverflow = diffOverflow;
            return this;
        }
        public Boolean getDiffOverflow() {
            return this.diffOverflow;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setDiffToolarge(Boolean diffToolarge) {
            this.diffToolarge = diffToolarge;
            return this;
        }
        public Boolean getDiffToolarge() {
            return this.diffToolarge;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setEncode(String encode) {
            this.encode = encode;
            return this;
        }
        public String getEncode() {
            return this.encode;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setEndAt(Long endAt) {
            this.endAt = endAt;
            return this;
        }
        public Long getEndAt() {
            return this.endAt;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setGitUrl(String gitUrl) {
            this.gitUrl = gitUrl;
            return this;
        }
        public String getGitUrl() {
            return this.gitUrl;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setLocalPath(String localPath) {
            this.localPath = localPath;
            return this;
        }
        public String getLocalPath() {
            return this.localPath;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setParentTaskId(String parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }
        public String getParentTaskId() {
            return this.parentTaskId;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setRuleSetName(String ruleSetName) {
            this.ruleSetName = ruleSetName;
            return this;
        }
        public String getRuleSetName() {
            return this.ruleSetName;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setScanKind(String scanKind) {
            this.scanKind = scanKind;
            return this;
        }
        public String getScanKind() {
            return this.scanKind;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setStartedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public Long getStartedAt() {
            return this.startedAt;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setStartCommitId(String startCommitId) {
            this.startCommitId = startCommitId;
            return this;
        }
        public String getStartCommitId() {
            return this.startCommitId;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setExcludes(java.util.List<String> excludes) {
            this.excludes = excludes;
            return this;
        }
        public java.util.List<String> getExcludes() {
            return this.excludes;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setRuleSets(java.util.List<String> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }
        public java.util.List<String> getRuleSets() {
            return this.ruleSets;
        }

        public QueryLinkeLinkaOutdatedtaskResponseBodyResult setSubTasks(java.util.List<String> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<String> getSubTasks() {
            return this.subTasks;
        }

    }

}
