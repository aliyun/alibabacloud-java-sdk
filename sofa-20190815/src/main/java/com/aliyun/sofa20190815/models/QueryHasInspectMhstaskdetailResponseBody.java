// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectMhstaskdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectMhstaskdetailResponseBodyResultContent resultContent;

    public static QueryHasInspectMhstaskdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectMhstaskdetailResponseBody self = new QueryHasInspectMhstaskdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectMhstaskdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectMhstaskdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectMhstaskdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectMhstaskdetailResponseBody setResultContent(QueryHasInspectMhstaskdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectMhstaskdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectMhstaskdetailResponseBodyResultContentData extends TeaModel {
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

        public static QueryHasInspectMhstaskdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectMhstaskdetailResponseBodyResultContentData self = new QueryHasInspectMhstaskdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setMpaasProdType(String mpaasProdType) {
            this.mpaasProdType = mpaasProdType;
            return this;
        }
        public String getMpaasProdType() {
            return this.mpaasProdType;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setMhsTaskId(String mhsTaskId) {
            this.mhsTaskId = mhsTaskId;
            return this;
        }
        public String getMhsTaskId() {
            return this.mhsTaskId;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setCaseId(String caseId) {
            this.caseId = caseId;
            return this;
        }
        public String getCaseId() {
            return this.caseId;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setCaseName(String caseName) {
            this.caseName = caseName;
            return this;
        }
        public String getCaseName() {
            return this.caseName;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setExeId(String exeId) {
            this.exeId = exeId;
            return this;
        }
        public String getExeId() {
            return this.exeId;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setServicesStr(String servicesStr) {
            this.servicesStr = servicesStr;
            return this;
        }
        public String getServicesStr() {
            return this.servicesStr;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode self = new QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason self = new QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectMhstaskdetailResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasInspectMhstaskdetailResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectMhstaskdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectMhstaskdetailResponseBodyResultContent self = new QueryHasInspectMhstaskdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setData(java.util.List<QueryHasInspectMhstaskdetailResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectMhstaskdetailResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setTopErrorCode(QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectMhstaskdetailResponseBodyResultContent setTopErrorReason(QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectMhstaskdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
