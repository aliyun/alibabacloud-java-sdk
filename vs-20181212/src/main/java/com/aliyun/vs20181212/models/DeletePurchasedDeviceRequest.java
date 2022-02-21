// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeletePurchasedDeviceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeletePurchasedDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePurchasedDeviceRequest self = new DeletePurchasedDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeletePurchasedDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeletePurchasedDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
