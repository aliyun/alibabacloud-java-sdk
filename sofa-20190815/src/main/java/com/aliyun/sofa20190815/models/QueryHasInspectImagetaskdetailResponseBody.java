// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectImagetaskdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectImagetaskdetailResponseBodyResultContent resultContent;

    public static QueryHasInspectImagetaskdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectImagetaskdetailResponseBody self = new QueryHasInspectImagetaskdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectImagetaskdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectImagetaskdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectImagetaskdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectImagetaskdetailResponseBody setResultContent(QueryHasInspectImagetaskdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectImagetaskdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectImagetaskdetailResponseBodyResultContentData extends TeaModel {
        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("OpsId")
        public String opsId;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("CaseType")
        public String caseType;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CaseName")
        public String caseName;

        @NameInMap("CaseLevel")
        public String caseLevel;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("CaseStatus")
        public String caseStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasInspectImagetaskdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectImagetaskdetailResponseBodyResultContentData self = new QueryHasInspectImagetaskdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setOpsId(String opsId) {
            this.opsId = opsId;
            return this;
        }
        public String getOpsId() {
            return this.opsId;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setCaseType(String caseType) {
            this.caseType = caseType;
            return this;
        }
        public String getCaseType() {
            return this.caseType;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setCaseName(String caseName) {
            this.caseName = caseName;
            return this;
        }
        public String getCaseName() {
            return this.caseName;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setCaseLevel(String caseLevel) {
            this.caseLevel = caseLevel;
            return this;
        }
        public String getCaseLevel() {
            return this.caseLevel;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setCaseStatus(String caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public String getCaseStatus() {
            return this.caseStatus;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode self = new QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason self = new QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectImagetaskdetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Data")
        public java.util.List<QueryHasInspectImagetaskdetailResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectImagetaskdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectImagetaskdetailResponseBodyResultContent self = new QueryHasInspectImagetaskdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setData(java.util.List<QueryHasInspectImagetaskdetailResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectImagetaskdetailResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setTopErrorCode(QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectImagetaskdetailResponseBodyResultContent setTopErrorReason(QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectImagetaskdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
