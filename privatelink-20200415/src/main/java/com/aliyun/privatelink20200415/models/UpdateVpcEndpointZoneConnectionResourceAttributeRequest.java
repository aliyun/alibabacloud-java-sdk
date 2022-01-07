// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointZoneConnectionResourceAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceAllocateMode")
    public String resourceAllocateMode;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceReplaceMode")
    public String resourceReplaceMode;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateVpcEndpointZoneConnectionResourceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointZoneConnectionResourceAttributeRequest self = new UpdateVpcEndpointZoneConnectionResourceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setResourceAllocateMode(String resourceAllocateMode) {
        this.resourceAllocateMode = resourceAllocateMode;
        return this;
    }
    public String getResourceAllocateMode() {
        return this.resourceAllocateMode;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setResourceReplaceMode(String resourceReplaceMode) {
        this.resourceReplaceMode = resourceReplaceMode;
        return this;
    }
    public String getResourceReplaceMode() {
        return this.resourceReplaceMode;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
