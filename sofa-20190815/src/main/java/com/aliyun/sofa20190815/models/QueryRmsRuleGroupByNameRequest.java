// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsRuleGroupByNameRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("ResType")
    public String resType;

    @NameInMap("RuleGroupName")
    public String ruleGroupName;

    @NameInMap("RuleType")
    public String ruleType;

    public static QueryRmsRuleGroupByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsRuleGroupByNameRequest self = new QueryRmsRuleGroupByNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsRuleGroupByNameRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsRuleGroupByNameRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public QueryRmsRuleGroupByNameRequest setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }
    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    public QueryRmsRuleGroupByNameRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
