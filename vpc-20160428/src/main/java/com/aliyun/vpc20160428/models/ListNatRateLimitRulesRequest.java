// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatRateLimitRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, and you must ensure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li><p>If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * </li>
     * <li><p>If a next query is to be sent, set the value to the <strong>NextToken</strong> value returned from the last call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the rate limiting rules.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<String> ruleIds;

    /**
     * <p>The name of the rate limiting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The source IP address CIDR block of the rate limiting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1.1.0/24</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    public static ListNatRateLimitRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNatRateLimitRulesRequest self = new ListNatRateLimitRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListNatRateLimitRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListNatRateLimitRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNatRateLimitRulesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListNatRateLimitRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatRateLimitRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListNatRateLimitRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNatRateLimitRulesRequest setRuleIds(java.util.List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<String> getRuleIds() {
        return this.ruleIds;
    }

    public ListNatRateLimitRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListNatRateLimitRulesRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

}
