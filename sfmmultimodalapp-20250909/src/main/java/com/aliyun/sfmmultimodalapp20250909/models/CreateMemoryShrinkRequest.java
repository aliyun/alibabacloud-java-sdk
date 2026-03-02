// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateMemoryShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Content")
    public String content;

    @NameInMap("MessagesJson")
    public String messagesJson;

    @NameInMap("MetaData")
    public String metaDataShrink;

    /**
     * <strong>example:</strong>
     * <p>profile_project</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CD51C0ED-4666-13DA-BC7D-C0D21CBE16C9</p>
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

    public static CreateMemoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryShrinkRequest self = new CreateMemoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMemoryShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateMemoryShrinkRequest setMessagesJson(String messagesJson) {
        this.messagesJson = messagesJson;
        return this;
    }
    public String getMessagesJson() {
        return this.messagesJson;
    }

    public CreateMemoryShrinkRequest setMetaDataShrink(String metaDataShrink) {
        this.metaDataShrink = metaDataShrink;
        return this;
    }
    public String getMetaDataShrink() {
        return this.metaDataShrink;
    }

    public CreateMemoryShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateMemoryShrinkRequest setUserDefinedId(String userDefinedId) {
        this.userDefinedId = userDefinedId;
        return this;
    }
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    public CreateMemoryShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
