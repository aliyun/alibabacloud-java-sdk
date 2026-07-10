// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AuthorizeAppProxyOpsResponseBody extends TeaModel {
    /**
     * <p>The deprecated parameter.</p>
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
     * <p>spring-cloud-b</p>
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
     * <p>xxx</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response object.</p>
     */
    @NameInMap("Module")
    public AuthorizeAppProxyOpsResponseBodyModule module;

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
     * <p>The root error message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request is synchronously processed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static AuthorizeAppProxyOpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAppProxyOpsResponseBody self = new AuthorizeAppProxyOpsResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeAppProxyOpsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AuthorizeAppProxyOpsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public AuthorizeAppProxyOpsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AuthorizeAppProxyOpsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public AuthorizeAppProxyOpsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public AuthorizeAppProxyOpsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public AuthorizeAppProxyOpsResponseBody setModule(AuthorizeAppProxyOpsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AuthorizeAppProxyOpsResponseBodyModule getModule() {
        return this.module;
    }

    public AuthorizeAppProxyOpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeAppProxyOpsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public AuthorizeAppProxyOpsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public AuthorizeAppProxyOpsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class AuthorizeAppProxyOpsResponseBodyModule extends TeaModel {
        /**
         * <p>Indicates whether the service-linked role is authorized.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Authorized")
        public Boolean authorized;

        /**
         * <p>The RAM service role authorization link returned when the service-linked role is not authorized.</p>
         * 
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("RamAuthLink")
        public String ramAuthLink;

        /**
         * <p>The authorization URL built with tmpTicket, returned when the service-linked role is authorized.</p>
         * 
         * <strong>example:</strong>
         * <p>12345rert</p>
         */
        @NameInMap("TmpTicket")
        public String tmpTicket;

        public static AuthorizeAppProxyOpsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeAppProxyOpsResponseBodyModule self = new AuthorizeAppProxyOpsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AuthorizeAppProxyOpsResponseBodyModule setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public AuthorizeAppProxyOpsResponseBodyModule setRamAuthLink(String ramAuthLink) {
            this.ramAuthLink = ramAuthLink;
            return this;
        }
        public String getRamAuthLink() {
            return this.ramAuthLink;
        }

        public AuthorizeAppProxyOpsResponseBodyModule setTmpTicket(String tmpTicket) {
            this.tmpTicket = tmpTicket;
            return this;
        }
        public String getTmpTicket() {
            return this.tmpTicket;
        }

    }

}
