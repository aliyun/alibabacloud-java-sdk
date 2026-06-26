// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentRequest extends TeaModel {
    /**
     * <p>Agent ID to update</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>Application ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>New avatar</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Avatar")
    public String avatar;

    /**
     * <p>List of files to update</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;FileName&quot;:&quot;SOUL.md&quot;,&quot;FileContent&quot;:&quot;You are a helpful assistant.&quot;}]</p>
     */
    @NameInMap("Files")
    public java.util.List<UpdatePolarClawAgentRequestFiles> files;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("KeepWorkspaceFiles")
    public Boolean keepWorkspaceFiles;

    /**
     * <p>Model override</p>
     * 
     * <strong>example:</strong>
     * <p>claude-sonnet-4-5</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>New display name</p>
     * 
     * <strong>example:</strong>
     * <p>Work Bot</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Whether to restart the gateway after creation, default is true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <p>New workspace directory path</p>
     * 
     * <strong>example:</strong>
     * <p>/home/node/.openclaw/workspace-work-v2</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static UpdatePolarClawAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentRequest self = new UpdatePolarClawAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UpdatePolarClawAgentRequest setFiles(java.util.List<UpdatePolarClawAgentRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<UpdatePolarClawAgentRequestFiles> getFiles() {
        return this.files;
    }

    public UpdatePolarClawAgentRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public UpdatePolarClawAgentRequest setKeepWorkspaceFiles(Boolean keepWorkspaceFiles) {
        this.keepWorkspaceFiles = keepWorkspaceFiles;
        return this;
    }
    public Boolean getKeepWorkspaceFiles() {
        return this.keepWorkspaceFiles;
    }

    public UpdatePolarClawAgentRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdatePolarClawAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePolarClawAgentRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public UpdatePolarClawAgentRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdatePolarClawAgentRequestFiles extends TeaModel {
        /**
         * <p>File content</p>
         * 
         * <strong>example:</strong>
         * <p>You are a helpful assistant.</p>
         */
        @NameInMap("FileContent")
        public String fileContent;

        /**
         * <p>File name, must be one of the allowed file names (AGENTS.md, SOUL.md, TOOLS.md, IDENTITY.md, USER.md, HEARTBEAT.md, BOOTSTRAP.md, MEMORY.md, MEMORY.alt.md)</p>
         * 
         * <strong>example:</strong>
         * <p>SOUL.md</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static UpdatePolarClawAgentRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawAgentRequestFiles self = new UpdatePolarClawAgentRequestFiles();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawAgentRequestFiles setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public UpdatePolarClawAgentRequestFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
