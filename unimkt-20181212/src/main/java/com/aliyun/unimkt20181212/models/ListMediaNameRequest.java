// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListMediaNameRequest extends TeaModel {
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
    public java.util.Map<String, ?> mediaName;

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

    public static ListMediaNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaNameRequest self = new ListMediaNameRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaNameRequest setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }
    public String getAccessStatus() {
        return this.accessStatus;
    }

    public ListMediaNameRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMediaNameRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ListMediaNameRequest setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    public ListMediaNameRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListMediaNameRequest setFirstScene(String firstScene) {
        this.firstScene = firstScene;
        return this;
    }
    public String getFirstScene() {
        return this.firstScene;
    }

    public ListMediaNameRequest setMediaName(java.util.Map<String, ?> mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public java.util.Map<String, ?> getMediaName() {
        return this.mediaName;
    }

    public ListMediaNameRequest setMediaStatus(String mediaStatus) {
        this.mediaStatus = mediaStatus;
        return this;
    }
    public String getMediaStatus() {
        return this.mediaStatus;
    }

    public ListMediaNameRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListMediaNameRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public ListMediaNameRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListMediaNameRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMediaNameRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMediaNameRequest setSecondScene(String secondScene) {
        this.secondScene = secondScene;
        return this;
    }
    public String getSecondScene() {
        return this.secondScene;
    }

    public ListMediaNameRequest setStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }
    public Long getStartCreateTime() {
        return this.startCreateTime;
    }

    public ListMediaNameRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListMediaNameRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListMediaNameRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
