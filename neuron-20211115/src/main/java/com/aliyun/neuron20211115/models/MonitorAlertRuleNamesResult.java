// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorAlertRuleNamesResult extends TeaModel {
    @NameInMap("ruleNames")
    public java.util.List<String> ruleNames;

    public static MonitorAlertRuleNamesResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorAlertRuleNamesResult self = new MonitorAlertRuleNamesResult();
        return TeaModel.build(map, self);
    }

    public MonitorAlertRuleNamesResult setRuleNames(java.util.List<String> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

}
