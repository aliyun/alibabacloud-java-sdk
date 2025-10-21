// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentTargetV2Request extends TeaModel {
    @NameInMap("body")
    public Resource body;

    public static UpdateDeploymentTargetV2Request build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentTargetV2Request self = new UpdateDeploymentTargetV2Request();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentTargetV2Request setBody(Resource body) {
        this.body = body;
        return this;
    }
    public Resource getBody() {
        return this.body;
    }

}
