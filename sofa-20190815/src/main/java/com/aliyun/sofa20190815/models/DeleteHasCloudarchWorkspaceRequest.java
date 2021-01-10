// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchWorkspaceRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteHasCloudarchWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchWorkspaceRequest self = new DeleteHasCloudarchWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
