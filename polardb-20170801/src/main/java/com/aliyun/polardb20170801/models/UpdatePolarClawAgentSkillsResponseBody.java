// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentSkillsResponseBody extends TeaModel {
    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ok")
    public Boolean ok;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The updated skill list.</p>
     */
    @NameInMap("Skills")
    public java.util.List<String> skills;

    public static UpdatePolarClawAgentSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentSkillsResponseBody self = new UpdatePolarClawAgentSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentSkillsResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentSkillsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentSkillsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdatePolarClawAgentSkillsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePolarClawAgentSkillsResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public UpdatePolarClawAgentSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePolarClawAgentSkillsResponseBody setSkills(java.util.List<String> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<String> getSkills() {
        return this.skills;
    }

}
