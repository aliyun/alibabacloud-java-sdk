// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAgentProfileRequest extends TeaModel {
    /**
     * <p>The agent profile template ID (unique value).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-survey</p>
     */
    @NameInMap("AgentProfileTemplateId")
    public String agentProfileTemplateId;

    /**
     * <p>The app_ip (system field). This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AppIp")
    public String appIp;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Describe the features of the current agent</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The FAQ category IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[30000474726]</p>
     */
    @NameInMap("FaqCategoryIds")
    public String faqCategoryIds;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instruction configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;type&quot;: &quot;TransferToAgent&quot;,
     *     &quot;instructions&quot;: [{
     *         &quot;code&quot;: &quot;Transfer0&quot;,
     *         &quot;skillGroupId&quot;: &quot;testcode&quot;,
     *         &quot;skillGroupName&quot;: &quot;skillgroup&quot;
     *     }],
     *     &quot;timeoutEnable&quot;: false
     * }, {
     *     &quot;type&quot;: &quot;CollectNumber&quot;,
     *     &quot;instructions&quot;: [{
     *         &quot;code&quot;: &quot;DTMF0&quot;,
     *         &quot;name&quot;: &quot;Number collection test&quot;,
     *         &quot;collectVoice&quot;: true,
     *         &quot;terminator&quot;: &quot;#&quot;
     *     }]
     * }]</p>
     */
    @NameInMap("InstructionJson")
    public String instructionJson;

    /**
     * <p>The label descriptions.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;name&quot;: &quot;Satisfaction&quot;,
     *     &quot;description&quot;: &quot;Whether you are interested in the introduced game content&quot;,
     *     &quot;valueList&quot;: &quot;[\&quot;Interested\&quot;,\&quot;Not interested\&quot;]&quot;
     * }]</p>
     */
    @NameInMap("LabelsJson")
    public String labelsJson;

    /**
     * <p>The model ID (unique value).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model_001</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p><strong>[Deprecated]</strong> The model configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ModelConfig")
    public String modelConfig;

    /**
     * <p>The agent configuration in professional mode.</p>
     * 
     * <strong>example:</strong>
     * <p>\nName: Annie \nIdentity: Game Promoter\nBackground: Promote the latest welfare events to players over the phone, ensuring that every player can keep up with the information in a timely manner and enjoy the game.\nSkills: As a game customer service representative, recommend limited-time game welfare events to users, emphasize the event highlights, and inform them of the participation process.\nConstraints: You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest welfare events to players over the phone.\nAs a customer service representative who proactively contacts players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call, while keeping the language approachable to ensure that players can easily understand the event content.\nClarify the start and end times of the event to ensure that players do not get confused.\nEmphasize the key rewards and participation methods of the event to increase players\&quot; interest in participating</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The agent configuration in normal mode.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;name&quot;: &quot;Annie&quot;,
     *     &quot;gender&quot;: &quot;Female&quot;,
     *     &quot;age&quot;: 20,
     *     &quot;role&quot;: &quot;Game Promoter&quot;,
     *     &quot;communicationStyle&quot;: [&quot;Friendly&quot;, &quot;Conversational&quot;, &quot;Lively&quot;],
     *     &quot;goals&quot;: &quot;Promote the latest welfare events to players over the phone, ensuring that every player can keep up with the information in a timely manner and enjoy the game.&quot;,
     *     &quot;background&quot;: &quot;Event Introduction\nFrom ${Start Time} to ${End Time}, we have carefully prepared the \&quot;Limited-Time Treasure Hunt\&quot; welfare event for a week. As long as you log in to the game every day during this period, you can claim a login gift pack containing rare materials, energy potions, and limited-edition appearance rewards.\n\nEvent Highlights\nThe highlight of this event is that players who log in for 5 cumulative days will receive an extra \&quot;Mystery Chest\&quot;. Opening the chest to get a rare pet will add a powerful boost to your battles! Don\&quot;t miss this great opportunity to enhance your strength.\n\nHow to Participate\nAfter logging into the game, find \&quot;Limited-Time Treasure Hunt\&quot; in the event panel and click to claim the corresponding rewards. Remember to log in every day, the rewards won\&quot;t wait!&quot;,
     *     &quot;skills&quot;: &quot;As a game customer service representative, recommend limited-time game welfare events to users, emphasize the event highlights, and inform them of the participation process.&quot;,
     *     &quot;workflow&quot;: &quot;1. Friendly greeting and self-introduction\n- Opening: \&quot;Hello, respected adventurer! I am Annie from the game customer service team. I am honored to connect with you today to share an exclusive welfare event that is about to launch, which will definitely make your adventure more exciting!\&quot;\n- Introduce the welfare event only after confirming that the player wants to learn about it.\n2. Welfare event introduction\n3. Emphasize event highlights\n4. Explain how to participate and remind\n5. Encourage sharing and feedback\n- Call to action: \&quot;If you think this event is good, feel free to share the good news with your guild partners or game friends. At the same time, we also highly welcome you to tell us your experience and suggestions through the built-in feedback system of the game after the event ends.\&quot;\nSkill 6: Politely end the call\n- Closing: \&quot;Well, respected adventurer, the above is the main content of this event. I hope you can return with a full load from the event, and I wish you invincible in your journey! If you have any questions, feel free to contact our customer service team. Thank you for answering, look forward to serving you again, goodbye!\&quot;&quot;,
     *     &quot;constraint&quot;: &quot;You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest welfare events to players over the phone.\nAs a customer service representative who proactively contacts players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call, while keeping the language approachable to ensure that players can easily understand the event content.\nClarify the start and end times of the event to ensure that players do not get confused.\nEmphasize the key rewards and participation methods of the event to increase players\&quot; interest in participating.\nEncourage interaction and feedback among players to promote the activity of the game community.\nMaintain politeness when ending the call to leave a good impression on the player.\nWhen the user asks questions that are irrelevant to the goal or process, politely refuse and guide them back to the target question.\nFor questions you do not know, do not reply randomly. You need to politely reply \&quot;I am not sure\&quot; and guide them back to the target question.&quot;,
     *     &quot;openingPrompt&quot;: &quot;Hello, respected adventurer! I am Annie from the game customer service team. I am honored to connect with you today to share an exclusive welfare event that is about to launch, which will definitely make your adventure more exciting!&quot;,
     *     &quot;output&quot;: &quot;&quot;,
     *     &quot;aiHangupOutput&quot;: &quot;&quot;,
     *     &quot;aiSilenceTimeoutOutput&quot;: &quot;&quot;
     * }</p>
     */
    @NameInMap("PromptJson")
    public String promptJson;

    /**
     * <p>The scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>Test scenario</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The variable configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;name&quot;: &quot;Start Time&quot;,
     *     &quot;description&quot;: &quot;Start time&quot;
     * }, {
     *     &quot;name&quot;: &quot;End Time&quot;,
     *     &quot;description&quot;: &quot;End time&quot;
     * }]</p>
     */
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
