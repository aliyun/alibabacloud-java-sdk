// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QuerySupabaseAuthConfigsForAdminResponseBody extends TeaModel {
    /**
     * <p>The details of the permission verification failure.</p>
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
     * <p>The dynamic message. This parameter is not in use. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
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
    public QuerySupabaseAuthConfigsForAdminResponseBodyModule module;

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
     * <p>The error message.</p>
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

    public static QuerySupabaseAuthConfigsForAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySupabaseAuthConfigsForAdminResponseBody self = new QuerySupabaseAuthConfigsForAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setModule(QuerySupabaseAuthConfigsForAdminResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QuerySupabaseAuthConfigsForAdminResponseBodyModule getModule() {
        return this.module;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QuerySupabaseAuthConfigsForAdminResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QuerySupabaseAuthConfigsForAdminResponseBodyModule extends TeaModel {
        /**
         * <p>The configuration value. Valid values:</p>
         * <ul>
         * <li><p>cc_rule: HTTP flood mitigation rule.</p>
         * </li>
         * <li><p>ddos_dispatch: DDoS interaction scheduling.</p>
         * </li>
         * <li><p>edge_safe: edge application security.</p>
         * </li>
         * <li><p>blocked_regions: Location Blacklist.</p>
         * </li>
         * <li><p>http_acl_policy: Accurate Access Control.</p>
         * </li>
         * <li><p>bot_manager: bot traffic management.</p>
         * </li>
         * <li><p>ip_reputation: IP reputation library.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Configs")
        public java.util.Map<String, ?> configs;

        public static QuerySupabaseAuthConfigsForAdminResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QuerySupabaseAuthConfigsForAdminResponseBodyModule self = new QuerySupabaseAuthConfigsForAdminResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QuerySupabaseAuthConfigsForAdminResponseBodyModule setConfigs(java.util.Map<String, ?> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.Map<String, ?> getConfigs() {
            return this.configs;
        }

    }

}
