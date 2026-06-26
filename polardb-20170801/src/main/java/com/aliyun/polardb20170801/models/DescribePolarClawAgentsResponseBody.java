// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentsResponseBody extends TeaModel {
    /**
     * <p>The agent list.</p>
     */
    @NameInMap("Agents")
    public java.util.List<DescribePolarClawAgentsResponseBodyAgents> agents;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
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
     * <p>The default agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("DefaultId")
    public String defaultId;

    /**
     * <p>The primary agent key name.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("MainKey")
    public String mainKey;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routing scope.</p>
     * 
     * <strong>example:</strong>
     * <p>per-sender</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static DescribePolarClawAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentsResponseBody self = new DescribePolarClawAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentsResponseBody setAgents(java.util.List<DescribePolarClawAgentsResponseBodyAgents> agents) {
        this.agents = agents;
        return this;
    }
    public java.util.List<DescribePolarClawAgentsResponseBodyAgents> getAgents() {
        return this.agents;
    }

    public DescribePolarClawAgentsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawAgentsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawAgentsResponseBody setDefaultId(String defaultId) {
        this.defaultId = defaultId;
        return this;
    }
    public String getDefaultId() {
        return this.defaultId;
    }

    public DescribePolarClawAgentsResponseBody setMainKey(String mainKey) {
        this.mainKey = mainKey;
        return this;
    }
    public String getMainKey() {
        return this.mainKey;
    }

    public DescribePolarClawAgentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawAgentsResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class DescribePolarClawAgentsResponseBodyAgentsFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Missing")
        public Boolean missing;

        /**
         * <strong>example:</strong>
         * <p>SOUL.md</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/workspace-work/SOUL.md</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>1716000000000</p>
         */
        @NameInMap("UpdatedAtMs")
        public Long updatedAtMs;

        public static DescribePolarClawAgentsResponseBodyAgentsFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentsResponseBodyAgentsFiles self = new DescribePolarClawAgentsResponseBodyAgentsFiles();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentsResponseBodyAgentsFiles setMissing(Boolean missing) {
            this.missing = missing;
            return this;
        }
        public Boolean getMissing() {
            return this.missing;
        }

        public DescribePolarClawAgentsResponseBodyAgentsFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolarClawAgentsResponseBodyAgentsFiles setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePolarClawAgentsResponseBodyAgentsFiles setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribePolarClawAgentsResponseBodyAgentsFiles setUpdatedAtMs(Long updatedAtMs) {
            this.updatedAtMs = updatedAtMs;
            return this;
        }
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

    }

    public static class DescribePolarClawAgentsResponseBodyAgentsIdentity extends TeaModel {
        /**
         * <p>The avatar path or content.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <p>The avatar URL.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        /**
         * <p>The emoji identifier in Unicode encoding format such as U+1F99E, or a direct emoji character.</p>
         * 
         * <strong>example:</strong>
         * <p>U+1F99E</p>
         */
        @NameInMap("Emoji")
        public String emoji;

        /**
         * <p>The identity name.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarClaw</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The theme.</p>
         * 
         * <strong>example:</strong>
         * <p>space lobster</p>
         */
        @NameInMap("Theme")
        public String theme;

        public static DescribePolarClawAgentsResponseBodyAgentsIdentity build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentsResponseBodyAgentsIdentity self = new DescribePolarClawAgentsResponseBodyAgentsIdentity();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentsResponseBodyAgentsIdentity setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public DescribePolarClawAgentsResponseBodyAgentsIdentity setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public DescribePolarClawAgentsResponseBodyAgentsIdentity setEmoji(String emoji) {
            this.emoji = emoji;
            return this;
        }
        public String getEmoji() {
            return this.emoji;
        }

        public DescribePolarClawAgentsResponseBodyAgentsIdentity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolarClawAgentsResponseBodyAgentsIdentity setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

    }

    public static class DescribePolarClawAgentsResponseBodyAgentsModel extends TeaModel {
        @NameInMap("Fallbacks")
        public java.util.List<String> fallbacks;

        /**
         * <strong>example:</strong>
         * <p>claude-sonnet-4-5</p>
         */
        @NameInMap("Primary")
        public String primary;

        public static DescribePolarClawAgentsResponseBodyAgentsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentsResponseBodyAgentsModel self = new DescribePolarClawAgentsResponseBodyAgentsModel();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentsResponseBodyAgentsModel setFallbacks(java.util.List<String> fallbacks) {
            this.fallbacks = fallbacks;
            return this;
        }
        public java.util.List<String> getFallbacks() {
            return this.fallbacks;
        }

        public DescribePolarClawAgentsResponseBodyAgentsModel setPrimary(String primary) {
            this.primary = primary;
            return this;
        }
        public String getPrimary() {
            return this.primary;
        }

    }

    public static class DescribePolarClawAgentsResponseBodyAgents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Default")
        public Boolean _default;

        @NameInMap("Files")
        public java.util.List<DescribePolarClawAgentsResponseBodyAgentsFiles> files;

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The identity information.</p>
         */
        @NameInMap("Identity")
        public DescribePolarClawAgentsResponseBodyAgentsIdentity identity;

        @NameInMap("Model")
        public DescribePolarClawAgentsResponseBodyAgentsModel model;

        /**
         * <p>The display name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Skills")
        public java.util.List<String> skills;

        /**
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/workspace-work</p>
         */
        @NameInMap("Workspace")
        public String workspace;

        public static DescribePolarClawAgentsResponseBodyAgents build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentsResponseBodyAgents self = new DescribePolarClawAgentsResponseBodyAgents();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawAgentsResponseBodyAgents set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public DescribePolarClawAgentsResponseBodyAgents setFiles(java.util.List<DescribePolarClawAgentsResponseBodyAgentsFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<DescribePolarClawAgentsResponseBodyAgentsFiles> getFiles() {
            return this.files;
        }

        public DescribePolarClawAgentsResponseBodyAgents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePolarClawAgentsResponseBodyAgents setIdentity(DescribePolarClawAgentsResponseBodyAgentsIdentity identity) {
            this.identity = identity;
            return this;
        }
        public DescribePolarClawAgentsResponseBodyAgentsIdentity getIdentity() {
            return this.identity;
        }

        public DescribePolarClawAgentsResponseBodyAgents setModel(DescribePolarClawAgentsResponseBodyAgentsModel model) {
            this.model = model;
            return this;
        }
        public DescribePolarClawAgentsResponseBodyAgentsModel getModel() {
            return this.model;
        }

        public DescribePolarClawAgentsResponseBodyAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolarClawAgentsResponseBodyAgents setSkills(java.util.List<String> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<String> getSkills() {
            return this.skills;
        }

        public DescribePolarClawAgentsResponseBodyAgents setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
