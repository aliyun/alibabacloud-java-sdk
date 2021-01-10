// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectDailyreportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectDailyreportResponseBodyResultContent resultContent;

    public static QueryHasInspectDailyreportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectDailyreportResponseBody self = new QueryHasInspectDailyreportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectDailyreportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectDailyreportResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectDailyreportResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectDailyreportResponseBody setResultContent(QueryHasInspectDailyreportResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectDailyreportResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectDailyreportResponseBodyResultContentData extends TeaModel {
        @NameInMap("SuccessRate")
        public String successRate;

        @NameInMap("Clean")
        public Boolean clean;

        @NameInMap("ReportDate")
        public Long reportDate;

        @NameInMap("RuleSum")
        public Long ruleSum;

        @NameInMap("ExecutionSum")
        public Long executionSum;

        @NameInMap("VerdictPassSum")
        public Long verdictPassSum;

        public static QueryHasInspectDailyreportResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectDailyreportResponseBodyResultContentData self = new QueryHasInspectDailyreportResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectDailyreportResponseBodyResultContentData setSuccessRate(String successRate) {
            this.successRate = successRate;
            return this;
        }
        public String getSuccessRate() {
            return this.successRate;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentData setClean(Boolean clean) {
            this.clean = clean;
            return this;
        }
        public Boolean getClean() {
            return this.clean;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentData setReportDate(Long reportDate) {
            this.reportDate = reportDate;
            return this;
        }
        public Long getReportDate() {
            return this.reportDate;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentData setRuleSum(Long ruleSum) {
            this.ruleSum = ruleSum;
            return this;
        }
        public Long getRuleSum() {
            return this.ruleSum;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentData setExecutionSum(Long executionSum) {
            this.executionSum = executionSum;
            return this;
        }
        public Long getExecutionSum() {
            return this.executionSum;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentData setVerdictPassSum(Long verdictPassSum) {
            this.verdictPassSum = verdictPassSum;
            return this;
        }
        public Long getVerdictPassSum() {
            return this.verdictPassSum;
        }

    }

    public static class QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode self = new QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason self = new QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectDailyreportResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasInspectDailyreportResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectDailyreportResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectDailyreportResponseBodyResultContent self = new QueryHasInspectDailyreportResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setData(java.util.List<QueryHasInspectDailyreportResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectDailyreportResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setTopErrorCode(QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectDailyreportResponseBodyResultContent setTopErrorReason(QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectDailyreportResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
