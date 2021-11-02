// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryIncomeDataRequest extends TeaModel {
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

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static QueryIncomeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncomeDataRequest self = new QueryIncomeDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncomeDataRequest setAdSlotId(String adSlotId) {
        this.adSlotId = adSlotId;
        return this;
    }
    public String getAdSlotId() {
        return this.adSlotId;
    }

    public QueryIncomeDataRequest setAdSlotName(String adSlotName) {
        this.adSlotName = adSlotName;
        return this;
    }
    public String getAdSlotName() {
        return this.adSlotName;
    }

    public QueryIncomeDataRequest setAdSlotType(String adSlotType) {
        this.adSlotType = adSlotType;
        return this;
    }
    public String getAdSlotType() {
        return this.adSlotType;
    }

    public QueryIncomeDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryIncomeDataRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public QueryIncomeDataRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public QueryIncomeDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryIncomeDataRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public QueryIncomeDataRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public QueryIncomeDataRequest setMediaName(java.util.Map<String, ?> mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public java.util.Map<String, ?> getMediaName() {
        return this.mediaName;
    }

    public QueryIncomeDataRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public QueryIncomeDataRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryIncomeDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryIncomeDataRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIncomeDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIncomeDataRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
