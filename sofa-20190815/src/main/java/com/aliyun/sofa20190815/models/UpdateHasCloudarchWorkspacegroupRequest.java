// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchWorkspacegroupRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("WorkspaceGroupId")
    public String workspaceGroupId;

    public static UpdateHasCloudarchWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchWorkspacegroupRequest self = new UpdateHasCloudarchWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchWorkspacegroupRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public UpdateHasCloudarchWorkspacegroupRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasCloudarchWorkspacegroupRequest setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

}
