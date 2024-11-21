// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMetricStoreResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the automatic sharding feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    /**
     * <p>The creation time. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1698933894</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The last update time. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1712023974</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>The maximum number of shards into which existing shards can be automatically split.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    /**
     * <p>The metric type of the Metricstore. Example: prometheus.</p>
     * 
     * <strong>example:</strong>
     * <p>prometheus</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>The specification type of the Metricstore. Example: standard.</p>
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
     * <p>The number of shards.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    public Integer shardCount;

    /**
     * <p>The retention period. Unit: days.</p>
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

    public GetMetricStoreResponseBody setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public GetMetricStoreResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
