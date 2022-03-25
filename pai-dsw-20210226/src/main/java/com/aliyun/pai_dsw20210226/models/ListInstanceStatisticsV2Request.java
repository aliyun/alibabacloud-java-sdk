// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceStatisticsV2Request extends TeaModel {
    // 工作空间列表
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static ListInstanceStatisticsV2Request build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatisticsV2Request self = new ListInstanceStatisticsV2Request();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatisticsV2Request setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
