// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSQLPlansResponseBody extends TeaModel {
    /**
     * <p>The list of SQL execution plan.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeOasSQLPlansResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOasSQLPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSQLPlansResponseBody self = new DescribeOasSQLPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOasSQLPlansResponseBody setData(java.util.List<DescribeOasSQLPlansResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOasSQLPlansResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOasSQLPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOasSQLPlansResponseBodyDataPlanExplain extends TeaModel {
        /**
         * <p>JSON string of the SQL execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;RootOperations\&quot;:[{\&quot;Children\</p>
         */
        @NameInMap("PlanJsonString")
        public String planJsonString;

        public static DescribeOasSQLPlansResponseBodyDataPlanExplain build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasSQLPlansResponseBodyDataPlanExplain self = new DescribeOasSQLPlansResponseBodyDataPlanExplain();
            return TeaModel.build(map, self);
        }

        public DescribeOasSQLPlansResponseBodyDataPlanExplain setPlanJsonString(String planJsonString) {
            this.planJsonString = planJsonString;
            return this;
        }
        public String getPlanJsonString() {
            return this.planJsonString;
        }

    }

    public static class DescribeOasSQLPlansResponseBodyDataPlans extends TeaModel {
        /**
         * <p>Average Application event waiting time (in milliseconds) during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AvgApplicationWaitTime")
        public Double avgApplicationWaitTime;

        /**
         * <p>Average cache read count during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>30137.03</p>
         */
        @NameInMap("AvgBufferGets")
        public Double avgBufferGets;

        /**
         * <p>Average Concurrency event waiting time (in milliseconds) during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AvgConcurrencyWaitTime")
        public Double avgConcurrencyWaitTime;

        /**
         * <p>Average CPU time (in milliseconds) during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>1875.34</p>
         */
        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        /**
         * <p>The average physical read count during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AvgDiskReads")
        public Double avgDiskReads;

        /**
         * <p>The average physical write count during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AvgDiskWrites")
        public Double avgDiskWrites;

        /**
         * <p>Average interval waiting time (in milliseconds) during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>1876.78</p>
         */
        @NameInMap("AvgElapsedTime")
        public Double avgElapsedTime;

        /**
         * <p>Average row processing waiting time (in milliseconds) during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("AvgRowProcessed")
        public Double avgRowProcessed;

        /**
         * <p>Average UserIo event waiting time (in milliseconds) during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AvgUserIoWaitTime")
        public Double avgUserIoWaitTime;

        /**
         * <p>Collection time.</p>
         * 
         * <strong>example:</strong>
         * <p>1684368****00000</p>
         */
        @NameInMap("CollectTimeUs")
        public Long collectTimeUs;

        /**
         * <p>Percentage of delayed long-running queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("DelayedLargeQueryPercentage")
        public Double delayedLargeQueryPercentage;

        /**
         * <p>The average execution count per second during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>0.31</p>
         */
        @NameInMap("ExecPs")
        public Double execPs;

        /**
         * <p>The total number of executions during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>First time to load the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-12T04:46:38Z</p>
         */
        @NameInMap("FirstLoadTime")
        public String firstLoadTime;

        /**
         * <p>First loading time.</p>
         * 
         * <strong>example:</strong>
         * <p>1684****03289441</p>
         */
        @NameInMap("FirstLoadTimeUs")
        public Long firstLoadTimeUs;

        /**
         * <p>Whether to hit the diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HitDiagnosis")
        public Boolean hitDiagnosis;

        /**
         * <p>Hit rate.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("HitPercentage")
        public Double hitPercentage;

        /**
         * <p>Percentage of completed long-running queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("LargeQueryPercentage")
        public Double largeQueryPercentage;

        /**
         * <p>Merge version.</p>
         * 
         * <strong>example:</strong>
         * <p>513</p>
         */
        @NameInMap("MergedVersion")
        public Long mergedVersion;

        /**
         * <p>Database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11006****828</p>
         */
        @NameInMap("ObDbId")
        public Long obDbId;

        /**
         * <p>Server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ObServerId")
        public Long obServerId;

        /**
         * <p>The outline_data parameter of the SQL execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>/*+ BEGIN_OUTLINE_DATA INDEX(@\&quot;SEL$1\</p>
         */
        @NameInMap("OutlineData")
        public String outlineData;

        /**
         * <p>Outline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("OutlineId")
        public Long outlineId;

        /**
         * <p>The internal identifier of the SQL execution plan in the diagnostic system.</p>
         * 
         * <strong>example:</strong>
         * <p>-86290582****886880</p>
         */
        @NameInMap("PlanHash")
        public String planHash;

        /**
         * <p>The ID of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>590****</p>
         */
        @NameInMap("PlanId")
        public Long planId;

        /**
         * <p>Plan size.</p>
         * 
         * <strong>example:</strong>
         * <p>10****</p>
         */
        @NameInMap("PlanSize")
        public Long planSize;

        /**
         * <p>Plan type, including LOCAL, REMOTE, DIST.</p>
         * 
         * <strong>example:</strong>
         * <p>LOCAL</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The internal unique identifier of the SQL execution plan in the diagnostic system.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;52c7c53<strong><strong>53e61b3f7586b17</strong></strong>ad&quot;</p>
         */
        @NameInMap("PlanUnionHash")
        public String planUnionHash;

        /**
         * <p>Schema version.</p>
         * 
         * <strong>example:</strong>
         * <p>16838****3550464</p>
         */
        @NameInMap("SchemaVersion")
        public Long schemaVersion;

        /**
         * <p>The server where the SQL is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1db1a9us038****jio</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The ID of the backend server instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ServerId")
        public Long serverId;

        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>Whether a full table scan is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TableScan")
        public Boolean tableScan;

        /**
         * <p>Percentage of timeouts.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("TimeoutPercentage")
        public Double timeoutPercentage;

        /**
         * <p>The unique identifier of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAAAAAAI<strong><strong>AAFoT2QAF--7W</strong></strong></p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeOasSQLPlansResponseBodyDataPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasSQLPlansResponseBodyDataPlans self = new DescribeOasSQLPlansResponseBodyDataPlans();
            return TeaModel.build(map, self);
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgApplicationWaitTime(Double avgApplicationWaitTime) {
            this.avgApplicationWaitTime = avgApplicationWaitTime;
            return this;
        }
        public Double getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgBufferGets(Double avgBufferGets) {
            this.avgBufferGets = avgBufferGets;
            return this;
        }
        public Double getAvgBufferGets() {
            return this.avgBufferGets;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
            this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
            return this;
        }
        public Double getAvgConcurrencyWaitTime() {
            return this.avgConcurrencyWaitTime;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgCpuTime(Double avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgDiskReads(Double avgDiskReads) {
            this.avgDiskReads = avgDiskReads;
            return this;
        }
        public Double getAvgDiskReads() {
            return this.avgDiskReads;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgDiskWrites(Double avgDiskWrites) {
            this.avgDiskWrites = avgDiskWrites;
            return this;
        }
        public Double getAvgDiskWrites() {
            return this.avgDiskWrites;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgElapsedTime(Double avgElapsedTime) {
            this.avgElapsedTime = avgElapsedTime;
            return this;
        }
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgRowProcessed(Double avgRowProcessed) {
            this.avgRowProcessed = avgRowProcessed;
            return this;
        }
        public Double getAvgRowProcessed() {
            return this.avgRowProcessed;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setAvgUserIoWaitTime(Double avgUserIoWaitTime) {
            this.avgUserIoWaitTime = avgUserIoWaitTime;
            return this;
        }
        public Double getAvgUserIoWaitTime() {
            return this.avgUserIoWaitTime;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setCollectTimeUs(Long collectTimeUs) {
            this.collectTimeUs = collectTimeUs;
            return this;
        }
        public Long getCollectTimeUs() {
            return this.collectTimeUs;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setDelayedLargeQueryPercentage(Double delayedLargeQueryPercentage) {
            this.delayedLargeQueryPercentage = delayedLargeQueryPercentage;
            return this;
        }
        public Double getDelayedLargeQueryPercentage() {
            return this.delayedLargeQueryPercentage;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setExecPs(Double execPs) {
            this.execPs = execPs;
            return this;
        }
        public Double getExecPs() {
            return this.execPs;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setFirstLoadTime(String firstLoadTime) {
            this.firstLoadTime = firstLoadTime;
            return this;
        }
        public String getFirstLoadTime() {
            return this.firstLoadTime;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setFirstLoadTimeUs(Long firstLoadTimeUs) {
            this.firstLoadTimeUs = firstLoadTimeUs;
            return this;
        }
        public Long getFirstLoadTimeUs() {
            return this.firstLoadTimeUs;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setHitDiagnosis(Boolean hitDiagnosis) {
            this.hitDiagnosis = hitDiagnosis;
            return this;
        }
        public Boolean getHitDiagnosis() {
            return this.hitDiagnosis;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setHitPercentage(Double hitPercentage) {
            this.hitPercentage = hitPercentage;
            return this;
        }
        public Double getHitPercentage() {
            return this.hitPercentage;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setLargeQueryPercentage(Double largeQueryPercentage) {
            this.largeQueryPercentage = largeQueryPercentage;
            return this;
        }
        public Double getLargeQueryPercentage() {
            return this.largeQueryPercentage;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setMergedVersion(Long mergedVersion) {
            this.mergedVersion = mergedVersion;
            return this;
        }
        public Long getMergedVersion() {
            return this.mergedVersion;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setObDbId(Long obDbId) {
            this.obDbId = obDbId;
            return this;
        }
        public Long getObDbId() {
            return this.obDbId;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setObServerId(Long obServerId) {
            this.obServerId = obServerId;
            return this;
        }
        public Long getObServerId() {
            return this.obServerId;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setOutlineData(String outlineData) {
            this.outlineData = outlineData;
            return this;
        }
        public String getOutlineData() {
            return this.outlineData;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setPlanHash(String planHash) {
            this.planHash = planHash;
            return this;
        }
        public String getPlanHash() {
            return this.planHash;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setPlanSize(Long planSize) {
            this.planSize = planSize;
            return this;
        }
        public Long getPlanSize() {
            return this.planSize;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setPlanUnionHash(String planUnionHash) {
            this.planUnionHash = planUnionHash;
            return this;
        }
        public String getPlanUnionHash() {
            return this.planUnionHash;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setSchemaVersion(Long schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setServerId(Long serverId) {
            this.serverId = serverId;
            return this;
        }
        public Long getServerId() {
            return this.serverId;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setTableScan(Boolean tableScan) {
            this.tableScan = tableScan;
            return this;
        }
        public Boolean getTableScan() {
            return this.tableScan;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setTimeoutPercentage(Double timeoutPercentage) {
            this.timeoutPercentage = timeoutPercentage;
            return this;
        }
        public Double getTimeoutPercentage() {
            return this.timeoutPercentage;
        }

        public DescribeOasSQLPlansResponseBodyDataPlans setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class DescribeOasSQLPlansResponseBodyData extends TeaModel {
        /**
         * <p>Average CPU time (in milliseconds) during the execution period.</p>
         * 
         * <strong>example:</strong>
         * <p>1875.34</p>
         */
        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        /**
         * <p>Whether to bind the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Bounded")
        public Boolean bounded;

        /**
         * <p>Execution count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>First loading time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-12T04:46:38Z</p>
         */
        @NameInMap("FirstLoadTime")
        public String firstLoadTime;

        /**
         * <p>Whether to hit the diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HitDiagnosis")
        public Boolean hitDiagnosis;

        /**
         * <p>Hit rate.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("HitPercentage")
        public Double hitPercentage;

        /**
         * <p>Merge version.</p>
         * 
         * <strong>example:</strong>
         * <p>513</p>
         */
        @NameInMap("MergedVersion")
        public Long mergedVersion;

        /**
         * <p>Execution plan.</p>
         */
        @NameInMap("PlanExplain")
        public DescribeOasSQLPlansResponseBodyDataPlanExplain planExplain;

        /**
         * <p>The internal identifier of the SQL execution plan in the diagnostic system.</p>
         * 
         * <strong>example:</strong>
         * <p>1758<strong><strong>24913166</strong></strong></p>
         */
        @NameInMap("PlanHash")
        public String planHash;

        /**
         * <p>Execution plan type.</p>
         * 
         * <strong>example:</strong>
         * <p>LOCAL</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The internal unique identifier of the SQL execution plan in the diagnostic system.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;52c7c53<strong><strong>53e61b3f7586b17</strong></strong>ad&quot;</p>
         */
        @NameInMap("PlanUnionHash")
        public String planUnionHash;

        /**
         * <p>The list of the execution plan.</p>
         */
        @NameInMap("Plans")
        public java.util.List<DescribeOasSQLPlansResponseBodyDataPlans> plans;

        /**
         * <p>The SQL for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;select 1 from t&quot;</p>
         */
        @NameInMap("QuerySql")
        public String querySql;

        public static DescribeOasSQLPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasSQLPlansResponseBodyData self = new DescribeOasSQLPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOasSQLPlansResponseBodyData setAvgCpuTime(Double avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeOasSQLPlansResponseBodyData setBounded(Boolean bounded) {
            this.bounded = bounded;
            return this;
        }
        public Boolean getBounded() {
            return this.bounded;
        }

        public DescribeOasSQLPlansResponseBodyData setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeOasSQLPlansResponseBodyData setFirstLoadTime(String firstLoadTime) {
            this.firstLoadTime = firstLoadTime;
            return this;
        }
        public String getFirstLoadTime() {
            return this.firstLoadTime;
        }

        public DescribeOasSQLPlansResponseBodyData setHitDiagnosis(Boolean hitDiagnosis) {
            this.hitDiagnosis = hitDiagnosis;
            return this;
        }
        public Boolean getHitDiagnosis() {
            return this.hitDiagnosis;
        }

        public DescribeOasSQLPlansResponseBodyData setHitPercentage(Double hitPercentage) {
            this.hitPercentage = hitPercentage;
            return this;
        }
        public Double getHitPercentage() {
            return this.hitPercentage;
        }

        public DescribeOasSQLPlansResponseBodyData setMergedVersion(Long mergedVersion) {
            this.mergedVersion = mergedVersion;
            return this;
        }
        public Long getMergedVersion() {
            return this.mergedVersion;
        }

        public DescribeOasSQLPlansResponseBodyData setPlanExplain(DescribeOasSQLPlansResponseBodyDataPlanExplain planExplain) {
            this.planExplain = planExplain;
            return this;
        }
        public DescribeOasSQLPlansResponseBodyDataPlanExplain getPlanExplain() {
            return this.planExplain;
        }

        public DescribeOasSQLPlansResponseBodyData setPlanHash(String planHash) {
            this.planHash = planHash;
            return this;
        }
        public String getPlanHash() {
            return this.planHash;
        }

        public DescribeOasSQLPlansResponseBodyData setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeOasSQLPlansResponseBodyData setPlanUnionHash(String planUnionHash) {
            this.planUnionHash = planUnionHash;
            return this;
        }
        public String getPlanUnionHash() {
            return this.planUnionHash;
        }

        public DescribeOasSQLPlansResponseBodyData setPlans(java.util.List<DescribeOasSQLPlansResponseBodyDataPlans> plans) {
            this.plans = plans;
            return this;
        }
        public java.util.List<DescribeOasSQLPlansResponseBodyDataPlans> getPlans() {
            return this.plans;
        }

        public DescribeOasSQLPlansResponseBodyData setQuerySql(String querySql) {
            this.querySql = querySql;
            return this;
        }
        public String getQuerySql() {
            return this.querySql;
        }

    }

}
