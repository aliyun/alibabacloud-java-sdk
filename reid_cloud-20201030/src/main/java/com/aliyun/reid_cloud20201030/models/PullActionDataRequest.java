// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class PullActionDataRequest extends TeaModel {
    @NameInMap("PartitionIndex")
    public Integer partitionIndex;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("StartMessageId")
    public Long startMessageId;

    @NameInMap("EndMessageId")
    public Long endMessageId;

    @NameInMap("Limit")
    public Integer limit;

    public static PullActionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PullActionDataRequest self = new PullActionDataRequest();
        return TeaModel.build(map, self);
    }

    public PullActionDataRequest setPartitionIndex(Integer partitionIndex) {
        this.partitionIndex = partitionIndex;
        return this;
    }
    public Integer getPartitionIndex() {
        return this.partitionIndex;
    }

    public PullActionDataRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public PullActionDataRequest setStartMessageId(Long startMessageId) {
        this.startMessageId = startMessageId;
        return this;
    }
    public Long getStartMessageId() {
        return this.startMessageId;
    }

    public PullActionDataRequest setEndMessageId(Long endMessageId) {
        this.endMessageId = endMessageId;
        return this;
    }
    public Long getEndMessageId() {
        return this.endMessageId;
    }

    public PullActionDataRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
