// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateV3InstanceByUserRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateV3InstanceByUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateV3InstanceByUserRequest self = new UpdateV3InstanceByUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateV3InstanceByUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateV3InstanceByUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
