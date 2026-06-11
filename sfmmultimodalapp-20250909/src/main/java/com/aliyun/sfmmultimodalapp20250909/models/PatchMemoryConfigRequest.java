// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class PatchMemoryConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AutoUpdate")
    public Boolean autoUpdate;

    @NameInMap("ExpirationTime")
    public Integer expirationTime;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("Threshold")
    public Double threshold;

    @NameInMap("TopK")
    public Integer topK;

    @NameInMap("UserDefinedId")
    public String userDefinedId;

    /**
     * <p>This parameter is required.</p>
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
