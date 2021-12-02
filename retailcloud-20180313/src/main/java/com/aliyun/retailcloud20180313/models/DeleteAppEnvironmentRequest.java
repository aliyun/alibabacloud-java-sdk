// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppEnvironmentRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteAppEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppEnvironmentRequest self = new DeleteAppEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppEnvironmentRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteAppEnvironmentRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public DeleteAppEnvironmentRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
