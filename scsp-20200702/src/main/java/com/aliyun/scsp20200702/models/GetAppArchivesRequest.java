// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAppArchivesRequest extends TeaModel {
    // 部署快照id
    @NameInMap("DeploymentArchiveId")
    public String deploymentArchiveId;

    public static GetAppArchivesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppArchivesRequest self = new GetAppArchivesRequest();
        return TeaModel.build(map, self);
    }

    public GetAppArchivesRequest setDeploymentArchiveId(String deploymentArchiveId) {
        this.deploymentArchiveId = deploymentArchiveId;
        return this;
    }
    public String getDeploymentArchiveId() {
        return this.deploymentArchiveId;
    }

}
