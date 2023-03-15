// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqMsgDigest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RetryCount")
    public Long retryCount;

    @NameInMap("StoreSize")
    public Integer storeSize;

    @NameInMap("StoreTime")
    public String storeTime;

    @NameInMap("Tags")
    public String tags;

    public static MqMsgDigest build(java.util.Map<String, ?> map) throws Exception {
        MqMsgDigest self = new MqMsgDigest();
        return TeaModel.build(map, self);
    }

    public MqMsgDigest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MqMsgDigest setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Long getRetryCount() {
        return this.retryCount;
    }

    public MqMsgDigest setStoreSize(Integer storeSize) {
        this.storeSize = storeSize;
        return this;
    }
    public Integer getStoreSize() {
        return this.storeSize;
    }

    public MqMsgDigest setStoreTime(String storeTime) {
        this.storeTime = storeTime;
        return this;
    }
    public String getStoreTime() {
        return this.storeTime;
    }

    public MqMsgDigest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
