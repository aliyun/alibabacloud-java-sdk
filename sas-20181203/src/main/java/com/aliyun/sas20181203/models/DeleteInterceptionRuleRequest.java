// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInterceptionRuleRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RuleIds")
    public java.util.List<Long> ruleIds;

    public static DeleteInterceptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterceptionRuleRequest self = new DeleteInterceptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInterceptionRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteInterceptionRuleRequest setRuleIds(java.util.List<Long> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

}
