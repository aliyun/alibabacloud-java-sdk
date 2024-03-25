// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryTokenRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the **Instance Details** page that corresponds to the instance in the [ApsaraMQ for MQTT console](https://mqtt.console.aliyun.com/).</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The token that you want to query.</p>
     */
    @NameInMap("Token")
    public String token;

    public static QueryTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenRequest self = new QueryTokenRequest();
        return TeaModel.build(map, self);
    }

    public QueryTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
