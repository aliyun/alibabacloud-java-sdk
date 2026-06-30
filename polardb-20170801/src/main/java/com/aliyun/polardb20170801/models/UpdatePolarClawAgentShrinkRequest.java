// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the agent to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The new avatar.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Avatar")
    public String avatar;

    /**
     * <p>The list of files to update.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;FileName&quot;:&quot;SOUL.md&quot;,&quot;FileContent&quot;:&quot;You are a helpful assistant.&quot;}]</p>
     */
    @NameInMap("Files")
    public String filesShrink;

    /**
     * <p>Specifies whether to set the agent as the default agent.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>Specifies whether to keep files when switching the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepWorkspaceFiles")
    public Boolean keepWorkspaceFiles;

    /**
     * <p>The model override.</p>
     * 
     * <strong>example:</strong>
     * <p>claude-sonnet-4-5</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The new display name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Work Bot</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to restart the gateway after creation. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <p>The new working directory path.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/node/.openclaw/workspace-work-v2</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static UpdatePolarClawAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentShrinkRequest self = new UpdatePolarClawAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentShrinkRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentShrinkRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UpdatePolarClawAgentShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public UpdatePolarClawAgentShrinkRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public UpdatePolarClawAgentShrinkRequest setKeepWorkspaceFiles(Boolean keepWorkspaceFiles) {
        this.keepWorkspaceFiles = keepWorkspaceFiles;
        return this;
    }
    public Boolean getKeepWorkspaceFiles() {
        return this.keepWorkspaceFiles;
    }

    public UpdatePolarClawAgentShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdatePolarClawAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePolarClawAgentShrinkRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public UpdatePolarClawAgentShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
