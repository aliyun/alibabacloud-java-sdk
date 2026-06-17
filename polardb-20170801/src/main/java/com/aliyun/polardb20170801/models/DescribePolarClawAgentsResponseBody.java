// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentsResponseBody extends TeaModel {
    /**
     * <p>The list of agents.</p>
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
     * <p>The status code.</p>
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
     * <p>The main agent key name.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("MainKey")
    public String mainKey;

    /**
     * <p>The message.</p>
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

    public static class DescribePolarClawAgentsResponseBodyAgentsIdentity extends TeaModel {
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
         * <p>The emoji for the identity. This can be a Unicode code point (e.g., <code>U+1F99E</code>) or an emoji character.</p>
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
         * <p>The identity theme.</p>
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

    public static class DescribePolarClawAgentsResponseBodyAgents extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The agent\&quot;s identity.</p>
         */
        @NameInMap("Identity")
        public DescribePolarClawAgentsResponseBodyAgentsIdentity identity;

        /**
         * <p>The agent display name.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribePolarClawAgentsResponseBodyAgents build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawAgentsResponseBodyAgents self = new DescribePolarClawAgentsResponseBodyAgents();
            return TeaModel.build(map, self);
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

        public DescribePolarClawAgentsResponseBodyAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
