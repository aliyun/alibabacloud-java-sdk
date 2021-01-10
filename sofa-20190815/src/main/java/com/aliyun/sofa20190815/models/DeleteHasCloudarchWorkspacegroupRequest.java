// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchWorkspacegroupRequest extends TeaModel {
    @NameInMap("WorkspaceGroupId")
    public String workspaceGroupId;

    public static DeleteHasCloudarchWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchWorkspacegroupRequest self = new DeleteHasCloudarchWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchWorkspacegroupRequest setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

}
