// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetDeploymentArchiveRequest extends TeaModel {
    // 部署快照id
    @NameInMap("deploymentArchiveId")
    public String deploymentArchiveId;

    public static GetDeploymentArchiveRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentArchiveRequest self = new GetDeploymentArchiveRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentArchiveRequest setDeploymentArchiveId(String deploymentArchiveId) {
        this.deploymentArchiveId = deploymentArchiveId;
        return this;
    }
    public String getDeploymentArchiveId() {
        return this.deploymentArchiveId;
    }

}
