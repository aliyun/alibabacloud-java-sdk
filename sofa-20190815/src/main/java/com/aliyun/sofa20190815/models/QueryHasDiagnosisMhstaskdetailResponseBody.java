// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisMhstaskdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisMhstaskdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisMhstaskdetailResponseBody self = new QueryHasDiagnosisMhstaskdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisMhstaskdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisMhstaskdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisMhstaskdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisMhstaskdetailResponseBody setResultContent(QueryHasDiagnosisMhstaskdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData extends TeaModel {
        @NameInMap("MpaasProdType")
        public String mpaasProdType;

        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("MhsTaskId")
        public String mhsTaskId;

        @NameInMap("CaseId")
        public String caseId;

        @NameInMap("CaseName")
        public String caseName;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("ExeId")
        public String exeId;

        @NameInMap("ServicesStr")
        public String servicesStr;

        @NameInMap("State")
        public String state;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData self = new QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setMpaasProdType(String mpaasProdType) {
            this.mpaasProdType = mpaasProdType;
            return this;
        }
        public String getMpaasProdType() {
            return this.mpaasProdType;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setMhsTaskId(String mhsTaskId) {
            this.mhsTaskId = mhsTaskId;
            return this;
        }
        public String getMhsTaskId() {
            return this.mhsTaskId;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setCaseId(String caseId) {
            this.caseId = caseId;
            return this;
        }
        public String getCaseId() {
            return this.caseId;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setCaseName(String caseName) {
            this.caseName = caseName;
            return this;
        }
        public String getCaseName() {
            return this.caseName;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setExeId(String exeId) {
            this.exeId = exeId;
            return this;
        }
        public String getExeId() {
            return this.exeId;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setServicesStr(String servicesStr) {
            this.servicesStr = servicesStr;
            return this;
        }
        public String getServicesStr() {
            return this.servicesStr;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisMhstaskdetailResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisMhstaskdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisMhstaskdetailResponseBodyResultContent self = new QueryHasDiagnosisMhstaskdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisMhstaskdetailResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisMhstaskdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
