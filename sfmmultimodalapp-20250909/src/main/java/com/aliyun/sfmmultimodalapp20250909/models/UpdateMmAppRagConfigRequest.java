// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRagConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_a2eb4e04b48041108edb1f6de815</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>top_k</p>
     */
    @NameInMap("PromptStrategy")
    public String promptStrategy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RetrieveMaxLength")
    public Integer retrieveMaxLength;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-6uhm7nfev4k8pwcz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMmAppRagConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRagConfigRequest self = new UpdateMmAppRagConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRagConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMmAppRagConfigRequest setPromptStrategy(String promptStrategy) {
        this.promptStrategy = promptStrategy;
        return this;
    }
    public String getPromptStrategy() {
        return this.promptStrategy;
    }

    public UpdateMmAppRagConfigRequest setRetrieveMaxLength(Integer retrieveMaxLength) {
        this.retrieveMaxLength = retrieveMaxLength;
        return this;
    }
    public Integer getRetrieveMaxLength() {
        return this.retrieveMaxLength;
    }

    public UpdateMmAppRagConfigRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public UpdateMmAppRagConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
