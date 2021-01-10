// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgAuthRuleGroupsRequest extends TeaModel {
    @NameInMap("AuthGroupId")
    public Long authGroupId;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableMsSgAuthRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgAuthRuleGroupsRequest self = new EnableMsSgAuthRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public EnableMsSgAuthRuleGroupsRequest setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }
    public Long getAuthGroupId() {
        return this.authGroupId;
    }

    public EnableMsSgAuthRuleGroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public EnableMsSgAuthRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
