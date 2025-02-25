// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DisasterRecoveryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-xxx</p>
     */
    @NameInMap("RecoveryInstanceId")
    public String recoveryInstanceId;

    public static DisasterRecoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DisasterRecoveryRequest self = new DisasterRecoveryRequest();
        return TeaModel.build(map, self);
    }

    public DisasterRecoveryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisasterRecoveryRequest setRecoveryInstanceId(String recoveryInstanceId) {
        this.recoveryInstanceId = recoveryInstanceId;
        return this;
    }
    public String getRecoveryInstanceId() {
        return this.recoveryInstanceId;
    }

}
