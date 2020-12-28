// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByClientIdRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMqttQueryClientByClientIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByClientIdRequest self = new OnsMqttQueryClientByClientIdRequest();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByClientIdRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public OnsMqttQueryClientByClientIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
