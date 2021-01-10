// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskRuleRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("RuleCode")
    public String ruleCode;

    public static GetClriskRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskRuleRequest self = new GetClriskRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskRuleRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public GetClriskRuleRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

}
