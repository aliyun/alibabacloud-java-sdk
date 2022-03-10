// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionRuleConfigRequest extends TeaModel {
    @NameInMap("RuleModel")
    public String ruleModel;

    public static SetDataLevelPermissionRuleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionRuleConfigRequest self = new SetDataLevelPermissionRuleConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionRuleConfigRequest setRuleModel(String ruleModel) {
        this.ruleModel = ruleModel;
        return this;
    }
    public String getRuleModel() {
        return this.ruleModel;
    }

}
