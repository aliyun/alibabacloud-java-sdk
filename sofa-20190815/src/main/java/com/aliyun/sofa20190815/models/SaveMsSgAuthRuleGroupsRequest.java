// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveMsSgAuthRuleGroupsRequest extends TeaModel {
    @NameInMap("AuthRuleGroup")
    public String authRuleGroup;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static SaveMsSgAuthRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMsSgAuthRuleGroupsRequest self = new SaveMsSgAuthRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public SaveMsSgAuthRuleGroupsRequest setAuthRuleGroup(String authRuleGroup) {
        this.authRuleGroup = authRuleGroup;
        return this;
    }
    public String getAuthRuleGroup() {
        return this.authRuleGroup;
    }

    public SaveMsSgAuthRuleGroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SaveMsSgAuthRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
