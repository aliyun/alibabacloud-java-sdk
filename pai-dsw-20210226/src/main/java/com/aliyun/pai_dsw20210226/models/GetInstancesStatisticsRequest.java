// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstancesStatisticsRequest extends TeaModel {
    // 工作空间id列表
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static GetInstancesStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesStatisticsRequest self = new GetInstancesStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancesStatisticsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
