// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRelatedDefenseRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeRelatedDefenseRulesResponseBodyRules> rules;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeRelatedDefenseRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRelatedDefenseRulesResponseBody self = new DescribeRelatedDefenseRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRelatedDefenseRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRelatedDefenseRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRelatedDefenseRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRelatedDefenseRulesResponseBody setRules(java.util.List<DescribeRelatedDefenseRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeRelatedDefenseRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeRelatedDefenseRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRelatedDefenseRulesResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>custom_acl</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <strong>example:</strong>
         * <p>template</p>
         */
        @NameInMap("DefenseType")
        public String defenseType;

        /**
         * <strong>example:</strong>
         * <p>2456789</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <strong>example:</strong>
         * <p>ruleTest</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>81501</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeRelatedDefenseRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRelatedDefenseRulesResponseBodyRules self = new DescribeRelatedDefenseRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeRelatedDefenseRulesResponseBodyRules setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeRelatedDefenseRulesResponseBodyRules setDefenseType(String defenseType) {
            this.defenseType = defenseType;
            return this;
        }
        public String getDefenseType() {
            return this.defenseType;
        }

        public DescribeRelatedDefenseRulesResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeRelatedDefenseRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRelatedDefenseRulesResponseBodyRules setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
