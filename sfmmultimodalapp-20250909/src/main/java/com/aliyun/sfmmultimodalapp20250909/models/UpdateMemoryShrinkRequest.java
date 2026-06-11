// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMemoryShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Content")
    public String content;

    @NameInMap("MemoryNodeId")
    public String memoryNodeId;

    @NameInMap("MetaData")
    public String metaDataShrink;

    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserDefinedId")
    public String userDefinedId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateMemoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryShrinkRequest self = new UpdateMemoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMemoryShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateMemoryShrinkRequest setMemoryNodeId(String memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
        return this;
    }
    public String getMemoryNodeId() {
        return this.memoryNodeId;
    }

    public UpdateMemoryShrinkRequest setMetaDataShrink(String metaDataShrink) {
        this.metaDataShrink = metaDataShrink;
        return this;
    }
    public String getMetaDataShrink() {
        return this.metaDataShrink;
    }

    public UpdateMemoryShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateMemoryShrinkRequest setUserDefinedId(String userDefinedId) {
        this.userDefinedId = userDefinedId;
        return this;
    }
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    public UpdateMemoryShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
