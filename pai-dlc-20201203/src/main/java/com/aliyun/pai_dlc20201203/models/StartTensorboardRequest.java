// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StartTensorboardRequest extends TeaModel {
    /**
     * <p>The workspace ID. 
     * &lt;props=&quot;china&quot;&gt;For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>380</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static StartTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTensorboardRequest self = new StartTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public StartTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
