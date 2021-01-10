// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsSgDowngradeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DisableMsSgDowngradeRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMsSgDowngradeRequest self = new DisableMsSgDowngradeRequest();
        return TeaModel.build(map, self);
    }

    public DisableMsSgDowngradeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableMsSgDowngradeRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
