// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeDefenseRulesResponseBodyRules> rules;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRulesResponseBody self = new DescribeDefenseRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseRulesResponseBody setRules(java.util.List<DescribeDefenseRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeDefenseRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeDefenseRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDefenseRulesResponseBodyRules extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("DefenseOrigin")
        public String defenseOrigin;

        @NameInMap("DefenseScene")
        public String defenseScene;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeDefenseRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseRulesResponseBodyRules self = new DescribeDefenseRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseRulesResponseBodyRules setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeDefenseRulesResponseBodyRules setDefenseOrigin(String defenseOrigin) {
            this.defenseOrigin = defenseOrigin;
            return this;
        }
        public String getDefenseOrigin() {
            return this.defenseOrigin;
        }

        public DescribeDefenseRulesResponseBodyRules setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDefenseRulesResponseBodyRules setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseRulesResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDefenseRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDefenseRulesResponseBodyRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDefenseRulesResponseBodyRules setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
