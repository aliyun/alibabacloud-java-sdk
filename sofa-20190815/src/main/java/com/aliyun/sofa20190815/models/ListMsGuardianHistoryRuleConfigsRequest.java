// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsGuardianHistoryRuleConfigsRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static ListMsGuardianHistoryRuleConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsGuardianHistoryRuleConfigsRequest self = new ListMsGuardianHistoryRuleConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsGuardianHistoryRuleConfigsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListMsGuardianHistoryRuleConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMsGuardianHistoryRuleConfigsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
