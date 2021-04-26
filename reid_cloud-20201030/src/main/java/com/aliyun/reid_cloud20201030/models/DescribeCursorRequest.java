// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeCursorRequest extends TeaModel {
    @NameInMap("PartitionIndex")
    public Integer partitionIndex;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("Time")
    public String time;

    public static DescribeCursorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCursorRequest self = new DescribeCursorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCursorRequest setPartitionIndex(Integer partitionIndex) {
        this.partitionIndex = partitionIndex;
        return this;
    }
    public Integer getPartitionIndex() {
        return this.partitionIndex;
    }

    public DescribeCursorRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public DescribeCursorRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
