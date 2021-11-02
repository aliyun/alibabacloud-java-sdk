// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListSlotRequest extends TeaModel {
    @NameInMap("AdSlotCorporateStatus")
    public String adSlotCorporateStatus;

    @NameInMap("AdSlotId")
    public String adSlotId;

    @NameInMap("AdSlotName")
    public String adSlotName;

    @NameInMap("AdSlotStatus")
    public String adSlotStatus;

    @NameInMap("AdSlotType")
    public String adSlotType;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaName")
    public String mediaName;

    @NameInMap("OriginSiteUserId")
    public String originSiteUserId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartCreateTime")
    public Long startCreateTime;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static ListSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlotRequest self = new ListSlotRequest();
        return TeaModel.build(map, self);
    }

    public ListSlotRequest setAdSlotCorporateStatus(String adSlotCorporateStatus) {
        this.adSlotCorporateStatus = adSlotCorporateStatus;
        return this;
    }
    public String getAdSlotCorporateStatus() {
        return this.adSlotCorporateStatus;
    }

    public ListSlotRequest setAdSlotId(String adSlotId) {
        this.adSlotId = adSlotId;
        return this;
    }
    public String getAdSlotId() {
        return this.adSlotId;
    }

    public ListSlotRequest setAdSlotName(String adSlotName) {
        this.adSlotName = adSlotName;
        return this;
    }
    public String getAdSlotName() {
        return this.adSlotName;
    }

    public ListSlotRequest setAdSlotStatus(String adSlotStatus) {
        this.adSlotStatus = adSlotStatus;
        return this;
    }
    public String getAdSlotStatus() {
        return this.adSlotStatus;
    }

    public ListSlotRequest setAdSlotType(String adSlotType) {
        this.adSlotType = adSlotType;
        return this;
    }
    public String getAdSlotType() {
        return this.adSlotType;
    }

    public ListSlotRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSlotRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ListSlotRequest setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    public ListSlotRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListSlotRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public ListSlotRequest setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public ListSlotRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public ListSlotRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSlotRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSlotRequest setStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }
    public Long getStartCreateTime() {
        return this.startCreateTime;
    }

    public ListSlotRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListSlotRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListSlotRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
