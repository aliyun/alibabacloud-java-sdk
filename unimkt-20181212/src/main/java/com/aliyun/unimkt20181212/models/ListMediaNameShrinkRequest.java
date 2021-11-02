// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListMediaNameShrinkRequest extends TeaModel {
    @NameInMap("AccessStatus")
    public String accessStatus;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("FirstScene")
    public String firstScene;

    @NameInMap("MediaName")
    public String mediaNameShrink;

    @NameInMap("MediaStatus")
    public String mediaStatus;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OriginSiteUserId")
    public String originSiteUserId;

    @NameInMap("Os")
    public String os;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecondScene")
    public String secondScene;

    @NameInMap("StartCreateTime")
    public Long startCreateTime;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static ListMediaNameShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaNameShrinkRequest self = new ListMediaNameShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaNameShrinkRequest setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }
    public String getAccessStatus() {
        return this.accessStatus;
    }

    public ListMediaNameShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMediaNameShrinkRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ListMediaNameShrinkRequest setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    public ListMediaNameShrinkRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListMediaNameShrinkRequest setFirstScene(String firstScene) {
        this.firstScene = firstScene;
        return this;
    }
    public String getFirstScene() {
        return this.firstScene;
    }

    public ListMediaNameShrinkRequest setMediaNameShrink(String mediaNameShrink) {
        this.mediaNameShrink = mediaNameShrink;
        return this;
    }
    public String getMediaNameShrink() {
        return this.mediaNameShrink;
    }

    public ListMediaNameShrinkRequest setMediaStatus(String mediaStatus) {
        this.mediaStatus = mediaStatus;
        return this;
    }
    public String getMediaStatus() {
        return this.mediaStatus;
    }

    public ListMediaNameShrinkRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListMediaNameShrinkRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public ListMediaNameShrinkRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListMediaNameShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMediaNameShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMediaNameShrinkRequest setSecondScene(String secondScene) {
        this.secondScene = secondScene;
        return this;
    }
    public String getSecondScene() {
        return this.secondScene;
    }

    public ListMediaNameShrinkRequest setStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }
    public Long getStartCreateTime() {
        return this.startCreateTime;
    }

    public ListMediaNameShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListMediaNameShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListMediaNameShrinkRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
