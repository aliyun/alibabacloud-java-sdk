// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceRequest extends TeaModel {
    // Specifies whether to automatically accept endpoint connection requests. Valid values:
    // 
    // *   **true**: automatically accepts endpoint connection requests.
    // *   **false**: does not automatically accept endpoint connection requests. This is the default value.
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to only precheck this request. Valid values:
    // 
    // *   **true**: prechecks the request without creating an endpoint service. The system checks the required parameters, request syntax, and limits. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
    // *   **false**: sends the request. This is the default value. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The payer of the endpoint service. Valid values:
    // 
    // *   **Endpoint**: the service consumer.
    // *   **EndpointService**: the service provider.
    @NameInMap("Payer")
    public String payer;

    // The ID of the region in which you want to create an endpoint service.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the available regions.
    @NameInMap("RegionId")
    public String regionId;

    // The list of the service resource that is added to the endpoint service.
    // 
    // You can specify up to 20 service resources.
    @NameInMap("Resource")
    public java.util.List<CreateVpcEndpointServiceRequestResource> resource;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The description of the endpoint service.
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    // The type of the service resource. Valid values:
    // 
    // *   **slb**: The service resource type is Classic Load Balancer (CLB).
    // *   **alb**: The service resource type is Application Load Balancer (ALB).
    // 
    // >  By default, the feature to specify ALB instances as the service resources of endpoint services is unavailable. If you need to use the feature,[submit a ticket](https://workorderintl.console.aliyun.com/#/ticket/crea).
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    // Specifies whether to enable IPv6 for the endpoint service. Valid values:
    // 
    // *   **true**: enables IPv6 for the endpoint service.
    // *   **false**: does not enable IPv6 for the endpoint service. This is the default value.
    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

    // The tags. Up to 20 tags are allowed.
    @NameInMap("Tag")
    public java.util.List<CreateVpcEndpointServiceRequestTag> tag;

    // Specifies whether to enable zone affinity. Valid values:
    // 
    // *   **true**: enables zone affinity.
    // *   **false**: does not enable zone affinity. This is the default value.
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    public static CreateVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointServiceRequest self = new CreateVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointServiceRequest setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
        this.autoAcceptEnabled = autoAcceptEnabled;
        return this;
    }
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    public CreateVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcEndpointServiceRequest setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

    public CreateVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcEndpointServiceRequest setResource(java.util.List<CreateVpcEndpointServiceRequestResource> resource) {
        this.resource = resource;
        return this;
    }
    public java.util.List<CreateVpcEndpointServiceRequestResource> getResource() {
        return this.resource;
    }

    public CreateVpcEndpointServiceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpcEndpointServiceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public CreateVpcEndpointServiceRequest setServiceResourceType(String serviceResourceType) {
        this.serviceResourceType = serviceResourceType;
        return this;
    }
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

    public CreateVpcEndpointServiceRequest setServiceSupportIPv6(Boolean serviceSupportIPv6) {
        this.serviceSupportIPv6 = serviceSupportIPv6;
        return this;
    }
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    public CreateVpcEndpointServiceRequest setTag(java.util.List<CreateVpcEndpointServiceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVpcEndpointServiceRequestTag> getTag() {
        return this.tag;
    }

    public CreateVpcEndpointServiceRequest setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static class CreateVpcEndpointServiceRequestResource extends TeaModel {
        // The ID of the service resource that is added to the endpoint service.
        @NameInMap("ResourceId")
        public String resourceId;

        // The type of the service resource that is added to the endpoint service. Valid values:
        // 
        // *   **slb**: The service resource type is CLB.
        // *   **alb**: The service resource type is ALB.
        // 
        // >  By default, the feature to specify ALB instances as the service resources of endpoint services is unavailable. If you need to use the feature,[submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/crea).
        // 
        // In regions in which PrivateLink is supported, CLB instances in virtual private clouds (VPCs) can serve as service resources of the endpoint service. For more information, see [Internal-facing CLB supports PrivateLink](~~301724~~).
        @NameInMap("ResourceType")
        public String resourceType;

        // The ID of the zone.
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateVpcEndpointServiceRequestResource build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcEndpointServiceRequestResource self = new CreateVpcEndpointServiceRequestResource();
            return TeaModel.build(map, self);
        }

        public CreateVpcEndpointServiceRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateVpcEndpointServiceRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public CreateVpcEndpointServiceRequestResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateVpcEndpointServiceRequestTag extends TeaModel {
        // The key of the tag.
        // 
        // The key cannot exceed 64 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The tag value.
        // 
        // The value cannot exceed 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static CreateVpcEndpointServiceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcEndpointServiceRequestTag self = new CreateVpcEndpointServiceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVpcEndpointServiceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpcEndpointServiceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
