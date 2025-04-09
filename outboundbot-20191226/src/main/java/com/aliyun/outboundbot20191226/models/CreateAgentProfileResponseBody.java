// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAgentProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateAgentProfileResponseBodyData data;

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
         * <p>“”</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <strong>example:</strong>
         * <p>1739333534000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1e16c663-0339-4064-9d57-07f772e78f21</p>
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

        /**
         * <strong>example:</strong>
         * <p>prompt</p>
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
         * <p>True</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <strong>example:</strong>
         * <p>1737077564000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

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
