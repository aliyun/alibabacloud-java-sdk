// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class MmAppBindingRagShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_a2eb4e04b48041108edb1f6de815</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("KnowledgeBaseCodeList")
    public String knowledgeBaseCodeListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-6uhm7nfev4k8pwcz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MmAppBindingRagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MmAppBindingRagShrinkRequest self = new MmAppBindingRagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MmAppBindingRagShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MmAppBindingRagShrinkRequest setKnowledgeBaseCodeListShrink(String knowledgeBaseCodeListShrink) {
        this.knowledgeBaseCodeListShrink = knowledgeBaseCodeListShrink;
        return this;
    }
    public String getKnowledgeBaseCodeListShrink() {
        return this.knowledgeBaseCodeListShrink;
    }

    public MmAppBindingRagShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
