// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseAuthConfigResponseBody extends TeaModel {
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
     * <p>or</p>
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
     * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the ErrMessage parameter.</p>
     * <blockquote>
     * <p>If ErrMessage returns <strong>The Value of Input Parameter %s is not valid</strong> and DynamicMessage returns <strong>DtsJobId</strong>, the DtsJobId request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The task object.</p>
     */
    @NameInMap("Module")
    public GetAppSupabaseAuthConfigResponseBodyModule module;

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

    public static GetAppSupabaseAuthConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseAuthConfigResponseBody self = new GetAppSupabaseAuthConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseAuthConfigResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppSupabaseAuthConfigResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppSupabaseAuthConfigResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppSupabaseAuthConfigResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppSupabaseAuthConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppSupabaseAuthConfigResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppSupabaseAuthConfigResponseBody setModule(GetAppSupabaseAuthConfigResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppSupabaseAuthConfigResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppSupabaseAuthConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppSupabaseAuthConfigResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppSupabaseAuthConfigResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppSupabaseAuthConfigResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppSupabaseAuthConfigResponseBodyModule extends TeaModel {
        /**
         * <p>The configuration value. Valid values:</p>
         * <ul>
         * <li><p>cc_rule: HTTP flood protection rule.</p>
         * </li>
         * <li><p>ddos_dispatch: DDoS mitigation interaction scheduling.</p>
         * </li>
         * <li><p>edge_safe: edge application security.</p>
         * </li>
         * <li><p>blocked_regions: location blacklist.</p>
         * </li>
         * <li><p>http_acl_policy: accurate access control.</p>
         * </li>
         * <li><p>bot_manager: bot traffic management.</p>
         * </li>
         * <li><p>ip_reputation: IP reputation library.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Configs")
        public java.util.Map<String, ?> configs;

        public static GetAppSupabaseAuthConfigResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppSupabaseAuthConfigResponseBodyModule self = new GetAppSupabaseAuthConfigResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppSupabaseAuthConfigResponseBodyModule setConfigs(java.util.Map<String, ?> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.Map<String, ?> getConfigs() {
            return this.configs;
        }

    }

}
