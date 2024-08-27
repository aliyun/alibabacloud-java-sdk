// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class BatchQuerySessionByClientIdsRequest extends TeaModel {
    /**
     * <p>The ApsaraMQ for MQTT clients.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ClientIdList.1</p>
     */
    @NameInMap("ClientIdList")
    public java.util.List<String> clientIdList;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the <strong>Instance Details</strong> page that corresponds to the instance in the <a href="https://mqtt.console.aliyun.com">ApsaraMQ for MQTT console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-cn-0pp12gl****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static BatchQuerySessionByClientIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQuerySessionByClientIdsRequest self = new BatchQuerySessionByClientIdsRequest();
        return TeaModel.build(map, self);
    }

    public BatchQuerySessionByClientIdsRequest setClientIdList(java.util.List<String> clientIdList) {
        this.clientIdList = clientIdList;
        return this;
    }
    public java.util.List<String> getClientIdList() {
        return this.clientIdList;
    }

    public BatchQuerySessionByClientIdsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
