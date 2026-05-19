// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetLlmProxyConfigForAdminResponseBody extends TeaModel {
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
    public GetLlmProxyConfigForAdminResponseBodyModule module;

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

    public static GetLlmProxyConfigForAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLlmProxyConfigForAdminResponseBody self = new GetLlmProxyConfigForAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLlmProxyConfigForAdminResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLlmProxyConfigForAdminResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetLlmProxyConfigForAdminResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLlmProxyConfigForAdminResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetLlmProxyConfigForAdminResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetLlmProxyConfigForAdminResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetLlmProxyConfigForAdminResponseBody setModule(GetLlmProxyConfigForAdminResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetLlmProxyConfigForAdminResponseBodyModule getModule() {
        return this.module;
    }

    public GetLlmProxyConfigForAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLlmProxyConfigForAdminResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetLlmProxyConfigForAdminResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetLlmProxyConfigForAdminResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetLlmProxyConfigForAdminResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        @NameInMap("AllowedModels")
        public String allowedModels;

        /**
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        @NameInMap("BlockedModels")
        public String blockedModels;

        /**
         * <strong>example:</strong>
         * <p>adds2</p>
         */
        @NameInMap("Capability")
        public String capability;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("DailyLimit")
        public Integer dailyLimit;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("DailyTokenLimit")
        public Long dailyTokenLimit;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Extend")
        public String extend;

        /**
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>16257</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>121.41.11.161,10.200.255.60</p>
         */
        @NameInMap("IpBlacklist")
        public String ipBlacklist;

        /**
         * <strong>example:</strong>
         * <p>121.41.11.161,10.200.255.60</p>
         */
        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("RpmLimit")
        public Integer rpmLimit;

        /**
         * <p>trial,draft,live,refunded,expired,released</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SuspendReason")
        public String suspendReason;

        public static GetLlmProxyConfigForAdminResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetLlmProxyConfigForAdminResponseBodyModule self = new GetLlmProxyConfigForAdminResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setAllowedModels(String allowedModels) {
            this.allowedModels = allowedModels;
            return this;
        }
        public String getAllowedModels() {
            return this.allowedModels;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setBlockedModels(String blockedModels) {
            this.blockedModels = blockedModels;
            return this;
        }
        public String getBlockedModels() {
            return this.blockedModels;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setCapability(String capability) {
            this.capability = capability;
            return this;
        }
        public String getCapability() {
            return this.capability;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setDailyLimit(Integer dailyLimit) {
            this.dailyLimit = dailyLimit;
            return this;
        }
        public Integer getDailyLimit() {
            return this.dailyLimit;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setDailyTokenLimit(Long dailyTokenLimit) {
            this.dailyTokenLimit = dailyTokenLimit;
            return this;
        }
        public Long getDailyTokenLimit() {
            return this.dailyTokenLimit;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setIpBlacklist(String ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }
        public String getIpBlacklist() {
            return this.ipBlacklist;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setRpmLimit(Integer rpmLimit) {
            this.rpmLimit = rpmLimit;
            return this;
        }
        public Integer getRpmLimit() {
            return this.rpmLimit;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetLlmProxyConfigForAdminResponseBodyModule setSuspendReason(String suspendReason) {
            this.suspendReason = suspendReason;
            return this;
        }
        public String getSuspendReason() {
            return this.suspendReason;
        }

    }

}
