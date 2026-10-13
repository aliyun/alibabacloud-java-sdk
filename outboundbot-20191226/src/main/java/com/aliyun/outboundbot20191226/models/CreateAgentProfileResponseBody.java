// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAgentProfileResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateAgentProfileResponseBodyData data;

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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgentProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentProfileResponseBody self = new CreateAgentProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentProfileResponseBody setData(CreateAgentProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentProfileResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAgentProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgentProfileResponseBodyData extends TeaModel {
        /**
         * <p>The agent profile ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d31794e2a51f47d2901b4094d88311d7</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        /**
         * <p>The agent profile template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>default-survey</p>
         */
        @NameInMap("AgentProfileTemplateId")
        public String agentProfileTemplateId;

        /**
         * <p>agent type</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1739333534000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an agent</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1e16c663-0339-4064-9d57-07f772e78f21</p>
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
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ModelConfig")
        public String modelConfig;

        /**
         * <p>The prompt in professional mode.</p>
         * 
         * <strong>example:</strong>
         * <p>\nName: Annie \nIdentity: Game Promoter\nBackground: Promote the latest welfare events to players over the phone, ensuring that every player can keep up with the information in a timely manner and enjoy the game.\nSkills: As a game customer service representative, recommend limited-time game welfare events to users, emphasize the event highlights, and inform them of the participation process.\nConstraints: You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest welfare events to players over the phone.\nAs a customer service representative who proactively contacts players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call, while keeping the language approachable to ensure that players can easily understand the event content.\nClarify the start and end times of the event to ensure that players do not get confused.\nEmphasize the key rewards and participation methods of the event to increase players\&quot; interest in participating</p>
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
         * <p>Scenario</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d13ad2d3-3fe6-4352-b38b-bd6559047de8</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>Indicates whether the template is a system template.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1737077564000</p>
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

        public static CreateAgentProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentProfileResponseBodyData self = new CreateAgentProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentProfileResponseBodyData setAgentProfileId(String agentProfileId) {
            this.agentProfileId = agentProfileId;
            return this;
        }
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        public CreateAgentProfileResponseBodyData setAgentProfileTemplateId(String agentProfileTemplateId) {
            this.agentProfileTemplateId = agentProfileTemplateId;
            return this;
        }
        public String getAgentProfileTemplateId() {
            return this.agentProfileTemplateId;
        }

        public CreateAgentProfileResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public CreateAgentProfileResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAgentProfileResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAgentProfileResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateAgentProfileResponseBodyData setInstructionJson(String instructionJson) {
            this.instructionJson = instructionJson;
            return this;
        }
        public String getInstructionJson() {
            return this.instructionJson;
        }

        public CreateAgentProfileResponseBodyData setLabelsJson(String labelsJson) {
            this.labelsJson = labelsJson;
            return this;
        }
        public String getLabelsJson() {
            return this.labelsJson;
        }

        public CreateAgentProfileResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateAgentProfileResponseBodyData setModelConfig(String modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public String getModelConfig() {
            return this.modelConfig;
        }

        public CreateAgentProfileResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CreateAgentProfileResponseBodyData setPromptJson(String promptJson) {
            this.promptJson = promptJson;
            return this;
        }
        public String getPromptJson() {
            return this.promptJson;
        }

        public CreateAgentProfileResponseBodyData setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public CreateAgentProfileResponseBodyData setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public CreateAgentProfileResponseBodyData setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public CreateAgentProfileResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateAgentProfileResponseBodyData setVariablesJson(String variablesJson) {
            this.variablesJson = variablesJson;
            return this;
        }
        public String getVariablesJson() {
            return this.variablesJson;
        }

    }

}
