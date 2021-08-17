// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOrderInfoRequest extends TeaModel {
    @NameInMap("RelService")
    public String relService;

    @NameInMap("ResourceType")
    public Integer resourceType;

    public static GetOrderInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderInfoRequest self = new GetOrderInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderInfoRequest setRelService(String relService) {
        this.relService = relService;
        return this;
    }
    public String getRelService() {
        return this.relService;
    }

    public GetOrderInfoRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
