// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceAttributeRequest extends TeaModel {
    /**
     * <p>The list of remote regions to add for the endpoint service.</p>
     */
    @NameInMap("AddSupportedRegionSet")
    public java.util.List<String> addSupportedRegionSet;

    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4.</li>
     * <li><strong>DualStack</strong>: dual-stack.<blockquote>
     * <p>Currently, only endpoint services whose backend resource type is NLB or GWLB support setting the IP address protocol to DualStack.</p>
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
     * <li><p><strong>true</strong>: automatically accepts endpoint connections.</p>
     * </li>
     * <li><p><strong>false</strong>: does not automatically accept endpoint connections.</p>
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
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>ClientToken</strong> parameter supports only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The default bandwidth limit. Default value: <strong>3072</strong>. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>100</strong> to <strong>10240</strong>.</p>
     * <blockquote>
     * <p>Settings for the default bandwidth limit are supported when the service resource is a Classic Load Balancer (CLB) instance or an Application Load Balancer (ALB) instance. When the service resource is a Network Load Balancer (NLB) instance, the connection bandwidth cannot be configured.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3072</p>
     */
    @NameInMap("ConnectBandwidth")
    public Integer connectBandwidth;

    /**
     * <p>The list of remote regions to remove from the endpoint service.</p>
     */
    @NameInMap("DeleteSupportedRegionSet")
    public java.util.List<String> deleteSupportedRegionSet;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the resource attributes are modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the endpoint service.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my EndpointService.</p>
     */
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    /**
     * <p>The ID of the endpoint service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

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
     * <p>Specifies whether to resolve the domain name of the endpoint that is connected to the endpoint service to the nearest access point. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    public static UpdateVpcEndpointServiceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointServiceAttributeRequest self = new UpdateVpcEndpointServiceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointServiceAttributeRequest setAddSupportedRegionSet(java.util.List<String> addSupportedRegionSet) {
        this.addSupportedRegionSet = addSupportedRegionSet;
        return this;
    }
    public java.util.List<String> getAddSupportedRegionSet() {
        return this.addSupportedRegionSet;
    }

    public UpdateVpcEndpointServiceAttributeRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public UpdateVpcEndpointServiceAttributeRequest setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
        this.autoAcceptEnabled = autoAcceptEnabled;
        return this;
    }
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    public UpdateVpcEndpointServiceAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcEndpointServiceAttributeRequest setConnectBandwidth(Integer connectBandwidth) {
        this.connectBandwidth = connectBandwidth;
        return this;
    }
    public Integer getConnectBandwidth() {
        return this.connectBandwidth;
    }

    public UpdateVpcEndpointServiceAttributeRequest setDeleteSupportedRegionSet(java.util.List<String> deleteSupportedRegionSet) {
        this.deleteSupportedRegionSet = deleteSupportedRegionSet;
        return this;
    }
    public java.util.List<String> getDeleteSupportedRegionSet() {
        return this.deleteSupportedRegionSet;
    }

    public UpdateVpcEndpointServiceAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcEndpointServiceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpcEndpointServiceAttributeRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public UpdateVpcEndpointServiceAttributeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    @Deprecated
    public UpdateVpcEndpointServiceAttributeRequest setServiceSupportIPv6(Boolean serviceSupportIPv6) {
        this.serviceSupportIPv6 = serviceSupportIPv6;
        return this;
    }
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    public UpdateVpcEndpointServiceAttributeRequest setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

}
