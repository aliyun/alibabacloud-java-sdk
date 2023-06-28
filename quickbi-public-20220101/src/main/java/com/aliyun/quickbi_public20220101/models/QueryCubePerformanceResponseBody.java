// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCubePerformanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryCubePerformanceResponseBodyResult> result;

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
