// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisImagetaskdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisImagetaskdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisImagetaskdetailResponseBody self = new QueryHasDiagnosisImagetaskdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisImagetaskdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisImagetaskdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisImagetaskdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisImagetaskdetailResponseBody setResultContent(QueryHasDiagnosisImagetaskdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData extends TeaModel {
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

        public static QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData self = new QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setOpsId(String opsId) {
            this.opsId = opsId;
            return this;
        }
        public String getOpsId() {
            return this.opsId;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setCaseType(String caseType) {
            this.caseType = caseType;
            return this;
        }
        public String getCaseType() {
            return this.caseType;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setCaseName(String caseName) {
            this.caseName = caseName;
            return this;
        }
        public String getCaseName() {
            return this.caseName;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setCaseLevel(String caseLevel) {
            this.caseLevel = caseLevel;
            return this;
        }
        public String getCaseLevel() {
            return this.caseLevel;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setCaseStatus(String caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public String getCaseStatus() {
            return this.caseStatus;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisImagetaskdetailResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisImagetaskdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisImagetaskdetailResponseBodyResultContent self = new QueryHasDiagnosisImagetaskdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisImagetaskdetailResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisImagetaskdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
