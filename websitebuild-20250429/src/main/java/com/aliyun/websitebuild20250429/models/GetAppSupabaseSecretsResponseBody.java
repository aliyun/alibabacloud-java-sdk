// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseSecretsResponseBody extends TeaModel {
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
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public GetAppSupabaseSecretsResponseBodyModule module;

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

    public static GetAppSupabaseSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseSecretsResponseBody self = new GetAppSupabaseSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseSecretsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppSupabaseSecretsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppSupabaseSecretsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppSupabaseSecretsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppSupabaseSecretsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppSupabaseSecretsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppSupabaseSecretsResponseBody setModule(GetAppSupabaseSecretsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppSupabaseSecretsResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppSupabaseSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppSupabaseSecretsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppSupabaseSecretsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppSupabaseSecretsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppSupabaseSecretsResponseBodyModuleSecrets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>curl GCEA6fET.popscan.xaliyun.com</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>LOGO3.png</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Opaque</p>
         */
        @NameInMap("SecretType")
        public String secretType;

        /**
         * <strong>example:</strong>
         * <p>58.16.60.28</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAppSupabaseSecretsResponseBodyModuleSecrets build(java.util.Map<String, ?> map) throws Exception {
            GetAppSupabaseSecretsResponseBodyModuleSecrets self = new GetAppSupabaseSecretsResponseBodyModuleSecrets();
            return TeaModel.build(map, self);
        }

        public GetAppSupabaseSecretsResponseBodyModuleSecrets setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAppSupabaseSecretsResponseBodyModuleSecrets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppSupabaseSecretsResponseBodyModuleSecrets setSecretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
        public String getSecretType() {
            return this.secretType;
        }

        public GetAppSupabaseSecretsResponseBodyModuleSecrets setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAppSupabaseSecretsResponseBodyModule extends TeaModel {
        @NameInMap("Secrets")
        public java.util.List<GetAppSupabaseSecretsResponseBodyModuleSecrets> secrets;

        public static GetAppSupabaseSecretsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppSupabaseSecretsResponseBodyModule self = new GetAppSupabaseSecretsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppSupabaseSecretsResponseBodyModule setSecrets(java.util.List<GetAppSupabaseSecretsResponseBodyModuleSecrets> secrets) {
            this.secrets = secrets;
            return this;
        }
        public java.util.List<GetAppSupabaseSecretsResponseBodyModuleSecrets> getSecrets() {
            return this.secrets;
        }

    }

}
