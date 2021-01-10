// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRuleapplyforpublishRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    public static ExecHasInspectRuleapplyforpublishRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRuleapplyforpublishRequest self = new ExecHasInspectRuleapplyforpublishRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRuleapplyforpublishRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
