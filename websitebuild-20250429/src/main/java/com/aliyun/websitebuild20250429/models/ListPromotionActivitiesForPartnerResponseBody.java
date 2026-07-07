// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListPromotionActivitiesForPartnerResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
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
     * <p>spring-cloud-b</p>
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
     * <p>The dynamic message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error arguments.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The number of entries per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListPromotionActivitiesForPartnerResponseBodyModule module;

    /**
     * <p>The token for the next query. This parameter is empty if no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>The root error message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request is processed synchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListPromotionActivitiesForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPromotionActivitiesForPartnerResponseBody self = new ListPromotionActivitiesForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPromotionActivitiesForPartnerResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListPromotionActivitiesForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListPromotionActivitiesForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListPromotionActivitiesForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListPromotionActivitiesForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListPromotionActivitiesForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListPromotionActivitiesForPartnerResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPromotionActivitiesForPartnerResponseBody setModule(ListPromotionActivitiesForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListPromotionActivitiesForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public ListPromotionActivitiesForPartnerResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPromotionActivitiesForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPromotionActivitiesForPartnerResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListPromotionActivitiesForPartnerResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListPromotionActivitiesForPartnerResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListPromotionActivitiesForPartnerResponseBodyModuleActivities extends TeaModel {
        /**
         * <p>The activity code.</p>
         * 
         * <strong>example:</strong>
         * <p>acwfradoj5u</p>
         */
        @NameInMap("ActivityCode")
        public String activityCode;

        /**
         * <p>The activity name.</p>
         * 
         * <strong>example:</strong>
         * <p>IP网段过滤统计</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The activity type.</p>
         * 
         * <strong>example:</strong>
         * <p>SCALE_IN</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        /**
         * <p>The consumed quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ConsumedQuota")
        public Long consumedQuota;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-14 11:57:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user who created the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>onlinehoztestrolebasicallow1755461756261068111(300216315676902267)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The eligibility configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("EligibilityConfig")
        public String eligibilityConfig;

        /**
         * <p>The end date.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-22 10:18:51 +0800</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The offer configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OfferConfig")
        public String offerConfig;

        /**
         * <p>The offer configuration summary.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OfferConfigSummary")
        public String offerConfigSummary;

        /**
         * <p>The remaining quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RemainingQuota")
        public Long remainingQuota;

        /**
         * <p>The start date.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-12T16:00:00.000Z</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The activity status.</p>
         * 
         * <strong>example:</strong>
         * <p>FE_ABORTING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalQuota")
        public Long totalQuota;

        /**
         * <p>The touchpoint configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("TouchpointConfig")
        public String touchpointConfig;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-11T21:13:38.164526965+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The user who last updated the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>123414</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The warning threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WarningThreshold")
        public Integer warningThreshold;

        public static ListPromotionActivitiesForPartnerResponseBodyModuleActivities build(java.util.Map<String, ?> map) throws Exception {
            ListPromotionActivitiesForPartnerResponseBodyModuleActivities self = new ListPromotionActivitiesForPartnerResponseBodyModuleActivities();
            return TeaModel.build(map, self);
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setActivityCode(String activityCode) {
            this.activityCode = activityCode;
            return this;
        }
        public String getActivityCode() {
            return this.activityCode;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setConsumedQuota(Long consumedQuota) {
            this.consumedQuota = consumedQuota;
            return this;
        }
        public Long getConsumedQuota() {
            return this.consumedQuota;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setEligibilityConfig(String eligibilityConfig) {
            this.eligibilityConfig = eligibilityConfig;
            return this;
        }
        public String getEligibilityConfig() {
            return this.eligibilityConfig;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setOfferConfig(String offerConfig) {
            this.offerConfig = offerConfig;
            return this;
        }
        public String getOfferConfig() {
            return this.offerConfig;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setOfferConfigSummary(String offerConfigSummary) {
            this.offerConfigSummary = offerConfigSummary;
            return this;
        }
        public String getOfferConfigSummary() {
            return this.offerConfigSummary;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setRemainingQuota(Long remainingQuota) {
            this.remainingQuota = remainingQuota;
            return this;
        }
        public Long getRemainingQuota() {
            return this.remainingQuota;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setTouchpointConfig(String touchpointConfig) {
            this.touchpointConfig = touchpointConfig;
            return this;
        }
        public String getTouchpointConfig() {
            return this.touchpointConfig;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModuleActivities setWarningThreshold(Integer warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public Integer getWarningThreshold() {
            return this.warningThreshold;
        }

    }

    public static class ListPromotionActivitiesForPartnerResponseBodyModule extends TeaModel {
        /**
         * <p>The list of promotional activities.</p>
         */
        @NameInMap("Activities")
        public java.util.List<ListPromotionActivitiesForPartnerResponseBodyModuleActivities> activities;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPromotionActivitiesForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListPromotionActivitiesForPartnerResponseBodyModule self = new ListPromotionActivitiesForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListPromotionActivitiesForPartnerResponseBodyModule setActivities(java.util.List<ListPromotionActivitiesForPartnerResponseBodyModuleActivities> activities) {
            this.activities = activities;
            return this;
        }
        public java.util.List<ListPromotionActivitiesForPartnerResponseBodyModuleActivities> getActivities() {
            return this.activities;
        }

        public ListPromotionActivitiesForPartnerResponseBodyModule setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
