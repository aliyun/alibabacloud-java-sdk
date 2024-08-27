// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QuerySessionByClientIdRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT client that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test@@@test</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the <strong>Instance Details</strong> page that corresponds to the instance in the <a href="https://mqtt.console.aliyun.com">ApsaraMQ for MQTT console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-0pp12gl****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static QuerySessionByClientIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByClientIdRequest self = new QuerySessionByClientIdRequest();
        return TeaModel.build(map, self);
    }

    public QuerySessionByClientIdRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QuerySessionByClientIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
