// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentToolsResponseBody extends TeaModel {
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
     * <p>The status code.</p>
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
     * <p>The updated tool configuration.</p>
     */
    @NameInMap("Tools")
    public UpdatePolarClawAgentToolsResponseBodyTools tools;

    public static UpdatePolarClawAgentToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentToolsResponseBody self = new UpdatePolarClawAgentToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentToolsResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentToolsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentToolsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdatePolarClawAgentToolsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePolarClawAgentToolsResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public UpdatePolarClawAgentToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePolarClawAgentToolsResponseBody setTools(UpdatePolarClawAgentToolsResponseBodyTools tools) {
        this.tools = tools;
        return this;
    }
    public UpdatePolarClawAgentToolsResponseBodyTools getTools() {
        return this.tools;
    }

    public static class UpdatePolarClawAgentToolsResponseBodyTools extends TeaModel {
        /**
         * <p>The list of explicitly allowed tools.</p>
         */
        @NameInMap("Allow")
        public java.util.List<String> allow;

        /**
         * <p>The list of additionally allowed tools.</p>
         */
        @NameInMap("AlsoAllow")
        public java.util.List<String> alsoAllow;

        /**
         * <p>The list of denied tools.</p>
         */
        @NameInMap("Deny")
        public java.util.List<String> deny;

        /**
         * <p>The tool profile.</p>
         * 
         * <strong>example:</strong>
         * <p>coding</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static UpdatePolarClawAgentToolsResponseBodyTools build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawAgentToolsResponseBodyTools self = new UpdatePolarClawAgentToolsResponseBodyTools();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawAgentToolsResponseBodyTools setAllow(java.util.List<String> allow) {
            this.allow = allow;
            return this;
        }
        public java.util.List<String> getAllow() {
            return this.allow;
        }

        public UpdatePolarClawAgentToolsResponseBodyTools setAlsoAllow(java.util.List<String> alsoAllow) {
            this.alsoAllow = alsoAllow;
            return this;
        }
        public java.util.List<String> getAlsoAllow() {
            return this.alsoAllow;
        }

        public UpdatePolarClawAgentToolsResponseBodyTools setDeny(java.util.List<String> deny) {
            this.deny = deny;
            return this;
        }
        public java.util.List<String> getDeny() {
            return this.deny;
        }

        public UpdatePolarClawAgentToolsResponseBodyTools setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

}
