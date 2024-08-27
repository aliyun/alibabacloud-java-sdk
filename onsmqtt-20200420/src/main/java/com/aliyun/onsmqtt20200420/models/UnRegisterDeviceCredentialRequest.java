// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnRegisterDeviceCredentialRequest extends TeaModel {
    /**
     * <p>The client ID of the device whose access credential you want to deregister.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test@@@test</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the <strong>Instance Details</strong> page that corresponds to the instance in the ApsaraMQ for MQTT console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-0pp12gl****</p>
     */
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
