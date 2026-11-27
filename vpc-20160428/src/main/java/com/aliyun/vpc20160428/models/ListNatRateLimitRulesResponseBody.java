// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatRateLimitRulesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The NAT gateway instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1b0lic8uz4r6vf2****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query is to be sent.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD97C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of rate limiting rules.</p>
     */
    @NameInMap("RuleInfos")
    public java.util.List<ListNatRateLimitRulesResponseBodyRuleInfos> ruleInfos;

    /**
     * <p>The total number of rate limiting rules returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNatRateLimitRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNatRateLimitRulesResponseBody self = new ListNatRateLimitRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNatRateLimitRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNatRateLimitRulesResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListNatRateLimitRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatRateLimitRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNatRateLimitRulesResponseBody setRuleInfos(java.util.List<ListNatRateLimitRulesResponseBodyRuleInfos> ruleInfos) {
        this.ruleInfos = ruleInfos;
        return this;
    }
    public java.util.List<ListNatRateLimitRulesResponseBodyRuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    public ListNatRateLimitRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNatRateLimitRulesResponseBodyRuleInfos extends TeaModel {
        /**
         * <p>The bandwidth limit. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BandwidthLimit")
        public String bandwidthLimit;

        /**
         * <p>The source match type of the rate limiting rule. Valid values:</p>
         * <ul>
         * <li><strong>CIDR</strong>: CIDR block match. This is the default value.</li>
         * <li><strong>TUNNEL</strong>: tunnel match. If this value is specified, a corresponding SNAT rule of the TUNNEL type must exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CIDR</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The description of the rate limiting rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleDescription")
        public String ruleDescription;

        /**
         * <p>The ID of the rate limiting rule.</p>
         * 
         * <strong>example:</strong>
         * <p>limit-rule-****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the rate limiting rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The source CIDR blocks of the rate limiting rule.</p>
         */
        @NameInMap("SourceCIDRs")
        public java.util.List<String> sourceCIDRs;

        /**
         * <p>The status of the rate limiting rule. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong>: The rule is available.</li>
         * <li><strong>Deleting</strong>: The rule is being deleted.</li>
         * <li><strong>Modifying</strong>: The rule is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tunnel index. If the MatchType parameter is set to TUNNEL, a corresponding SNAT rule must exist.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TunnelIndex")
        public String tunnelIndex;

        public static ListNatRateLimitRulesResponseBodyRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            ListNatRateLimitRulesResponseBodyRuleInfos self = new ListNatRateLimitRulesResponseBodyRuleInfos();
            return TeaModel.build(map, self);
        }

        public ListNatRateLimitRulesResponseBodyRuleInfos setBandwidthLimit(String bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        public String getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        public ListNatRateLimitRulesResponseBodyRuleInfos setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListNatRateLimitRulesResponseBodyRuleInfos setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public ListNatRateLimitRulesResponseBodyRuleInfos setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListNatRateLimitRulesResponseBodyRuleInfos setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListNatRateLimitRulesResponseBodyRuleInfos setSourceCIDRs(java.util.List<String> sourceCIDRs) {
            this.sourceCIDRs = sourceCIDRs;
            return this;
        }
        public java.util.List<String> getSourceCIDRs() {
            return this.sourceCIDRs;
        }

        public ListNatRateLimitRulesResponseBodyRuleInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNatRateLimitRulesResponseBodyRuleInfos setTunnelIndex(String tunnelIndex) {
            this.tunnelIndex = tunnelIndex;
            return this;
        }
        public String getTunnelIndex() {
            return this.tunnelIndex;
        }

    }

}
