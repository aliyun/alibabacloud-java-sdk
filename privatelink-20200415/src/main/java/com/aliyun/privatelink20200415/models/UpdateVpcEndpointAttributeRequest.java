// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointAttributeRequest extends TeaModel {
    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong>: IPv4.</p>
     * </li>
     * <li><p><strong>DualStack</strong>: dual-stack.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To enable dual-stack for an endpoint, the associated endpoint service and the endpoint\&quot;s VPC must also support dual-stack.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You must generate a unique value for this parameter. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cross-region bandwidth in Mbps. This parameter applies only when the endpoint and its associated endpoint service are in different regions. Valid values:</p>
     * <ul>
     * <li><p><strong>Minimum value</strong>: 100.</p>
     * </li>
     * <li><p><strong>Maximum value</strong>: The value is limited by your account quota. For more information, see <a href="https://help.aliyun.com/zh/privatelink/quotas-and-limits?spm=a2c4g.11174283.help-menu-search-120462.d_0">Quotas and limits</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can specify this parameter only for cross-region endpoints.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CrossRegionBandwidth")
    public Integer crossRegionBandwidth;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the check, the system returns an error message. If the request passes the check, the system returns the <code>DryRunOperation</code> error code.</p>
     * </li>
     * <li><p><strong>false</strong> (Default): Sends a normal request. If the request passes the check, the system performs the operation and returns a 2xx HTTP status code.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The new description for the endpoint.</p>
     * <p>The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my Endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The ID of the endpoint to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The new name for the endpoint.</p>
     * <p>The name must be 2 to 128 characters in length, start with a letter or a Chinese character, and can contain digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The RAM access policy. For more information, see <a href="https://help.aliyun.com/document_detail/93738.html">Basic elements of a RAM policy</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;Version&quot;: &quot;1&quot;,
     *   &quot;Statement&quot;: [
     *     {
     *       &quot;Effect&quot;: &quot;Allow&quot;,
     *       &quot;Action&quot;: [
     *         &quot;oss:List*&quot;,
     *         &quot;oss:PutObject&quot;,
     *         &quot;oss:GetObject&quot;
     *       ],
     *       &quot;Resource&quot;: [
     *         &quot;acs:oss:oss-<em>:</em>:pvl-policy-test/policy-test.txt&quot;
     *       ],
     *       &quot;Principal&quot;: {
     *         &quot;RAM&quot;: [
     *           &quot;acs:ram::14199xxxxxx:*&quot;
     *         ]
     *       }
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The region ID of the endpoint. You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eu-west-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResetPolicy")
    public Boolean resetPolicy;

    /**
     * <p>Specifies whether to enable zone affinity for domain name resolution of the endpoint service. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables zone affinity.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables zone affinity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    public static UpdateVpcEndpointAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointAttributeRequest self = new UpdateVpcEndpointAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointAttributeRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public UpdateVpcEndpointAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcEndpointAttributeRequest setCrossRegionBandwidth(Integer crossRegionBandwidth) {
        this.crossRegionBandwidth = crossRegionBandwidth;
        return this;
    }
    public Integer getCrossRegionBandwidth() {
        return this.crossRegionBandwidth;
    }

    public UpdateVpcEndpointAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcEndpointAttributeRequest setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public UpdateVpcEndpointAttributeRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateVpcEndpointAttributeRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public UpdateVpcEndpointAttributeRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public UpdateVpcEndpointAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpcEndpointAttributeRequest setResetPolicy(Boolean resetPolicy) {
        this.resetPolicy = resetPolicy;
        return this;
    }
    public Boolean getResetPolicy() {
        return this.resetPolicy;
    }

    public UpdateVpcEndpointAttributeRequest setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

}
