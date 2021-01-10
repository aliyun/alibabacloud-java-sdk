// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultInjectAllServicesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMsSgFaultInjectAllServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultInjectAllServicesRequest self = new ListMsSgFaultInjectAllServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultInjectAllServicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
