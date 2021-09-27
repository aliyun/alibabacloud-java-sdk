// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class BatchGetJobsStatisticsRequest extends TeaModel {
    // 工作空间id列表
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static BatchGetJobsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetJobsStatisticsRequest self = new BatchGetJobsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetJobsStatisticsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
