// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class CloseConnectionRequest extends TeaModel {
    /**
     * <p>Client ID of the device</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test@@@test</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>ID of the Micro Message Queue MQTT version instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-0pp12gl****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CloseConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseConnectionRequest self = new CloseConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CloseConnectionRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CloseConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
