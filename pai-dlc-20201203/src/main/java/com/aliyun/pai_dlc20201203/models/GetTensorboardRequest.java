// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardRequest extends TeaModel {
    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // JodId
    @NameInMap("JodId")
    public String jodId;

    public static GetTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTensorboardRequest self = new GetTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public GetTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetTensorboardRequest setJodId(String jodId) {
        this.jodId = jodId;
        return this;
    }
    public String getJodId() {
        return this.jodId;
    }

}
