// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAgentProfileShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>37ca3ca1ac4b4e57adf3da5b5d939d04</p>
     */
    @NameInMap("AgentProfileId")
    public String agentProfileId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ApiPluginJson")
    public String apiPluginJson;

    @NameInMap("Description")
    public String description;

    @NameInMap("FaqCategoryIds")
    public String faqCategoryIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;TransferToAgent&quot;,&quot;instructions&quot;:[{&quot;code&quot;:&quot;Transfer0&quot;,&quot;skillGroupId&quot;:&quot;123&quot;,&quot;skillGroupName&quot;:&quot;123&quot;}],&quot;timeoutEnable&quot;:false},{&quot;type&quot;:&quot;CollectNumber&quot;,&quot;instructions&quot;:[]}]</p>
     */
    @NameInMap("InstructionJson")
    public String instructionJson;

    @NameInMap("LabelsJson")
    public String labelsJson;

    /**
     * <strong>example:</strong>
     * <p>model_001</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ModelConfig")
    public String modelConfig;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("PromptJson")
    public String promptJson;

    @NameInMap("Scenario")
    public String scenario;

    @NameInMap("VariablesJson")
    public String variablesJson;

    public static ModifyAgentProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentProfileShrinkRequest self = new ModifyAgentProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAgentProfileShrinkRequest setAgentProfileId(String agentProfileId) {
        this.agentProfileId = agentProfileId;
        return this;
    }
    public String getAgentProfileId() {
        return this.agentProfileId;
    }

    public ModifyAgentProfileShrinkRequest setApiPluginJson(String apiPluginJson) {
        this.apiPluginJson = apiPluginJson;
        return this;
    }
    public String getApiPluginJson() {
        return this.apiPluginJson;
    }

    public ModifyAgentProfileShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAgentProfileShrinkRequest setFaqCategoryIdsShrink(String faqCategoryIdsShrink) {
        this.faqCategoryIdsShrink = faqCategoryIdsShrink;
        return this;
    }
    public String getFaqCategoryIdsShrink() {
        return this.faqCategoryIdsShrink;
    }

    public ModifyAgentProfileShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAgentProfileShrinkRequest setInstructionJson(String instructionJson) {
        this.instructionJson = instructionJson;
        return this;
    }
    public String getInstructionJson() {
        return this.instructionJson;
    }

    public ModifyAgentProfileShrinkRequest setLabelsJson(String labelsJson) {
        this.labelsJson = labelsJson;
        return this;
    }
    public String getLabelsJson() {
        return this.labelsJson;
    }

    public ModifyAgentProfileShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ModifyAgentProfileShrinkRequest setModelConfig(String modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public String getModelConfig() {
        return this.modelConfig;
    }

    public ModifyAgentProfileShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ModifyAgentProfileShrinkRequest setPromptJson(String promptJson) {
        this.promptJson = promptJson;
        return this;
    }
    public String getPromptJson() {
        return this.promptJson;
    }

    public ModifyAgentProfileShrinkRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ModifyAgentProfileShrinkRequest setVariablesJson(String variablesJson) {
        this.variablesJson = variablesJson;
        return this;
    }
    public String getVariablesJson() {
        return this.variablesJson;
    }

}
