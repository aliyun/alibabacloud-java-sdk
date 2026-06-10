// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceEntitlementResponseBody extends TeaModel {
    /**
     * <p>Permission denied information</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed</p>
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
     * <p>ish-intelligence-store-platform-admin-web</p>
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
     * <p>Dynamic error message, used to replace <code>%s</code> in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the request parameter <strong>DtsJobId</strong> is invalid.</p>
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
     * <p>Response data</p>
     */
    @NameInMap("Module")
    public GetAppInstanceEntitlementResponseBodyModule module;

    /**
     * <p>Id of the request</p>
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
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static GetAppInstanceEntitlementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceEntitlementResponseBody self = new GetAppInstanceEntitlementResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceEntitlementResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppInstanceEntitlementResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppInstanceEntitlementResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppInstanceEntitlementResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppInstanceEntitlementResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppInstanceEntitlementResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppInstanceEntitlementResponseBody setModule(GetAppInstanceEntitlementResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppInstanceEntitlementResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppInstanceEntitlementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppInstanceEntitlementResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppInstanceEntitlementResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppInstanceEntitlementResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppInstanceEntitlementResponseBodyModuleItems extends TeaModel {
        /**
         * <p>Indicates whether an instance has been assigned</p>
         */
        @NameInMap("Allocated")
        public Boolean allocated;

        /**
         * <p>Is this item currently active?</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Available")
        public Boolean available;

        /**
         * <p>Authorization item identity</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Indicates whether configuration has been completed</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Configured")
        public Boolean configured;

        /**
         * <p>Is this item entitled in the version?</p>
         */
        @NameInMap("Entitled")
        public Boolean entitled;

        /**
         * <p>Feature source type (PLUGIN/SKILL/CHANNEL/SYSTEM)</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FeatureType")
        public String featureType;

        /**
         * <p>Runtime instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2intl_public_intl-sg-i5c43rcpw04</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Authorization item Name</p>
         * 
         * <strong>example:</strong>
         * <p>4e46d24b56bfa944b5e6f2305715bc4e.jpg</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Plugin ID</p>
         * 
         * <strong>example:</strong>
         * <p>alipay-isv</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>Total quota</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Quota")
        public Long quota;

        /**
         * <p>Remaining quantity</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Remaining")
        public Long remaining;

        /**
         * <p>Resource domain association identity</p>
         * 
         * <strong>example:</strong>
         * <p>SmsCount</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>Resource type (QUOTA/LIMIT)</p>
         * 
         * <strong>example:</strong>
         * <p>filesystem</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>Is it running?</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Running")
        public Boolean running;

        /**
         * <p>Authorization Type (FEATURE / RESOURCE / RUNTIME)</p>
         * 
         * <strong>example:</strong>
         * <p>question</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Usage percentage</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsagePercent")
        public Integer usagePercent;

        /**
         * <p>Usage</p>
         * 
         * <strong>example:</strong>
         * <p>3295422523872</p>
         */
        @NameInMap("Used")
        public Long used;

        public static GetAppInstanceEntitlementResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceEntitlementResponseBodyModuleItems self = new GetAppInstanceEntitlementResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setAllocated(Boolean allocated) {
            this.allocated = allocated;
            return this;
        }
        public Boolean getAllocated() {
            return this.allocated;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setEntitled(Boolean entitled) {
            this.entitled = entitled;
            return this;
        }
        public Boolean getEntitled() {
            return this.entitled;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setQuota(Long quota) {
            this.quota = quota;
            return this;
        }
        public Long getQuota() {
            return this.quota;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setRemaining(Long remaining) {
            this.remaining = remaining;
            return this;
        }
        public Long getRemaining() {
            return this.remaining;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setResourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }
        public String getResourceCode() {
            return this.resourceCode;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setRunning(Boolean running) {
            this.running = running;
            return this;
        }
        public Boolean getRunning() {
            return this.running;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setUsagePercent(Integer usagePercent) {
            this.usagePercent = usagePercent;
            return this;
        }
        public Integer getUsagePercent() {
            return this.usagePercent;
        }

        public GetAppInstanceEntitlementResponseBodyModuleItems setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class GetAppInstanceEntitlementResponseBodyModule extends TeaModel {
        /**
         * <p>BizId of the associated application instance</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>All entitlements</p>
         */
        @NameInMap("Items")
        public java.util.List<GetAppInstanceEntitlementResponseBodyModuleItems> items;

        public static GetAppInstanceEntitlementResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceEntitlementResponseBodyModule self = new GetAppInstanceEntitlementResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceEntitlementResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetAppInstanceEntitlementResponseBodyModule setItems(java.util.List<GetAppInstanceEntitlementResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetAppInstanceEntitlementResponseBodyModuleItems> getItems() {
            return this.items;
        }

    }

}
