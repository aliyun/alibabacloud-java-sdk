// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardRequest extends TeaModel {
    @NameInMap("JodId")
    public String jodId;

    @NameInMap("Token")
    public String token;

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

    public GetTensorboardRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
