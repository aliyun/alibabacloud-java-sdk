// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnRegisterDeviceCredentialRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UnRegisterDeviceCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterDeviceCredentialRequest self = new UnRegisterDeviceCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UnRegisterDeviceCredentialRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UnRegisterDeviceCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
