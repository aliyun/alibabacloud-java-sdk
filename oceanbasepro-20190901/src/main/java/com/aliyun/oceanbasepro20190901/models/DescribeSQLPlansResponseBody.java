// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLPlansResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the execution plan.</p>
     */
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
        /**
         * <p>The average execution duration, in ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AvgExecutionMS")
        public Float avgExecutionMS;

        /**
         * <p>The average execution duration when the database uses this execution plan, in ms.</p>
         * 
         * <strong>example:</strong>
         * <p>288</p>
         */
        @NameInMap("AvgExecutionTimeMS")
        public Long avgExecutionTimeMS;

        /**
         * <p>The time when the plan was loaded for the first time, .</p>
         * 
         * <strong>example:</strong>
         * <p>1641492303000</p>
         */
        @NameInMap("FirstLoadTime")
        public Long firstLoadTime;

        /**
         * <p>The time when the plan was loaded for the first time, in UTC +0.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-06T18:05:03Z</p>
         */
        @NameInMap("FirstLoadTimeUTCString")
        public String firstLoadTimeUTCString;

        /**
         * <p>The number of hits.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HitCount")
        public Integer hitCount;

        /**
         * <p>The major compaction version.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        @NameInMap("MergedVersion")
        public Integer mergedVersion;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp16niirq4zdmgvm****</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>The outline data.</p>
         */
        @NameInMap("OutlineData")
        public String outlineData;

        /**
         * <p>OutlineID.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("OutlineId")
        public Long outlineId;

        /**
         * <p>The time when the plan was bound.</p>
         * 
         * <strong>example:</strong>
         * <p>1641492303000</p>
         */
        @NameInMap("OutlineTime")
        public Long outlineTime;

        /**
         * <p>The time when the plan was bound, in UTC +0.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-06T18:05:03Z</p>
         */
        @NameInMap("OutlineTimeUTCString")
        public String outlineTimeUTCString;

        /**
         * <p>The complete execution plan of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>PHY_TABLE_SCAN | bmsql_order_line | 40 ******</p>
         */
        @NameInMap("PlanFull")
        public String planFull;

        /**
         * <p>The ID of the SQL execution plan in the database.</p>
         * 
         * <strong>example:</strong>
         * <p>9114</p>
         */
        @NameInMap("PlanId")
        public Integer planId;

        /**
         * <p>The information about the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>PHY_TABLE_SCAN</p>
         */
        @NameInMap("PlanInfo")
        public String planInfo;

        /**
         * <p>The unique identifier of the SQL execution plan in the diagnostic system.</p>
         * 
         * <strong>example:</strong>
         * <p>859ef7ee<strong><strong>b23ac98cdeb2476f</strong></strong></p>
         */
        @NameInMap("PlanUnionHash")
        public String planUnionHash;

        /**
         * <p>The query SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT ol_i_id, ***, *** FROM aaa</p>
         */
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
