// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppLlmApiKeyForPartnerResponseBody extends TeaModel {
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
     * <p>watermark</p>
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
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public CreateAppLlmApiKeyForPartnerResponseBodyModule module;

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
     * <p>SYSTEM.EROR</p>
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

    public static CreateAppLlmApiKeyForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppLlmApiKeyForPartnerResponseBody self = new CreateAppLlmApiKeyForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setModule(CreateAppLlmApiKeyForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateAppLlmApiKeyForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public CreateAppLlmApiKeyForPartnerResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class CreateAppLlmApiKeyForPartnerResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx-xxxxxx</p>
         */
        @NameInMap("EncryptedApiKey")
        public String encryptedApiKey;

        public static CreateAppLlmApiKeyForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateAppLlmApiKeyForPartnerResponseBodyModule self = new CreateAppLlmApiKeyForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateAppLlmApiKeyForPartnerResponseBodyModule setEncryptedApiKey(String encryptedApiKey) {
            this.encryptedApiKey = encryptedApiKey;
            return this;
        }
        public String getEncryptedApiKey() {
            return this.encryptedApiKey;
        }

    }

}
