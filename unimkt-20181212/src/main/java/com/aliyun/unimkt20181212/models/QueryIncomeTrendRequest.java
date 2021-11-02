// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryIncomeTrendRequest extends TeaModel {
    @NameInMap("AdSlotId")
    public String adSlotId;

    @NameInMap("AdSlotName")
    public String adSlotName;

    @NameInMap("AdSlotType")
    public String adSlotType;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("Dimension")
    public String dimension;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaName")
    public java.util.Map<String, ?> mediaName;

    @NameInMap("OriginSiteUserId")
    public String originSiteUserId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("Slot")
    public Long slot;

    @NameInMap("SlotDimension")
    public String slotDimension;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static QueryIncomeTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncomeTrendRequest self = new QueryIncomeTrendRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncomeTrendRequest setAdSlotId(String adSlotId) {
        this.adSlotId = adSlotId;
        return this;
    }
    public String getAdSlotId() {
        return this.adSlotId;
    }

    public QueryIncomeTrendRequest setAdSlotName(String adSlotName) {
        this.adSlotName = adSlotName;
        return this;
    }
    public String getAdSlotName() {
        return this.adSlotName;
    }

    public QueryIncomeTrendRequest setAdSlotType(String adSlotType) {
        this.adSlotType = adSlotType;
        return this;
    }
    public String getAdSlotType() {
        return this.adSlotType;
    }

    public QueryIncomeTrendRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryIncomeTrendRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public QueryIncomeTrendRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public QueryIncomeTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryIncomeTrendRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public QueryIncomeTrendRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public QueryIncomeTrendRequest setMediaName(java.util.Map<String, ?> mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public java.util.Map<String, ?> getMediaName() {
        return this.mediaName;
    }

    public QueryIncomeTrendRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public QueryIncomeTrendRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryIncomeTrendRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryIncomeTrendRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryIncomeTrendRequest setSlot(Long slot) {
        this.slot = slot;
        return this;
    }
    public Long getSlot() {
        return this.slot;
    }

    public QueryIncomeTrendRequest setSlotDimension(String slotDimension) {
        this.slotDimension = slotDimension;
        return this;
    }
    public String getSlotDimension() {
        return this.slotDimension;
    }

    public QueryIncomeTrendRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryIncomeTrendRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIncomeTrendRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIncomeTrendRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
