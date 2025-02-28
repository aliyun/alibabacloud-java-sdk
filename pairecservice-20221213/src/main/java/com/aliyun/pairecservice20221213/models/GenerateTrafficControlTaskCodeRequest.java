// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateTrafficControlTaskCodeRequest extends TeaModel {
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>This parameter is required.</p>
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
