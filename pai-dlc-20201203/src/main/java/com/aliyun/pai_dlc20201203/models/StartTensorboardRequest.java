// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StartTensorboardRequest extends TeaModel {
    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static StartTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTensorboardRequest self = new StartTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public StartTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
