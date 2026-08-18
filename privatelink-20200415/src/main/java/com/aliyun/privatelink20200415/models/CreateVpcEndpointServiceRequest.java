// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointServiceRequest extends TeaModel {
    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4 (default).</li>
     * <li><strong>DualStack</strong>: dual-stack.<blockquote>
     * <p>Only endpoint services whose backend resource type is nlb or gwlb support the DualStack IP address protocol. If the endpoint service supports dual-stack, the backend resources must also support dual-stack.</p>
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
     * <p>Specifies whether to automatically accept endpoint connections. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: automatically accept endpoint connections.</p>
     * </li>
     * <li><p><strong>false</strong> (default): do not automatically accept endpoint connections.</p>
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
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The payer. Valid values:</p>
     * <ul>
     * <li><p><strong>Endpoint</strong>: service consumer.</p>
     * </li>
     * <li><p><strong>EndpointService</strong>: service provider.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Endpoint</p>
     */
    @NameInMap("Payer")
    public String payer;

    /**
     * <p>The region ID of the endpoint service.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/469325.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service resources of the endpoint service. You can add up to 10 resources during creation. After creation, you can add more resources by adding service resources to the endpoint.</p>
     */
    @NameInMap("Resource")
    public java.util.List<CreateVpcEndpointServiceRequestResource> resource;

    /**
     * <p>The resource group ID.</p>
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
     * <p>The EPS resource type. Valid values:</p>
     * <ul>
     * <li><p><strong>slb</strong>: Classic Load Balancer (CLB).</p>
     * </li>
     * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
     * </li>
     * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
     * </li>
     * <li><p><strong>gwlb</strong>: Gateway Load Balancer (GWLB).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Access to TCPSSL listeners of NLB is not supported.</p>
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
     * <li><p><strong>true</strong>: supported.</p>
     * </li>
     * <li><p><strong>false</strong> (default): not supported.</p>
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
     * <p>The list of regions supported by the endpoint service. Service consumers can initiate endpoint connections from the regions in the list.</p>
     */
    @NameInMap("SupportedRegionList")
    public java.util.List<String> supportedRegionList;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVpcEndpointServiceRequestTag> tag;

    /**
     * <p>Specifies whether to support zone affinity for the endpoint domain name of the endpoint service. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: supported.</p>
     * </li>
     * <li><p><strong>false</strong> (default): not supported.</p>
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
         * <p>The ID of the service resource to add to the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp32z1wp5peaoox2q****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The EPS resource type to add to the endpoint service. You can add up to 20 service resources to an endpoint service. Valid values:</p>
         * <ul>
         * <li><p><strong>slb</strong>: Classic Load Balancer (CLB).</p>
         * </li>
         * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
         * </li>
         * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
         * </li>
         * <li><p><strong>gwlb</strong>: Gateway Load Balancer (GWLB).</p>
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
         * <p>The tag key of the instance. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
