// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointServiceAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    public static GetVpcEndpointServiceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpcEndpointServiceAttributeRequest self = new GetVpcEndpointServiceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetVpcEndpointServiceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVpcEndpointServiceAttributeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
