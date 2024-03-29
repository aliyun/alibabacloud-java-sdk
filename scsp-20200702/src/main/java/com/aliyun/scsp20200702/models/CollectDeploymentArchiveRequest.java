// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CollectDeploymentArchiveRequest extends TeaModel {
    @NameInMap("DeploymentCode")
    public String deploymentCode;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("Name")
    public String name;

    public static CollectDeploymentArchiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CollectDeploymentArchiveRequest self = new CollectDeploymentArchiveRequest();
        return TeaModel.build(map, self);
    }

    public CollectDeploymentArchiveRequest setDeploymentCode(String deploymentCode) {
        this.deploymentCode = deploymentCode;
        return this;
    }
    public String getDeploymentCode() {
        return this.deploymentCode;
    }

    public CollectDeploymentArchiveRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public CollectDeploymentArchiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
