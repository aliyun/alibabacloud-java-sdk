// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateMetricStoreRequest extends TeaModel {
    /**
     * <p>Specifies whether to record the public IP address of the client. The default value is false.</p>
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
     * <p>Specifies whether to enable automatic shard splitting.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    /**
     * <p>The period for which data is stored in the hot tier. Unit: days. The value must be at least 7 and cannot be greater than the value of ttl. If you set this parameter to -1, all data is stored in the hot tier for the duration specified by ttl.</p>
     * <p>When the hot storage period ends, the data is moved to the IA storage class. For more information, see <a href="https://help.aliyun.com/document_detail/308645.html">Tiered Storage of Hot and Cold Data</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("hot_ttl")
    public Integer hotTtl;

    /**
     * <p>The retention period of data in the IA storage class. Unit: days. The minimum value is 30. After this period, data is moved to Archive Storage.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("infrequentAccessTTL")
    public Integer infrequentAccessTTL;

    /**
     * <p>The maximum number of shards into which a shard can be split. This parameter is valid only if autoSplit is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    /**
     * <p>The type of the Metricstore. Only prometheus is supported. The default value is prometheus.</p>
     * 
     * <strong>example:</strong>
     * <p>prometheus</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>The type of the Metricstore. Only standard is supported. The default value is standard.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The name of the Metricstore to create.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_metric_store</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The number of <a href="https://help.aliyun.com/document_detail/28976.html">shards</a> for the Metricstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    public Integer shardCount;

    /**
     * <p>The write hashing configuration.</p>
     */
    @NameInMap("shardingPolicy")
    public ShardingPolicy shardingPolicy;

    /**
     * <p>The data retention period of the Metricstore. Unit: days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static CreateMetricStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricStoreRequest self = new CreateMetricStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetricStoreRequest setAppendMeta(Boolean appendMeta) {
        this.appendMeta = appendMeta;
        return this;
    }
    public Boolean getAppendMeta() {
        return this.appendMeta;
    }

    public CreateMetricStoreRequest setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    public CreateMetricStoreRequest setHotTtl(Integer hotTtl) {
        this.hotTtl = hotTtl;
        return this;
    }
    public Integer getHotTtl() {
        return this.hotTtl;
    }

    public CreateMetricStoreRequest setInfrequentAccessTTL(Integer infrequentAccessTTL) {
        this.infrequentAccessTTL = infrequentAccessTTL;
        return this;
    }
    public Integer getInfrequentAccessTTL() {
        return this.infrequentAccessTTL;
    }

    public CreateMetricStoreRequest setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
        return this;
    }
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    public CreateMetricStoreRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public CreateMetricStoreRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateMetricStoreRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetricStoreRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public CreateMetricStoreRequest setShardingPolicy(ShardingPolicy shardingPolicy) {
        this.shardingPolicy = shardingPolicy;
        return this;
    }
    public ShardingPolicy getShardingPolicy() {
        return this.shardingPolicy;
    }

    public CreateMetricStoreRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
