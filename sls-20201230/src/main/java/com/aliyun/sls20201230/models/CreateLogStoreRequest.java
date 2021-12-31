// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLogStoreRequest extends TeaModel {
    @NameInMap("appendMeta")
    public Boolean appendMeta;

    @NameInMap("autoSplit")
    public Boolean autoSplit;

    @NameInMap("enable_tracking")
    public Boolean enableTracking;

    @NameInMap("encrypt_conf")
    public EncryptConf encryptConf;

    @NameInMap("logstoreName")
    public String logstoreName;

    @NameInMap("maxSplitShard")
    public Integer maxSplitShard;

    @NameInMap("shardCount")
    public Integer shardCount;

    @NameInMap("ttl")
    public Integer ttl;

    public static CreateLogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogStoreRequest self = new CreateLogStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogStoreRequest setAppendMeta(Boolean appendMeta) {
        this.appendMeta = appendMeta;
        return this;
    }
    public Boolean getAppendMeta() {
        return this.appendMeta;
    }

    public CreateLogStoreRequest setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    public CreateLogStoreRequest setEnableTracking(Boolean enableTracking) {
        this.enableTracking = enableTracking;
        return this;
    }
    public Boolean getEnableTracking() {
        return this.enableTracking;
    }

    public CreateLogStoreRequest setEncryptConf(EncryptConf encryptConf) {
        this.encryptConf = encryptConf;
        return this;
    }
    public EncryptConf getEncryptConf() {
        return this.encryptConf;
    }

    public CreateLogStoreRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public CreateLogStoreRequest setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
        return this;
    }
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    public CreateLogStoreRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public CreateLogStoreRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
