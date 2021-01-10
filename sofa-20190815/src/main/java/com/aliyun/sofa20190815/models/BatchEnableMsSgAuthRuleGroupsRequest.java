// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchEnableMsSgAuthRuleGroupsRequest extends TeaModel {
    @NameInMap("AuthRuleIds")
    public String authRuleIds;

    @NameInMap("InstanceId")
    public String instanceId;

    public static BatchEnableMsSgAuthRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableMsSgAuthRuleGroupsRequest self = new BatchEnableMsSgAuthRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public BatchEnableMsSgAuthRuleGroupsRequest setAuthRuleIds(String authRuleIds) {
        this.authRuleIds = authRuleIds;
        return this;
    }
    public String getAuthRuleIds() {
        return this.authRuleIds;
    }

    public BatchEnableMsSgAuthRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
