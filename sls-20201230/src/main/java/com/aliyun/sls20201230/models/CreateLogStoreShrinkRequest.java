// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLogStoreShrinkRequest extends TeaModel {
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    @NameInMap("autoSplit")
    public Boolean autoSplit;

    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    @NameInMap("encrypt_conf")
    public String encryptConfShrink;

    @NameInMap("logstoreName")
    public String logstoreName;

    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    @NameInMap("shardCount")
    public Integer shardCount;

    @NameInMap("ttl")
    public Integer ttl;

    public static CreateLogStoreShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogStoreShrinkRequest self = new CreateLogStoreShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogStoreShrinkRequest setAppendMeta(Boolean appendMeta) {
        this.appendMeta = appendMeta;
        return this;
    }
    public Boolean getAppendMeta() {
        return this.appendMeta;
    }

    public CreateLogStoreShrinkRequest setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    public CreateLogStoreShrinkRequest setEnableTracking(Boolean enableTracking) {
        this.enableTracking = enableTracking;
        return this;
    }
    public Boolean getEnableTracking() {
        return this.enableTracking;
    }

    public CreateLogStoreShrinkRequest setEncryptConfShrink(String encryptConfShrink) {
        this.encryptConfShrink = encryptConfShrink;
        return this;
    }
    public String getEncryptConfShrink() {
        return this.encryptConfShrink;
    }

    public CreateLogStoreShrinkRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public CreateLogStoreShrinkRequest setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
        return this;
    }
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    public CreateLogStoreShrinkRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public CreateLogStoreShrinkRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
