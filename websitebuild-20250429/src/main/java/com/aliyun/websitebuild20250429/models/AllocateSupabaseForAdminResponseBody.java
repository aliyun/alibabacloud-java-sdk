// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AllocateSupabaseForAdminResponseBody extends TeaModel {
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
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public AllocateSupabaseForAdminResponseBodyModule module;

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

    public static AllocateSupabaseForAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateSupabaseForAdminResponseBody self = new AllocateSupabaseForAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateSupabaseForAdminResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AllocateSupabaseForAdminResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public AllocateSupabaseForAdminResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AllocateSupabaseForAdminResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public AllocateSupabaseForAdminResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public AllocateSupabaseForAdminResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public AllocateSupabaseForAdminResponseBody setModule(AllocateSupabaseForAdminResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AllocateSupabaseForAdminResponseBodyModule getModule() {
        return this.module;
    }

    public AllocateSupabaseForAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateSupabaseForAdminResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public AllocateSupabaseForAdminResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public AllocateSupabaseForAdminResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class AllocateSupabaseForAdminResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("AnonKey")
        public String anonKey;

        /**
         * <strong>example:</strong>
         * <p>WS20250915163734000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("DbInstanceCreateTime")
        public String dbInstanceCreateTime;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-2bl4djolb02</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("DbPublicUrl")
        public String dbPublicUrl;

        /**
         * <strong>example:</strong>
         * <p>ORACLE</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;appId\&quot;:\&quot;APP_NTJAK8P11SNZDJ3M6BWC\&quot;}</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("InstanceCreateFinishedTime")
        public String instanceCreateFinishedTime;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("InstanceCreateStatus")
        public String instanceCreateStatus;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDeleted")
        public Integer isDeleted;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("RdsDatabasePassword")
        public String rdsDatabasePassword;

        /**
         * <strong>example:</strong>
         * <p>e80f5a7a08514709a2fb</p>
         */
        @NameInMap("ServiceKey")
        public String serviceKey;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SupabaseDashboardPassword")
        public String supabaseDashboardPassword;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("SupabaseDashboardUserName")
        public String supabaseDashboardUserName;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("SupabaseInstanceCreateTime")
        public String supabaseInstanceCreateTime;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SupabaseInstanceId")
        public String supabaseInstanceId;

        /**
         * <p>Supabase Kong URL</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("SupabaseKongUrl")
        public String supabaseKongUrl;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("SupabasePrivateIp")
        public String supabasePrivateIp;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("SupabasePublicIp")
        public String supabasePublicIp;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("SupabasePublicUrl")
        public String supabasePublicUrl;

        /**
         * <strong>example:</strong>
         * <p>GFCBAMJH-zh_CN</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static AllocateSupabaseForAdminResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AllocateSupabaseForAdminResponseBodyModule self = new AllocateSupabaseForAdminResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AllocateSupabaseForAdminResponseBodyModule setAnonKey(String anonKey) {
            this.anonKey = anonKey;
            return this;
        }
        public String getAnonKey() {
            return this.anonKey;
        }

        public AllocateSupabaseForAdminResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public AllocateSupabaseForAdminResponseBodyModule setDbInstanceCreateTime(String dbInstanceCreateTime) {
            this.dbInstanceCreateTime = dbInstanceCreateTime;
            return this;
        }
        public String getDbInstanceCreateTime() {
            return this.dbInstanceCreateTime;
        }

        public AllocateSupabaseForAdminResponseBodyModule setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public AllocateSupabaseForAdminResponseBodyModule setDbPublicUrl(String dbPublicUrl) {
            this.dbPublicUrl = dbPublicUrl;
            return this;
        }
        public String getDbPublicUrl() {
            return this.dbPublicUrl;
        }

        public AllocateSupabaseForAdminResponseBodyModule setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public AllocateSupabaseForAdminResponseBodyModule setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public AllocateSupabaseForAdminResponseBodyModule setInstanceCreateFinishedTime(String instanceCreateFinishedTime) {
            this.instanceCreateFinishedTime = instanceCreateFinishedTime;
            return this;
        }
        public String getInstanceCreateFinishedTime() {
            return this.instanceCreateFinishedTime;
        }

        public AllocateSupabaseForAdminResponseBodyModule setInstanceCreateStatus(String instanceCreateStatus) {
            this.instanceCreateStatus = instanceCreateStatus;
            return this;
        }
        public String getInstanceCreateStatus() {
            return this.instanceCreateStatus;
        }

        public AllocateSupabaseForAdminResponseBodyModule setIsDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        public AllocateSupabaseForAdminResponseBodyModule setRdsDatabasePassword(String rdsDatabasePassword) {
            this.rdsDatabasePassword = rdsDatabasePassword;
            return this;
        }
        public String getRdsDatabasePassword() {
            return this.rdsDatabasePassword;
        }

        public AllocateSupabaseForAdminResponseBodyModule setServiceKey(String serviceKey) {
            this.serviceKey = serviceKey;
            return this;
        }
        public String getServiceKey() {
            return this.serviceKey;
        }

        public AllocateSupabaseForAdminResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public AllocateSupabaseForAdminResponseBodyModule setSupabaseDashboardPassword(String supabaseDashboardPassword) {
            this.supabaseDashboardPassword = supabaseDashboardPassword;
            return this;
        }
        public String getSupabaseDashboardPassword() {
            return this.supabaseDashboardPassword;
        }

        public AllocateSupabaseForAdminResponseBodyModule setSupabaseDashboardUserName(String supabaseDashboardUserName) {
            this.supabaseDashboardUserName = supabaseDashboardUserName;
            return this;
        }
        public String getSupabaseDashboardUserName() {
            return this.supabaseDashboardUserName;
        }

        public AllocateSupabaseForAdminResponseBodyModule setSupabaseInstanceCreateTime(String supabaseInstanceCreateTime) {
            this.supabaseInstanceCreateTime = supabaseInstanceCreateTime;
            return this;
        }
        public String getSupabaseInstanceCreateTime() {
            return this.supabaseInstanceCreateTime;
        }

        public AllocateSupabaseForAdminResponseBodyModule setSupabaseInstanceId(String supabaseInstanceId) {
            this.supabaseInstanceId = supabaseInstanceId;
            return this;
        }
        public String getSupabaseInstanceId() {
            return this.supabaseInstanceId;
        }

        public AllocateSupabaseForAdminResponseBodyModule setSupabaseKongUrl(String supabaseKongUrl) {
            this.supabaseKongUrl = supabaseKongUrl;
            return this;
        }
        public String getSupabaseKongUrl() {
            return this.supabaseKongUrl;
        }

        public AllocateSupabaseForAdminResponseBodyModule setSupabasePrivateIp(String supabasePrivateIp) {
            this.supabasePrivateIp = supabasePrivateIp;
            return this;
        }
        public String getSupabasePrivateIp() {
            return this.supabasePrivateIp;
        }

        public AllocateSupabaseForAdminResponseBodyModule setSupabasePublicIp(String supabasePublicIp) {
            this.supabasePublicIp = supabasePublicIp;
            return this;
        }
        public String getSupabasePublicIp() {
            return this.supabasePublicIp;
        }

        public AllocateSupabaseForAdminResponseBodyModule setSupabasePublicUrl(String supabasePublicUrl) {
            this.supabasePublicUrl = supabasePublicUrl;
            return this;
        }
        public String getSupabasePublicUrl() {
            return this.supabasePublicUrl;
        }

        public AllocateSupabaseForAdminResponseBodyModule setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public AllocateSupabaseForAdminResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
