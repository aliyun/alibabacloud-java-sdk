// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically accept endpoint connection requests. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The payer of the endpoint service. Valid values:</p>
     * <br>
     * <p>*   **Endpoint**: the service consumer</p>
     * <p>*   **EndpointService**: the service provider</p>
     * <br>
     * <p>> By default, the feature of allowing the service provider to pay is unavailable. To use this feature, log on to the [Quota Center console](https://quotas.console.aliyun.com/white-list-products/privatelink/quotas) and click Privileges in the left-side navigation pane. On the **Privileges** page, enter the quota ID `privatelink_whitelist/epsvc_payer_mode`, and click Apply in the Actions column.</p>
     */
    @NameInMap("Payer")
    public String payer;

    /**
     * <p>The region ID of the endpoint service.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service resources of the endpoint service.</p>
     */
    @NameInMap("Resource")
    public java.util.List<CreateVpcEndpointServiceRequestResource> resource;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The description of the endpoint service.</p>
     */
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    /**
     * <p>The type of the service resource. Valid values:</p>
     * <br>
     * <p>*   **slb**: a Classic Load Balancer (CLB) instance</p>
     * <p>*   **alb**: an Application Load Balancer (ALB) instance</p>
     * <p>*   **nlb**: a Network Load Balancer (NLB) instance</p>
     */
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    /**
     * <p>Specifies whether to enable IPv6 for the endpoint service. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVpcEndpointServiceRequestTag> tag;

    /**
     * <p>Specifies whether to first resolve the domain name of the nearest endpoint that is associated with the endpoint service. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
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
        /**
         * <p>The ID of the service resource that is added to the endpoint service. You can specify up to 20 service resource IDs.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the service resource that is added to the endpoint service. You can add up to 20 service resources to the endpoint service. Valid values:</p>
         * <br>
         * <p>*   **slb**: a CLB instance</p>
         * <p>*   **alb**: an ALB instance</p>
         * <p>*   **nlb**: a NLB instance</p>
         * <br>
         * <p>>  In regions where PrivateLink is supported, CLB instances deployed in virtual private clouds (VPCs) can serve as service resources of the endpoint service.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The zone ID.</p>
         */
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
        /**
         * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key must be 1 to 64 characters in length and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value must be 1 to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
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
