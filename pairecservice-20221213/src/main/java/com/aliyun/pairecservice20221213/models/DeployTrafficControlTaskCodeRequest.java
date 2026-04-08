// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeployTrafficControlTaskCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RetryDeploy")
    public Boolean retryDeploy;

    public static DeployTrafficControlTaskCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployTrafficControlTaskCodeRequest self = new DeployTrafficControlTaskCodeRequest();
        return TeaModel.build(map, self);
    }

    public DeployTrafficControlTaskCodeRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public DeployTrafficControlTaskCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeployTrafficControlTaskCodeRequest setRetryDeploy(Boolean retryDeploy) {
        this.retryDeploy = retryDeploy;
        return this;
    }
    public Boolean getRetryDeploy() {
        return this.retryDeploy;
    }

}
