// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyAiproEmbedConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AiProId")
    public String aiProId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChatHistoryStatus")
    public Integer chatHistoryStatus;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MemoryEnabled")
    public Integer memoryEnabled;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ShowName")
    public String showName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UploadEnabled")
    public Integer uploadEnabled;

    public static ModifyAiproEmbedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAiproEmbedConfigRequest self = new ModifyAiproEmbedConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAiproEmbedConfigRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public ModifyAiproEmbedConfigRequest setAiProId(String aiProId) {
        this.aiProId = aiProId;
        return this;
    }
    public String getAiProId() {
        return this.aiProId;
    }

    public ModifyAiproEmbedConfigRequest setChatHistoryStatus(Integer chatHistoryStatus) {
        this.chatHistoryStatus = chatHistoryStatus;
        return this;
    }
    public Integer getChatHistoryStatus() {
        return this.chatHistoryStatus;
    }

    public ModifyAiproEmbedConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyAiproEmbedConfigRequest setMemoryEnabled(Integer memoryEnabled) {
        this.memoryEnabled = memoryEnabled;
        return this;
    }
    public Integer getMemoryEnabled() {
        return this.memoryEnabled;
    }

    public ModifyAiproEmbedConfigRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public ModifyAiproEmbedConfigRequest setUploadEnabled(Integer uploadEnabled) {
        this.uploadEnabled = uploadEnabled;
        return this;
    }
    public Integer getUploadEnabled() {
        return this.uploadEnabled;
    }

}
