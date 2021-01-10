// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutGetmvnrepoResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutGetmvnrepoResponseBodyResult> result;

    public static QueryLinkeBahamutGetmvnrepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutGetmvnrepoResponseBody self = new QueryLinkeBahamutGetmvnrepoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutGetmvnrepoResponseBody setResult(java.util.List<QueryLinkeBahamutGetmvnrepoResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutGetmvnrepoResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutGetmvnrepoResponseBodyResult extends TeaModel {
        @NameInMap("CanEdit")
        public Boolean canEdit;

        @NameInMap("FabricStage")
        public String fabricStage;

        @NameInMap("RepoFullName")
        public String repoFullName;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoUrl")
        public String repoUrl;

        @NameInMap("Type")
        public String type;

        public static QueryLinkeBahamutGetmvnrepoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutGetmvnrepoResponseBodyResult self = new QueryLinkeBahamutGetmvnrepoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutGetmvnrepoResponseBodyResult setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        public QueryLinkeBahamutGetmvnrepoResponseBodyResult setFabricStage(String fabricStage) {
            this.fabricStage = fabricStage;
            return this;
        }
        public String getFabricStage() {
            return this.fabricStage;
        }

        public QueryLinkeBahamutGetmvnrepoResponseBodyResult setRepoFullName(String repoFullName) {
            this.repoFullName = repoFullName;
            return this;
        }
        public String getRepoFullName() {
            return this.repoFullName;
        }

        public QueryLinkeBahamutGetmvnrepoResponseBodyResult setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public QueryLinkeBahamutGetmvnrepoResponseBodyResult setRepoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }
        public String getRepoUrl() {
            return this.repoUrl;
        }

        public QueryLinkeBahamutGetmvnrepoResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
