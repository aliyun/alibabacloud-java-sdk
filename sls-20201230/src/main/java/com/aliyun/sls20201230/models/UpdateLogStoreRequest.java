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

    @NameInMap("encrypt_conf")
    public EncryptConf encryptConf;

    @NameInMap("hot_ttl")
    public Integer hotTtl;

    @NameInMap("logstoreName")
    public String logstoreName;

    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    @NameInMap("shardCount")
    public Integer shardCount;

    @NameInMap("telemetryType")
    public String telemetryType;

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
