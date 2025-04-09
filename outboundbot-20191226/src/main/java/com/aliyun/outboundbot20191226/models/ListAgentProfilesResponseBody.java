// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAgentProfilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAgentProfilesResponseBodyData> data;

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

    public static ListAgentProfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentProfilesResponseBody self = new ListAgentProfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentProfilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentProfilesResponseBody setData(java.util.List<ListAgentProfilesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentProfilesResponseBodyData> getData() {
        return this.data;
    }

    public ListAgentProfilesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentProfilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentProfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentProfilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentProfilesResponseBodyData extends TeaModel {
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
         * <p>1721701525327</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>e49ad122-15a1-443a-a102-84a78a93be79</p>
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
         * <p>“”</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("PromptJson")
        public String promptJson;

        @NameInMap("Scenario")
        public String scenario;

        /**
         * <strong>example:</strong>
         * <p>43972417-0657-452a-81c2-c59d8245a9b2</p>
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
         * <p>1721701525327</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VariablesJson")
        public String variablesJson;

        public static ListAgentProfilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentProfilesResponseBodyData self = new ListAgentProfilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentProfilesResponseBodyData setAgentProfileId(String agentProfileId) {
            this.agentProfileId = agentProfileId;
            return this;
        }
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        public ListAgentProfilesResponseBodyData setAgentProfileTemplateId(String agentProfileTemplateId) {
            this.agentProfileTemplateId = agentProfileTemplateId;
            return this;
        }
        public String getAgentProfileTemplateId() {
            return this.agentProfileTemplateId;
        }

        public ListAgentProfilesResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public ListAgentProfilesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAgentProfilesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAgentProfilesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentProfilesResponseBodyData setInstructionJson(String instructionJson) {
            this.instructionJson = instructionJson;
            return this;
        }
        public String getInstructionJson() {
            return this.instructionJson;
        }

        public ListAgentProfilesResponseBodyData setLabelsJson(String labelsJson) {
            this.labelsJson = labelsJson;
            return this;
        }
        public String getLabelsJson() {
            return this.labelsJson;
        }

        public ListAgentProfilesResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListAgentProfilesResponseBodyData setModelConfig(String modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public String getModelConfig() {
            return this.modelConfig;
        }

        public ListAgentProfilesResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ListAgentProfilesResponseBodyData setPromptJson(String promptJson) {
            this.promptJson = promptJson;
            return this;
        }
        public String getPromptJson() {
            return this.promptJson;
        }

        public ListAgentProfilesResponseBodyData setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ListAgentProfilesResponseBodyData setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListAgentProfilesResponseBodyData setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public ListAgentProfilesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListAgentProfilesResponseBodyData setVariablesJson(String variablesJson) {
            this.variablesJson = variablesJson;
            return this;
        }
        public String getVariablesJson() {
            return this.variablesJson;
        }

    }

}
