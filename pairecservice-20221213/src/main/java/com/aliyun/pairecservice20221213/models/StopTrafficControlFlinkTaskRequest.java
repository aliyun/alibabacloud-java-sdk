// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlFlinkTaskRequest extends TeaModel {
    /**
     * <p>The environment to which the instance belongs. Valid values: </p>
     * <ul>
     * <li><p>Daily: daily environment.</p>
     * </li>
     * <li><p>Pre: staging environment.</p>
     * </li>
     * <li><p>Prod: production environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec_123****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopTrafficControlFlinkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlFlinkTaskRequest self = new StopTrafficControlFlinkTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlFlinkTaskRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public StopTrafficControlFlinkTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
