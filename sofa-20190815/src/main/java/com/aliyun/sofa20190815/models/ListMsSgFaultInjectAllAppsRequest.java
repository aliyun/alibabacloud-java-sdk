// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultInjectAllAppsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMsSgFaultInjectAllAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultInjectAllAppsRequest self = new ListMsSgFaultInjectAllAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultInjectAllAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
