// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateTensorboardRequest extends TeaModel {
    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // MaxRunningTimeMinutes
    @NameInMap("MaxRunningTimeMinutes")
    public String maxRunningTimeMinutes;

    public static UpdateTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTensorboardRequest self = new UpdateTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateTensorboardRequest setMaxRunningTimeMinutes(String maxRunningTimeMinutes) {
        this.maxRunningTimeMinutes = maxRunningTimeMinutes;
        return this;
    }
    public String getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

}
