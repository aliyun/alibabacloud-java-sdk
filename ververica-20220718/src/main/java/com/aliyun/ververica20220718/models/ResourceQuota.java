// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ResourceQuota extends TeaModel {
    @NameInMap("limit")
    public ResourceSpec limit;

    @NameInMap("used")
    public ResourceSpec used;

    public static ResourceQuota build(java.util.Map<String, ?> map) throws Exception {
        ResourceQuota self = new ResourceQuota();
        return TeaModel.build(map, self);
    }

    public ResourceQuota setLimit(ResourceSpec limit) {
        this.limit = limit;
        return this;
    }
    public ResourceSpec getLimit() {
        return this.limit;
    }

    public ResourceQuota setUsed(ResourceSpec used) {
        this.used = used;
        return this;
    }
    public ResourceSpec getUsed() {
        return this.used;
    }

}
