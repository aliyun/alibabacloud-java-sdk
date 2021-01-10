// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAntcloudappResponseBody extends TeaModel {
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
    public QueryLinkeBahamutAntcloudappResponseBodyResult result;

    public static QueryLinkeBahamutAntcloudappResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAntcloudappResponseBody self = new QueryLinkeBahamutAntcloudappResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAntcloudappResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAntcloudappResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAntcloudappResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAntcloudappResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAntcloudappResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAntcloudappResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAntcloudappResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAntcloudappResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAntcloudappResponseBody setResult(QueryLinkeBahamutAntcloudappResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutAntcloudappResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAntcloudappResponseBodyResult extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("AppGroupName")
        public String appGroupName;

        @NameInMap("AppLevel")
        public String appLevel;

        @NameInMap("BuildpackName")
        public String buildpackName;

        @NameInMap("BuildpackVersion")
        public String buildpackVersion;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("HasImported")
        public Boolean hasImported;

        @NameInMap("OwnerLoginName")
        public String ownerLoginName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TechV2")
        public Boolean techV2;

        public static QueryLinkeBahamutAntcloudappResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAntcloudappResponseBodyResult self = new QueryLinkeBahamutAntcloudappResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setAppLevel(String appLevel) {
            this.appLevel = appLevel;
            return this;
        }
        public String getAppLevel() {
            return this.appLevel;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setBuildpackName(String buildpackName) {
            this.buildpackName = buildpackName;
            return this;
        }
        public String getBuildpackName() {
            return this.buildpackName;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setBuildpackVersion(String buildpackVersion) {
            this.buildpackVersion = buildpackVersion;
            return this;
        }
        public String getBuildpackVersion() {
            return this.buildpackVersion;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setHasImported(Boolean hasImported) {
            this.hasImported = hasImported;
            return this;
        }
        public Boolean getHasImported() {
            return this.hasImported;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setOwnerLoginName(String ownerLoginName) {
            this.ownerLoginName = ownerLoginName;
            return this;
        }
        public String getOwnerLoginName() {
            return this.ownerLoginName;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutAntcloudappResponseBodyResult setTechV2(Boolean techV2) {
            this.techV2 = techV2;
            return this;
        }
        public Boolean getTechV2() {
            return this.techV2;
        }

    }

}
