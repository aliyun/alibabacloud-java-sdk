// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetLlmProxyConfigForAdminResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access is denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retries are allowed. Valid values:</p>
     * <ul>
     * <li>false: Retries are not allowed.</li>
     * <li>true: Retries are allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name. The application with this name is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic code. This parameter is not in use. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message. This parameter is used to replace the <code>%s</code> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p>For example, if the <strong>ErrMessage</strong> parameter returns <strong>The Value of Input Parameter %s is not valid</strong> and the <strong>DynamicMessage</strong> parameter returns <strong>DtsJobId</strong>, the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The returned object.</p>
     */
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
         * <p>The list of supported models.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        @NameInMap("AllowedModels")
        public String allowedModels;

        /**
         * <p>The business ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>The list of blocked models.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        @NameInMap("BlockedModels")
        public String blockedModels;

        /**
         * <p>Grants specific permissions to processes in the container. Only NET_ADMIN and NET_RAW are supported.</p>
         * <blockquote>
         * <p>NET_RAW is not supported by default. Submit a ticket to apply for this permission.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>adds2</p>
         */
        @NameInMap("Capability")
        public String capability;

        /**
         * <p>The maximum number of requests per day.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("DailyLimit")
        public Integer dailyLimit;

        /**
         * <p>The maximum number of tokens per day.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("DailyTokenLimit")
        public Long dailyTokenLimit;

        /**
         * <p>Indicates whether scheduled delivery of resource snapshots is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The extended configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;deliveryNodeName\&quot;:\&quot;绑定域名及发布\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Finish\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Provider\&quot;}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>16257</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The IP blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>121.41.11.161,10.200.255.60</p>
         */
        @NameInMap("IpBlacklist")
        public String ipBlacklist;

        /**
         * <p>The IP whitelist. Separate multiple IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>121.41.11.161,10.200.255.60</p>
         */
        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        /**
         * <p>The maximum number of requests per minute.</p>
         * 
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
         * <p>The reason for suspension.</p>
         * 
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
