// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAgentProfileResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ModifyAgentProfileResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyAgentProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentProfileResponseBody self = new ModifyAgentProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAgentProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyAgentProfileResponseBody setData(ModifyAgentProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyAgentProfileResponseBodyData getData() {
        return this.data;
    }

    public ModifyAgentProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyAgentProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyAgentProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAgentProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyAgentProfileResponseBodyData extends TeaModel {
        /**
         * <p>The agent profile ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3d7d253cfb77476da0cf3681bcf7b4e8</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        /**
         * <p>Agent Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>default-survey</p>
         */
        @NameInMap("AgentProfileTemplateId")
        public String agentProfileTemplateId;

        /**
         * <p>Agent Type</p>
         * 
         * <strong>example:</strong>
         * <p>Human</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The API plugin configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("ApiPluginJson")
        public String apiPluginJson;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721356124220</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a large model scenario</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>788066f2-f160-458e-a3bb-83e1c9d5606d</p>
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
         * <p>model_002</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The model configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ModelConfig")
        public String modelConfig;

        /**
         * <p>The NLU configuration. Parameter settings:</p>
         * <ul>
         * <li>chatbotInstanceId: the Chatbot large model robot instance ID.</li>
         * <li>faqCategoryIds: the attached FAQ category IDs.</li>
         * <li>llmAgentId: the Chatbot large model workspace ID.</li>
         * <li>llmAgentKey: the Chatbot large model workspace key.</li>
         * <li>llmAgentInstanceId: the Chatbot large model workspace instance ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;chatbotInstanceId&quot;: &quot;chatbot-cn-j7eiVJZRmb&quot;,
         *     &quot;faqCategoryIds&quot;: [30000474726],
         *     &quot;llmAgentId&quot;: &quot;1246206&quot;,
         *     &quot;llmAgentInstanceId&quot;: &quot;outbound_05efb75a-95df-438e-9b9b-8f2c857d5498&quot;,
         *     &quot;llmAgentKey&quot;: &quot;d682716514814815ae77757c0bcbda01_p_outbound_public&quot;
         * }</p>
         */
        @NameInMap("NluConfigJson")
        public String nluConfigJson;

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
         * <p>default</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3eacaec0-64ba-4008-9392-1d419b0d2673</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>Indicates whether the template is a system template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <p>The update time. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1715416630.0</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

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

        public static ModifyAgentProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyAgentProfileResponseBodyData self = new ModifyAgentProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyAgentProfileResponseBodyData setAgentProfileId(String agentProfileId) {
            this.agentProfileId = agentProfileId;
            return this;
        }
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        public ModifyAgentProfileResponseBodyData setAgentProfileTemplateId(String agentProfileTemplateId) {
            this.agentProfileTemplateId = agentProfileTemplateId;
            return this;
        }
        public String getAgentProfileTemplateId() {
            return this.agentProfileTemplateId;
        }

        public ModifyAgentProfileResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public ModifyAgentProfileResponseBodyData setApiPluginJson(String apiPluginJson) {
            this.apiPluginJson = apiPluginJson;
            return this;
        }
        public String getApiPluginJson() {
            return this.apiPluginJson;
        }

        public ModifyAgentProfileResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ModifyAgentProfileResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyAgentProfileResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyAgentProfileResponseBodyData setInstructionJson(String instructionJson) {
            this.instructionJson = instructionJson;
            return this;
        }
        public String getInstructionJson() {
            return this.instructionJson;
        }

        public ModifyAgentProfileResponseBodyData setLabelsJson(String labelsJson) {
            this.labelsJson = labelsJson;
            return this;
        }
        public String getLabelsJson() {
            return this.labelsJson;
        }

        public ModifyAgentProfileResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ModifyAgentProfileResponseBodyData setModelConfig(String modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public String getModelConfig() {
            return this.modelConfig;
        }

        public ModifyAgentProfileResponseBodyData setNluConfigJson(String nluConfigJson) {
            this.nluConfigJson = nluConfigJson;
            return this;
        }
        public String getNluConfigJson() {
            return this.nluConfigJson;
        }

        public ModifyAgentProfileResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ModifyAgentProfileResponseBodyData setPromptJson(String promptJson) {
            this.promptJson = promptJson;
            return this;
        }
        public String getPromptJson() {
            return this.promptJson;
        }

        public ModifyAgentProfileResponseBodyData setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ModifyAgentProfileResponseBodyData setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ModifyAgentProfileResponseBodyData setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public ModifyAgentProfileResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ModifyAgentProfileResponseBodyData setVariablesJson(String variablesJson) {
            this.variablesJson = variablesJson;
            return this;
        }
        public String getVariablesJson() {
            return this.variablesJson;
        }

    }

}
