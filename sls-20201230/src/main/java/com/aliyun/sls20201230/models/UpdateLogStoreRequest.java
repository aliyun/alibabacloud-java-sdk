// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogStoreRequest extends TeaModel {
    /**
     * <p>Specifies whether to record public IP addresses. Default value: false.</p>
     * <ul>
     * <li><p>true: records public IP addresses.</p>
     * </li>
     * <li><p>false: does not record public IP addresses.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    /**
     * <p>Specifies whether to automatically split a shard.</p>
     * <ul>
     * <li><p>true: automatically splits a shard.</p>
     * </li>
     * <li><p>false: does not automatically split a shard.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    /**
     * <p>Specifies whether to enable web tracking. Default value: false.</p>
     * <ul>
     * <li><p>true: enables web tracking.</p>
     * </li>
     * <li><p>false: does not enable web tracking.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    /**
     * <p>The encryption configuration.</p>
     */
    @NameInMap("encrypt_conf")
    public EncryptConf encryptConf;

    /**
     * <p>The retention period of data in the hot tier of the Logstore. Minimum value: 7. Unit: days. Valid values: 7 to 3000.
     * After the retention period of the hot tier ends, the data is moved to the Infrequent Access (IA) storage class. For more information, see <a href="https://help.aliyun.com/document_detail/308645.html">Automatic Storage Tiering</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("hot_ttl")
    public Integer hotTtl;

    /**
     * <p>The retention period for data in the IA storage class. Data in this storage class has no minimum retention period. Data must be stored for at least 30 days before it is moved to Archive storage.</p>
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
     * <p>The maximum number of shards to which a shard can be split. The value must be an integer from 1 to 256.</p>
     * <blockquote>
     * <p>This parameter is required if autoSplit is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    /**
     * <p>SLS provides two types of Logstores: Standard and Query.</p>
     * <ul>
     * <li><p><strong>standard</strong>: supports one-stop data analytics. This type of Logstore is suitable for scenarios such as real-time monitoring, interactive analysis, and building a complete observability system.</p>
     * </li>
     * <li><p><strong>query</strong>: supports high-performance queries. The index traffic cost of a Query Logstore is about half that of a Standard Logstore. However, a Query Logstore does not support SQL analysis. This type of Logstore is suitable for scenarios that involve large data volumes, long retention periods of weeks or months, and no log analysis.</p>
     * </li>
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
     * <p>You cannot update the number of shards with this operation. To change the number of shards, call the SplitShard or MergeShards operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    @Deprecated
    public Integer shardCount;

    /**
     * <p>The hash-based write configuration.</p>
     */
    @NameInMap("shardingPolicy")
    public ShardingPolicy shardingPolicy;

    /**
     * <p>The type of observable data. Valid values:</p>
     * <ul>
     * <li><p>None: logs. This is the default value.</p>
     * </li>
     * <li><p>Metrics: metrics.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("telemetryType")
    @Deprecated
    public String telemetryType;

    /**
     * <p>The data retention period. Unit: days. Valid values: 1 to 3650. If you set this parameter to 3650, the data is permanently retained.</p>
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
