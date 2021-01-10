// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody extends TeaModel {
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
    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult result;

    public static QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody self = new QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody setResult(QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ReadNeedOwnerAudit")
        public Boolean readNeedOwnerAudit;

        @NameInMap("ReadSecLevel")
        public String readSecLevel;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoUrl")
        public String repoUrl;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("WriteNeedOwnerAudit")
        public Boolean writeNeedOwnerAudit;

        @NameInMap("WriteSecLevel")
        public String writeSecLevel;

        public static QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult self = new QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setReadNeedOwnerAudit(Boolean readNeedOwnerAudit) {
            this.readNeedOwnerAudit = readNeedOwnerAudit;
            return this;
        }
        public Boolean getReadNeedOwnerAudit() {
            return this.readNeedOwnerAudit;
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setReadSecLevel(String readSecLevel) {
            this.readSecLevel = readSecLevel;
            return this;
        }
        public String getReadSecLevel() {
            return this.readSecLevel;
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setRepoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }
        public String getRepoUrl() {
            return this.repoUrl;
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setWriteNeedOwnerAudit(Boolean writeNeedOwnerAudit) {
            this.writeNeedOwnerAudit = writeNeedOwnerAudit;
            return this;
        }
        public Boolean getWriteNeedOwnerAudit() {
            return this.writeNeedOwnerAudit;
        }

        public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBodyResult setWriteSecLevel(String writeSecLevel) {
            this.writeSecLevel = writeSecLevel;
            return this;
        }
        public String getWriteSecLevel() {
            return this.writeSecLevel;
        }

    }

}
