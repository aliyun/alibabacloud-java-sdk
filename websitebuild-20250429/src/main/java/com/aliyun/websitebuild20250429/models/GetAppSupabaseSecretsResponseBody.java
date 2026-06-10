// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseSecretsResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed. Valid values:  </p>
     * <ul>
     * <li>false: Retry is not allowed.  </li>
     * <li>true: Retry is allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>App name.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message, used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> error message.  </p>
     * <blockquote>
     * <p>For example, if <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the provided request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("Module")
    public GetAppSupabaseSecretsResponseBodyModule module;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.EROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>Abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the operation is processed synchronously.</p>
     * 
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
         * <p>Tag key</p>
         * 
         * <strong>example:</strong>
         * <p>curl GCEA6fET.popscan.xaliyun.com</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Application name</p>
         * 
         * <strong>example:</strong>
         * <p>LOGO3.png</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The credential type. Valid values:  </p>
         * <ul>
         * <li>Generic: generic secret.  </li>
         * <li>Rds: RDS credential.  </li>
         * <li>Redis: Redis/Tair credential.  </li>
         * <li>RAMCredentials: RAM credential.  </li>
         * <li>ECS: ECS credential.  </li>
         * <li>PolarDB: PolarDB credential.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Opaque</p>
         */
        @NameInMap("SecretType")
        public String secretType;

        /**
         * <p>Record value</p>
         * 
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
        /**
         * <p>Instance ID.</p>
         */
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
