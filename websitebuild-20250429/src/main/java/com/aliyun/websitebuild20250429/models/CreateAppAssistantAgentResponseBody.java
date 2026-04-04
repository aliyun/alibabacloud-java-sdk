// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppAssistantAgentResponseBody extends TeaModel {
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
     * <p>dewuApp</p>
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
    public CreateAppAssistantAgentResponseBodyModule module;

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

    public static CreateAppAssistantAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAssistantAgentResponseBody self = new CreateAppAssistantAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppAssistantAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateAppAssistantAgentResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public CreateAppAssistantAgentResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppAssistantAgentResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CreateAppAssistantAgentResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateAppAssistantAgentResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public CreateAppAssistantAgentResponseBody setModule(CreateAppAssistantAgentResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateAppAssistantAgentResponseBodyModule getModule() {
        return this.module;
    }

    public CreateAppAssistantAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppAssistantAgentResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public CreateAppAssistantAgentResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public CreateAppAssistantAgentResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class CreateAppAssistantAgentResponseBodyModuleCredential extends TeaModel {
        @NameInMap("Extra")
        public java.util.Map<String, String> extra;

        /**
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Username")
        public String username;

        public static CreateAppAssistantAgentResponseBodyModuleCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAssistantAgentResponseBodyModuleCredential self = new CreateAppAssistantAgentResponseBodyModuleCredential();
            return TeaModel.build(map, self);
        }

        public CreateAppAssistantAgentResponseBodyModuleCredential setExtra(java.util.Map<String, String> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, String> getExtra() {
            return this.extra;
        }

        public CreateAppAssistantAgentResponseBodyModuleCredential setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateAppAssistantAgentResponseBodyModuleEmbedConfig extends TeaModel {
        @NameInMap("Extra")
        public java.util.Map<String, String> extra;

        @NameInMap("RawScript")
        public String rawScript;

        public static CreateAppAssistantAgentResponseBodyModuleEmbedConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAssistantAgentResponseBodyModuleEmbedConfig self = new CreateAppAssistantAgentResponseBodyModuleEmbedConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppAssistantAgentResponseBodyModuleEmbedConfig setExtra(java.util.Map<String, String> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, String> getExtra() {
            return this.extra;
        }

        public CreateAppAssistantAgentResponseBodyModuleEmbedConfig setRawScript(String rawScript) {
            this.rawScript = rawScript;
            return this;
        }
        public String getRawScript() {
            return this.rawScript;
        }

    }

    public static class CreateAppAssistantAgentResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>duanwei@qianrutest</p>
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
        public CreateAppAssistantAgentResponseBodyModuleCredential credential;

        @NameInMap("EmbedConfig")
        public CreateAppAssistantAgentResponseBodyModuleEmbedConfig embedConfig;

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
         * <p>WA12313131313</p>
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
         * <p>1231313131</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateAppAssistantAgentResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAssistantAgentResponseBodyModule self = new CreateAppAssistantAgentResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateAppAssistantAgentResponseBodyModule setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateAppAssistantAgentResponseBodyModule setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CreateAppAssistantAgentResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public CreateAppAssistantAgentResponseBodyModule setCredential(CreateAppAssistantAgentResponseBodyModuleCredential credential) {
            this.credential = credential;
            return this;
        }
        public CreateAppAssistantAgentResponseBodyModuleCredential getCredential() {
            return this.credential;
        }

        public CreateAppAssistantAgentResponseBodyModule setEmbedConfig(CreateAppAssistantAgentResponseBodyModuleEmbedConfig embedConfig) {
            this.embedConfig = embedConfig;
            return this;
        }
        public CreateAppAssistantAgentResponseBodyModuleEmbedConfig getEmbedConfig() {
            return this.embedConfig;
        }

        public CreateAppAssistantAgentResponseBodyModule setExtraParams(java.util.Map<String, String> extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public java.util.Map<String, String> getExtraParams() {
            return this.extraParams;
        }

        public CreateAppAssistantAgentResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateAppAssistantAgentResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateAppAssistantAgentResponseBodyModule setPlatformAppId(String platformAppId) {
            this.platformAppId = platformAppId;
            return this;
        }
        public String getPlatformAppId() {
            return this.platformAppId;
        }

        public CreateAppAssistantAgentResponseBodyModule setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public CreateAppAssistantAgentResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAppAssistantAgentResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
