// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDisableMsSgAuthRuleGroupsRequest extends TeaModel {
    @NameInMap("AuthRuleIds")
    public String authRuleIds;

    @NameInMap("InstanceId")
    public String instanceId;

    public static BatchDisableMsSgAuthRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDisableMsSgAuthRuleGroupsRequest self = new BatchDisableMsSgAuthRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDisableMsSgAuthRuleGroupsRequest setAuthRuleIds(String authRuleIds) {
        this.authRuleIds = authRuleIds;
        return this;
    }
    public String getAuthRuleIds() {
        return this.authRuleIds;
    }

    public BatchDisableMsSgAuthRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
