// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketInventoryRequest extends TeaModel {
    // The ID of the inventory rule to query
    @NameInMap("inventoryId")
    public String inventoryId;

    public static GetBucketInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInventoryRequest self = new GetBucketInventoryRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketInventoryRequest setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }
    public String getInventoryId() {
        return this.inventoryId;
    }

}
