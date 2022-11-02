// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rule")
    public DescribeDefenseRuleResponseBodyRule rule;

    public static DescribeDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRuleResponseBody self = new DescribeDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseRuleResponseBody setRule(DescribeDefenseRuleResponseBodyRule rule) {
        this.rule = rule;
        return this;
    }
    public DescribeDefenseRuleResponseBodyRule getRule() {
        return this.rule;
    }

    public static class DescribeDefenseRuleResponseBodyRule extends TeaModel {
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

        public static DescribeDefenseRuleResponseBodyRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseRuleResponseBodyRule self = new DescribeDefenseRuleResponseBodyRule();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseRuleResponseBodyRule setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeDefenseRuleResponseBodyRule setDefenseOrigin(String defenseOrigin) {
            this.defenseOrigin = defenseOrigin;
            return this;
        }
        public String getDefenseOrigin() {
            return this.defenseOrigin;
        }

        public DescribeDefenseRuleResponseBodyRule setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDefenseRuleResponseBodyRule setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseRuleResponseBodyRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDefenseRuleResponseBodyRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDefenseRuleResponseBodyRule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDefenseRuleResponseBodyRule setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
