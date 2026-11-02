// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatRateLimitRuleRequest extends TeaModel {
    /**
     * <p>The new bandwidth limit. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("BandwidthLimit")
    public String bandwidthLimit;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run and does not query the resource status. The system checks whether your AccessKey pair is valid, the authorization of Resource Access Management (RAM) users, and whether required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The ID of the NAT gateway to which the rate limit rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1b0lic8uz4r6vf2****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The new description of the rate limit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleDescription")
    public String ruleDescription;

    /**
     * <p>The ID of the rate limit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>limit-rule-****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The new name of the rate limit rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The new list of source CIDR blocks for the rate limit rule.</p>
     */
    @NameInMap("SourceCIDRs")
    public java.util.List<String> sourceCIDRs;

    public static ModifyNatRateLimitRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatRateLimitRuleRequest self = new ModifyNatRateLimitRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNatRateLimitRuleRequest setBandwidthLimit(String bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }
    public String getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public ModifyNatRateLimitRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyNatRateLimitRuleRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public ModifyNatRateLimitRuleRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ModifyNatRateLimitRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNatRateLimitRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    public ModifyNatRateLimitRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ModifyNatRateLimitRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyNatRateLimitRuleRequest setSourceCIDRs(java.util.List<String> sourceCIDRs) {
        this.sourceCIDRs = sourceCIDRs;
        return this;
    }
    public java.util.List<String> getSourceCIDRs() {
        return this.sourceCIDRs;
    }

}
