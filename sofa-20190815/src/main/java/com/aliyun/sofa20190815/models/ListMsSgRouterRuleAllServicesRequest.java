// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleAllServicesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMsSgRouterRuleAllServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleAllServicesRequest self = new ListMsSgRouterRuleAllServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleAllServicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
