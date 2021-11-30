// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InventoryDestination extends TeaModel {
    // The information about the bucket that stores the exported inventory list
    @NameInMap("OSSBucketDestination")
    public InventoryOSSBucketDestination OSSBucketDestination;

    public static InventoryDestination build(java.util.Map<String, ?> map) throws Exception {
        InventoryDestination self = new InventoryDestination();
        return TeaModel.build(map, self);
    }

    public InventoryDestination setOSSBucketDestination(InventoryOSSBucketDestination OSSBucketDestination) {
        this.OSSBucketDestination = OSSBucketDestination;
        return this;
    }
    public InventoryOSSBucketDestination getOSSBucketDestination() {
        return this.OSSBucketDestination;
    }

}
