// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchWorkspaceRequest extends TeaModel {
    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateHasCloudarchWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchWorkspaceRequest self = new UpdateHasCloudarchWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchWorkspaceRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasCloudarchWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
