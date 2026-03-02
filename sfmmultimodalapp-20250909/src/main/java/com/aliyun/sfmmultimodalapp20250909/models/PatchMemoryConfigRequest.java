// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class PatchMemoryConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUpdate")
    public Boolean autoUpdate;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ExpirationTime")
    public Integer expirationTime;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>0.03</p>
     */
    @NameInMap("Threshold")
    public Double threshold;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>110b6d4359977d1</p>
     */
    @NameInMap("UserDefinedId")
    public String userDefinedId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-jb5sabg80b4ts71g</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PatchMemoryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchMemoryConfigRequest self = new PatchMemoryConfigRequest();
        return TeaModel.build(map, self);
    }

    public PatchMemoryConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PatchMemoryConfigRequest setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }
    public Boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    public PatchMemoryConfigRequest setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Integer getExpirationTime() {
        return this.expirationTime;
    }

    public PatchMemoryConfigRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public PatchMemoryConfigRequest setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public PatchMemoryConfigRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public PatchMemoryConfigRequest setUserDefinedId(String userDefinedId) {
        this.userDefinedId = userDefinedId;
        return this;
    }
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    public PatchMemoryConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
