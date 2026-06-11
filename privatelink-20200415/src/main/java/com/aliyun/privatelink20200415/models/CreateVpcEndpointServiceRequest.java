// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceRequest extends TeaModel {
    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong> (default): IPv4.</li>
     * <li><strong>DualStack</strong>: dual stack.<blockquote>
     * <p>Only endpoint services whose backend resource type is nlb or gwlb support DualStack. If the endpoint service supports dual stack, its backend resources must also support dual stack.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>Specifies whether to automatically accept endpoint connection requests. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: automatically accepts endpoint connection requests.</p>
     * </li>
     * <li><p><strong>false</strong> (default): does not automatically accept endpoint connection requests.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The payer of the endpoint service. Valid values:</p>
     * <ul>
     * <li><p><strong>Endpoint</strong>: the service consumer.</p>
     * </li>
     * <li><p><strong>EndpointService</strong>: the service provider.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Endpoint</p>
     */
    @NameInMap("Payer")
    public String payer;

    /**
     * <p>The ID of the region where the endpoint service is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/469325.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of service resources of the endpoint service. You can add at most 10 service resources when you create the endpoint service. After the endpoint service is created, you can continue to add service resources.</p>
     */
    @NameInMap("Resource")
    public java.util.List<CreateVpcEndpointServiceRequestResource> resource;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The description of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my EndpointService.</p>
     */
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    /**
     * <p>The type of the service resource. Valid values:</p>
     * <ul>
     * <li><p><strong>slb</strong>: a Classic Load Balancer (CLB) instance.</p>
     * </li>
     * <li><p><strong>alb</strong>: an Application Load Balancer (ALB) instance.</p>
     * </li>
     * <li><p><strong>nlb</strong>: a Network Load Balancer (NLB) instance.</p>
     * </li>
     * <li><p><strong>gwlb</strong>: a Gateway Load Balancer (GWLB) instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>TCPSSL listeners of NLB instances cannot be accessed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    /**
     * <p>Specifies whether the endpoint service supports IPv6. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * <li><p><strong>false</strong> (default): no.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ServiceSupportIPv6")
    @Deprecated
    public Boolean serviceSupportIPv6;

    /**
     * <p>The list of regions in which the endpoint service is available. Service consumers can initiate endpoint connections from the regions in the list.</p>
     */
    @NameInMap("SupportedRegionList")
    public java.util.List<String> supportedRegionList;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVpcEndpointServiceRequestTag> tag;

    /**
     * <p>Specifies whether to enable zone affinity for endpoint domain name resolution. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * <li><p><strong>false</strong> (default): no.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    public static CreateVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointServiceRequest self = new CreateVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointServiceRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
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

    @Deprecated
    public CreateVpcEndpointServiceRequest setServiceSupportIPv6(Boolean serviceSupportIPv6) {
        this.serviceSupportIPv6 = serviceSupportIPv6;
        return this;
    }
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    public CreateVpcEndpointServiceRequest setSupportedRegionList(java.util.List<String> supportedRegionList) {
        this.supportedRegionList = supportedRegionList;
        return this;
    }
    public java.util.List<String> getSupportedRegionList() {
        return this.supportedRegionList;
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
         * <p>The ID of the service resource that is added to the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp32z1wp5peaoox2q****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the service resource that is added to the endpoint service. You can add at most 20 service resources to an endpoint service. Valid values:</p>
         * <ul>
         * <li><p><strong>slb</strong>: a Classic Load Balancer (CLB) instance.</p>
         * </li>
         * <li><p><strong>alb</strong>: an Application Load Balancer (ALB) instance.</p>
         * </li>
         * <li><p><strong>nlb</strong>: a Network Load Balancer (NLB) instance.</p>
         * </li>
         * <li><p><strong>gwlb</strong>: a Gateway Load Balancer (GWLB) instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote-a</p>
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
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be at most 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be at most 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
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
