// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceResourceAttributeRequest extends TeaModel {
    // Specifies whether to allow automatic resource allocation. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("AutoAllocatedEnabled")
    public Boolean autoAllocatedEnabled;

    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to only precheck this request. Valid values:
    // 
    // *   **true**: only prechecks the API request without performing the operation. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether required parameters are set. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
    // *   **false** (default): sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the service resource is modified.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the region where the service resource that you want to modify is deployed.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the service resource.
    @NameInMap("ResourceId")
    public String resourceId;

    // The ID of the endpoint service.
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
