// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopTensorboardRequest extends TeaModel {
    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static StopTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTensorboardRequest self = new StopTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public StopTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
