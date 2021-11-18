// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetDashboardStatisticsRequest extends TeaModel {
    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDashboardStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardStatisticsRequest self = new GetDashboardStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetDashboardStatisticsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
