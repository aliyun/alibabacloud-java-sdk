// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReportPerformanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryReportPerformanceResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryReportPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReportPerformanceResponseBody self = new QueryReportPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReportPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReportPerformanceResponseBody setResult(java.util.List<QueryReportPerformanceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryReportPerformanceResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryReportPerformanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryReportPerformanceResponseBodyResult extends TeaModel {
        @NameInMap("CacheCostTimeAvg")
        public Double cacheCostTimeAvg;

        @NameInMap("CacheQueryCount")
        public Integer cacheQueryCount;

        @NameInMap("ComponentQueryCount")
        public Integer componentQueryCount;

        @NameInMap("ComponentQueryCountAvg")
        public Double componentQueryCountAvg;

        @NameInMap("CostTimeAvg")
        public Double costTimeAvg;

        @NameInMap("QueryCount")
        public Integer queryCount;

        @NameInMap("QueryCountAvg")
        public Double queryCountAvg;

        @NameInMap("QueryOverFivePercentNum")
        public Double queryOverFivePercentNum;

        @NameInMap("QueryOverFiveSecPercent")
        public String queryOverFiveSecPercent;

        @NameInMap("QueryOverTenSecPercent")
        public String queryOverTenSecPercent;

        @NameInMap("QueryOverTenSecPercentNum")
        public Double queryOverTenSecPercentNum;

        @NameInMap("QueryTimeoutCount")
        public Integer queryTimeoutCount;

        @NameInMap("QueryTimeoutCountPercent")
        public Double queryTimeoutCountPercent;

        @NameInMap("QuickIndexCostTimeAvg")
        public Double quickIndexCostTimeAvg;

        @NameInMap("QuickIndexQueryCount")
        public Integer quickIndexQueryCount;

        @NameInMap("RepeatQueryPercent")
        public String repeatQueryPercent;

        @NameInMap("RepeatQueryPercentNum")
        public Double repeatQueryPercentNum;

        @NameInMap("RepeatSqlQueryCount")
        public Integer repeatSqlQueryCount;

        @NameInMap("RepeatSqlQueryPercent")
        public String repeatSqlQueryPercent;

        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("ReportName")
        public String reportName;

        @NameInMap("ReportType")
        public String reportType;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryReportPerformanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryReportPerformanceResponseBodyResult self = new QueryReportPerformanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryReportPerformanceResponseBodyResult setCacheCostTimeAvg(Double cacheCostTimeAvg) {
            this.cacheCostTimeAvg = cacheCostTimeAvg;
            return this;
        }
        public Double getCacheCostTimeAvg() {
            return this.cacheCostTimeAvg;
        }

        public QueryReportPerformanceResponseBodyResult setCacheQueryCount(Integer cacheQueryCount) {
            this.cacheQueryCount = cacheQueryCount;
            return this;
        }
        public Integer getCacheQueryCount() {
            return this.cacheQueryCount;
        }

        public QueryReportPerformanceResponseBodyResult setComponentQueryCount(Integer componentQueryCount) {
            this.componentQueryCount = componentQueryCount;
            return this;
        }
        public Integer getComponentQueryCount() {
            return this.componentQueryCount;
        }

        public QueryReportPerformanceResponseBodyResult setComponentQueryCountAvg(Double componentQueryCountAvg) {
            this.componentQueryCountAvg = componentQueryCountAvg;
            return this;
        }
        public Double getComponentQueryCountAvg() {
            return this.componentQueryCountAvg;
        }

        public QueryReportPerformanceResponseBodyResult setCostTimeAvg(Double costTimeAvg) {
            this.costTimeAvg = costTimeAvg;
            return this;
        }
        public Double getCostTimeAvg() {
            return this.costTimeAvg;
        }

        public QueryReportPerformanceResponseBodyResult setQueryCount(Integer queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Integer getQueryCount() {
            return this.queryCount;
        }

        public QueryReportPerformanceResponseBodyResult setQueryCountAvg(Double queryCountAvg) {
            this.queryCountAvg = queryCountAvg;
            return this;
        }
        public Double getQueryCountAvg() {
            return this.queryCountAvg;
        }

        public QueryReportPerformanceResponseBodyResult setQueryOverFivePercentNum(Double queryOverFivePercentNum) {
            this.queryOverFivePercentNum = queryOverFivePercentNum;
            return this;
        }
        public Double getQueryOverFivePercentNum() {
            return this.queryOverFivePercentNum;
        }

        public QueryReportPerformanceResponseBodyResult setQueryOverFiveSecPercent(String queryOverFiveSecPercent) {
            this.queryOverFiveSecPercent = queryOverFiveSecPercent;
            return this;
        }
        public String getQueryOverFiveSecPercent() {
            return this.queryOverFiveSecPercent;
        }

        public QueryReportPerformanceResponseBodyResult setQueryOverTenSecPercent(String queryOverTenSecPercent) {
            this.queryOverTenSecPercent = queryOverTenSecPercent;
            return this;
        }
        public String getQueryOverTenSecPercent() {
            return this.queryOverTenSecPercent;
        }

        public QueryReportPerformanceResponseBodyResult setQueryOverTenSecPercentNum(Double queryOverTenSecPercentNum) {
            this.queryOverTenSecPercentNum = queryOverTenSecPercentNum;
            return this;
        }
        public Double getQueryOverTenSecPercentNum() {
            return this.queryOverTenSecPercentNum;
        }

        public QueryReportPerformanceResponseBodyResult setQueryTimeoutCount(Integer queryTimeoutCount) {
            this.queryTimeoutCount = queryTimeoutCount;
            return this;
        }
        public Integer getQueryTimeoutCount() {
            return this.queryTimeoutCount;
        }

        public QueryReportPerformanceResponseBodyResult setQueryTimeoutCountPercent(Double queryTimeoutCountPercent) {
            this.queryTimeoutCountPercent = queryTimeoutCountPercent;
            return this;
        }
        public Double getQueryTimeoutCountPercent() {
            return this.queryTimeoutCountPercent;
        }

        public QueryReportPerformanceResponseBodyResult setQuickIndexCostTimeAvg(Double quickIndexCostTimeAvg) {
            this.quickIndexCostTimeAvg = quickIndexCostTimeAvg;
            return this;
        }
        public Double getQuickIndexCostTimeAvg() {
            return this.quickIndexCostTimeAvg;
        }

        public QueryReportPerformanceResponseBodyResult setQuickIndexQueryCount(Integer quickIndexQueryCount) {
            this.quickIndexQueryCount = quickIndexQueryCount;
            return this;
        }
        public Integer getQuickIndexQueryCount() {
            return this.quickIndexQueryCount;
        }

        public QueryReportPerformanceResponseBodyResult setRepeatQueryPercent(String repeatQueryPercent) {
            this.repeatQueryPercent = repeatQueryPercent;
            return this;
        }
        public String getRepeatQueryPercent() {
            return this.repeatQueryPercent;
        }

        public QueryReportPerformanceResponseBodyResult setRepeatQueryPercentNum(Double repeatQueryPercentNum) {
            this.repeatQueryPercentNum = repeatQueryPercentNum;
            return this;
        }
        public Double getRepeatQueryPercentNum() {
            return this.repeatQueryPercentNum;
        }

        public QueryReportPerformanceResponseBodyResult setRepeatSqlQueryCount(Integer repeatSqlQueryCount) {
            this.repeatSqlQueryCount = repeatSqlQueryCount;
            return this;
        }
        public Integer getRepeatSqlQueryCount() {
            return this.repeatSqlQueryCount;
        }

        public QueryReportPerformanceResponseBodyResult setRepeatSqlQueryPercent(String repeatSqlQueryPercent) {
            this.repeatSqlQueryPercent = repeatSqlQueryPercent;
            return this;
        }
        public String getRepeatSqlQueryPercent() {
            return this.repeatSqlQueryPercent;
        }

        public QueryReportPerformanceResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public QueryReportPerformanceResponseBodyResult setReportName(String reportName) {
            this.reportName = reportName;
            return this;
        }
        public String getReportName() {
            return this.reportName;
        }

        public QueryReportPerformanceResponseBodyResult setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public QueryReportPerformanceResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryReportPerformanceResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
