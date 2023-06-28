// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCubeOptimizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryCubeOptimizationResponseBodyResult> result;

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
        @NameInMap("CacheCostTimeAvg")
        public Double cacheCostTimeAvg;

        @NameInMap("CacheQueryCount")
        public Integer cacheQueryCount;

        @NameInMap("CostTimeAvg")
        public Double costTimeAvg;

        @NameInMap("CubeId")
        public String cubeId;

        @NameInMap("CubeName")
        public String cubeName;

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

        @NameInMap("WorkspaceId")
        public String workspaceId;

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
        @NameInMap("AdviceType")
        public String adviceType;

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
