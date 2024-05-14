// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeRulesResponseBody extends TeaModel {
    @NameInMap("IsSubscribe")
    public Long isSubscribe;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleGroupName")
    public String ruleGroupName;

    @NameInMap("RuleGroupTemplateId")
    public String ruleGroupTemplateId;

    @NameInMap("RuleGroupTemplateName")
    public String ruleGroupTemplateName;

    @NameInMap("Rules")
    public java.util.List<DescribeRulesResponseBodyRules> rules;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesResponseBody self = new DescribeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRulesResponseBody setIsSubscribe(Long isSubscribe) {
        this.isSubscribe = isSubscribe;
        return this;
    }
    public Long getIsSubscribe() {
        return this.isSubscribe;
    }

    public DescribeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRulesResponseBody setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }
    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    public DescribeRulesResponseBody setRuleGroupTemplateId(String ruleGroupTemplateId) {
        this.ruleGroupTemplateId = ruleGroupTemplateId;
        return this;
    }
    public String getRuleGroupTemplateId() {
        return this.ruleGroupTemplateId;
    }

    public DescribeRulesResponseBody setRuleGroupTemplateName(String ruleGroupTemplateName) {
        this.ruleGroupTemplateName = ruleGroupTemplateName;
        return this;
    }
    public String getRuleGroupTemplateName() {
        return this.ruleGroupTemplateName;
    }

    public DescribeRulesResponseBody setRules(java.util.List<DescribeRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRulesResponseBodyRules extends TeaModel {
        @NameInMap("ApplicationType")
        public Integer applicationType;

        /**
         * <p>CVE ID。</p>
         */
        @NameInMap("CveId")
        public String cveId;

        @NameInMap("CveUrl")
        public String cveUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("ProtectionType")
        public Integer protectionType;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesResponseBodyRules self = new DescribeRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeRulesResponseBodyRules setApplicationType(Integer applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public Integer getApplicationType() {
            return this.applicationType;
        }

        public DescribeRulesResponseBodyRules setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeRulesResponseBodyRules setCveUrl(String cveUrl) {
            this.cveUrl = cveUrl;
            return this;
        }
        public String getCveUrl() {
            return this.cveUrl;
        }

        public DescribeRulesResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRulesResponseBodyRules setProtectionType(Integer protectionType) {
            this.protectionType = protectionType;
            return this;
        }
        public Integer getProtectionType() {
            return this.protectionType;
        }

        public DescribeRulesResponseBodyRules setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeRulesResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRulesResponseBodyRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
