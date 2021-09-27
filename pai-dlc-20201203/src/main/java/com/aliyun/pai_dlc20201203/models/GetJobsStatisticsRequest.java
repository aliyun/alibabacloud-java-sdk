// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobsStatisticsRequest extends TeaModel {
    // 工作空间id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetJobsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobsStatisticsRequest self = new GetJobsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetJobsStatisticsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
