// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryStatsResponseBody extends TeaModel {
    /**
     * <p>An array of slow query statistics, grouped by database.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *       &quot;maxScanBytes&quot;: 271603242215,
     *       &quot;minScanRows&quot;: 550584606,
     *       &quot;totalScanRows&quot;: 96977924056,
     *       &quot;avgLatency&quot;: 10804,
     *       &quot;minLatency&quot;: 5138,
     *       &quot;maxLatency&quot;: 24746,
     *       &quot;totalScanBytes&quot;: 1441239240695,
     *       &quot;queryCount&quot;: 29,
     *       &quot;avgScanBytes&quot;: 49697904851,
     *       &quot;minScanBytes&quot;: 8691897406,
     *       &quot;totalLatency&quot;: 313322,
     *       &quot;maxScanRows&quot;: 23040660808,
     *       &quot;avgCpuTimeMs&quot;: 732085,
     *       &quot;avgScanRows&quot;: 3344066346,
     *       &quot;maxCpuTimeMs&quot;: 1368932,
     *       &quot;db&quot;: &quot;tpcds_1000g&quot;,
     *       &quot;totalCpuTimeMs&quot;: 21230477,
     *       &quot;minCpuTimeMs&quot;: 292711
     *     }
     * ]</p>
     */
    @NameInMap("ByDatabase")
    public Object byDatabase;

    /**
     * <p>An array of slow query statistics, grouped by time bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *       &quot;maxScanBytes&quot;: 261400873691,
     *       &quot;minScanRows&quot;: 5915582721,
     *       &quot;totalScanRows&quot;: 23662330884,
     *       &quot;avgLatency&quot;: 6988.5,
     *       &quot;minLatency&quot;: 6657,
     *       &quot;maxLatency&quot;: 7401,
     *       &quot;totalScanBytes&quot;: 1045601376995,
     *       &quot;queryCount&quot;: 4,
     *       &quot;avgScanBytes&quot;: 261400344248.75,
     *       &quot;minScanBytes&quot;: 261400167768,
     *       &quot;maxScanRows&quot;: 5915582721,
     *       &quot;avgCpuTimeMs&quot;: 603488.25,
     *       &quot;avgScanRows&quot;: 5915582721,
     *       &quot;maxCpuTimeMs&quot;: 637311,
     *       &quot;timeBucket&quot;: &quot;2026-04-15 22:00:00&quot;,
     *       &quot;totalCpuTimeMs&quot;: 2413953,
     *       &quot;minCpuTimeMs&quot;: 567462
     *     }
     * ]</p>
     */
    @NameInMap("ByTimeBucket")
    public Object byTimeBucket;

    /**
     * <p>An array of slow query statistics, grouped by user.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *       &quot;maxScanBytes&quot;: 279794422882,
     *       &quot;minScanRows&quot;: 0,
     *       &quot;totalScanRows&quot;: 214219674180,
     *       &quot;avgLatency&quot;: 9862.755555555555,
     *       &quot;minLatency&quot;: 5051,
     *       &quot;maxLatency&quot;: 24746,
     *       &quot;totalScanBytes&quot;: 4657224498428,
     *       &quot;queryCount&quot;: 45,
     *       &quot;avgScanBytes&quot;: 103493877742.84445,
     *       &quot;minScanBytes&quot;: 0,
     *       &quot;totalLatency&quot;: 443824,
     *       &quot;maxScanRows&quot;: 23040660808,
     *       &quot;avgCpuTimeMs&quot;: 649451.7777777778,
     *       &quot;avgScanRows&quot;: 4760437204,
     *       &quot;maxCpuTimeMs&quot;: 1368932,
     *       &quot;distinctSqlDigests&quot;: 1,
     *       &quot;user&quot;: &quot;admin&quot;,
     *       &quot;totalCpuTimeMs&quot;: 29225330,
     *       &quot;minCpuTimeMs&quot;: 2434
     *     }
     *   ]</p>
     */
    @NameInMap("ByUser")
    public Object byUser;

    /**
     * <p>The percentile statistics for query latency.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;p99&quot;: &quot;24746.0&quot;,
     *     &quot;p50&quot;: &quot;8295.0&quot;,
     *     &quot;p95&quot;: &quot;23872.0&quot;,
     *     &quot;p90&quot;: &quot;15794.0&quot;,
     *     &quot;p75&quot;: &quot;11972.25&quot;
     *   }</p>
     */
    @NameInMap("Percentiles")
    public java.util.Map<String, ?> percentiles;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FCEEA97F-XXXX-XXXX-932F-B4BAEA170896</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The summary of slow query statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;totalAllQueries&quot;: &quot;4531&quot;,
     *     &quot;maxScanBytes&quot;: &quot;279794422882&quot;,
     *     &quot;totalQueries&quot;: &quot;45&quot;,
     *     &quot;minScanRows&quot;: &quot;0&quot;,
     *     &quot;totalScanRows&quot;: &quot;214219674180&quot;,
     *     &quot;errorQueryCount&quot;: &quot;0&quot;,
     *     &quot;avgLatency&quot;: &quot;9862&quot;,
     *     &quot;minLatency&quot;: &quot;5051&quot;,
     *     &quot;maxLatency&quot;: &quot;24746&quot;,
     *     &quot;totalScanBytes&quot;: &quot;4657224498428&quot;,
     *     &quot;avgScanBytes&quot;: &quot;103493877742&quot;,
     *     &quot;distinctUsers&quot;: &quot;1&quot;,
     *     &quot;minScanBytes&quot;: &quot;0&quot;,
     *     &quot;slowQueryRatio&quot;: &quot;0.009931582432134187&quot;,
     *     &quot;maxScanRows&quot;: &quot;23040660808&quot;,
     *     &quot;avgCpuTimeMs&quot;: &quot;649451&quot;,
     *     &quot;avgScanRows&quot;: &quot;4760437204&quot;,
     *     &quot;maxCpuTimeMs&quot;: &quot;1368932&quot;,
     *     &quot;totalCpuTimeMs&quot;: &quot;29225330&quot;
     *   }</p>
     */
    @NameInMap("Summary")
    public java.util.Map<String, ?> summary;

    /**
     * <p>An array of detailed audit records for the top N slow queries.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;peakMemoryBytes&quot;: 71731165356,
     *         &quot;planTimesMs&quot;: &quot;{\&quot;plan\&quot;:15, \&quot;garbage_collect\&quot;:0, \&quot;lock_tables\&quot;:0, \&quot;analyze\&quot;:2, \&quot;rewrite\&quot;:4, \&quot;fold_const_by_be\&quot;:0, \&quot;collect_partitions\&quot;:0, \&quot;optimize\&quot;:3, \&quot;translate\&quot;:2, \&quot;init_scan_node\&quot;:-1, \&quot;finalize_scan_node\&quot;:-1, \&quot;create_scan_range\&quot;:-1, \&quot;distribute\&quot;:4}&quot;,
     *         &quot;catalog&quot;: &quot;internal&quot;,
     *         &quot;sqlMode&quot;: &quot;ONLY_FULL_GROUP_BY&quot;,
     *         &quot;errorCode&quot;: 0,
     *         &quot;spillReadBytesFromLocalStorage&quot;: -1,
     *         &quot;computeGroup&quot;: &quot;test&quot;,
     *         &quot;queryId&quot;: &quot;921f10bc054d4dbb-903784520a2ab26f&quot;,
     *         &quot;parseTimeMs&quot;: 0,
     *         &quot;stmtId&quot;: 5822,
     *         &quot;hitSqlCache&quot;: false,
     *         &quot;chosenMViews&quot;: &quot;[]&quot;,
     *         &quot;scanBytesFromLocalStorage&quot;: 861079963,
     *         &quot;frontendIp&quot;: &quot;172.16.17.192&quot;,
     *         &quot;handledInFe&quot;: false,
     *         &quot;returnRows&quot;: 100,
     *         &quot;state&quot;: &quot;EOF&quot;,
     *         &quot;scanRows&quot;: 550584606,
     *         &quot;cpuTimeMs&quot;: 1368932,
     *         &quot;scheduleTimesMs&quot;: &quot;{\&quot;schedule_time_ms\&quot;:14, \&quot;fragment_assign_time_ms\&quot;:0, \&quot;fragment_serialize_time_ms\&quot;:2, \&quot;fragment_rpc_phase_1_time_ms\&quot;:11, \&quot;fragment_rpc_phase_2_time_ms\&quot;:1, \&quot;fragment_compressed_size_byte\&quot;:142152, \&quot;fragment_rpc_count\&quot;:6}&quot;,
     *         &quot;shuffleSendBytes&quot;: 27745167331,
     *         &quot;stmtType&quot;: &quot;SELECT&quot;,
     *         &quot;sqlHash&quot;: &quot;ecf08bbca3e4b33b1630e03a9dc671b4&quot;,
     *         &quot;errorMessage&quot;: &quot;&quot;,
     *         &quot;isQuery&quot;: true,
     *         &quot;isNereids&quot;: true,
     *         &quot;changedVariables&quot;: &quot;{\&quot;enable_profile\&quot;:\&quot;true\&quot;, \&quot;enable_auto_analyze\&quot;:\&quot;false\&quot;, \&quot;runtime_filter_wait_time_ms\&quot;:\&quot;10000\&quot;, \&quot;sql_converter_service_url\&quot;:\&quot;<a href="http://127.0.0.1:5001/api/v1/convert%5C%5C%22%7D">http://127.0.0.1:5001/api/v1/convert\\&quot;}</a>&quot;,
     *         &quot;scanBytesFromRemoteStorage&quot;: 0,
     *         &quot;scanBytes&quot;: 11358721363,
     *         &quot;isInternal&quot;: false,
     *         &quot;workloadGroup&quot;: &quot;normal&quot;,
     *         &quot;queriedTablesAndViews&quot;: &quot;[\&quot;internal.tpcds_1000g.item\&quot;, \&quot;internal.tpcds_1000g.store_sales\&quot;, \&quot;internal.tpcds_1000g.date_dim\&quot;, \&quot;internal.tpcds_1000g.store\&quot;]&quot;,
     *         &quot;sqlDigest&quot;: &quot;d41d8cd98f00b204e9800998ecf8427e&quot;,
     *         &quot;clientIp&quot;: &quot;123.56.117.27:33664&quot;,
     *         &quot;queryTime&quot;: 24746,
     *         &quot;shuffleSendRows&quot;: 454538612,
     *         &quot;time&quot;: &quot;1776267563848&quot;,
     *         &quot;getMetaTimesMs&quot;: &quot;{\&quot;get_partition_version_time_ms\&quot;:3381937, \&quot;get_partition_version_count_has_data\&quot;:0, \&quot;get_partition_version_count\&quot;:1, \&quot;get_table_version_time_ms\&quot;:0, \&quot;get_table_version_count\&quot;:0}&quot;,
     *         &quot;spillWriteBytesFromLocalStorage&quot;: -1,
     *         &quot;user&quot;: &quot;admin&quot;,
     *         &quot;db&quot;: &quot;tpcds_1000g&quot;,
     *         &quot;stmt&quot;: &quot;xxx&quot;
     *     }
     * ]</p>
     */
    @NameInMap("TopQueries")
    public Object topQueries;

    /**
     * <p>An array of statistics for the top N slow queries, grouped by SQL digest. Available for kernel version 5.0 and later.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *       &quot;maxScanBytes&quot;: 279794422882,
     *       &quot;minScanRows&quot;: 0,
     *       &quot;totalScanRows&quot;: 214219674180,
     *       &quot;avgLatency&quot;: 9862.755555555555,
     *       &quot;minLatency&quot;: 5051,
     *       &quot;maxLatency&quot;: 24746,
     *       &quot;totalScanBytes&quot;: 4657224498428,
     *       &quot;queryCount&quot;: 45,
     *       &quot;avgScanBytes&quot;: 103493877742.84445,
     *       &quot;minScanBytes&quot;: 0,
     *       &quot;totalLatency&quot;: 443824,
     *       &quot;sqlDigest&quot;: &quot;d41d8cd98f00b204e9800998ecf8427e&quot;,
     *       &quot;maxScanRows&quot;: 23040660808,
     *       &quot;avgCpuTimeMs&quot;: 649451.7777777778,
     *       &quot;avgScanRows&quot;: 4760437204,
     *       &quot;maxCpuTimeMs&quot;: 1368932,
     *       &quot;sampleStmt&quot;: &quot;xxx&quot;,
     *       &quot;user&quot;: &quot;admin&quot;,
     *       &quot;db&quot;: &quot;tpcds_1000g&quot;,
     *       &quot;totalCpuTimeMs&quot;: 29225330,
     *       &quot;minCpuTimeMs&quot;: 2434
     *     }
     *   ]</p>
     */
    @NameInMap("TopSqlDigests")
    public Object topSqlDigests;

    public static DescribeSlowQueryStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryStatsResponseBody self = new DescribeSlowQueryStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryStatsResponseBody setByDatabase(Object byDatabase) {
        this.byDatabase = byDatabase;
        return this;
    }
    public Object getByDatabase() {
        return this.byDatabase;
    }

    public DescribeSlowQueryStatsResponseBody setByTimeBucket(Object byTimeBucket) {
        this.byTimeBucket = byTimeBucket;
        return this;
    }
    public Object getByTimeBucket() {
        return this.byTimeBucket;
    }

    public DescribeSlowQueryStatsResponseBody setByUser(Object byUser) {
        this.byUser = byUser;
        return this;
    }
    public Object getByUser() {
        return this.byUser;
    }

    public DescribeSlowQueryStatsResponseBody setPercentiles(java.util.Map<String, ?> percentiles) {
        this.percentiles = percentiles;
        return this;
    }
    public java.util.Map<String, ?> getPercentiles() {
        return this.percentiles;
    }

    public DescribeSlowQueryStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowQueryStatsResponseBody setSummary(java.util.Map<String, ?> summary) {
        this.summary = summary;
        return this;
    }
    public java.util.Map<String, ?> getSummary() {
        return this.summary;
    }

    public DescribeSlowQueryStatsResponseBody setTopQueries(Object topQueries) {
        this.topQueries = topQueries;
        return this;
    }
    public Object getTopQueries() {
        return this.topQueries;
    }

    public DescribeSlowQueryStatsResponseBody setTopSqlDigests(Object topSqlDigests) {
        this.topSqlDigests = topSqlDigests;
        return this;
    }
    public Object getTopSqlDigests() {
        return this.topSqlDigests;
    }

}
