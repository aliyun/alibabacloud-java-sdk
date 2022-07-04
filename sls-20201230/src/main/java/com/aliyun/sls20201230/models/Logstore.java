// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Logstore extends TeaModel {
    // 接收日志后，自动添加客户端外网IP和日志到达时间
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    // 是否开启 shard 自动分裂。当写入数据量超过已有分区（Shard）写入服务能力且持续5分钟以上时，开启自动分裂功能可自动根据数据量增加分区数量
    @NameInMap("autoSplit")
    public Boolean autoSplit;

    // 创建时间。
    @NameInMap("createTime")
    public Integer createTime;

    // WebTracking功能支持快速采集各种浏览器以及iOS/Android/APP访问信息，默认关闭
    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    // Encrypt configuration
    @NameInMap("encrypt_conf")
    public EncryptConf encryptConf;

    // 必须在 (30, ttl) 之间
    @NameInMap("hot_ttl")
    public Integer hotTtl;

    // 最后修改时间。
    @NameInMap("lastModifyTime")
    public Integer lastModifyTime;

    // logstore 的名称。
    @NameInMap("logstoreName")
    public String logstoreName;

    // 最大 shard 数量。
    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    // shard 数量。
    @NameInMap("shardCount")
    public Integer shardCount;

    // telemetryType
    @NameInMap("telemetryType")
    public String telemetryType;

    // 数据保存的天数。
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
