// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLPlansResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 执行计划信息
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
        // 平均执行时间 (ms)
        @NameInMap("AvgExecutionMS")
        public Float avgExecutionMS;

        @NameInMap("AvgExecutionTimeMS")
        public Long avgExecutionTimeMS;

        // 首次加载时间
        @NameInMap("FirstLoadTime")
        public Long firstLoadTime;

        // 首次加载时间(零时区)
        @NameInMap("FirstLoadTimeUTCString")
        public String firstLoadTimeUTCString;

        // 命中次数
        @NameInMap("HitCount")
        public Integer hitCount;

        // 合并版本
        @NameInMap("MergedVersion")
        public Integer mergedVersion;

        // 节点ip
        @NameInMap("NodeIp")
        public String nodeIp;

        // Outline数据
        @NameInMap("OutlineData")
        public String outlineData;

        // OutlineID
        @NameInMap("OutlineId")
        public Long outlineId;

        // 绑定时间
        @NameInMap("OutlineTime")
        public Long outlineTime;

        // 绑定时间(零时区)
        @NameInMap("OutlineTimeUTCString")
        public String outlineTimeUTCString;

        // SQL的完整执行计划
        @NameInMap("PlanFull")
        public String planFull;

        // SQL执行计划在数据库内部的ID
        @NameInMap("PlanId")
        public Integer planId;

        // 计划信息
        @NameInMap("PlanInfo")
        public String planInfo;

        // SQL执行计划在诊断系统内部的唯一标识
        @NameInMap("PlanUnionHash")
        public String planUnionHash;

        // 查询sql
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
