// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCubePerformanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>685072a0-1fd5-40ef-ae6b-cf94e79e718f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Array of report objects</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryCubePerformanceResponseBodyResult> result;

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

    public static QueryCubePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCubePerformanceResponseBody self = new QueryCubePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCubePerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCubePerformanceResponseBody setResult(java.util.List<QueryCubePerformanceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryCubePerformanceResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryCubePerformanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCubePerformanceResponseBodyResult extends TeaModel {
        /**
         * <p>The average duration of cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The average query duration associated with the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CostTimeAvg")
        public Double costTimeAvg;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        @NameInMap("CubeId")
        public String cubeId;

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CubeName")
        public String cubeName;

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
         * <p>1</p>
         */
        @NameInMap("QueryCountAvg")
        public Double queryCountAvg;

        /**
         * <p>The percentage of the number of queries that exceed the 5S.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("QueryOverFivePercentNum")
        public Double queryOverFivePercentNum;

        /**
         * <p>Query the proportion of more than 5S.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("QueryOverFiveSecPercent")
        public String queryOverFiveSecPercent;

        /**
         * <p>The percentage of queries that exceed 10s.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("QueryOverTenSecPercent")
        public String queryOverTenSecPercent;

        /**
         * <p>The percentage of queries that exceed 10s.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
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
         * <p>1</p>
         */
        @NameInMap("QueryTimeoutCountPercent")
        public Double queryTimeoutCountPercent;

        /**
         * <p>The average time consumed by the Quick engine query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QuickIndexCostTimeAvg")
        public Double quickIndexCostTimeAvg;

        /**
         * <p>The number of times that the Quick engine is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>1</p>
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
         * <p>1</p>
         */
        @NameInMap("RepeatSqlQueryPercent")
        public String repeatSqlQueryPercent;

        /**
         * <p>The ID of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>87c6b145-090c-43e1-9426-8f93be23****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>taascontainerprod</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryCubePerformanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCubePerformanceResponseBodyResult self = new QueryCubePerformanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryCubePerformanceResponseBodyResult setCacheCostTimeAvg(Double cacheCostTimeAvg) {
            this.cacheCostTimeAvg = cacheCostTimeAvg;
            return this;
        }
        public Double getCacheCostTimeAvg() {
            return this.cacheCostTimeAvg;
        }

        public QueryCubePerformanceResponseBodyResult setCacheQueryCount(Integer cacheQueryCount) {
            this.cacheQueryCount = cacheQueryCount;
            return this;
        }
        public Integer getCacheQueryCount() {
            return this.cacheQueryCount;
        }

        public QueryCubePerformanceResponseBodyResult setCostTimeAvg(Double costTimeAvg) {
            this.costTimeAvg = costTimeAvg;
            return this;
        }
        public Double getCostTimeAvg() {
            return this.costTimeAvg;
        }

        public QueryCubePerformanceResponseBodyResult setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

        public QueryCubePerformanceResponseBodyResult setCubeName(String cubeName) {
            this.cubeName = cubeName;
            return this;
        }
        public String getCubeName() {
            return this.cubeName;
        }

        public QueryCubePerformanceResponseBodyResult setQueryCount(Integer queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Integer getQueryCount() {
            return this.queryCount;
        }

        public QueryCubePerformanceResponseBodyResult setQueryCountAvg(Double queryCountAvg) {
            this.queryCountAvg = queryCountAvg;
            return this;
        }
        public Double getQueryCountAvg() {
            return this.queryCountAvg;
        }

        public QueryCubePerformanceResponseBodyResult setQueryOverFivePercentNum(Double queryOverFivePercentNum) {
            this.queryOverFivePercentNum = queryOverFivePercentNum;
            return this;
        }
        public Double getQueryOverFivePercentNum() {
            return this.queryOverFivePercentNum;
        }

        public QueryCubePerformanceResponseBodyResult setQueryOverFiveSecPercent(String queryOverFiveSecPercent) {
            this.queryOverFiveSecPercent = queryOverFiveSecPercent;
            return this;
        }
        public String getQueryOverFiveSecPercent() {
            return this.queryOverFiveSecPercent;
        }

        public QueryCubePerformanceResponseBodyResult setQueryOverTenSecPercent(String queryOverTenSecPercent) {
            this.queryOverTenSecPercent = queryOverTenSecPercent;
            return this;
        }
        public String getQueryOverTenSecPercent() {
            return this.queryOverTenSecPercent;
        }

        public QueryCubePerformanceResponseBodyResult setQueryOverTenSecPercentNum(Double queryOverTenSecPercentNum) {
            this.queryOverTenSecPercentNum = queryOverTenSecPercentNum;
            return this;
        }
        public Double getQueryOverTenSecPercentNum() {
            return this.queryOverTenSecPercentNum;
        }

        public QueryCubePerformanceResponseBodyResult setQueryTimeoutCount(Integer queryTimeoutCount) {
            this.queryTimeoutCount = queryTimeoutCount;
            return this;
        }
        public Integer getQueryTimeoutCount() {
            return this.queryTimeoutCount;
        }

        public QueryCubePerformanceResponseBodyResult setQueryTimeoutCountPercent(Double queryTimeoutCountPercent) {
            this.queryTimeoutCountPercent = queryTimeoutCountPercent;
            return this;
        }
        public Double getQueryTimeoutCountPercent() {
            return this.queryTimeoutCountPercent;
        }

        public QueryCubePerformanceResponseBodyResult setQuickIndexCostTimeAvg(Double quickIndexCostTimeAvg) {
            this.quickIndexCostTimeAvg = quickIndexCostTimeAvg;
            return this;
        }
        public Double getQuickIndexCostTimeAvg() {
            return this.quickIndexCostTimeAvg;
        }

        public QueryCubePerformanceResponseBodyResult setQuickIndexQueryCount(Integer quickIndexQueryCount) {
            this.quickIndexQueryCount = quickIndexQueryCount;
            return this;
        }
        public Integer getQuickIndexQueryCount() {
            return this.quickIndexQueryCount;
        }

        public QueryCubePerformanceResponseBodyResult setRepeatQueryPercent(String repeatQueryPercent) {
            this.repeatQueryPercent = repeatQueryPercent;
            return this;
        }
        public String getRepeatQueryPercent() {
            return this.repeatQueryPercent;
        }

        public QueryCubePerformanceResponseBodyResult setRepeatQueryPercentNum(Double repeatQueryPercentNum) {
            this.repeatQueryPercentNum = repeatQueryPercentNum;
            return this;
        }
        public Double getRepeatQueryPercentNum() {
            return this.repeatQueryPercentNum;
        }

        public QueryCubePerformanceResponseBodyResult setRepeatSqlQueryCount(Integer repeatSqlQueryCount) {
            this.repeatSqlQueryCount = repeatSqlQueryCount;
            return this;
        }
        public Integer getRepeatSqlQueryCount() {
            return this.repeatSqlQueryCount;
        }

        public QueryCubePerformanceResponseBodyResult setRepeatSqlQueryPercent(String repeatSqlQueryPercent) {
            this.repeatSqlQueryPercent = repeatSqlQueryPercent;
            return this;
        }
        public String getRepeatSqlQueryPercent() {
            return this.repeatSqlQueryPercent;
        }

        public QueryCubePerformanceResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCubePerformanceResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
