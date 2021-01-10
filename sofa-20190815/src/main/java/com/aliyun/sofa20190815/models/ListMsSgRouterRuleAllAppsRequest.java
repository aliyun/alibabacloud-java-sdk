// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleAllAppsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMsSgRouterRuleAllAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleAllAppsRequest self = new ListMsSgRouterRuleAllAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleAllAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
