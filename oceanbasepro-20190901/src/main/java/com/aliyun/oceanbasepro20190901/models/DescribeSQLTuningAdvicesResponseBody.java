// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLTuningAdvicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSQLTuningAdvicesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLTuningAdvicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLTuningAdvicesResponseBody self = new DescribeSQLTuningAdvicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLTuningAdvicesResponseBody setData(java.util.List<DescribeSQLTuningAdvicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSQLTuningAdvicesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSQLTuningAdvicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLTuningAdvicesResponseBodyDataColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxValue")
        public String maxValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public String minValue;

        /**
         * <p>NDV</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Ndv")
        public Double ndv;

        public static DescribeSQLTuningAdvicesResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLTuningAdvicesResponseBodyDataColumns self = new DescribeSQLTuningAdvicesResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public DescribeSQLTuningAdvicesResponseBodyDataColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataColumns setMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public String getMaxValue() {
            return this.maxValue;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataColumns setMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }
        public String getMinValue() {
            return this.minValue;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataColumns setNdv(Double ndv) {
            this.ndv = ndv;
            return this;
        }
        public Double getNdv() {
            return this.ndv;
        }

    }

    public static class DescribeSQLTuningAdvicesResponseBodyDataPlan extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgApplicationWaitTime")
        public Float avgApplicationWaitTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgBufferGets")
        public Float avgBufferGets;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgConcurrencyWaitTime")
        public Float avgConcurrencyWaitTime;

        /**
         * <strong>example:</strong>
         * <p>100.36</p>
         */
        @NameInMap("AvgCpuTime")
        public Float avgCpuTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgDiskReads")
        public Float avgDiskReads;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgDiskWrites")
        public Float avgDiskWrites;

        /**
         * <strong>example:</strong>
         * <p>713.62</p>
         */
        @NameInMap("AvgElapsedTime")
        public Float avgElapsedTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AvgRowProcessed")
        public Float avgRowProcessed;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgUserIoWaitTime")
        public Float avgUserIoWaitTime;

        /**
         * <strong>example:</strong>
         * <p>1672358400000000</p>
         */
        @NameInMap("CollectTimeUs")
        public Long collectTimeUs;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DelayedLargeQueryPercentage")
        public Float delayedLargeQueryPercentage;

        /**
         * <strong>example:</strong>
         * <p>1.45</p>
         */
        @NameInMap("ExecPs")
        public Float execPs;

        /**
         * <strong>example:</strong>
         * <p>2062</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <strong>example:</strong>
         * <p>2022-12-30T02:25:30.576Z</p>
         */
        @NameInMap("FirstLoadTime")
        public String firstLoadTime;

        /**
         * <strong>example:</strong>
         * <p>1672367130576163</p>
         */
        @NameInMap("FirstLoadTimeUs")
        public Long firstLoadTimeUs;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HitDiagnosis")
        public Boolean hitDiagnosis;

        /**
         * <strong>example:</strong>
         * <p>66.8</p>
         */
        @NameInMap("HitPercentage")
        public Float hitPercentage;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LargeQueryPercentage")
        public Float largeQueryPercentage;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MergedVersion")
        public Long mergedVersion;

        /**
         * <strong>example:</strong>
         * <p>1108307720799259</p>
         */
        @NameInMap("ObDbId")
        public Long obDbId;

        /**
         * <p>server  ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObServerId")
        public Long obServerId;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("OutlineData")
        public String outlineData;

        /**
         * <p>Outline ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutlineId")
        public Long outlineId;

        /**
         * <strong>example:</strong>
         * <p>-86290582****886880</p>
         */
        @NameInMap("PlanHash")
        public String planHash;

        /**
         * <strong>example:</strong>
         * <p>818</p>
         */
        @NameInMap("PlanId")
        public Long planId;

        /**
         * <strong>example:</strong>
         * <p>49216</p>
         */
        @NameInMap("PlanSize")
        public Long planSize;

        /**
         * <strong>example:</strong>
         * <p>LOCAL</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <strong>example:</strong>
         * <p>1672367130529680</p>
         */
        @NameInMap("SchemaVersion")
        public Long schemaVersion;

        /**
         * <strong>example:</strong>
         * <p>i-bp1<em><strong><strong>sw64dhb</strong></strong></em></p>
         */
        @NameInMap("ServerSn")
        public String serverSn;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TableScan")
        public Boolean tableScan;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TimeoutPercentage")
        public Float timeoutPercentage;

        /**
         * <strong>example:</strong>
         * <p>AAAAAAAAAAEAAAAAAAADMgAF8QJQwIUj</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeSQLTuningAdvicesResponseBodyDataPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLTuningAdvicesResponseBodyDataPlan self = new DescribeSQLTuningAdvicesResponseBodyDataPlan();
            return TeaModel.build(map, self);
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgApplicationWaitTime(Float avgApplicationWaitTime) {
            this.avgApplicationWaitTime = avgApplicationWaitTime;
            return this;
        }
        public Float getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgBufferGets(Float avgBufferGets) {
            this.avgBufferGets = avgBufferGets;
            return this;
        }
        public Float getAvgBufferGets() {
            return this.avgBufferGets;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgConcurrencyWaitTime(Float avgConcurrencyWaitTime) {
            this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
            return this;
        }
        public Float getAvgConcurrencyWaitTime() {
            return this.avgConcurrencyWaitTime;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgCpuTime(Float avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Float getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgDiskReads(Float avgDiskReads) {
            this.avgDiskReads = avgDiskReads;
            return this;
        }
        public Float getAvgDiskReads() {
            return this.avgDiskReads;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgDiskWrites(Float avgDiskWrites) {
            this.avgDiskWrites = avgDiskWrites;
            return this;
        }
        public Float getAvgDiskWrites() {
            return this.avgDiskWrites;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgElapsedTime(Float avgElapsedTime) {
            this.avgElapsedTime = avgElapsedTime;
            return this;
        }
        public Float getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgRowProcessed(Float avgRowProcessed) {
            this.avgRowProcessed = avgRowProcessed;
            return this;
        }
        public Float getAvgRowProcessed() {
            return this.avgRowProcessed;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setAvgUserIoWaitTime(Float avgUserIoWaitTime) {
            this.avgUserIoWaitTime = avgUserIoWaitTime;
            return this;
        }
        public Float getAvgUserIoWaitTime() {
            return this.avgUserIoWaitTime;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setCollectTimeUs(Long collectTimeUs) {
            this.collectTimeUs = collectTimeUs;
            return this;
        }
        public Long getCollectTimeUs() {
            return this.collectTimeUs;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setDelayedLargeQueryPercentage(Float delayedLargeQueryPercentage) {
            this.delayedLargeQueryPercentage = delayedLargeQueryPercentage;
            return this;
        }
        public Float getDelayedLargeQueryPercentage() {
            return this.delayedLargeQueryPercentage;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setExecPs(Float execPs) {
            this.execPs = execPs;
            return this;
        }
        public Float getExecPs() {
            return this.execPs;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setFirstLoadTime(String firstLoadTime) {
            this.firstLoadTime = firstLoadTime;
            return this;
        }
        public String getFirstLoadTime() {
            return this.firstLoadTime;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setFirstLoadTimeUs(Long firstLoadTimeUs) {
            this.firstLoadTimeUs = firstLoadTimeUs;
            return this;
        }
        public Long getFirstLoadTimeUs() {
            return this.firstLoadTimeUs;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setHitDiagnosis(Boolean hitDiagnosis) {
            this.hitDiagnosis = hitDiagnosis;
            return this;
        }
        public Boolean getHitDiagnosis() {
            return this.hitDiagnosis;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setHitPercentage(Float hitPercentage) {
            this.hitPercentage = hitPercentage;
            return this;
        }
        public Float getHitPercentage() {
            return this.hitPercentage;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setLargeQueryPercentage(Float largeQueryPercentage) {
            this.largeQueryPercentage = largeQueryPercentage;
            return this;
        }
        public Float getLargeQueryPercentage() {
            return this.largeQueryPercentage;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setMergedVersion(Long mergedVersion) {
            this.mergedVersion = mergedVersion;
            return this;
        }
        public Long getMergedVersion() {
            return this.mergedVersion;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setObDbId(Long obDbId) {
            this.obDbId = obDbId;
            return this;
        }
        public Long getObDbId() {
            return this.obDbId;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setObServerId(Long obServerId) {
            this.obServerId = obServerId;
            return this;
        }
        public Long getObServerId() {
            return this.obServerId;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setOutlineData(String outlineData) {
            this.outlineData = outlineData;
            return this;
        }
        public String getOutlineData() {
            return this.outlineData;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setPlanHash(String planHash) {
            this.planHash = planHash;
            return this;
        }
        public String getPlanHash() {
            return this.planHash;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setPlanSize(Long planSize) {
            this.planSize = planSize;
            return this;
        }
        public Long getPlanSize() {
            return this.planSize;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setSchemaVersion(Long schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setServerSn(String serverSn) {
            this.serverSn = serverSn;
            return this;
        }
        public String getServerSn() {
            return this.serverSn;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setTableScan(Boolean tableScan) {
            this.tableScan = tableScan;
            return this;
        }
        public Boolean getTableScan() {
            return this.tableScan;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setTimeoutPercentage(Float timeoutPercentage) {
            this.timeoutPercentage = timeoutPercentage;
            return this;
        }
        public Float getTimeoutPercentage() {
            return this.timeoutPercentage;
        }

        public DescribeSQLTuningAdvicesResponseBodyDataPlan setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class DescribeSQLTuningAdvicesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c1;c2;c3</p>
         */
        @NameInMap("ColumnNames")
        public String columnNames;

        @NameInMap("Columns")
        public java.util.List<DescribeSQLTuningAdvicesResponseBodyDataColumns> columns;

        /**
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <strong>example:</strong>
         * <p>Local/Global</p>
         */
        @NameInMap("LocalityType")
        public String localityType;

        @NameInMap("Plan")
        public DescribeSQLTuningAdvicesResponseBodyDataPlan plan;

        /**
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("Table")
        public String table;

        /**
         * <strong>example:</strong>
         * <p>PLAN_BINDING/INDEX_CREATION</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeSQLTuningAdvicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLTuningAdvicesResponseBodyData self = new DescribeSQLTuningAdvicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSQLTuningAdvicesResponseBodyData setColumnNames(String columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public String getColumnNames() {
            return this.columnNames;
        }

        public DescribeSQLTuningAdvicesResponseBodyData setColumns(java.util.List<DescribeSQLTuningAdvicesResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<DescribeSQLTuningAdvicesResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public DescribeSQLTuningAdvicesResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSQLTuningAdvicesResponseBodyData setLocalityType(String localityType) {
            this.localityType = localityType;
            return this;
        }
        public String getLocalityType() {
            return this.localityType;
        }

        public DescribeSQLTuningAdvicesResponseBodyData setPlan(DescribeSQLTuningAdvicesResponseBodyDataPlan plan) {
            this.plan = plan;
            return this;
        }
        public DescribeSQLTuningAdvicesResponseBodyDataPlan getPlan() {
            return this.plan;
        }

        public DescribeSQLTuningAdvicesResponseBodyData setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeSQLTuningAdvicesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
