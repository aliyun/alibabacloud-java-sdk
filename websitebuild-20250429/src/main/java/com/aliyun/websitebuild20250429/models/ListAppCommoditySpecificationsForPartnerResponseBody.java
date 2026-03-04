// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppCommoditySpecificationsForPartnerResponseBody extends TeaModel {
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
     * <p>spring-cloud-b</p>
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
    public ListAppCommoditySpecificationsForPartnerResponseBodyModule module;

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

    public static ListAppCommoditySpecificationsForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppCommoditySpecificationsForPartnerResponseBody self = new ListAppCommoditySpecificationsForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setModule(ListAppCommoditySpecificationsForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAppCommoditySpecificationsForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppCommoditySpecificationsForPartnerResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppCommoditySpecificationsForPartnerResponseBodyModule extends TeaModel {
        @NameInMap("Versions")
        public java.util.Map<String, ModuleVersionsValue> versions;

        public static ListAppCommoditySpecificationsForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppCommoditySpecificationsForPartnerResponseBodyModule self = new ListAppCommoditySpecificationsForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppCommoditySpecificationsForPartnerResponseBodyModule setVersions(java.util.Map<String, ModuleVersionsValue> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.Map<String, ModuleVersionsValue> getVersions() {
            return this.versions;
        }

    }

}
