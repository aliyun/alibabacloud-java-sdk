// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentToolsResponseBody extends TeaModel {
    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
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
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The current tool configuration.</p>
     */
    @NameInMap("CurrentConfig")
    public DescribePolarClawAgentToolsResponseBodyCurrentConfig currentConfig;

    /**
     * <p>The list of tool groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<DescribePolarClawAgentToolsResponseBodyGroups> groups;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of available profiles.</p>
     */
    @NameInMap("Profiles")
    public java.util.List<DescribePolarClawAgentToolsResponseBodyProfiles> profiles;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolarClawAgentToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentToolsResponseBody self = new DescribePolarClawAgentToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentToolsResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DescribePolarClawAgentToolsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawAgentToolsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawAgentToolsResponseBody setCurrentConfig(DescribePolarClawAgentToolsResponseBodyCurrentConfig currentConfig) {
        this.currentConfig = currentConfig;
        return this;
    }
    public DescribePolarClawAgentToolsResponseBodyCurrentConfig getCurrentConfig() {
        return this.currentConfig;
    }

    public DescribePolarClawAgentToolsResponseBody setGroups(java.util.List<DescribePolarClawAgentToolsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribePolarClawAgentToolsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public DescribePolarClawAgentToolsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawAgentToolsResponseBody setProfiles(java.util.List<DescribePolarClawAgentToolsResponseBodyProfiles> profiles) {
        this.profiles = profiles;
        return this;
    }
    public java.util.List<DescribePolarClawAgentToolsResponseBodyProfiles> getProfiles() {
        return this.profiles;
    }

    public DescribePolarClawAgentToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolarClawAgentToolsResponseBodyCurrentConfig extends TeaModel {
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
         * <p>full</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static DescribePolarClawAgentToolsResponseBodyCurrentConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentToolsResponseBodyCurrentConfig self = new DescribePolarClawAgentToolsResponseBodyCurrentConfig();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentToolsResponseBodyCurrentConfig setAllow(java.util.List<String> allow) {
            this.allow = allow;
            return this;
        }
        public java.util.List<String> getAllow() {
            return this.allow;
        }

        public DescribePolarClawAgentToolsResponseBodyCurrentConfig setAlsoAllow(java.util.List<String> alsoAllow) {
            this.alsoAllow = alsoAllow;
            return this;
        }
        public java.util.List<String> getAlsoAllow() {
            return this.alsoAllow;
        }

        public DescribePolarClawAgentToolsResponseBodyCurrentConfig setDeny(java.util.List<String> deny) {
            this.deny = deny;
            return this;
        }
        public java.util.List<String> getDeny() {
            return this.deny;
        }

        public DescribePolarClawAgentToolsResponseBodyCurrentConfig setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class DescribePolarClawAgentToolsResponseBodyGroupsTools extends TeaModel {
        /**
         * <p>The list of profiles that include this tool by default.</p>
         */
        @NameInMap("DefaultProfiles")
        public java.util.List<String> defaultProfiles;

        /**
         * <p>The tool description.</p>
         * 
         * <strong>example:</strong>
         * <p>读取指定文件内容</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tool identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>read</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>读取文件</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>core</p>
         */
        @NameInMap("Source")
        public String source;

        public static DescribePolarClawAgentToolsResponseBodyGroupsTools build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentToolsResponseBodyGroupsTools self = new DescribePolarClawAgentToolsResponseBodyGroupsTools();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentToolsResponseBodyGroupsTools setDefaultProfiles(java.util.List<String> defaultProfiles) {
            this.defaultProfiles = defaultProfiles;
            return this;
        }
        public java.util.List<String> getDefaultProfiles() {
            return this.defaultProfiles;
        }

        public DescribePolarClawAgentToolsResponseBodyGroupsTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolarClawAgentToolsResponseBodyGroupsTools setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePolarClawAgentToolsResponseBodyGroupsTools setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribePolarClawAgentToolsResponseBodyGroupsTools setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class DescribePolarClawAgentToolsResponseBodyGroups extends TeaModel {
        /**
         * <p>The group identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>文件操作</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The source, which is core or a plugin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>core</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The list of tools.</p>
         */
        @NameInMap("Tools")
        public java.util.List<DescribePolarClawAgentToolsResponseBodyGroupsTools> tools;

        public static DescribePolarClawAgentToolsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentToolsResponseBodyGroups self = new DescribePolarClawAgentToolsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentToolsResponseBodyGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePolarClawAgentToolsResponseBodyGroups setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribePolarClawAgentToolsResponseBodyGroups setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribePolarClawAgentToolsResponseBodyGroups setTools(java.util.List<DescribePolarClawAgentToolsResponseBodyGroupsTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<DescribePolarClawAgentToolsResponseBodyGroupsTools> getTools() {
            return this.tools;
        }

    }

    public static class DescribePolarClawAgentToolsResponseBodyProfiles extends TeaModel {
        /**
         * <p>The profile identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>全部工具</p>
         */
        @NameInMap("Label")
        public String label;

        public static DescribePolarClawAgentToolsResponseBodyProfiles build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentToolsResponseBodyProfiles self = new DescribePolarClawAgentToolsResponseBodyProfiles();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentToolsResponseBodyProfiles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePolarClawAgentToolsResponseBodyProfiles setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

}
