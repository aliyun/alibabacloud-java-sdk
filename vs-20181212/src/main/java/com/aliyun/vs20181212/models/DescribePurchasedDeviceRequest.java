// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDeviceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribePurchasedDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDeviceRequest self = new DescribePurchasedDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribePurchasedDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
