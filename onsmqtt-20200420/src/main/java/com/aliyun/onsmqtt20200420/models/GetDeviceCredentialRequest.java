// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetDeviceCredentialRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDeviceCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCredentialRequest self = new GetDeviceCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceCredentialRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetDeviceCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
