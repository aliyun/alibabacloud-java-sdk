// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgDowngradeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static EnableMsSgDowngradeRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgDowngradeRequest self = new EnableMsSgDowngradeRequest();
        return TeaModel.build(map, self);
    }

    public EnableMsSgDowngradeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableMsSgDowngradeRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
