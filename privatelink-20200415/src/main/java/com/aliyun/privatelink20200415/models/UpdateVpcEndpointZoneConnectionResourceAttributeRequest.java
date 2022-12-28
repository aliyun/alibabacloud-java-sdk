// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointZoneConnectionResourceAttributeRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to only precheck the request. Valid values:
    // 
    // *   **true**: only prechecks the request without performing the operation. The system prechecks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether required parameters are set. If the request fails to pass the precheck, the corresponding error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
    // *   **false** (default): sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The region ID of the endpoint connection bandwidth that you want to modify.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The resource allocation mode. You can adjust the resource allocation mode only if the endpoint connection is in the **Disconnected** state. Valid values:
    // 
    // *   **Auto**: automatically and randomly allocates service resources. In this mode, the specified service resource is deleted.
    // *   **Mannual**: manually allocates service resources. If you set the value to Mannual, you must also set **ResourceId** and **ResourceType**.
    @NameInMap("ResourceAllocateMode")
    public String resourceAllocateMode;

    // The ID of the service resource that you want to manually allocate or migrate in the zone of the endpoint connection.
    // 
    // >  If **ResourceAllocateMode** is set to **Manual**, or **ResourceReplaceMode** is set, this parameter is required.
    @NameInMap("ResourceId")
    public String resourceId;

    // The migration mode of service resources. Valid values:
    // 
    // *   **Graceful**: smooth migration. Service resources in the zone are smoothly migrated.
    // *   **Force**: forced migration. Service resources in the zone are forcefully migrated.
    // 
    // >  If you want to migrate service resources, you can set this parameter. This parameter is available only if the endpoint connection is in the **Connected** state. If you set this parameter, you must also set **ResourceId** and **ResourceType**.
    @NameInMap("ResourceReplaceMode")
    public String resourceReplaceMode;

    // The type of the service resource.
    // 
    // Set the value to **slb**, which specifies that the service resource is a Classic Load Balancer (CLB) instance that supports PrivateLink. In addition, the CLB instance is deployed in a virtual private cloud (VPC).
    // 
    // >  If **ResourceAllocateMode** is set to **Manual**, or **ResourceReplaceMode** is set, this parameter is required.
    @NameInMap("ResourceType")
    public String resourceType;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // The ID of the zone.
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
