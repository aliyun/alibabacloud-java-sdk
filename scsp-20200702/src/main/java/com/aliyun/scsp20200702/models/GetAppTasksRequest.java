// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAppTasksRequest extends TeaModel {
    // 部署任务id
    @NameInMap("deploymentTaskId")
    public String deploymentTaskId;

    public static GetAppTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppTasksRequest self = new GetAppTasksRequest();
        return TeaModel.build(map, self);
    }

    public GetAppTasksRequest setDeploymentTaskId(String deploymentTaskId) {
        this.deploymentTaskId = deploymentTaskId;
        return this;
    }
    public String getDeploymentTaskId() {
        return this.deploymentTaskId;
    }

}
