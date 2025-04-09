// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAgentProfileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-survey</p>
     */
    @NameInMap("AgentProfileTemplateId")
    public String agentProfileTemplateId;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AppIp")
    public String appIp;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>[30000474726]</p>
     */
    @NameInMap("FaqCategoryIds")
    public String faqCategoryIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;type\&quot;:\&quot;TransferToAgent\&quot;,\&quot;instructions\&quot;:[{\&quot;code\&quot;:\&quot;Transfer0\&quot;,\&quot;skillGroupId\&quot;:\&quot;123\&quot;,\&quot;skillGroupName\&quot;:\&quot;123\&quot;}]</p>
     */
    @NameInMap("InstructionJson")
    public String instructionJson;

    @NameInMap("LabelsJson")
    public String labelsJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model_001</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ModelConfig")
    public String modelConfig;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("PromptJson")
    public String promptJson;

    @NameInMap("Scenario")
    public String scenario;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("VariablesJson")
    public String variablesJson;

    public static CreateAgentProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentProfileRequest self = new CreateAgentProfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentProfileRequest setAgentProfileTemplateId(String agentProfileTemplateId) {
        this.agentProfileTemplateId = agentProfileTemplateId;
        return this;
    }
    public String getAgentProfileTemplateId() {
        return this.agentProfileTemplateId;
    }

    public CreateAgentProfileRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

    public CreateAgentProfileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentProfileRequest setFaqCategoryIds(String faqCategoryIds) {
        this.faqCategoryIds = faqCategoryIds;
        return this;
    }
    public String getFaqCategoryIds() {
        return this.faqCategoryIds;
    }

    public CreateAgentProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAgentProfileRequest setInstructionJson(String instructionJson) {
        this.instructionJson = instructionJson;
        return this;
    }
    public String getInstructionJson() {
        return this.instructionJson;
    }

    public CreateAgentProfileRequest setLabelsJson(String labelsJson) {
        this.labelsJson = labelsJson;
        return this;
    }
    public String getLabelsJson() {
        return this.labelsJson;
    }

    public CreateAgentProfileRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateAgentProfileRequest setModelConfig(String modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public String getModelConfig() {
        return this.modelConfig;
    }

    public CreateAgentProfileRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateAgentProfileRequest setPromptJson(String promptJson) {
        this.promptJson = promptJson;
        return this;
    }
    public String getPromptJson() {
        return this.promptJson;
    }

    public CreateAgentProfileRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public CreateAgentProfileRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateAgentProfileRequest setVariablesJson(String variablesJson) {
        this.variablesJson = variablesJson;
        return this;
    }
    public String getVariablesJson() {
        return this.variablesJson;
    }

}
