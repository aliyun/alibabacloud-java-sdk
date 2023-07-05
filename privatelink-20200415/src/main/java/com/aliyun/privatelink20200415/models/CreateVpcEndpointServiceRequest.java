// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceRequest extends TeaModel {
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Payer")
    public String payer;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Resource")
    public java.util.List<CreateVpcEndpointServiceRequestResource> resource;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceDescription")
    public String serviceDescription;

    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

    @NameInMap("Tag")
    public java.util.List<CreateVpcEndpointServiceRequestTag> tag;

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
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

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
        @NameInMap("Key")
        public String key;

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
