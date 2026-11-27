// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatRateLimitRuleRequest extends TeaModel {
    /**
     * <p>The bandwidth limit. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("BandwidthLimit")
    public String bandwidthLimit;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The system prechecks the request without creating the rate limiting rule. The system checks whether the required parameters are specified, and validates the request format and limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): The system sends a normal request. If the request passes the precheck, the rate limiting rule is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The source match type for rate limiting. Valid values:</p>
     * <p>CIDR: CIDR block match. This is the default value.
     * TUNNEL: tunnel match. If you set the value to TUNNEL, a corresponding SNAT rule of the TUNNEL type must exist.</p>
     * 
     * <strong>example:</strong>
     * <p>CIDR</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The ID of the NAT gateway to which the rate limiting rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the DescribeRegions operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the rate limiting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test rule description</p>
     */
    @NameInMap("RuleDescription")
    public String ruleDescription;

    /**
     * <p>The name of the rate limiting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The list of source CIDR blocks to which the rate limiting rule applies.</p>
     */
    @NameInMap("SourceCIDRs")
    public java.util.List<String> sourceCIDRs;

    /**
     * <p>The tunnel index. If MatchType is set to TUNNEL, a corresponding SNAT rule must exist.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TunnelIndex")
    public String tunnelIndex;

    public static CreateNatRateLimitRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatRateLimitRuleRequest self = new CreateNatRateLimitRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatRateLimitRuleRequest setBandwidthLimit(String bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }
    public String getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public CreateNatRateLimitRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNatRateLimitRuleRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public CreateNatRateLimitRuleRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public CreateNatRateLimitRuleRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateNatRateLimitRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNatRateLimitRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    public CreateNatRateLimitRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateNatRateLimitRuleRequest setSourceCIDRs(java.util.List<String> sourceCIDRs) {
        this.sourceCIDRs = sourceCIDRs;
        return this;
    }
    public java.util.List<String> getSourceCIDRs() {
        return this.sourceCIDRs;
    }

    public CreateNatRateLimitRuleRequest setTunnelIndex(String tunnelIndex) {
        this.tunnelIndex = tunnelIndex;
        return this;
    }
    public String getTunnelIndex() {
        return this.tunnelIndex;
    }

}
