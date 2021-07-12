// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDeviceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Id")
    public String id;

    public static DescribePurchasedDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDeviceRequest self = new DescribePurchasedDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePurchasedDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
