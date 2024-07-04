// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateTensorboardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MaxRunningTimeMinutes</p>
     */
    @NameInMap("MaxRunningTimeMinutes")
    public Long maxRunningTimeMinutes;

    /**
     * <strong>example:</strong>
     * <p>380</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTensorboardRequest self = new UpdateTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTensorboardRequest setMaxRunningTimeMinutes(Long maxRunningTimeMinutes) {
        this.maxRunningTimeMinutes = maxRunningTimeMinutes;
        return this;
    }
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    public UpdateTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
