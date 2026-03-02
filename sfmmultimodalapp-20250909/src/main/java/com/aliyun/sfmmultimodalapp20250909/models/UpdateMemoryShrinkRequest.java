// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMemoryShrinkRequest extends TeaModel {
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
     * <p>True</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>384dc4786b9d4f5a8cab0d83112cd5a8</p>
     */
    @NameInMap("MemoryNodeId")
    public String memoryNodeId;

    @NameInMap("MetaData")
    public String metaDataShrink;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bfaf7e110b6d435997</p>
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
