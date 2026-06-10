// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseInstanceResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Is retry allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>App Name.</p>
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
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the provided request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Task object</p>
     */
    @NameInMap("Module")
    public GetAppSupabaseInstanceResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
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
     * <p>Spare parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static GetAppSupabaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseInstanceResponseBody self = new GetAppSupabaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseInstanceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppSupabaseInstanceResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppSupabaseInstanceResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppSupabaseInstanceResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppSupabaseInstanceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppSupabaseInstanceResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppSupabaseInstanceResponseBody setModule(GetAppSupabaseInstanceResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppSupabaseInstanceResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppSupabaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppSupabaseInstanceResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppSupabaseInstanceResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppSupabaseInstanceResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppSupabaseInstanceResponseBodyModule extends TeaModel {
        /**
         * <p>anonymity key</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("AnonKey")
        public String anonKey;

        /**
         * <p>application instance business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250915163734000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>database instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-2bl4djolb02</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>Database public URL</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("DbPublicUrl")
        public String dbPublicUrl;

        /**
         * <p>instance creation status</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("InstanceCreateStatus")
        public String instanceCreateStatus;

        /**
         * <p>service key</p>
         * 
         * <strong>example:</strong>
         * <p>e80f5a7a08514709a2fb</p>
         */
        @NameInMap("ServiceKey")
        public String serviceKey;

        /**
         * <p>trial, draft, live, refunded, expired, released</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Supabase instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SupabaseInstanceId")
        public String supabaseInstanceId;

        /**
         * <p>Supabase public URL</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("SupabasePublicUrl")
        public String supabasePublicUrl;

        public static GetAppSupabaseInstanceResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppSupabaseInstanceResponseBodyModule self = new GetAppSupabaseInstanceResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppSupabaseInstanceResponseBodyModule setAnonKey(String anonKey) {
            this.anonKey = anonKey;
            return this;
        }
        public String getAnonKey() {
            return this.anonKey;
        }

        public GetAppSupabaseInstanceResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppSupabaseInstanceResponseBodyModule setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public GetAppSupabaseInstanceResponseBodyModule setDbPublicUrl(String dbPublicUrl) {
            this.dbPublicUrl = dbPublicUrl;
            return this;
        }
        public String getDbPublicUrl() {
            return this.dbPublicUrl;
        }

        public GetAppSupabaseInstanceResponseBodyModule setInstanceCreateStatus(String instanceCreateStatus) {
            this.instanceCreateStatus = instanceCreateStatus;
            return this;
        }
        public String getInstanceCreateStatus() {
            return this.instanceCreateStatus;
        }

        public GetAppSupabaseInstanceResponseBodyModule setServiceKey(String serviceKey) {
            this.serviceKey = serviceKey;
            return this;
        }
        public String getServiceKey() {
            return this.serviceKey;
        }

        public GetAppSupabaseInstanceResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAppSupabaseInstanceResponseBodyModule setSupabaseInstanceId(String supabaseInstanceId) {
            this.supabaseInstanceId = supabaseInstanceId;
            return this;
        }
        public String getSupabaseInstanceId() {
            return this.supabaseInstanceId;
        }

        public GetAppSupabaseInstanceResponseBodyModule setSupabasePublicUrl(String supabasePublicUrl) {
            this.supabasePublicUrl = supabasePublicUrl;
            return this;
        }
        public String getSupabasePublicUrl() {
            return this.supabasePublicUrl;
        }

    }

}
