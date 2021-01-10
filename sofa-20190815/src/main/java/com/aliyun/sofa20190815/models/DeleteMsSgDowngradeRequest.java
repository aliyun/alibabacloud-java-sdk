// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgDowngradeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteMsSgDowngradeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgDowngradeRequest self = new DeleteMsSgDowngradeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgDowngradeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMsSgDowngradeRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
