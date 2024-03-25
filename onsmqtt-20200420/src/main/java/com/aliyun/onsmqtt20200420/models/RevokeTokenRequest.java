// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RevokeTokenRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the **Instance Details** page that corresponds to the instance in the [ApsaraMQ for MQTT console](https://mqtt.console.aliyun.com/).</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The token that you want to revoke.</p>
     */
    @NameInMap("Token")
    public String token;

    public static RevokeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeTokenRequest self = new RevokeTokenRequest();
        return TeaModel.build(map, self);
    }

    public RevokeTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
