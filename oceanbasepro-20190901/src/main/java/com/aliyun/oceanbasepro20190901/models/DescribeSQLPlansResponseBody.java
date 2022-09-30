// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLPlansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQLPlans")
    public java.util.List<DescribeSQLPlansResponseBodySQLPlans> SQLPlans;

    public static DescribeSQLPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlansResponseBody self = new DescribeSQLPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLPlansResponseBody setSQLPlans(java.util.List<DescribeSQLPlansResponseBodySQLPlans> SQLPlans) {
        this.SQLPlans = SQLPlans;
        return this;
    }
    public java.util.List<DescribeSQLPlansResponseBodySQLPlans> getSQLPlans() {
        return this.SQLPlans;
    }

    public static class DescribeSQLPlansResponseBodySQLPlans extends TeaModel {
        @NameInMap("AvgExecutionMS")
        public Float avgExecutionMS;

        @NameInMap("AvgExecutionTimeMS")
        public Long avgExecutionTimeMS;

        @NameInMap("FirstLoadTime")
        public Long firstLoadTime;

        @NameInMap("FirstLoadTimeUTCString")
        public String firstLoadTimeUTCString;

        @NameInMap("HitCount")
        public Integer hitCount;

        @NameInMap("MergedVersion")
        public Integer mergedVersion;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("OutlineData")
        public String outlineData;

        @NameInMap("OutlineId")
        public Long outlineId;

        @NameInMap("OutlineTime")
        public Long outlineTime;

        @NameInMap("OutlineTimeUTCString")
        public String outlineTimeUTCString;

        @NameInMap("PlanFull")
        public String planFull;

        @NameInMap("PlanId")
        public Integer planId;

        @NameInMap("PlanInfo")
        public String planInfo;

        @NameInMap("PlanUnionHash")
        public String planUnionHash;

        @NameInMap("QuerySQL")
        public String querySQL;

        public static DescribeSQLPlansResponseBodySQLPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlansResponseBodySQLPlans self = new DescribeSQLPlansResponseBodySQLPlans();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlansResponseBodySQLPlans setAvgExecutionMS(Float avgExecutionMS) {
            this.avgExecutionMS = avgExecutionMS;
            return this;
        }
        public Float getAvgExecutionMS() {
            return this.avgExecutionMS;
        }

        public DescribeSQLPlansResponseBodySQLPlans setAvgExecutionTimeMS(Long avgExecutionTimeMS) {
            this.avgExecutionTimeMS = avgExecutionTimeMS;
            return this;
        }
        public Long getAvgExecutionTimeMS() {
            return this.avgExecutionTimeMS;
        }

        public DescribeSQLPlansResponseBodySQLPlans setFirstLoadTime(Long firstLoadTime) {
            this.firstLoadTime = firstLoadTime;
            return this;
        }
        public Long getFirstLoadTime() {
            return this.firstLoadTime;
        }

        public DescribeSQLPlansResponseBodySQLPlans setFirstLoadTimeUTCString(String firstLoadTimeUTCString) {
            this.firstLoadTimeUTCString = firstLoadTimeUTCString;
            return this;
        }
        public String getFirstLoadTimeUTCString() {
            return this.firstLoadTimeUTCString;
        }

        public DescribeSQLPlansResponseBodySQLPlans setHitCount(Integer hitCount) {
            this.hitCount = hitCount;
            return this;
        }
        public Integer getHitCount() {
            return this.hitCount;
        }

        public DescribeSQLPlansResponseBodySQLPlans setMergedVersion(Integer mergedVersion) {
            this.mergedVersion = mergedVersion;
            return this;
        }
        public Integer getMergedVersion() {
            return this.mergedVersion;
        }

        public DescribeSQLPlansResponseBodySQLPlans setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeSQLPlansResponseBodySQLPlans setOutlineData(String outlineData) {
            this.outlineData = outlineData;
            return this;
        }
        public String getOutlineData() {
            return this.outlineData;
        }

        public DescribeSQLPlansResponseBodySQLPlans setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public DescribeSQLPlansResponseBodySQLPlans setOutlineTime(Long outlineTime) {
            this.outlineTime = outlineTime;
            return this;
        }
        public Long getOutlineTime() {
            return this.outlineTime;
        }

        public DescribeSQLPlansResponseBodySQLPlans setOutlineTimeUTCString(String outlineTimeUTCString) {
            this.outlineTimeUTCString = outlineTimeUTCString;
            return this;
        }
        public String getOutlineTimeUTCString() {
            return this.outlineTimeUTCString;
        }

        public DescribeSQLPlansResponseBodySQLPlans setPlanFull(String planFull) {
            this.planFull = planFull;
            return this;
        }
        public String getPlanFull() {
            return this.planFull;
        }

        public DescribeSQLPlansResponseBodySQLPlans setPlanId(Integer planId) {
            this.planId = planId;
            return this;
        }
        public Integer getPlanId() {
            return this.planId;
        }

        public DescribeSQLPlansResponseBodySQLPlans setPlanInfo(String planInfo) {
            this.planInfo = planInfo;
            return this;
        }
        public String getPlanInfo() {
            return this.planInfo;
        }

        public DescribeSQLPlansResponseBodySQLPlans setPlanUnionHash(String planUnionHash) {
            this.planUnionHash = planUnionHash;
            return this;
        }
        public String getPlanUnionHash() {
            return this.planUnionHash;
        }

        public DescribeSQLPlansResponseBodySQLPlans setQuerySQL(String querySQL) {
            this.querySQL = querySQL;
            return this;
        }
        public String getQuerySQL() {
            return this.querySQL;
        }

    }

}
