// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAgentProfileRequest extends TeaModel {
    /**
     * <p>The agent profile ID.</p>
     * <blockquote>
     * <p>You can obtain the agent profile ID of a created scenario from the ChatbotId response parameter of DescribeScript.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>37ca3ca1ac4b4e57adf3da5b5d939d04</p>
     */
    @NameInMap("AgentProfileId")
    public String agentProfileId;

    /**
     * <p>The API plugin configuration.</p>
     * <blockquote>
     * <p>To bind multiple APIs, obtain the UUIDs of multiple APIs through ListApiPlugins, and fill them in the format of [{&quot;uuid&quot;:&quot;xxx&quot;},{&quot;uuid&quot;:&quot;xxxx&quot;},....].</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;uuid&quot;:&quot;a55d171da96c41a************&quot;},{&quot;uuid&quot;:&quot;d41a3e5195d1402********&quot;}]</p>
     */
    @NameInMap("ApiPluginJson")
    public String apiPluginJson;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>First version submitted for review</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The FAQ category IDs.</p>
     */
    @NameInMap("FaqCategoryIds")
    public java.util.List<Long> faqCategoryIds;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
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
     * <p>The label description.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;name&quot;: &quot;Satisfied&quot;,
     *     &quot;description&quot;: &quot;Whether interested in the introduced game content&quot;,
     *     &quot;valueList&quot;: &quot;[\&quot;Interested\&quot;,\&quot;Not interested\&quot;]&quot;
     * }]</p>
     */
    @NameInMap("LabelsJson")
    public String labelsJson;

    /**
     * <p>The model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>model_001</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The model configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ModelConfig")
    public String modelConfig;

    /**
     * <p>The prompt in professional mode.</p>
     * 
     * <strong>example:</strong>
     * <p>\nName: Annie \nIdentity: Game Promoter\nBackground: Promote the latest promotional events to players over the phone, ensuring that every player stays informed and enjoys the game.\nSkills: As a game customer service representative, recommend limited-time game promotional events to users, highlight the event benefits, and inform them of the participation process.\nConstraints: You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest promotional events to players over the phone.\nAs a customer service representative proactively contacting players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call while keeping the language approachable to ensure players can easily understand the event content.\nClarify the start and end times of the event to ensure players do not get confused.\nHighlight the key rewards and participation methods to increase players\&quot; interest in participating</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The agent configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;name&quot;: &quot;Annie&quot;,
     *     &quot;gender&quot;: &quot;Female&quot;,
     *     &quot;age&quot;: 20,
     *     &quot;role&quot;: &quot;Game Promoter&quot;,
     *     &quot;communicationStyle&quot;: [&quot;Friendly&quot;, &quot;Conversational&quot;, &quot;Lively&quot;],
     *     &quot;goals&quot;: &quot;Promote the latest promotional events to players over the phone, ensuring that every player stays informed and enjoys the game.&quot;,
     *     &quot;background&quot;: &quot;Event Introduction\nStarting from ${Start Time} until ${End Time}, we have carefully prepared the \&quot;Limited-Time Treasure Hunt\&quot; promotional event for a week. As long as you log in to the game daily during this period, you can claim a login gift pack containing rare materials, energy potions, and exclusive cosmetic rewards.\n\nEvent Highlights\nThe highlight of this event is that players who log in for 5 cumulative days will receive an extra \&quot;Mystery Chest\&quot;. Opening the chest to obtain a rare pet will add a powerful boost to your battles! Do not miss this excellent opportunity to enhance your strength.\n\nHow to Participate\nAfter logging into the game, find \&quot;Limited-Time Treasure Hunt\&quot; in the event panel and click to claim the corresponding rewards. Remember to log in every day, the rewards wait for no one!&quot;,
     *     &quot;skills&quot;: &quot;As a game customer service representative, recommend limited-time game promotional events to users, highlight the event benefits, and inform them of the participation process.&quot;,
     *     &quot;workflow&quot;: &quot;1. Friendly greeting and self-introduction\n- Opening: \&quot;Greetings, honorable adventurer! I am Annie from the game customer service team. I am honored to connect with you today to share an exclusive promotional event that is about to launch, which will definitely make your adventure more exciting!\&quot;\n- Introduce the promotional event only after confirming that the player wants to learn about it.\n2. Promotional event introduction\n3. Highlight event benefits\n4. Explain how to participate and remind\n5. Encourage sharing and feedback\n- Call to action: \&quot;If you think this event is good, feel free to share this good news with your guild mates or game friends. At the same time, we also welcome you to share your experience and suggestions through the in-game feedback system after the event ends.\&quot;\nSkill 6: Politely end the call\n- Closing: \&quot;Well, honorable adventurer, that is the main content of this event. I hope you will return with full rewards from the event, and I wish you invincible in your journey! If you have any questions, feel free to contact our customer service team. Thank you for taking my call, I look forward to serving you again, goodbye!\&quot;&quot;,
     *     &quot;constraint&quot;: &quot;You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest promotional events to players over the phone.\nAs a customer service representative proactively contacting players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call while keeping the language approachable to ensure players can easily understand the event content.\nClarify the start and end times of the event to ensure players do not get confused.\nHighlight the key rewards and participation methods to increase players\&quot; interest in participating.\nEncourage interaction and feedback among players to promote the activity of the game community.\nMaintain politeness when ending the call to leave a good impression on the player.\nWhen the user asks questions unrelated to the goal or process, politely refuse and guide them back to the target topic.\nFor questions you do not know the answer to, do not reply randomly. You need to politely reply \&quot;I am not sure\&quot; and guide them back to the target topic.&quot;,
     *     &quot;openingPrompt&quot;: &quot;Greetings, honorable adventurer! I am Annie from the game customer service team. I am honored to connect with you today to share an exclusive promotional event that is about to launch, which will definitely make your adventure more exciting!&quot;,
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

    public static ModifyAgentProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentProfileRequest self = new ModifyAgentProfileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAgentProfileRequest setAgentProfileId(String agentProfileId) {
        this.agentProfileId = agentProfileId;
        return this;
    }
    public String getAgentProfileId() {
        return this.agentProfileId;
    }

    public ModifyAgentProfileRequest setApiPluginJson(String apiPluginJson) {
        this.apiPluginJson = apiPluginJson;
        return this;
    }
    public String getApiPluginJson() {
        return this.apiPluginJson;
    }

    public ModifyAgentProfileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAgentProfileRequest setFaqCategoryIds(java.util.List<Long> faqCategoryIds) {
        this.faqCategoryIds = faqCategoryIds;
        return this;
    }
    public java.util.List<Long> getFaqCategoryIds() {
        return this.faqCategoryIds;
    }

    public ModifyAgentProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAgentProfileRequest setInstructionJson(String instructionJson) {
        this.instructionJson = instructionJson;
        return this;
    }
    public String getInstructionJson() {
        return this.instructionJson;
    }

    public ModifyAgentProfileRequest setLabelsJson(String labelsJson) {
        this.labelsJson = labelsJson;
        return this;
    }
    public String getLabelsJson() {
        return this.labelsJson;
    }

    public ModifyAgentProfileRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ModifyAgentProfileRequest setModelConfig(String modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public String getModelConfig() {
        return this.modelConfig;
    }

    public ModifyAgentProfileRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ModifyAgentProfileRequest setPromptJson(String promptJson) {
        this.promptJson = promptJson;
        return this;
    }
    public String getPromptJson() {
        return this.promptJson;
    }

    public ModifyAgentProfileRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ModifyAgentProfileRequest setVariablesJson(String variablesJson) {
        this.variablesJson = variablesJson;
        return this;
    }
    public String getVariablesJson() {
        return this.variablesJson;
    }

}
