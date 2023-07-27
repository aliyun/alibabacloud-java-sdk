// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class BucketResourceGroupConfiguration extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static BucketResourceGroupConfiguration build(java.util.Map<String, ?> map) throws Exception {
        BucketResourceGroupConfiguration self = new BucketResourceGroupConfiguration();
        return TeaModel.build(map, self);
    }

    public BucketResourceGroupConfiguration setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
