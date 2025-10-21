// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateDeploymentTargetV2Request extends TeaModel {
    @NameInMap("body")
    public Resource body;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dt</p>
     */
    @NameInMap("deploymentTargetName")
    public String deploymentTargetName;

    public static CreateDeploymentTargetV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentTargetV2Request self = new CreateDeploymentTargetV2Request();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentTargetV2Request setBody(Resource body) {
        this.body = body;
        return this;
    }
    public Resource getBody() {
        return this.body;
    }

    public CreateDeploymentTargetV2Request setDeploymentTargetName(String deploymentTargetName) {
        this.deploymentTargetName = deploymentTargetName;
        return this;
    }
    public String getDeploymentTargetName() {
        return this.deploymentTargetName;
    }

}
