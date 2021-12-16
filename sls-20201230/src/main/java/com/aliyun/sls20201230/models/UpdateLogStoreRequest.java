// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogStoreRequest extends TeaModel {
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    @NameInMap("autoSplit")
    public Boolean autoSplit;

    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    @NameInMap("logstoreName")
    public String logstoreName;

    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    @NameInMap("shardCount")
    public Integer shardCount;

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

    public UpdateLogStoreRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public UpdateLogStoreRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
