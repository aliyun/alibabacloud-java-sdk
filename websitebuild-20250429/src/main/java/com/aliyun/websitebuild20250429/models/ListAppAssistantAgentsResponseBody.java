// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppAssistantAgentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public java.util.List<ListAppAssistantAgentsResponseBodyModule> module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppAssistantAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppAssistantAgentsResponseBody self = new ListAppAssistantAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppAssistantAgentsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppAssistantAgentsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppAssistantAgentsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppAssistantAgentsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppAssistantAgentsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppAssistantAgentsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppAssistantAgentsResponseBody setModule(java.util.List<ListAppAssistantAgentsResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<ListAppAssistantAgentsResponseBodyModule> getModule() {
        return this.module;
    }

    public ListAppAssistantAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppAssistantAgentsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppAssistantAgentsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppAssistantAgentsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppAssistantAgentsResponseBodyModuleCredential extends TeaModel {
        /**
         * <p>API Key</p>
         * 
         * <strong>example:</strong>
         * <p>akm-xxxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>API Secret</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxx</p>
         */
        @NameInMap("ApiSecret")
        public String apiSecret;

        @NameInMap("Extra")
        public java.util.Map<String, String> extra;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListAppAssistantAgentsResponseBodyModuleCredential build(java.util.Map<String, ?> map) throws Exception {
            ListAppAssistantAgentsResponseBodyModuleCredential self = new ListAppAssistantAgentsResponseBodyModuleCredential();
            return TeaModel.build(map, self);
        }

        public ListAppAssistantAgentsResponseBodyModuleCredential setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListAppAssistantAgentsResponseBodyModuleCredential setApiSecret(String apiSecret) {
            this.apiSecret = apiSecret;
            return this;
        }
        public String getApiSecret() {
            return this.apiSecret;
        }

        public ListAppAssistantAgentsResponseBodyModuleCredential setExtra(java.util.Map<String, String> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, String> getExtra() {
            return this.extra;
        }

        public ListAppAssistantAgentsResponseBodyModuleCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListAppAssistantAgentsResponseBodyModuleCredential setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListAppAssistantAgentsResponseBodyModuleEmbedConfig extends TeaModel {
        @NameInMap("Extra")
        public java.util.Map<String, String> extra;

        @NameInMap("RawScript")
        public String rawScript;

        public static ListAppAssistantAgentsResponseBodyModuleEmbedConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAppAssistantAgentsResponseBodyModuleEmbedConfig self = new ListAppAssistantAgentsResponseBodyModuleEmbedConfig();
            return TeaModel.build(map, self);
        }

        public ListAppAssistantAgentsResponseBodyModuleEmbedConfig setExtra(java.util.Map<String, String> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, String> getExtra() {
            return this.extra;
        }

        public ListAppAssistantAgentsResponseBodyModuleEmbedConfig setRawScript(String rawScript) {
            this.rawScript = rawScript;
            return this;
        }
        public String getRawScript() {
            return this.rawScript;
        }

    }

    public static class ListAppAssistantAgentsResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>liyang1_v@soulapp</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        /**
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Credential")
        public ListAppAssistantAgentsResponseBodyModuleCredential credential;

        @NameInMap("EmbedConfig")
        public ListAppAssistantAgentsResponseBodyModuleEmbedConfig embedConfig;

        @NameInMap("ExtraParams")
        public java.util.Map<String, String> extraParams;

        /**
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>WA12313123131</p>
         */
        @NameInMap("PlatformAppId")
        public String platformAppId;

        /**
         * <strong>example:</strong>
         * <p>VMWARE</p>
         */
        @NameInMap("PlatformType")
        public String platformType;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1231311312</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListAppAssistantAgentsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppAssistantAgentsResponseBodyModule self = new ListAppAssistantAgentsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppAssistantAgentsResponseBodyModule setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAppAssistantAgentsResponseBodyModule setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAppAssistantAgentsResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListAppAssistantAgentsResponseBodyModule setCredential(ListAppAssistantAgentsResponseBodyModuleCredential credential) {
            this.credential = credential;
            return this;
        }
        public ListAppAssistantAgentsResponseBodyModuleCredential getCredential() {
            return this.credential;
        }

        public ListAppAssistantAgentsResponseBodyModule setEmbedConfig(ListAppAssistantAgentsResponseBodyModuleEmbedConfig embedConfig) {
            this.embedConfig = embedConfig;
            return this;
        }
        public ListAppAssistantAgentsResponseBodyModuleEmbedConfig getEmbedConfig() {
            return this.embedConfig;
        }

        public ListAppAssistantAgentsResponseBodyModule setExtraParams(java.util.Map<String, String> extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public java.util.Map<String, String> getExtraParams() {
            return this.extraParams;
        }

        public ListAppAssistantAgentsResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppAssistantAgentsResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppAssistantAgentsResponseBodyModule setPlatformAppId(String platformAppId) {
            this.platformAppId = platformAppId;
            return this;
        }
        public String getPlatformAppId() {
            return this.platformAppId;
        }

        public ListAppAssistantAgentsResponseBodyModule setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public ListAppAssistantAgentsResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppAssistantAgentsResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
