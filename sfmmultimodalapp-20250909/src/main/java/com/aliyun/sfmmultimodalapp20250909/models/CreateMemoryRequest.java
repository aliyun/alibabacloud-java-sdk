// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateMemoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AutoUpdate")
    public Boolean autoUpdate;

    @NameInMap("Content")
    public String content;

    @NameInMap("ExpirationTime")
    public Integer expirationTime;

    @NameInMap("MessagesJson")
    public String messagesJson;

    @NameInMap("MetaData")
    public java.util.Map<String, String> metaData;

    /**
     * <strong>example:</strong>
     * <p>profile_project</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Prompt")
    public String prompt;

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

    public static CreateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryRequest self = new CreateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMemoryRequest setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }
    public Boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    public CreateMemoryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateMemoryRequest setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Integer getExpirationTime() {
        return this.expirationTime;
    }

    public CreateMemoryRequest setMessagesJson(String messagesJson) {
        this.messagesJson = messagesJson;
        return this;
    }
    public String getMessagesJson() {
        return this.messagesJson;
    }

    public CreateMemoryRequest setMetaData(java.util.Map<String, String> metaData) {
        this.metaData = metaData;
        return this;
    }
    public java.util.Map<String, String> getMetaData() {
        return this.metaData;
    }

    public CreateMemoryRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateMemoryRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateMemoryRequest setUserDefinedId(String userDefinedId) {
        this.userDefinedId = userDefinedId;
        return this;
    }
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    public CreateMemoryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
