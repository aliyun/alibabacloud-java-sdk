// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Avatar")
    public String avatar;

    /**
     * <strong>example:</strong>
     * <p>U+1F99E</p>
     */
    @NameInMap("Emoji")
    public String emoji;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/node/.openclaw/workspace-work</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static CreatePolarClawAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawAgentRequest self = new CreatePolarClawAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreatePolarClawAgentRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePolarClawAgentRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public CreatePolarClawAgentRequest setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }
    public String getEmoji() {
        return this.emoji;
    }

    public CreatePolarClawAgentRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public CreatePolarClawAgentRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
