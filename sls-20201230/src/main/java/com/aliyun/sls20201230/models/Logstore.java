// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Logstore extends TeaModel {
    /**
     * <p>Specifies whether to include the client\&quot;s public IP address in the log data. The default is false.</p>
     * <ul>
     * <li><p>true: Records the public IP address.</p>
     * </li>
     * <li><p>false: Does not record the public IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    /**
     * <p>Specifies whether to enable auto split.</p>
     * <ul>
     * <li><p>true: Enables auto split.</p>
     * </li>
     * <li><p>false: Disables auto split.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    /**
     * <p>The creation time of the Logstore, specified as a UNIX timestamp (the number of seconds since January 1, 1970, 00:00:00 UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>1453949705</p>
     */
    @NameInMap("createTime")
    public Integer createTime;

    @NameInMap("enableModify")
    public Boolean enableModify;

    /**
     * <p>Specifies whether to enable WebTracking. The default value is false.</p>
     * <ul>
     * <li><p>true: Enables WebTracking.</p>
     * </li>
     * <li><p>false: Disables WebTracking.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    /**
     * <p>The data encryption configuration.</p>
     */
    @NameInMap("encrypt_conf")
    public EncryptConf encryptConf;

    /**
     * <p>The number of days to retain data in the hot storage tier. The minimum value is 30.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("hot_ttl")
    public Integer hotTtl;

    /**
     * <p>The number of days to retain data in the infrequent access storage tier.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("infrequentAccessTTL")
    public Integer infrequentAccessTTL;

    /**
     * <p>The time the Logstore was last modified, specified as a UNIX timestamp (the number of seconds since January 1, 1970, 00:00:00 UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>1524155379</p>
     */
    @NameInMap("lastModifyTime")
    public Integer lastModifyTime;

    /**
     * <p>The name of the Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logstoreName")
    public String logstoreName;

    /**
     * <p>The maximum number of shards that an auto split can create. Valid values: 1 to 64.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    /**
     * <p>Log Service provides two types of Logstores: Standard and Query.</p>
     * <ul>
     * <li><p><strong>Standard</strong>: Supports the full suite of Log Service data analysis features. This mode is ideal for real-time monitoring, interactive analysis, and building complete observability solutions.</p>
     * </li>
     * <li><p><strong>Query</strong>: Optimized for high-performance queries with indexing traffic costs that are approximately half those of the Standard mode. This mode does not support SQL analysis and is best for use cases involving large data volumes and long retention periods, where complex log analysis is not a requirement.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The IngestProcessor ID.</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>The product type of the logs.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("productType")
    public String productType;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of shards in the Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    public Integer shardCount;

    @NameInMap("shardingPolicy")
    public ShardingPolicy shardingPolicy;

    /**
     * <p>The type of log data. Valid values:</p>
     * <ul>
     * <li><p>Metrics: The Logstore is optimized for time-series storage.</p>
     * </li>
     * <li><p>None: The Logstore uses standard storage for logs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Metrics</p>
     */
    @NameInMap("telemetryType")
    public String telemetryType;

    /**
     * <p>The data retention period in days. Valid values: 1 to 3,650. A value of 3,650 indicates permanent storage.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static Logstore build(java.util.Map<String, ?> map) throws Exception {
        Logstore self = new Logstore();
        return TeaModel.build(map, self);
    }

    public Logstore setAppendMeta(Boolean appendMeta) {
        this.appendMeta = appendMeta;
        return this;
    }
    public Boolean getAppendMeta() {
        return this.appendMeta;
    }

    public Logstore setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    public Logstore setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public Logstore setEnableModify(Boolean enableModify) {
        this.enableModify = enableModify;
        return this;
    }
    public Boolean getEnableModify() {
        return this.enableModify;
    }

    public Logstore setEnableTracking(Boolean enableTracking) {
        this.enableTracking = enableTracking;
        return this;
    }
    public Boolean getEnableTracking() {
        return this.enableTracking;
    }

    public Logstore setEncryptConf(EncryptConf encryptConf) {
        this.encryptConf = encryptConf;
        return this;
    }
    public EncryptConf getEncryptConf() {
        return this.encryptConf;
    }

    public Logstore setHotTtl(Integer hotTtl) {
        this.hotTtl = hotTtl;
        return this;
    }
    public Integer getHotTtl() {
        return this.hotTtl;
    }

    public Logstore setInfrequentAccessTTL(Integer infrequentAccessTTL) {
        this.infrequentAccessTTL = infrequentAccessTTL;
        return this;
    }
    public Integer getInfrequentAccessTTL() {
        return this.infrequentAccessTTL;
    }

    public Logstore setLastModifyTime(Integer lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Integer getLastModifyTime() {
        return this.lastModifyTime;
    }

    public Logstore setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public Logstore setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
        return this;
    }
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    public Logstore setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public Logstore setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
    }

    public Logstore setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public Logstore setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Logstore setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public Logstore setShardingPolicy(ShardingPolicy shardingPolicy) {
        this.shardingPolicy = shardingPolicy;
        return this;
    }
    public ShardingPolicy getShardingPolicy() {
        return this.shardingPolicy;
    }

    public Logstore setTelemetryType(String telemetryType) {
        this.telemetryType = telemetryType;
        return this;
    }
    public String getTelemetryType() {
        return this.telemetryType;
    }

    public Logstore setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
