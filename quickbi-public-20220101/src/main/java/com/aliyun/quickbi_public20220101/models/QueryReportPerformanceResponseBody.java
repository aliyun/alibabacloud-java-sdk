// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReportPerformanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1FC71085-D5FD-08E0-813A-4D4BD1031BC5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryReportPerformanceResponseBodyResult> result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <p>The average duration of cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2</p>
         */
        @NameInMap("CacheCostTimeAvg")
        public Double cacheCostTimeAvg;

        /**
         * <p>The number of cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CacheQueryCount")
        public Integer cacheQueryCount;

        /**
         * <p>The number of times the chart is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentQueryCount")
        public Integer componentQueryCount;

        /**
         * <p>The average number of times the chart is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("ComponentQueryCountAvg")
        public Double componentQueryCountAvg;

        /**
         * <p>The average query duration associated with the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("CostTimeAvg")
        public Double costTimeAvg;

        /**
         * <p>The number of queries.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("QueryCount")
        public Integer queryCount;

        /**
         * <p>The average number of queries.</p>
         * 
         * <strong>example:</strong>
         * <p>3.3</p>
         */
        @NameInMap("QueryCountAvg")
        public Double queryCountAvg;

        /**
         * <p>The percentage of the number of queries that exceed the 5S.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("QueryOverFivePercentNum")
        public Double queryOverFivePercentNum;

        /**
         * <p>Query the proportion of more than 5S.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("QueryOverFiveSecPercent")
        public String queryOverFiveSecPercent;

        /**
         * <p>The percentage of queries that exceed 10s.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("QueryOverTenSecPercent")
        public String queryOverTenSecPercent;

        /**
         * <p>The number of queries that exceed 10 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("QueryOverTenSecPercentNum")
        public Double queryOverTenSecPercentNum;

        /**
         * <p>The number of times that the chart query times out.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueryTimeoutCount")
        public Integer queryTimeoutCount;

        /**
         * <p>The percentage of timeout times for chart queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("QueryTimeoutCountPercent")
        public Double queryTimeoutCountPercent;

        /**
         * <p>The average time consumed by the Quick engine query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QuickIndexCostTimeAvg")
        public Double quickIndexCostTimeAvg;

        /**
         * <p>The number of times that the Quick engine is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("QuickIndexQueryCount")
        public Integer quickIndexQueryCount;

        /**
         * <p>The proportion of duplicate queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("RepeatQueryPercent")
        public String repeatQueryPercent;

        /**
         * <p>The number of duplicate queries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RepeatQueryPercentNum")
        public Double repeatQueryPercentNum;

        /**
         * <p>The number of times the query is repeated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatSqlQueryCount")
        public Integer repeatSqlQueryCount;

        /**
         * <p>The proportion of duplicate queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("RepeatSqlQueryPercent")
        public String repeatSqlQueryPercent;

        /**
         * <p>The ID of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>6b407e50-e774-406b-9956-da2425c2****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The name of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterAddonUpgradeReport</p>
         */
        @NameInMap("ReportName")
        public String reportName;

        /**
         * <p>The format of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>report</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>The ID of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ab46ed33-6278-4ef7-8013-8c1335f266ee</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
