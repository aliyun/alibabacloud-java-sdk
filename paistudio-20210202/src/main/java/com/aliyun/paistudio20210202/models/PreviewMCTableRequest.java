// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PreviewMCTableRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("Endpoint")
    public String endpoint;

    public static PreviewMCTableRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewMCTableRequest self = new PreviewMCTableRequest();
        return TeaModel.build(map, self);
    }

    public PreviewMCTableRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public PreviewMCTableRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
