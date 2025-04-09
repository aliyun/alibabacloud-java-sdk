// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAgentProfileTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentProfileTemplateResponseBodyData data;

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

    public static GetAgentProfileTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentProfileTemplateResponseBody self = new GetAgentProfileTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentProfileTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentProfileTemplateResponseBody setData(GetAgentProfileTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentProfileTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetAgentProfileTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentProfileTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentProfileTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentProfileTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentProfileTemplateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default-survey</p>
         */
        @NameInMap("AgentProfileTemplateId")
        public String agentProfileTemplateId;

        /**
         * <strong>example:</strong>
         * <p>1720766491000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("PromptSchema")
        public String promptSchema;

        /**
         * <strong>example:</strong>
         * <p>1720766491000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetAgentProfileTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentProfileTemplateResponseBodyData self = new GetAgentProfileTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentProfileTemplateResponseBodyData setAgentProfileTemplateId(String agentProfileTemplateId) {
            this.agentProfileTemplateId = agentProfileTemplateId;
            return this;
        }
        public String getAgentProfileTemplateId() {
            return this.agentProfileTemplateId;
        }

        public GetAgentProfileTemplateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAgentProfileTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentProfileTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentProfileTemplateResponseBodyData setPromptSchema(String promptSchema) {
            this.promptSchema = promptSchema;
            return this;
        }
        public String getPromptSchema() {
            return this.promptSchema;
        }

        public GetAgentProfileTemplateResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
