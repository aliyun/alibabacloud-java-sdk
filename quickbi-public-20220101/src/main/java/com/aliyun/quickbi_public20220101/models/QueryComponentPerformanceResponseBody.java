// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryComponentPerformanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BCE45E6D-9304-4F94-86BB-5A772B1615FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryComponentPerformanceResponseBodyResult> result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryComponentPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryComponentPerformanceResponseBody self = new QueryComponentPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryComponentPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryComponentPerformanceResponseBody setResult(java.util.List<QueryComponentPerformanceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryComponentPerformanceResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryComponentPerformanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryComponentPerformanceResponseBodyResult extends TeaModel {
        /**
         * <p>The average duration of cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("CacheCostTimeAvg")
        public Double cacheCostTimeAvg;

        /**
         * <p>The number of cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CacheQueryCount")
        public Integer cacheQueryCount;

        /**
         * <p>The component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0696083a-ca72-4d89-8e7a-c017910e0***</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The name of the add-on.</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The average query duration associated with the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("CostTimeAvg")
        public Double costTimeAvg;

        /**
         * <p>The number of queries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("QueryCount")
        public Integer queryCount;

        /**
         * <p>The average number of queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("QueryCountAvg")
        public Double queryCountAvg;

        /**
         * <p>The query exceeds the 5S number of queries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("QueryOverFivePercentNum")
        public Double queryOverFivePercentNum;

        /**
         * <p>Query the proportion of more than 5S.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("QueryOverFiveSecPercent")
        public String queryOverFiveSecPercent;

        /**
         * <p>The percentage of queries that exceed 10s.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("QueryOverTenSecPercent")
        public String queryOverTenSecPercent;

        /**
         * <p>The percentage of queries that exceed 10s.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("QueryOverTenSecPercentNum")
        public Double queryOverTenSecPercentNum;

        /**
         * <p>The number of times that the chart query times out.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QueryTimeoutCount")
        public Integer queryTimeoutCount;

        /**
         * <p>The percentage of timeout times for chart queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("QueryTimeoutCountPercent")
        public Double queryTimeoutCountPercent;

        /**
         * <p>The average time consumed by the Quick engine query.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("QuickIndexCostTimeAvg")
        public Double quickIndexCostTimeAvg;

        /**
         * <p>The number of times that the Quick engine is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("QuickIndexQueryCount")
        public Integer quickIndexQueryCount;

        /**
         * <p>The proportion of duplicate queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("RepeatQueryPercent")
        public String repeatQueryPercent;

        /**
         * <p>The number of duplicate queries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RepeatQueryPercentNum")
        public Double repeatQueryPercentNum;

        /**
         * <p>The number of times the query is repeated.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RepeatSqlQueryCount")
        public Integer repeatSqlQueryCount;

        /**
         * <p>The proportion of duplicate queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
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
         * <p>ClusterRiskReport</p>
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
         * <p>The unique ID of the space.</p>
         * 
         * <strong>example:</strong>
         * <p>89713491-cb4f-4579-b889-e82c35f1****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the group.</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryComponentPerformanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryComponentPerformanceResponseBodyResult self = new QueryComponentPerformanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryComponentPerformanceResponseBodyResult setCacheCostTimeAvg(Double cacheCostTimeAvg) {
            this.cacheCostTimeAvg = cacheCostTimeAvg;
            return this;
        }
        public Double getCacheCostTimeAvg() {
            return this.cacheCostTimeAvg;
        }

        public QueryComponentPerformanceResponseBodyResult setCacheQueryCount(Integer cacheQueryCount) {
            this.cacheQueryCount = cacheQueryCount;
            return this;
        }
        public Integer getCacheQueryCount() {
            return this.cacheQueryCount;
        }

        public QueryComponentPerformanceResponseBodyResult setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public QueryComponentPerformanceResponseBodyResult setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryComponentPerformanceResponseBodyResult setCostTimeAvg(Double costTimeAvg) {
            this.costTimeAvg = costTimeAvg;
            return this;
        }
        public Double getCostTimeAvg() {
            return this.costTimeAvg;
        }

        public QueryComponentPerformanceResponseBodyResult setQueryCount(Integer queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Integer getQueryCount() {
            return this.queryCount;
        }

        public QueryComponentPerformanceResponseBodyResult setQueryCountAvg(Double queryCountAvg) {
            this.queryCountAvg = queryCountAvg;
            return this;
        }
        public Double getQueryCountAvg() {
            return this.queryCountAvg;
        }

        public QueryComponentPerformanceResponseBodyResult setQueryOverFivePercentNum(Double queryOverFivePercentNum) {
            this.queryOverFivePercentNum = queryOverFivePercentNum;
            return this;
        }
        public Double getQueryOverFivePercentNum() {
            return this.queryOverFivePercentNum;
        }

        public QueryComponentPerformanceResponseBodyResult setQueryOverFiveSecPercent(String queryOverFiveSecPercent) {
            this.queryOverFiveSecPercent = queryOverFiveSecPercent;
            return this;
        }
        public String getQueryOverFiveSecPercent() {
            return this.queryOverFiveSecPercent;
        }

        public QueryComponentPerformanceResponseBodyResult setQueryOverTenSecPercent(String queryOverTenSecPercent) {
            this.queryOverTenSecPercent = queryOverTenSecPercent;
            return this;
        }
        public String getQueryOverTenSecPercent() {
            return this.queryOverTenSecPercent;
        }

        public QueryComponentPerformanceResponseBodyResult setQueryOverTenSecPercentNum(Double queryOverTenSecPercentNum) {
            this.queryOverTenSecPercentNum = queryOverTenSecPercentNum;
            return this;
        }
        public Double getQueryOverTenSecPercentNum() {
            return this.queryOverTenSecPercentNum;
        }

        public QueryComponentPerformanceResponseBodyResult setQueryTimeoutCount(Integer queryTimeoutCount) {
            this.queryTimeoutCount = queryTimeoutCount;
            return this;
        }
        public Integer getQueryTimeoutCount() {
            return this.queryTimeoutCount;
        }

        public QueryComponentPerformanceResponseBodyResult setQueryTimeoutCountPercent(Double queryTimeoutCountPercent) {
            this.queryTimeoutCountPercent = queryTimeoutCountPercent;
            return this;
        }
        public Double getQueryTimeoutCountPercent() {
            return this.queryTimeoutCountPercent;
        }

        public QueryComponentPerformanceResponseBodyResult setQuickIndexCostTimeAvg(Double quickIndexCostTimeAvg) {
            this.quickIndexCostTimeAvg = quickIndexCostTimeAvg;
            return this;
        }
        public Double getQuickIndexCostTimeAvg() {
            return this.quickIndexCostTimeAvg;
        }

        public QueryComponentPerformanceResponseBodyResult setQuickIndexQueryCount(Integer quickIndexQueryCount) {
            this.quickIndexQueryCount = quickIndexQueryCount;
            return this;
        }
        public Integer getQuickIndexQueryCount() {
            return this.quickIndexQueryCount;
        }

        public QueryComponentPerformanceResponseBodyResult setRepeatQueryPercent(String repeatQueryPercent) {
            this.repeatQueryPercent = repeatQueryPercent;
            return this;
        }
        public String getRepeatQueryPercent() {
            return this.repeatQueryPercent;
        }

        public QueryComponentPerformanceResponseBodyResult setRepeatQueryPercentNum(Double repeatQueryPercentNum) {
            this.repeatQueryPercentNum = repeatQueryPercentNum;
            return this;
        }
        public Double getRepeatQueryPercentNum() {
            return this.repeatQueryPercentNum;
        }

        public QueryComponentPerformanceResponseBodyResult setRepeatSqlQueryCount(Integer repeatSqlQueryCount) {
            this.repeatSqlQueryCount = repeatSqlQueryCount;
            return this;
        }
        public Integer getRepeatSqlQueryCount() {
            return this.repeatSqlQueryCount;
        }

        public QueryComponentPerformanceResponseBodyResult setRepeatSqlQueryPercent(String repeatSqlQueryPercent) {
            this.repeatSqlQueryPercent = repeatSqlQueryPercent;
            return this;
        }
        public String getRepeatSqlQueryPercent() {
            return this.repeatSqlQueryPercent;
        }

        public QueryComponentPerformanceResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public QueryComponentPerformanceResponseBodyResult setReportName(String reportName) {
            this.reportName = reportName;
            return this;
        }
        public String getReportName() {
            return this.reportName;
        }

        public QueryComponentPerformanceResponseBodyResult setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public QueryComponentPerformanceResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryComponentPerformanceResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
