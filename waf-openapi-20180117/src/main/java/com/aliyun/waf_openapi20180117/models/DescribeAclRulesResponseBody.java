// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeAclRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAclRulesResponseBodyResult result;

    public static DescribeAclRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclRulesResponseBody self = new DescribeAclRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAclRulesResponseBody setResult(DescribeAclRulesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAclRulesResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Contain")
        public String contain;

        public static DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition self = new DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition();
            return TeaModel.build(map, self);
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition setContain(String contain) {
            this.contain = contain;
            return this;
        }
        public String getContain() {
            return this.contain;
        }

    }

    public static class DescribeAclRulesResponseBodyResultAclRulesAclRuleConditions extends TeaModel {
        @NameInMap("condition")
        public java.util.List<DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition> condition;

        public static DescribeAclRulesResponseBodyResultAclRulesAclRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclRulesResponseBodyResultAclRulesAclRuleConditions self = new DescribeAclRulesResponseBodyResultAclRulesAclRuleConditions();
            return TeaModel.build(map, self);
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRuleConditions setCondition(java.util.List<DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition> condition) {
            this.condition = condition;
            return this;
        }
        public java.util.List<DescribeAclRulesResponseBodyResultAclRulesAclRuleConditionsCondition> getCondition() {
            return this.condition;
        }

    }

    public static class DescribeAclRulesResponseBodyResultAclRulesAclRule extends TeaModel {
        @NameInMap("Action")
        public Integer action;

        @NameInMap("IsDefault")
        public Integer isDefault;

        @NameInMap("ContinueWaf")
        public Integer continueWaf;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("Conditions")
        public DescribeAclRulesResponseBodyResultAclRulesAclRuleConditions conditions;

        @NameInMap("ContinueDataRiskControl")
        public Integer continueDataRiskControl;

        @NameInMap("ContinueSdk")
        public Integer continueSdk;

        @NameInMap("ContinueCc")
        public Integer continueCc;

        @NameInMap("ContinueSA")
        public Integer continueSA;

        @NameInMap("ContinueBlockGeo")
        public Integer continueBlockGeo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static DescribeAclRulesResponseBodyResultAclRulesAclRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclRulesResponseBodyResultAclRulesAclRule self = new DescribeAclRulesResponseBodyResultAclRulesAclRule();
            return TeaModel.build(map, self);
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setAction(Integer action) {
            this.action = action;
            return this;
        }
        public Integer getAction() {
            return this.action;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Integer getIsDefault() {
            return this.isDefault;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setContinueWaf(Integer continueWaf) {
            this.continueWaf = continueWaf;
            return this;
        }
        public Integer getContinueWaf() {
            return this.continueWaf;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setConditions(DescribeAclRulesResponseBodyResultAclRulesAclRuleConditions conditions) {
            this.conditions = conditions;
            return this;
        }
        public DescribeAclRulesResponseBodyResultAclRulesAclRuleConditions getConditions() {
            return this.conditions;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setContinueDataRiskControl(Integer continueDataRiskControl) {
            this.continueDataRiskControl = continueDataRiskControl;
            return this;
        }
        public Integer getContinueDataRiskControl() {
            return this.continueDataRiskControl;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setContinueSdk(Integer continueSdk) {
            this.continueSdk = continueSdk;
            return this;
        }
        public Integer getContinueSdk() {
            return this.continueSdk;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setContinueCc(Integer continueCc) {
            this.continueCc = continueCc;
            return this;
        }
        public Integer getContinueCc() {
            return this.continueCc;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setContinueSA(Integer continueSA) {
            this.continueSA = continueSA;
            return this;
        }
        public Integer getContinueSA() {
            return this.continueSA;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setContinueBlockGeo(Integer continueBlockGeo) {
            this.continueBlockGeo = continueBlockGeo;
            return this;
        }
        public Integer getContinueBlockGeo() {
            return this.continueBlockGeo;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAclRulesResponseBodyResultAclRulesAclRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DescribeAclRulesResponseBodyResultAclRules extends TeaModel {
        @NameInMap("AclRule")
        public java.util.List<DescribeAclRulesResponseBodyResultAclRulesAclRule> aclRule;

        public static DescribeAclRulesResponseBodyResultAclRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclRulesResponseBodyResultAclRules self = new DescribeAclRulesResponseBodyResultAclRules();
            return TeaModel.build(map, self);
        }

        public DescribeAclRulesResponseBodyResultAclRules setAclRule(java.util.List<DescribeAclRulesResponseBodyResultAclRulesAclRule> aclRule) {
            this.aclRule = aclRule;
            return this;
        }
        public java.util.List<DescribeAclRulesResponseBodyResultAclRulesAclRule> getAclRule() {
            return this.aclRule;
        }

    }

    public static class DescribeAclRulesResponseBodyResult extends TeaModel {
        @NameInMap("AclRules")
        public DescribeAclRulesResponseBodyResultAclRules aclRules;

        @NameInMap("Total")
        public Integer total;

        public static DescribeAclRulesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclRulesResponseBodyResult self = new DescribeAclRulesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAclRulesResponseBodyResult setAclRules(DescribeAclRulesResponseBodyResultAclRules aclRules) {
            this.aclRules = aclRules;
            return this;
        }
        public DescribeAclRulesResponseBodyResultAclRules getAclRules() {
            return this.aclRules;
        }

        public DescribeAclRulesResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
