// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class MmAppBindingRagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_a2eb4e04b48041108edb1f6de815</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("KnowledgeBaseCodeList")
    public java.util.List<String> knowledgeBaseCodeList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-6uhm7nfev4k8pwcz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MmAppBindingRagRequest build(java.util.Map<String, ?> map) throws Exception {
        MmAppBindingRagRequest self = new MmAppBindingRagRequest();
        return TeaModel.build(map, self);
    }

    public MmAppBindingRagRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MmAppBindingRagRequest setKnowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
        this.knowledgeBaseCodeList = knowledgeBaseCodeList;
        return this;
    }
    public java.util.List<String> getKnowledgeBaseCodeList() {
        return this.knowledgeBaseCodeList;
    }

    public MmAppBindingRagRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
