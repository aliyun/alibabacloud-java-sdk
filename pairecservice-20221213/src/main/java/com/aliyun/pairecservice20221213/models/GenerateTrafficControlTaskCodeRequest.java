// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateTrafficControlTaskCodeRequest extends TeaModel {
    /**
     * <p>The environment type. Valid values: <code>Daily</code> (daily environment), <code>Pre</code> (pre-release environment), and <code>Prod</code> (production environment).</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GenerateTrafficControlTaskCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTrafficControlTaskCodeRequest self = new GenerateTrafficControlTaskCodeRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTrafficControlTaskCodeRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public GenerateTrafficControlTaskCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
