// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsRuleGroupByNameRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("ResType")
    public String resType;

    @NameInMap("RuleGroupName")
    public String ruleGroupName;

    public static DeleteRmsRuleGroupByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsRuleGroupByNameRequest self = new DeleteRmsRuleGroupByNameRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRmsRuleGroupByNameRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public DeleteRmsRuleGroupByNameRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public DeleteRmsRuleGroupByNameRequest setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }
    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

}
