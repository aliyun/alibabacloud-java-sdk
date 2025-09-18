// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeleteMmAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_xxxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMmAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMmAppRequest self = new DeleteMmAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMmAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMmAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
