// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawAgentResponseBody extends TeaModel {
    /**
     * <p>The details of the updated agent.</p>
     */
    @NameInMap("Agent")
    public UpdatePolarClawAgentResponseBodyAgent agent;

    /**
     * <p>The agent ID.</p>
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
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePolarClawAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawAgentResponseBody self = new UpdatePolarClawAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawAgentResponseBody setAgent(UpdatePolarClawAgentResponseBodyAgent agent) {
        this.agent = agent;
        return this;
    }
    public UpdatePolarClawAgentResponseBodyAgent getAgent() {
        return this.agent;
    }

    public UpdatePolarClawAgentResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawAgentResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawAgentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdatePolarClawAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePolarClawAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePolarClawAgentResponseBodyAgentIdentity extends TeaModel {
        /**
         * <p>The path or content of the avatar.</p>
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
         * <p>The identity\&quot;s Emoji identifier. This can be a Unicode code point, such as U+1F99E, or the Emoji character itself.</p>
         * 
         * <strong>example:</strong>
         * <p>U+1F99E</p>
         */
        @NameInMap("Emoji")
        public String emoji;

        /**
         * <p>The name of the identity.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarClaw</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The theme of the identity.</p>
         * 
         * <strong>example:</strong>
         * <p>soul lobster</p>
         */
        @NameInMap("Theme")
        public String theme;

        public static UpdatePolarClawAgentResponseBodyAgentIdentity build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawAgentResponseBodyAgentIdentity self = new UpdatePolarClawAgentResponseBodyAgentIdentity();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawAgentResponseBodyAgentIdentity setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public UpdatePolarClawAgentResponseBodyAgentIdentity setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdatePolarClawAgentResponseBodyAgentIdentity setEmoji(String emoji) {
            this.emoji = emoji;
            return this;
        }
        public String getEmoji() {
            return this.emoji;
        }

        public UpdatePolarClawAgentResponseBodyAgentIdentity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePolarClawAgentResponseBodyAgentIdentity setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

    }

    public static class UpdatePolarClawAgentResponseBodyAgent extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The identity information of the agent.</p>
         */
        @NameInMap("Identity")
        public UpdatePolarClawAgentResponseBodyAgentIdentity identity;

        /**
         * <p>The display name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarClaw</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The workspace path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/workspace-work-v2</p>
         */
        @NameInMap("Workspace")
        public String workspace;

        public static UpdatePolarClawAgentResponseBodyAgent build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawAgentResponseBodyAgent self = new UpdatePolarClawAgentResponseBodyAgent();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawAgentResponseBodyAgent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePolarClawAgentResponseBodyAgent setIdentity(UpdatePolarClawAgentResponseBodyAgentIdentity identity) {
            this.identity = identity;
            return this;
        }
        public UpdatePolarClawAgentResponseBodyAgentIdentity getIdentity() {
            return this.identity;
        }

        public UpdatePolarClawAgentResponseBodyAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePolarClawAgentResponseBodyAgent setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
