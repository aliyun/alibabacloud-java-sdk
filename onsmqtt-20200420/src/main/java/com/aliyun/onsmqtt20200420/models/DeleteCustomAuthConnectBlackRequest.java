// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCustomAuthConnectBlackRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteCustomAuthConnectBlackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAuthConnectBlackRequest self = new DeleteCustomAuthConnectBlackRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAuthConnectBlackRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DeleteCustomAuthConnectBlackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
