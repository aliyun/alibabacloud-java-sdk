// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawAgentResponseBody extends TeaModel {
    @NameInMap("Agent")
    public CreatePolarClawAgentResponseBodyAgent agent;

    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>/home/node/.openclaw/workspace-work</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static CreatePolarClawAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawAgentResponseBody self = new CreatePolarClawAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawAgentResponseBody setAgent(CreatePolarClawAgentResponseBodyAgent agent) {
        this.agent = agent;
        return this;
    }
    public CreatePolarClawAgentResponseBodyAgent getAgent() {
        return this.agent;
    }

    public CreatePolarClawAgentResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreatePolarClawAgentResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePolarClawAgentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePolarClawAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePolarClawAgentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolarClawAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolarClawAgentResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreatePolarClawAgentResponseBodyAgentIdentity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p>U+1F99E</p>
         */
        @NameInMap("Emoji")
        public String emoji;

        /**
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("Theme")
        public String theme;

        public static CreatePolarClawAgentResponseBodyAgentIdentity build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawAgentResponseBodyAgentIdentity self = new CreatePolarClawAgentResponseBodyAgentIdentity();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawAgentResponseBodyAgentIdentity setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public CreatePolarClawAgentResponseBodyAgentIdentity setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreatePolarClawAgentResponseBodyAgentIdentity setEmoji(String emoji) {
            this.emoji = emoji;
            return this;
        }
        public String getEmoji() {
            return this.emoji;
        }

        public CreatePolarClawAgentResponseBodyAgentIdentity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePolarClawAgentResponseBodyAgentIdentity setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

    }

    public static class CreatePolarClawAgentResponseBodyAgent extends TeaModel {
        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Identity")
        public CreatePolarClawAgentResponseBodyAgentIdentity identity;

        /**
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/workspace-work</p>
         */
        @NameInMap("Workspace")
        public String workspace;

        public static CreatePolarClawAgentResponseBodyAgent build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawAgentResponseBodyAgent self = new CreatePolarClawAgentResponseBodyAgent();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawAgentResponseBodyAgent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreatePolarClawAgentResponseBodyAgent setIdentity(CreatePolarClawAgentResponseBodyAgentIdentity identity) {
            this.identity = identity;
            return this;
        }
        public CreatePolarClawAgentResponseBodyAgentIdentity getIdentity() {
            return this.identity;
        }

        public CreatePolarClawAgentResponseBodyAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePolarClawAgentResponseBodyAgent setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
