// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Logstore extends TeaModel {
    // append client ip and receive time
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    // archiveSeconds
    @NameInMap("archiveSeconds")
    public Integer archiveSeconds;

    // auto spilt shard
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    // create time
    @NameInMap("createTime")
    public Integer createTime;

    // enable web tracking
    @NameInMap("enableTracking")
    public Boolean enableTracking;

    // last modify time
    @NameInMap("lastModifyTime")
    public Integer lastModifyTime;

    // logstore name
    @NameInMap("logstoreName")
    public String logstoreName;

    // max split shard
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    // shard count
    @NameInMap("shardCount")
    public Integer shardCount;

    // telemetryType
    @NameInMap("telemetryType")
    public String telemetryType;

    // ttl
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

    public Logstore setArchiveSeconds(Integer archiveSeconds) {
        this.archiveSeconds = archiveSeconds;
        return this;
    }
    public Integer getArchiveSeconds() {
        return this.archiveSeconds;
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

    public Logstore setEnableTracking(Boolean enableTracking) {
        this.enableTracking = enableTracking;
        return this;
    }
    public Boolean getEnableTracking() {
        return this.enableTracking;
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

    public Logstore setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
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
