// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppAssistantAgentSsoLoginResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access is denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether a retry is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> that you specify is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public CreateAppAssistantAgentSsoLoginResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The exception message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static CreateAppAssistantAgentSsoLoginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAssistantAgentSsoLoginResponseBody self = new CreateAppAssistantAgentSsoLoginResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setModule(CreateAppAssistantAgentSsoLoginResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateAppAssistantAgentSsoLoginResponseBodyModule getModule() {
        return this.module;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public CreateAppAssistantAgentSsoLoginResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class CreateAppAssistantAgentSsoLoginResponseBodyModule extends TeaModel {
        /**
         * <p>The expiration timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-30T16:00Z</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The platform-specific extension field.</p>
         */
        @NameInMap("Extra")
        public java.util.Map<String, String> extra;

        /**
         * <p>The platform type identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>VMWARE</p>
         */
        @NameInMap("PlatformType")
        public String platformType;

        /**
         * <p>The SSO logon-free URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sso.agent">https://sso.agent</a></p>
         */
        @NameInMap("SsoUrl")
        public String ssoUrl;

        public static CreateAppAssistantAgentSsoLoginResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAssistantAgentSsoLoginResponseBodyModule self = new CreateAppAssistantAgentSsoLoginResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateAppAssistantAgentSsoLoginResponseBodyModule setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public CreateAppAssistantAgentSsoLoginResponseBodyModule setExtra(java.util.Map<String, String> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, String> getExtra() {
            return this.extra;
        }

        public CreateAppAssistantAgentSsoLoginResponseBodyModule setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public CreateAppAssistantAgentSsoLoginResponseBodyModule setSsoUrl(String ssoUrl) {
            this.ssoUrl = ssoUrl;
            return this;
        }
        public String getSsoUrl() {
            return this.ssoUrl;
        }

    }

}
