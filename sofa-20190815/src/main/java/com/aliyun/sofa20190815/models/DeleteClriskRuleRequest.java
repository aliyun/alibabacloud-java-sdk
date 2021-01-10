// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskRuleRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("RuleCode")
    public String ruleCode;

    public static DeleteClriskRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskRuleRequest self = new DeleteClriskRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClriskRuleRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public DeleteClriskRuleRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

}
