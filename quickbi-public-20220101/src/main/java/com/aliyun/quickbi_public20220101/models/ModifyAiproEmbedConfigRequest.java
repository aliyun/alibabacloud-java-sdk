// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyAiproEmbedConfigRequest extends TeaModel {
    /**
     * <p>The nickname of the agent. The default value is Intelligent Data Analytics Assistant when you create a configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The AIPro configuration ID. If this parameter is not specified or is left empty, a new configuration is created. If this parameter is specified, the existing configuration is updated.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AiProId")
    public String aiProId;

    /**
     * <p>Specifies whether to display the chat history. Valid values:</p>
     * <ul>
     * <li>1: Display.</li>
     * <li>0: Do not display.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChatHistoryStatus")
    public Integer chatHistoryStatus;

    /**
     * <p>The JSON string of the embedding appearance configuration saved on the frontend.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Specifies whether to enable memory. Valid values:</p>
     * <ul>
     * <li>1: Enable.</li>
     * <li>0: Disable.</li>
     * </ul>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MemoryEnabled")
    public Integer memoryEnabled;

    /**
     * <p>The name of the configuration. This parameter is required and must be unique within the organization when you create a configuration. If this parameter is left empty when you update a configuration, the name is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ShowName")
    public String showName;

    /**
     * <p>Specifies whether to allow file uploads. Valid values:</p>
     * <ul>
     * <li>1: Allow.</li>
     * <li>0: Do not allow.</li>
     * </ul>
     * <p>Default value: 0.</p>
     * 
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
