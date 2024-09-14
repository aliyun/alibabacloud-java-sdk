// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentTargetRequest extends TeaModel {
    @NameInMap("body")
    public ResourceSpec body;

    public static UpdateDeploymentTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentTargetRequest self = new UpdateDeploymentTargetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentTargetRequest setBody(ResourceSpec body) {
        this.body = body;
        return this;
    }
    public ResourceSpec getBody() {
        return this.body;
    }

}
