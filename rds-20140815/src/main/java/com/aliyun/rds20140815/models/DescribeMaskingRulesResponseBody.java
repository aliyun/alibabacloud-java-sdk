// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMaskingRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeMaskingRulesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMaskingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaskingRulesResponseBody self = new DescribeMaskingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMaskingRulesResponseBody setData(DescribeMaskingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMaskingRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeMaskingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMaskingRulesResponseBodyDataRulesRuleConfig extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<String> columns;

        @NameInMap("Databases")
        public java.util.List<String> databases;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static DescribeMaskingRulesResponseBodyDataRulesRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaskingRulesResponseBodyDataRulesRuleConfig self = new DescribeMaskingRulesResponseBodyDataRulesRuleConfig();
            return TeaModel.build(map, self);
        }

        public DescribeMaskingRulesResponseBodyDataRulesRuleConfig setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public DescribeMaskingRulesResponseBodyDataRulesRuleConfig setDatabases(java.util.List<String> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<String> getDatabases() {
            return this.databases;
        }

        public DescribeMaskingRulesResponseBodyDataRulesRuleConfig setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

    public static class DescribeMaskingRulesResponseBodyDataRules extends TeaModel {
        @NameInMap("DefaultAlgo")
        public String defaultAlgo;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("MaskingAlgo")
        public String maskingAlgo;

        @NameInMap("RuleConfig")
        public DescribeMaskingRulesResponseBodyDataRulesRuleConfig ruleConfig;

        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeMaskingRulesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaskingRulesResponseBodyDataRules self = new DescribeMaskingRulesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public DescribeMaskingRulesResponseBodyDataRules setDefaultAlgo(String defaultAlgo) {
            this.defaultAlgo = defaultAlgo;
            return this;
        }
        public String getDefaultAlgo() {
            return this.defaultAlgo;
        }

        public DescribeMaskingRulesResponseBodyDataRules setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeMaskingRulesResponseBodyDataRules setMaskingAlgo(String maskingAlgo) {
            this.maskingAlgo = maskingAlgo;
            return this;
        }
        public String getMaskingAlgo() {
            return this.maskingAlgo;
        }

        public DescribeMaskingRulesResponseBodyDataRules setRuleConfig(DescribeMaskingRulesResponseBodyDataRulesRuleConfig ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public DescribeMaskingRulesResponseBodyDataRulesRuleConfig getRuleConfig() {
            return this.ruleConfig;
        }

        public DescribeMaskingRulesResponseBodyDataRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class DescribeMaskingRulesResponseBodyData extends TeaModel {
        @NameInMap("Rules")
        public java.util.List<DescribeMaskingRulesResponseBodyDataRules> rules;

        public static DescribeMaskingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaskingRulesResponseBodyData self = new DescribeMaskingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMaskingRulesResponseBodyData setRules(java.util.List<DescribeMaskingRulesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeMaskingRulesResponseBodyDataRules> getRules() {
            return this.rules;
        }

    }

}
