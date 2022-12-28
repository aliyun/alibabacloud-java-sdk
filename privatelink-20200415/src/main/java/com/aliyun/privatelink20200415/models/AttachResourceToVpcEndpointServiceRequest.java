// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AttachResourceToVpcEndpointServiceRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the request without performing the operation. Valid values:
    // 
    // *   **true**: checks the request without performing the operation. The service resource is not added. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether required parameters are set. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false**: sends the request. If the request passes the check, a 2xx HTTP status code is returned and the operation is performed. This is the default value.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the region where the endpoint service is created.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the available regions.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the service resource.
    @NameInMap("ResourceId")
    public String resourceId;

    // The type of the service resource. Valid values:
    // 
    // *   **slb**: specifies that the service resource is a Classic Load Balancer (CLB) instance that supports PrivateLink. In addition, the CLB instance is deployed in a virtual private cloud (VPC).
    // *   **alb**: specifies that the service resource is an Application Load Balancer (ALB) instance that supports PrivateLink. In addition, the ALB instance is deployed in a VPC.
    @NameInMap("ResourceType")
    public String resourceType;

    // The endpoint service to which you want to add the service resource.
    @NameInMap("ServiceId")
    public String serviceId;

    public static AttachResourceToVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachResourceToVpcEndpointServiceRequest self = new AttachResourceToVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public AttachResourceToVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachResourceToVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AttachResourceToVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachResourceToVpcEndpointServiceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AttachResourceToVpcEndpointServiceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AttachResourceToVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
