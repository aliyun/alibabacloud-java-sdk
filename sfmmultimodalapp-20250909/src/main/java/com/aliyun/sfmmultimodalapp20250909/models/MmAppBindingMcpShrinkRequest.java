// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class MmAppBindingMcpShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_a2eb4e04b48041108edb1f6de815</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Mcps")
    public String mcpsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-o8ixktz41iyd2b6p</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MmAppBindingMcpShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MmAppBindingMcpShrinkRequest self = new MmAppBindingMcpShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MmAppBindingMcpShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MmAppBindingMcpShrinkRequest setMcpsShrink(String mcpsShrink) {
        this.mcpsShrink = mcpsShrink;
        return this;
    }
    public String getMcpsShrink() {
        return this.mcpsShrink;
    }

    public MmAppBindingMcpShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
