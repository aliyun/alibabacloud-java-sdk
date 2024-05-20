// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOrderInfoRequest extends TeaModel {
    @NameInMap("ListReleased")
    public Boolean listReleased;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RelService")
    public String relService;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    public static GetOrderInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderInfoRequest self = new GetOrderInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderInfoRequest setListReleased(Boolean listReleased) {
        this.listReleased = listReleased;
        return this;
    }
    public Boolean getListReleased() {
        return this.listReleased;
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
