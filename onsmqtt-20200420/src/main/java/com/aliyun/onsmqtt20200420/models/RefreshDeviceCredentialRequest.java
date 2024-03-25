// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RefreshDeviceCredentialRequest extends TeaModel {
    /**
     * <p>The client ID of the device whose access credential you want to update.</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the **Instance Details** page that corresponds to the instance in the ApsaraMQ for MQTT console.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RefreshDeviceCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDeviceCredentialRequest self = new RefreshDeviceCredentialRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDeviceCredentialRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RefreshDeviceCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
