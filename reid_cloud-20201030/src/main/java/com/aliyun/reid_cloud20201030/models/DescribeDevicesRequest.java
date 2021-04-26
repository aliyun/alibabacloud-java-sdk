// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeDevicesRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    public static DescribeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesRequest self = new DescribeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

}
