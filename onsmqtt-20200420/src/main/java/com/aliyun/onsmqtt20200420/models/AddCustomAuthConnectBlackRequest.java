// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class AddCustomAuthConnectBlackRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AddCustomAuthConnectBlackRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAuthConnectBlackRequest self = new AddCustomAuthConnectBlackRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomAuthConnectBlackRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AddCustomAuthConnectBlackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
