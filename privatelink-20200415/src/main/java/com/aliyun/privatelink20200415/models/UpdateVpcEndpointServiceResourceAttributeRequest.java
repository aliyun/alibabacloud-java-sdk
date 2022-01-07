// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceResourceAttributeRequest extends TeaModel {
    @NameInMap("AutoAllocatedEnabled")
    public Boolean autoAllocatedEnabled;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ServiceId")
    public String serviceId;

    public static UpdateVpcEndpointServiceResourceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointServiceResourceAttributeRequest self = new UpdateVpcEndpointServiceResourceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointServiceResourceAttributeRequest setAutoAllocatedEnabled(Boolean autoAllocatedEnabled) {
        this.autoAllocatedEnabled = autoAllocatedEnabled;
        return this;
    }
    public Boolean getAutoAllocatedEnabled() {
        return this.autoAllocatedEnabled;
    }

    public UpdateVpcEndpointServiceResourceAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcEndpointServiceResourceAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcEndpointServiceResourceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpcEndpointServiceResourceAttributeRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateVpcEndpointServiceResourceAttributeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
