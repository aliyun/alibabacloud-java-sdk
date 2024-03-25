// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterDeviceCredentialRequest extends TeaModel {
    /**
     * <p>The client ID of the device for which you want to create an access credential.</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the **Instance Details** page that corresponds to the instance in the ApsaraMQ for MQTT console.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RegisterDeviceCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceCredentialRequest self = new RegisterDeviceCredentialRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceCredentialRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RegisterDeviceCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
