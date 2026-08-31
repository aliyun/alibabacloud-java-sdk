// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMetricStoreResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the public IP address and log receive time are recorded.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    /**
     * <p>Indicates whether automatic sharding is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    /**
     * <p>The creation time, as a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1698933894</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The storage duration of data in the hot tier, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("hot_ttl")
    public Integer hotTtl;

    /**
     * <p>The storage duration in the infrequent access (IA) tier, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("infrequentAccessTTL")
    public Integer infrequentAccessTTL;

    /**
     * <p>The last modification time, as a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1712023974</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>The maximum number of shards for automatic sharding.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    /**
     * <p>The category of the Metricstore, such as prometheus.</p>
     * 
     * <strong>example:</strong>
     * <p>prometheus</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>The specification type of the Metricstore, such as standard.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The name of the Metricstore.</p>
     * 
     * <strong>example:</strong>
     * <p>my_metric_store</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the write processor associated with the Metricstore.</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>The number of shards.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    public Integer shardCount;

    /**
     * <p>The hash write configuration.</p>
     */
    @NameInMap("shardingPolicy")
    public ShardingPolicy shardingPolicy;

    /**
     * <p>The data retention period, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static GetMetricStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetricStoreResponseBody self = new GetMetricStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetricStoreResponseBody setAppendMeta(Boolean appendMeta) {
        this.appendMeta = appendMeta;
        return this;
    }
    public Boolean getAppendMeta() {
        return this.appendMeta;
    }

    public GetMetricStoreResponseBody setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    public GetMetricStoreResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetMetricStoreResponseBody setHotTtl(Integer hotTtl) {
        this.hotTtl = hotTtl;
        return this;
    }
    public Integer getHotTtl() {
        return this.hotTtl;
    }

    public GetMetricStoreResponseBody setInfrequentAccessTTL(Integer infrequentAccessTTL) {
        this.infrequentAccessTTL = infrequentAccessTTL;
        return this;
    }
    public Integer getInfrequentAccessTTL() {
        return this.infrequentAccessTTL;
    }

    public GetMetricStoreResponseBody setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public GetMetricStoreResponseBody setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
        return this;
    }
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    public GetMetricStoreResponseBody setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public GetMetricStoreResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public GetMetricStoreResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMetricStoreResponseBody setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
    }

    public GetMetricStoreResponseBody setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public GetMetricStoreResponseBody setShardingPolicy(ShardingPolicy shardingPolicy) {
        this.shardingPolicy = shardingPolicy;
        return this;
    }
    public ShardingPolicy getShardingPolicy() {
        return this.shardingPolicy;
    }

    public GetMetricStoreResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
