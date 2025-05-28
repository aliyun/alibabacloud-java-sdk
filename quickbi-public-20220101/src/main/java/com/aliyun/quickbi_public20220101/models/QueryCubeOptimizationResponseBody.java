// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCubeOptimizationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The query results are returned.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryCubeOptimizationResponseBodyResult> result;

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

    public static QueryCubeOptimizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCubeOptimizationResponseBody self = new QueryCubeOptimizationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCubeOptimizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCubeOptimizationResponseBody setResult(java.util.List<QueryCubeOptimizationResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryCubeOptimizationResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryCubeOptimizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel extends TeaModel {
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
         * <p>2</p>
         */
        @NameInMap("CacheQueryCount")
        public Integer cacheQueryCount;

        /**
         * <p>The average query duration associated with the SQL pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("CostTimeAvg")
        public Double costTimeAvg;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3e45b61a-9ba8-4c7c-8248-8dbe69945636</p>
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
         * <p>2</p>
         */
        @NameInMap("QueryCountAvg")
        public Double queryCountAvg;

        /**
         * <p>The percentage of the number of queries that exceed the 5S.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
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
         * <p>0.1</p>
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
         * <p>1</p>
         */
        @NameInMap("QuickIndexCostTimeAvg")
        public Double quickIndexCostTimeAvg;

        /**
         * <p>The number of times that the Quick engine is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("QuickIndexQueryCount")
        public Integer quickIndexQueryCount;

        /**
         * <p>The proportion of duplicate queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
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
         * <p>2</p>
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
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6ea74bff-c818-4188-b462-dbb45a24dbac</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>eco0sh0prods</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel build(java.util.Map<String, ?> map) throws Exception {
            QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel self = new QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel();
            return TeaModel.build(map, self);
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setCacheCostTimeAvg(Double cacheCostTimeAvg) {
            this.cacheCostTimeAvg = cacheCostTimeAvg;
            return this;
        }
        public Double getCacheCostTimeAvg() {
            return this.cacheCostTimeAvg;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setCacheQueryCount(Integer cacheQueryCount) {
            this.cacheQueryCount = cacheQueryCount;
            return this;
        }
        public Integer getCacheQueryCount() {
            return this.cacheQueryCount;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setCostTimeAvg(Double costTimeAvg) {
            this.costTimeAvg = costTimeAvg;
            return this;
        }
        public Double getCostTimeAvg() {
            return this.costTimeAvg;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setCubeName(String cubeName) {
            this.cubeName = cubeName;
            return this;
        }
        public String getCubeName() {
            return this.cubeName;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQueryCount(Integer queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Integer getQueryCount() {
            return this.queryCount;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQueryCountAvg(Double queryCountAvg) {
            this.queryCountAvg = queryCountAvg;
            return this;
        }
        public Double getQueryCountAvg() {
            return this.queryCountAvg;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQueryOverFivePercentNum(Double queryOverFivePercentNum) {
            this.queryOverFivePercentNum = queryOverFivePercentNum;
            return this;
        }
        public Double getQueryOverFivePercentNum() {
            return this.queryOverFivePercentNum;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQueryOverFiveSecPercent(String queryOverFiveSecPercent) {
            this.queryOverFiveSecPercent = queryOverFiveSecPercent;
            return this;
        }
        public String getQueryOverFiveSecPercent() {
            return this.queryOverFiveSecPercent;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQueryOverTenSecPercent(String queryOverTenSecPercent) {
            this.queryOverTenSecPercent = queryOverTenSecPercent;
            return this;
        }
        public String getQueryOverTenSecPercent() {
            return this.queryOverTenSecPercent;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQueryOverTenSecPercentNum(Double queryOverTenSecPercentNum) {
            this.queryOverTenSecPercentNum = queryOverTenSecPercentNum;
            return this;
        }
        public Double getQueryOverTenSecPercentNum() {
            return this.queryOverTenSecPercentNum;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQueryTimeoutCount(Integer queryTimeoutCount) {
            this.queryTimeoutCount = queryTimeoutCount;
            return this;
        }
        public Integer getQueryTimeoutCount() {
            return this.queryTimeoutCount;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQueryTimeoutCountPercent(Double queryTimeoutCountPercent) {
            this.queryTimeoutCountPercent = queryTimeoutCountPercent;
            return this;
        }
        public Double getQueryTimeoutCountPercent() {
            return this.queryTimeoutCountPercent;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQuickIndexCostTimeAvg(Double quickIndexCostTimeAvg) {
            this.quickIndexCostTimeAvg = quickIndexCostTimeAvg;
            return this;
        }
        public Double getQuickIndexCostTimeAvg() {
            return this.quickIndexCostTimeAvg;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setQuickIndexQueryCount(Integer quickIndexQueryCount) {
            this.quickIndexQueryCount = quickIndexQueryCount;
            return this;
        }
        public Integer getQuickIndexQueryCount() {
            return this.quickIndexQueryCount;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setRepeatQueryPercent(String repeatQueryPercent) {
            this.repeatQueryPercent = repeatQueryPercent;
            return this;
        }
        public String getRepeatQueryPercent() {
            return this.repeatQueryPercent;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setRepeatQueryPercentNum(Double repeatQueryPercentNum) {
            this.repeatQueryPercentNum = repeatQueryPercentNum;
            return this;
        }
        public Double getRepeatQueryPercentNum() {
            return this.repeatQueryPercentNum;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setRepeatSqlQueryCount(Integer repeatSqlQueryCount) {
            this.repeatSqlQueryCount = repeatSqlQueryCount;
            return this;
        }
        public Integer getRepeatSqlQueryCount() {
            return this.repeatSqlQueryCount;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setRepeatSqlQueryPercent(String repeatSqlQueryPercent) {
            this.repeatSqlQueryPercent = repeatSqlQueryPercent;
            return this;
        }
        public String getRepeatSqlQueryPercent() {
            return this.repeatSqlQueryPercent;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryCubeOptimizationResponseBodyResult extends TeaModel {
        /**
         * <p>The type of the suggestion. Valid values:</p>
         * <ul>
         * <li><strong>OPEN_CACHE</strong>: Open cache.</li>
         * <li><strong>OPEN_QUICK_ENGINE</strong>: Open FAST Cache.</li>
         * <li><strong>INCREASE_CACHE_TIME</strong>: Increase the cache time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPENQUICKENGINE</p>
         */
        @NameInMap("AdviceType")
        public String adviceType;

        /**
         * <p>The diagnostic information about the dataset.</p>
         */
        @NameInMap("CubePerformanceDiagnoseModel")
        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel cubePerformanceDiagnoseModel;

        public static QueryCubeOptimizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCubeOptimizationResponseBodyResult self = new QueryCubeOptimizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryCubeOptimizationResponseBodyResult setAdviceType(String adviceType) {
            this.adviceType = adviceType;
            return this;
        }
        public String getAdviceType() {
            return this.adviceType;
        }

        public QueryCubeOptimizationResponseBodyResult setCubePerformanceDiagnoseModel(QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel cubePerformanceDiagnoseModel) {
            this.cubePerformanceDiagnoseModel = cubePerformanceDiagnoseModel;
            return this;
        }
        public QueryCubeOptimizationResponseBodyResultCubePerformanceDiagnoseModel getCubePerformanceDiagnoseModel() {
            return this.cubePerformanceDiagnoseModel;
        }

    }

}
