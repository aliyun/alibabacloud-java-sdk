// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CreateOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrderRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
