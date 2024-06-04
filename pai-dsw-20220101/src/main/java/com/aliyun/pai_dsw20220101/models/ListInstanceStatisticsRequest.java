// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstanceStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static ListInstanceStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatisticsRequest self = new ListInstanceStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatisticsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
