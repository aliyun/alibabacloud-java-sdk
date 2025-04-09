// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAgentProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ModifyAgentProfileResponseBodyData data;

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
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>3d7d253cfb77476da0cf3681bcf7b4e8</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        /**
         * <p>agent template id</p>
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
         * <p>Human</p>
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
         * <p>1721356124220</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>788066f2-f160-458e-a3bb-83e1c9d5606d</p>
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
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ModelConfig")
        public String modelConfig;

        /**
         * <strong>example:</strong>
         * <p>{&quot;chatbotInstanceId&quot;:&quot;chatbot-cn-j7eiVJZRmb&quot;,&quot;faqCategoryIds&quot;:[30000474726],&quot;llmAgentId&quot;:&quot;1246206&quot;,&quot;llmAgentInstanceId&quot;:&quot;outbound_05efb75a-95df-438e-9b9b-8f2c857d5498&quot;,&quot;llmAgentKey&quot;:&quot;d682716514814815ae77757c0bcbda01_p_outbound_public&quot;}</p>
         */
        @NameInMap("NluConfigJson")
        public String nluConfigJson;

        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("PromptJson")
        public String promptJson;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <strong>example:</strong>
         * <p>3eacaec0-64ba-4008-9392-1d419b0d2673</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <strong>example:</strong>
         * <p>1715416630.0</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

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
