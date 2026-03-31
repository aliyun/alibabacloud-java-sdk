// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBaseSystemRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>80736FA5-FA87-55F6-AA69-C5477C6FE6D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeBaseSystemRulesResponseBodyRules> rules;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeBaseSystemRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseSystemRulesResponseBody self = new DescribeBaseSystemRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBaseSystemRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBaseSystemRulesResponseBody setRules(java.util.List<DescribeBaseSystemRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeBaseSystemRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeBaseSystemRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBaseSystemRulesResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CVE-2021-34538</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <strong>example:</strong>
         * <p>rule description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>sqli</p>
         */
        @NameInMap("DetectType")
        public String detectType;

        /**
         * <strong>example:</strong>
         * <p>super_strict</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <strong>example:</strong>
         * <p>113089</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <strong>example:</strong>
         * <p>systemRuleTest</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleStatus")
        public Integer ruleStatus;

        /**
         * <strong>example:</strong>
         * <p>1665460629000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeBaseSystemRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseSystemRulesResponseBodyRules self = new DescribeBaseSystemRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeBaseSystemRulesResponseBodyRules setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeBaseSystemRulesResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBaseSystemRulesResponseBodyRules setDetectType(String detectType) {
            this.detectType = detectType;
            return this;
        }
        public String getDetectType() {
            return this.detectType;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRuleStatus(Integer ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeBaseSystemRulesResponseBodyRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
