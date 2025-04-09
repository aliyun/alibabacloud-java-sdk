// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAgentProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentProfileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7A573837-3AD3-54CF-930A-07A3287042C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAgentProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentProfileResponseBody self = new GetAgentProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentProfileResponseBody setData(GetAgentProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentProfileResponseBodyData getData() {
        return this.data;
    }

    public GetAgentProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentProfileResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>37ca3ca1ac4b4e57adf3da5b5d939d04</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        /**
         * <strong>example:</strong>
         * <p>default-survey</p>
         */
        @NameInMap("AgentProfileTemplateId")
        public String agentProfileTemplateId;

        /**
         * <p>agent type</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("ApiPluginJson")
        public String apiPluginJson;

        /**
         * <strong>example:</strong>
         * <p>1741338619000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>7f04f92c-ccfc-4f8f-a816-6902023be5c6</p>
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
         * <p>model_002</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ModelConfig")
        public String modelConfig;

        /**
         * <strong>example:</strong>
         * <p>{&quot;chatbotInstanceId&quot;:&quot;chatbot-cn-j7eiVJZRmb&quot;,&quot;faqCategoryIds&quot;:[30000474726],&quot;llmAgentId&quot;:&quot;1246206&quot;,&quot;llmAgentInstanceId&quot;:&quot;outbound_05efb75a-95df-438e-9b9b-8f2c857d5498&quot;,&quot;llmAgentKey&quot;:&quot;d682716514814815ae77757c0bcbda01_p_outbound_public&quot;}</p>
         */
        @NameInMap("NluConfigJson")
        public String nluConfigJson;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("PromptJson")
        public String promptJson;

        @NameInMap("Scenario")
        public String scenario;

        /**
         * <strong>example:</strong>
         * <p>d13ad2d3-3fe6-4352-b38b-bd6559047de8</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <strong>example:</strong>
         * <p>1741338619000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VariablesJson")
        public String variablesJson;

        public static GetAgentProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentProfileResponseBodyData self = new GetAgentProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentProfileResponseBodyData setAgentProfileId(String agentProfileId) {
            this.agentProfileId = agentProfileId;
            return this;
        }
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        public GetAgentProfileResponseBodyData setAgentProfileTemplateId(String agentProfileTemplateId) {
            this.agentProfileTemplateId = agentProfileTemplateId;
            return this;
        }
        public String getAgentProfileTemplateId() {
            return this.agentProfileTemplateId;
        }

        public GetAgentProfileResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public GetAgentProfileResponseBodyData setApiPluginJson(String apiPluginJson) {
            this.apiPluginJson = apiPluginJson;
            return this;
        }
        public String getApiPluginJson() {
            return this.apiPluginJson;
        }

        public GetAgentProfileResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAgentProfileResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentProfileResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAgentProfileResponseBodyData setInstructionJson(String instructionJson) {
            this.instructionJson = instructionJson;
            return this;
        }
        public String getInstructionJson() {
            return this.instructionJson;
        }

        public GetAgentProfileResponseBodyData setLabelsJson(String labelsJson) {
            this.labelsJson = labelsJson;
            return this;
        }
        public String getLabelsJson() {
            return this.labelsJson;
        }

        public GetAgentProfileResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetAgentProfileResponseBodyData setModelConfig(String modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public String getModelConfig() {
            return this.modelConfig;
        }

        public GetAgentProfileResponseBodyData setNluConfigJson(String nluConfigJson) {
            this.nluConfigJson = nluConfigJson;
            return this;
        }
        public String getNluConfigJson() {
            return this.nluConfigJson;
        }

        public GetAgentProfileResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public GetAgentProfileResponseBodyData setPromptJson(String promptJson) {
            this.promptJson = promptJson;
            return this;
        }
        public String getPromptJson() {
            return this.promptJson;
        }

        public GetAgentProfileResponseBodyData setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public GetAgentProfileResponseBodyData setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public GetAgentProfileResponseBodyData setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public GetAgentProfileResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetAgentProfileResponseBodyData setVariablesJson(String variablesJson) {
            this.variablesJson = variablesJson;
            return this;
        }
        public String getVariablesJson() {
            return this.variablesJson;
        }

    }

}
