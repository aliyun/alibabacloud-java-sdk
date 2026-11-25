// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlTargetRequest extends TeaModel {
    /**
     * <p>The environment.</p>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-1324***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopTrafficControlTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlTargetRequest self = new StopTrafficControlTargetRequest();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlTargetRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public StopTrafficControlTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
