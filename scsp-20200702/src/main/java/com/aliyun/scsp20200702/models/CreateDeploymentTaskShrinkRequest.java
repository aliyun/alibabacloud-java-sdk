// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateDeploymentTaskShrinkRequest extends TeaModel {
    @NameInMap("AppArchiveIds")
    public String appArchiveIdsShrink;

    @NameInMap("DeploymentArchiveId")
    public String deploymentArchiveId;

    @NameInMap("DeploymentCode")
    public String deploymentCode;

    @NameInMap("EnvType")
    public String envType;

    public static CreateDeploymentTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTaskShrinkRequest self = new CreateDeploymentTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTaskShrinkRequest setAppArchiveIdsShrink(String appArchiveIdsShrink) {
        this.appArchiveIdsShrink = appArchiveIdsShrink;
        return this;
    }
    public String getAppArchiveIdsShrink() {
        return this.appArchiveIdsShrink;
    }

    public CreateDeploymentTaskShrinkRequest setDeploymentArchiveId(String deploymentArchiveId) {
        this.deploymentArchiveId = deploymentArchiveId;
        return this;
    }
    public String getDeploymentArchiveId() {
        return this.deploymentArchiveId;
    }

    public CreateDeploymentTaskShrinkRequest setDeploymentCode(String deploymentCode) {
        this.deploymentCode = deploymentCode;
        return this;
    }
    public String getDeploymentCode() {
        return this.deploymentCode;
    }

    public CreateDeploymentTaskShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

}
