// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteTensorboardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46099</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTensorboardRequest self = new DeleteTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
