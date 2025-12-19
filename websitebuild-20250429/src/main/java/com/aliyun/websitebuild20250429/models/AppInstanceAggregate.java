// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppInstanceAggregate extends TeaModel {
    @NameInMap("AiStaffList")
    public java.util.List<AppAiStaff> aiStaffList;

    @NameInMap("AppOperationAddress")
    public AppOperationAddress appOperationAddress;

    @NameInMap("AppServiceList")
    public java.util.List<AppServiceAggregate> appServiceList;

    @NameInMap("AppSubType")
    public String appSubType;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BuildType")
    public String buildType;

    @NameInMap("CreateTime")
    public String createTime;

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

    public static AppInstanceAggregate build(java.util.Map<String, ?> map) throws Exception {
        AppInstanceAggregate self = new AppInstanceAggregate();
        return TeaModel.build(map, self);
    }

    public AppInstanceAggregate setAiStaffList(java.util.List<AppAiStaff> aiStaffList) {
        this.aiStaffList = aiStaffList;
        return this;
    }
    public java.util.List<AppAiStaff> getAiStaffList() {
        return this.aiStaffList;
    }

    public AppInstanceAggregate setAppOperationAddress(AppOperationAddress appOperationAddress) {
        this.appOperationAddress = appOperationAddress;
        return this;
    }
    public AppOperationAddress getAppOperationAddress() {
        return this.appOperationAddress;
    }

    public AppInstanceAggregate setAppServiceList(java.util.List<AppServiceAggregate> appServiceList) {
        this.appServiceList = appServiceList;
        return this;
    }
    public java.util.List<AppServiceAggregate> getAppServiceList() {
        return this.appServiceList;
    }

    public AppInstanceAggregate setAppSubType(String appSubType) {
        this.appSubType = appSubType;
        return this;
    }
    public String getAppSubType() {
        return this.appSubType;
    }

    public AppInstanceAggregate setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AppInstanceAggregate setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppInstanceAggregate setBuildType(String buildType) {
        this.buildType = buildType;
        return this;
    }
    public String getBuildType() {
        return this.buildType;
    }

    public AppInstanceAggregate setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AppInstanceAggregate setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }
    public Integer getDeleted() {
        return this.deleted;
    }

    public AppInstanceAggregate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppInstanceAggregate setDesignSpecBizId(String designSpecBizId) {
        this.designSpecBizId = designSpecBizId;
        return this;
    }
    public String getDesignSpecBizId() {
        return this.designSpecBizId;
    }

    public AppInstanceAggregate setDesignSpecId(String designSpecId) {
        this.designSpecId = designSpecId;
        return this;
    }
    public String getDesignSpecId() {
        return this.designSpecId;
    }

    public AppInstanceAggregate setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AppInstanceAggregate setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AppInstanceAggregate setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public AppInstanceAggregate setGmtDelete(String gmtDelete) {
        this.gmtDelete = gmtDelete;
        return this;
    }
    public String getGmtDelete() {
        return this.gmtDelete;
    }

    public AppInstanceAggregate setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppInstanceAggregate setGmtPublish(String gmtPublish) {
        this.gmtPublish = gmtPublish;
        return this;
    }
    public String getGmtPublish() {
        return this.gmtPublish;
    }

    public AppInstanceAggregate setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public AppInstanceAggregate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppInstanceAggregate setProfile(AppInstanceProfile profile) {
        this.profile = profile;
        return this;
    }
    public AppInstanceProfile getProfile() {
        return this.profile;
    }

    public AppInstanceAggregate setSiteHost(String siteHost) {
        this.siteHost = siteHost;
        return this;
    }
    public String getSiteHost() {
        return this.siteHost;
    }

    public AppInstanceAggregate setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public AppInstanceAggregate setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public AppInstanceAggregate setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AppInstanceAggregate setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppInstanceAggregate setStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }
    public String getStatusText() {
        return this.statusText;
    }

    public AppInstanceAggregate setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public AppInstanceAggregate setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
