// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteBucketInventoryRequest extends TeaModel {
    // The ID of the inventory task to delete
    @NameInMap("inventoryId")
    public String inventoryId;

    public static DeleteBucketInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketInventoryRequest self = new DeleteBucketInventoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBucketInventoryRequest setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }
    public String getInventoryId() {
        return this.inventoryId;
    }

}
