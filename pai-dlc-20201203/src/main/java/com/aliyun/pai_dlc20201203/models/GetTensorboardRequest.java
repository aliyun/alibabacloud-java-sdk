// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardRequest extends TeaModel {
    // JodId
    @NameInMap("JodId")
    public String jodId;

    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTensorboardRequest self = new GetTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public GetTensorboardRequest setJodId(String jodId) {
        this.jodId = jodId;
        return this;
    }
    public String getJodId() {
        return this.jodId;
    }

    public GetTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
