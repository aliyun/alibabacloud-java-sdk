// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachResourceFromVpcEndpointServiceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ServiceId")
    public String serviceId;

    public static DetachResourceFromVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachResourceFromVpcEndpointServiceRequest self = new DetachResourceFromVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public DetachResourceFromVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachResourceFromVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DetachResourceFromVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachResourceFromVpcEndpointServiceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DetachResourceFromVpcEndpointServiceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DetachResourceFromVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
