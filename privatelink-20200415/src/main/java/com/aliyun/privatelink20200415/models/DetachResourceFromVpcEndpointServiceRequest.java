// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachResourceFromVpcEndpointServiceRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate a value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purposes only. If you select this option, the service resource is not removed after the request passes the check. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false**: sends a common request. If the request passes the check, an 2xx HTTP status code is returned, and the operation is performed. This is the default value.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the region where the endpoint service is deployed. You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the service resource.
    @NameInMap("ResourceId")
    public String resourceId;

    // The type of the service resource. Valid values:
    // 
    // *   **slb**: specifies that the service resource is a Classic Load Balancer (CLB) instance that supports PrivateLink. In addition, the CLB instance is deployed in a virtual private cloud (VPC).
    // *   **alb**: specifies that the service resource is an Application Load Balancer (ALB) instance that supports PrivateLink. In addition, the ALB instance is deployed in a VPC.
    // 
    // >  By default, the feature to specify ALB instances as the service resources of endpoint services is unavailable. If you need to use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/crea).
    @NameInMap("ResourceType")
    public String resourceType;

    // The ID of the endpoint service from which you want to remove the service resource.
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
