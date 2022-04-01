// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeployModeNodeCountConstraint extends TeaModel {
    // deployMode
    @NameInMap("deployMode")
    public String deployMode;

    // nodeCountConstraint
    @NameInMap("nodeCountConstraint")
    public IntValueConstraint nodeCountConstraint;

    public static DeployModeNodeCountConstraint build(java.util.Map<String, ?> map) throws Exception {
        DeployModeNodeCountConstraint self = new DeployModeNodeCountConstraint();
        return TeaModel.build(map, self);
    }

    public DeployModeNodeCountConstraint setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public DeployModeNodeCountConstraint setNodeCountConstraint(IntValueConstraint nodeCountConstraint) {
        this.nodeCountConstraint = nodeCountConstraint;
        return this;
    }
    public IntValueConstraint getNodeCountConstraint() {
        return this.nodeCountConstraint;
    }

}
