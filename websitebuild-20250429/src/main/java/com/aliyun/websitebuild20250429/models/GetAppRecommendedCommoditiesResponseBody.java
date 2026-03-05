// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppRecommendedCommoditiesResponseBody extends TeaModel {
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
    public GetAppRecommendedCommoditiesResponseBodyModule module;

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

    public static GetAppRecommendedCommoditiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppRecommendedCommoditiesResponseBody self = new GetAppRecommendedCommoditiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppRecommendedCommoditiesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppRecommendedCommoditiesResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppRecommendedCommoditiesResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppRecommendedCommoditiesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppRecommendedCommoditiesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppRecommendedCommoditiesResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppRecommendedCommoditiesResponseBody setModule(GetAppRecommendedCommoditiesResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppRecommendedCommoditiesResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppRecommendedCommoditiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppRecommendedCommoditiesResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppRecommendedCommoditiesResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppRecommendedCommoditiesResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppRecommendedCommoditiesResponseBodyModuleCommodities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("Extend")
        public java.util.Map<String, String> extend;

        /**
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("PromotionCommodityId")
        public String promotionCommodityId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ecs-workbench-disposable.aliyun.com/account/disposable/login/sst/1291612921555690/edvo2gevfh">https://ecs-workbench-disposable.aliyun.com/account/disposable/login/sst/1291612921555690/edvo2gevfh</a></p>
         */
        @NameInMap("RedirectUrl")
        public String redirectUrl;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAppRecommendedCommoditiesResponseBodyModuleCommodities build(java.util.Map<String, ?> map) throws Exception {
            GetAppRecommendedCommoditiesResponseBodyModuleCommodities self = new GetAppRecommendedCommoditiesResponseBodyModuleCommodities();
            return TeaModel.build(map, self);
        }

        public GetAppRecommendedCommoditiesResponseBodyModuleCommodities setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetAppRecommendedCommoditiesResponseBodyModuleCommodities setExtend(java.util.Map<String, String> extend) {
            this.extend = extend;
            return this;
        }
        public java.util.Map<String, String> getExtend() {
            return this.extend;
        }

        public GetAppRecommendedCommoditiesResponseBodyModuleCommodities setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetAppRecommendedCommoditiesResponseBodyModuleCommodities setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetAppRecommendedCommoditiesResponseBodyModuleCommodities setPromotionCommodityId(String promotionCommodityId) {
            this.promotionCommodityId = promotionCommodityId;
            return this;
        }
        public String getPromotionCommodityId() {
            return this.promotionCommodityId;
        }

        public GetAppRecommendedCommoditiesResponseBodyModuleCommodities setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public GetAppRecommendedCommoditiesResponseBodyModuleCommodities setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetAppRecommendedCommoditiesResponseBodyModule extends TeaModel {
        @NameInMap("Commodities")
        public java.util.List<GetAppRecommendedCommoditiesResponseBodyModuleCommodities> commodities;

        public static GetAppRecommendedCommoditiesResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppRecommendedCommoditiesResponseBodyModule self = new GetAppRecommendedCommoditiesResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppRecommendedCommoditiesResponseBodyModule setCommodities(java.util.List<GetAppRecommendedCommoditiesResponseBodyModuleCommodities> commodities) {
            this.commodities = commodities;
            return this;
        }
        public java.util.List<GetAppRecommendedCommoditiesResponseBodyModuleCommodities> getCommodities() {
            return this.commodities;
        }

    }

}
