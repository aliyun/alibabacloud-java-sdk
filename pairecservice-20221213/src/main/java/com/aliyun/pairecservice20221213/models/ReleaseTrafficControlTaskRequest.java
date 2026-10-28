// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReleaseTrafficControlTaskRequest extends TeaModel {
    /**
     * <p>The environment. Valid values: Daily (daily environment), Pre (staging environment), and Prod (production environment).</p>
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

    public static ReleaseTrafficControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseTrafficControlTaskRequest self = new ReleaseTrafficControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseTrafficControlTaskRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ReleaseTrafficControlTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
