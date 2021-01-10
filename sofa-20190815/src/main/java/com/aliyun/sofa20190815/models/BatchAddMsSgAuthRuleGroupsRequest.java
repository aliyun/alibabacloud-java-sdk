// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchAddMsSgAuthRuleGroupsRequest extends TeaModel {
    @NameInMap("AuthRuleAddModel")
    public String authRuleAddModel;

    @NameInMap("InstanceId")
    public String instanceId;

    public static BatchAddMsSgAuthRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddMsSgAuthRuleGroupsRequest self = new BatchAddMsSgAuthRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddMsSgAuthRuleGroupsRequest setAuthRuleAddModel(String authRuleAddModel) {
        this.authRuleAddModel = authRuleAddModel;
        return this;
    }
    public String getAuthRuleAddModel() {
        return this.authRuleAddModel;
    }

    public BatchAddMsSgAuthRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
