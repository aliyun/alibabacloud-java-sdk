// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceAttributeRequest extends TeaModel {
    /**
     * <p>The remote regions to add to the list of supported regions.</p>
     */
    @NameInMap("AddSupportedRegionSet")
    public java.util.List<String> addSupportedRegionSet;

    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong>: IPv4.</p>
     * </li>
     * <li><p><strong>DualStack</strong>: dual-stack.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Only endpoint services that use an NLB or GWLB instance as the service resource support the <strong>DualStack</strong> IP version.</p>
     * </blockquote>
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
     * <p>A client-generated token that ensures the idempotence of the request.</p>
     * <p>Your client must generate a unique token for each request. <strong>ClientToken</strong> can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The default maximum connection bandwidth. The default value is <strong>3072</strong>. Unit: Mbps.</p>
     * <p>Valid values: <strong>100</strong> to <strong>10240</strong>.</p>
     * <blockquote>
     * <p>You can set this parameter only if the service resource is a CLB or ALB instance, but not an NLB instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3072</p>
     */
    @NameInMap("ConnectBandwidth")
    public Integer connectBandwidth;

    /**
     * <p>The remote regions to remove from the list of supported regions.</p>
     */
    @NameInMap("DeleteSupportedRegionSet")
    public java.util.List<String> deleteSupportedRegionSet;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, the system returns an error message. If the request passes the dry run, the system returns the <code>DryRunOperation</code> error code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, the system returns a 2xx HTTP status code and performs the operation.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to get the region ID.</p>
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
     * <p>Specifies whether to enable IPv6 for the endpoint service. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables IPv6.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Disables IPv6.</p>
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
     * <p>Specifies whether to enable zone affinity for the endpoint service. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): Enables zone affinity.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables zone affinity.</p>
     * </li>
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
