// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DisasterDowngradeRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for MQTT instance for which you want to downgrade the VIP access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-xxxx</p>
     */
    @NameInMap("DowngradeInstanceId")
    public String downgradeInstanceId;

    /**
     * <p>The ID of the ApsaraMQ for MQTT instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisasterDowngradeRequest build(java.util.Map<String, ?> map) throws Exception {
        DisasterDowngradeRequest self = new DisasterDowngradeRequest();
        return TeaModel.build(map, self);
    }

    public DisasterDowngradeRequest setDowngradeInstanceId(String downgradeInstanceId) {
        this.downgradeInstanceId = downgradeInstanceId;
        return this;
    }
    public String getDowngradeInstanceId() {
        return this.downgradeInstanceId;
    }

    public DisasterDowngradeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
