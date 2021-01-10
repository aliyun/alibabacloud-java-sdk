// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckRmsRulegroupNameRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("RuleGroupName")
    public String ruleGroupName;

    public static CheckRmsRulegroupNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRmsRulegroupNameRequest self = new CheckRmsRulegroupNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckRmsRulegroupNameRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public CheckRmsRulegroupNameRequest setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }
    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

}
