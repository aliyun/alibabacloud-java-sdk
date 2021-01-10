// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASApplicationDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetCASApplicationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCASApplicationDetailRequest self = new GetCASApplicationDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCASApplicationDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetCASApplicationDetailRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
