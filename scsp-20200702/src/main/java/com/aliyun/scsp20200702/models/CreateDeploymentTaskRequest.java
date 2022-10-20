// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateDeploymentTaskRequest extends TeaModel {
    @NameInMap("AppArchiveIds")
    public java.util.List<String> appArchiveIds;

    @NameInMap("DeploymentArchiveId")
    public String deploymentArchiveId;

    @NameInMap("DeploymentCode")
    public String deploymentCode;

    @NameInMap("EnvType")
    public String envType;

    public static CreateDeploymentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTaskRequest self = new CreateDeploymentTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTaskRequest setAppArchiveIds(java.util.List<String> appArchiveIds) {
        this.appArchiveIds = appArchiveIds;
        return this;
    }
    public java.util.List<String> getAppArchiveIds() {
        return this.appArchiveIds;
    }

    public CreateDeploymentTaskRequest setDeploymentArchiveId(String deploymentArchiveId) {
        this.deploymentArchiveId = deploymentArchiveId;
        return this;
    }
    public String getDeploymentArchiveId() {
        return this.deploymentArchiveId;
    }

    public CreateDeploymentTaskRequest setDeploymentCode(String deploymentCode) {
        this.deploymentCode = deploymentCode;
        return this;
    }
    public String getDeploymentCode() {
        return this.deploymentCode;
    }

    public CreateDeploymentTaskRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

}
