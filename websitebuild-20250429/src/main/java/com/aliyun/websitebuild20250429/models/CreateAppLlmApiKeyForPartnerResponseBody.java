// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppLlmApiKeyForPartnerResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed.</p>
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
     * <p>watermark</p>
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
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error arguments returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
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
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.EROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The root error message.</p>
     * 
     * <strong>example:</strong>
     * <p>System exception.</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request is processed synchronously.</p>
     * 
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
         * <p>The AES-encrypted API key ciphertext.</p>
         * 
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
