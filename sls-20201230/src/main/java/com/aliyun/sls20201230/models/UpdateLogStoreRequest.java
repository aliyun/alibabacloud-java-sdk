// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogStoreRequest extends TeaModel {
    /**
     * <p>Specifies whether to record the public IP address and log arrival time. Default value: false.</p>
     * <ul>
     * <li>true: enables the feature. After this feature is enabled, Simple Log Service automatically adds the public IP address of the log source device and the time when the log arrives at the server to the Tag field of the log.</li>
     * <li>false: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    /**
     * <p>Specifies whether to enable automatic sharding. After this feature is enabled, a shard is automatically split when the write traffic continuously exceeds the limit, which improves write capacity. You must set maxSplitShard (the maximum number of shards after splitting) when you enable automatic sharding.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    /**
     * <p>Specifies whether to enable the WebTracking feature. Default value: false. You can use the WebTracking feature to collect and analyze user behavior data in browsers or mini programs, such as page views, purchase records, and time on site.</p>
     * <ul>
     * <li>true: enables WebTracking.</li>
     * <li>false: disables WebTracking.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    /**
     * <p>The encryption configuration. Encryption is disabled by default.</p>
     * <p>Example 1 (enable default encryption):</p>
     * <pre><code>{
     *     &quot;enable&quot;: true,
     *     &quot;encrypt_conf&quot;: &quot;default&quot;
     * }
     * </code></pre>
     * <p>Example 2 (enable BYOK encryption):</p>
     * <pre><code>{
     *     &quot;enable&quot;: true,
     *     &quot;encrypt_conf&quot;: &quot;default&quot;,
     *     &quot;user_cmk_info&quot;: {
     *         &quot;cmk_key_id&quot;: &quot;xxxxx&quot;,
     *         &quot;arn&quot;: &quot;acs:ram::112340000000:role/rolename&quot;,
     *         &quot;region&quot;: &quot;ap-southeast-1&quot;
     *     }
     * }
     * </code></pre>
     */
    @NameInMap("encrypt_conf")
    public EncryptConf encryptConf;

    /**
     * <p>The retention period of data in the hot tier of the Logstore. Unit: days. Minimum value: 7. The value cannot exceed the value of ttl. By default, all data within the retention period is stored in the hot tier.</p>
     * <p>After the data storage time exceeds the configured hot data retention period, the data is moved to the infrequent access (IA) tier. When you enable the IA tier, the hot data retention period must be at least 7 days. For more information, see <a href="https://help.aliyun.com/document_detail/308645.html">Intelligent tiering</a>.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>Scenario 1 (hot tier only, 30 days): <code>{&quot;ttl&quot;: 30}</code> or <code>{&quot;ttl&quot;: 30, &quot;hot_ttl&quot;: 30}</code></li>
     * <li>Scenario 2 (hot tier 7 days, IA tier 23 days): <code>{&quot;ttl&quot;: 30, &quot;hot_ttl&quot;: 7}</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("hot_ttl")
    public Integer hotTtl;

    /**
     * <p>Infrequent access (IA) tier. No minimum storage time is required. Data must be stored for at least 30 days before being moved to the archive tier.</p>
     * <p>When the log retention period exceeds the sum of the hot tier retention period and the IA tier retention period, the remaining storage time is converted to archive tier storage.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>Scenario 1 (hot tier 7 days, IA tier 23 days): <code>{&quot;ttl&quot;: 30, &quot;hot_ttl&quot;: 7}</code></li>
     * <li>Scenario 2 (hot tier 7 days, IA tier 30 days, archive tier 60 days): <code>{&quot;ttl&quot;: 97, &quot;hot_ttl&quot;: 7, &quot;infrequentAccessTTL&quot;: 30}</code></li>
     * <li>Scenario 3 (hot tier 60 days, IA tier 0 days, archive tier 60 days): <code>{&quot;ttl&quot;: 120, &quot;hot_ttl&quot;: 60, &quot;infrequentAccessTTL&quot;: 0}</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("infrequentAccessTTL")
    public Integer infrequentAccessTTL;

    /**
     * <p>The name of the Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstoreName")
    public String logstoreName;

    /**
     * <p>The maximum number of shards for automatic sharding. Minimum value: 1. Maximum value: 256.</p>
     * <blockquote>
     * <p>This parameter is required when autoSplit is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    /**
     * <p>Simple Log Service provides two types of Logstores: Standard and Query.</p>
     * <ul>
     * <li><strong>standard</strong>: supports one-stop data analytics capabilities of Simple Log Service. This type is suitable for scenarios such as real-time monitoring, interactive analysis, and building complete observability systems.</li>
     * <li><strong>query</strong>: supports high-performance queries. The index traffic fee is approximately half that of the Standard type. However, SQL analysis is not supported. This type is suitable for scenarios with large data volumes, long storage periods (weeks or months), and no log analysis requirements.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The number of shards.</p>
     * <blockquote>
     * <p>This operation does not support updating the number of shards. You can modify the number of shards only by calling the SplitShard or MergeShards operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    @Deprecated
    public Integer shardCount;

    /**
     * <p>The hash-based write configuration. When data is written, logs are routed to shards based on the configured hash policy. Before configuring this parameter, ensure that the hash ranges of shards are evenly distributed. This configuration may affect write capacity. Proceed with caution.</p>
     */
    @NameInMap("shardingPolicy")
    public ShardingPolicy shardingPolicy;

    /**
     * <p>The type of observable data. The default value is log data. Valid values:</p>
     * <ul>
     * <li>None: log data. This is the default value.</li>
     * <li>Metrics: time series data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("telemetryType")
    @Deprecated
    public String telemetryType;

    /**
     * <p>The data retention period. Unit: days. Valid values: 1 to 3650. A value of 3650 indicates permanent retention.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static UpdateLogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogStoreRequest self = new UpdateLogStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogStoreRequest setAppendMeta(Boolean appendMeta) {
        this.appendMeta = appendMeta;
        return this;
    }
    public Boolean getAppendMeta() {
        return this.appendMeta;
    }

    public UpdateLogStoreRequest setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    public UpdateLogStoreRequest setEnableTracking(Boolean enableTracking) {
        this.enableTracking = enableTracking;
        return this;
    }
    public Boolean getEnableTracking() {
        return this.enableTracking;
    }

    public UpdateLogStoreRequest setEncryptConf(EncryptConf encryptConf) {
        this.encryptConf = encryptConf;
        return this;
    }
    public EncryptConf getEncryptConf() {
        return this.encryptConf;
    }

    public UpdateLogStoreRequest setHotTtl(Integer hotTtl) {
        this.hotTtl = hotTtl;
        return this;
    }
    public Integer getHotTtl() {
        return this.hotTtl;
    }

    public UpdateLogStoreRequest setInfrequentAccessTTL(Integer infrequentAccessTTL) {
        this.infrequentAccessTTL = infrequentAccessTTL;
        return this;
    }
    public Integer getInfrequentAccessTTL() {
        return this.infrequentAccessTTL;
    }

    public UpdateLogStoreRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public UpdateLogStoreRequest setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
        return this;
    }
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    public UpdateLogStoreRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    @Deprecated
    public UpdateLogStoreRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public UpdateLogStoreRequest setShardingPolicy(ShardingPolicy shardingPolicy) {
        this.shardingPolicy = shardingPolicy;
        return this;
    }
    public ShardingPolicy getShardingPolicy() {
        return this.shardingPolicy;
    }

    @Deprecated
    public UpdateLogStoreRequest setTelemetryType(String telemetryType) {
        this.telemetryType = telemetryType;
        return this;
    }
    public String getTelemetryType() {
        return this.telemetryType;
    }

    public UpdateLogStoreRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
