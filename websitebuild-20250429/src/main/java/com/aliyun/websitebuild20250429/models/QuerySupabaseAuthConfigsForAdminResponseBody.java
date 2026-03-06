// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QuerySupabaseAuthConfigsForAdminResponseBody extends TeaModel {
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
     * <p>or</p>
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
     * <p><a href="https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/u6qw3gxzu3b7sbj/u6qw3gxzu3b7sbj.diff.zip?Expires=1740975709&OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&Signature=FP7dDnkrLlOZHmRRORVqbLOtv9c%3D">https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/u6qw3gxzu3b7sbj/u6qw3gxzu3b7sbj.diff.zip?Expires=1740975709&amp;OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&amp;Signature=FP7dDnkrLlOZHmRRORVqbLOtv9c%3D</a></p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

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
