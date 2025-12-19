// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppInstance extends TeaModel {
    @NameInMap("AppSubType")
    public String appSubType;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BuildType")
    public String buildType;

    @NameInMap("Deleted")
    public Integer deleted;

    @NameInMap("Description")
    public String description;

    @NameInMap("DesignSpecBizId")
    public String designSpecBizId;

    @NameInMap("DesignSpecId")
    public String designSpecId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EspBizId")
    public String espBizId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtDelete")
    public String gmtDelete;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("GmtPublish")
    public String gmtPublish;

    @NameInMap("IconUrl")
    public String iconUrl;

    @NameInMap("Name")
    public String name;

    @NameInMap("Profile")
    public AppInstanceProfile profile;

    @NameInMap("SiteHost")
    public String siteHost;

    @NameInMap("Slug")
    public String slug;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>trial,draft,live,refunded,expired,released</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("StatusText")
    public String statusText;

    @NameInMap("ThumbnailUrl")
    public String thumbnailUrl;

    @NameInMap("UserId")
    public String userId;

    public static AppInstance build(java.util.Map<String, ?> map) throws Exception {
        AppInstance self = new AppInstance();
        return TeaModel.build(map, self);
    }

    public AppInstance setAppSubType(String appSubType) {
        this.appSubType = appSubType;
        return this;
    }
    public String getAppSubType() {
        return this.appSubType;
    }

    public AppInstance setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AppInstance setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppInstance setBuildType(String buildType) {
        this.buildType = buildType;
        return this;
    }
    public String getBuildType() {
        return this.buildType;
    }

    public AppInstance setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }
    public Integer getDeleted() {
        return this.deleted;
    }

    public AppInstance setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppInstance setDesignSpecBizId(String designSpecBizId) {
        this.designSpecBizId = designSpecBizId;
        return this;
    }
    public String getDesignSpecBizId() {
        return this.designSpecBizId;
    }

    public AppInstance setDesignSpecId(String designSpecId) {
        this.designSpecId = designSpecId;
        return this;
    }
    public String getDesignSpecId() {
        return this.designSpecId;
    }

    public AppInstance setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AppInstance setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AppInstance setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public AppInstance setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppInstance setGmtDelete(String gmtDelete) {
        this.gmtDelete = gmtDelete;
        return this;
    }
    public String getGmtDelete() {
        return this.gmtDelete;
    }

    public AppInstance setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppInstance setGmtPublish(String gmtPublish) {
        this.gmtPublish = gmtPublish;
        return this;
    }
    public String getGmtPublish() {
        return this.gmtPublish;
    }

    public AppInstance setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public AppInstance setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppInstance setProfile(AppInstanceProfile profile) {
        this.profile = profile;
        return this;
    }
    public AppInstanceProfile getProfile() {
        return this.profile;
    }

    public AppInstance setSiteHost(String siteHost) {
        this.siteHost = siteHost;
        return this;
    }
    public String getSiteHost() {
        return this.siteHost;
    }

    public AppInstance setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public AppInstance setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public AppInstance setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AppInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppInstance setStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }
    public String getStatusText() {
        return this.statusText;
    }

    public AppInstance setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public AppInstance setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
