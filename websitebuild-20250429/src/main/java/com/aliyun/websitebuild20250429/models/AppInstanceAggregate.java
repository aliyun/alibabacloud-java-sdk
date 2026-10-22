// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppInstanceAggregate extends TeaModel {
    /**
     * <p>The list of AI agents associated with the application.</p>
     */
    @NameInMap("AiStaffList")
    public java.util.List<AppAiStaff> aiStaffList;

    /**
     * <p>The operation address of the application.</p>
     */
    @NameInMap("AppOperationAddress")
    public AppOperationAddress appOperationAddress;

    /**
     * <p>The list of service instances associated with the application.</p>
     */
    @NameInMap("AppServiceList")
    public java.util.List<AppServiceAggregate> appServiceList;

    /**
     * <p>The application subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>SEO_CONTENT</p>
     */
    @NameInMap("AppSubType")
    public String appSubType;

    /**
     * <p>The application type.</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSITE</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250915163734000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The build type.</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_DREAM_SAAS</p>
     */
    @NameInMap("BuildType")
    public String buildType;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01 00:00:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether the instance is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Deleted")
    public Integer deleted;

    /**
     * <p>The application description.</p>
     * 
     * <strong>example:</strong>
     * <p>base</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The business ID of the design specification.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801151731000007</p>
     */
    @NameInMap("DesignSpecBizId")
    public String designSpecBizId;

    /**
     * <p>The design specification ID.</p>
     */
    @NameInMap("DesignSpecId")
    public String designSpecId;

    /**
     * <p>The primary domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>stxycw.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-05T15:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the associated delivery order.</p>
     * 
     * <strong>example:</strong>
     * <p>p20202933455</p>
     */
    @NameInMap("EspBizId")
    public String espBizId;

    /**
     * <p>The deletion time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01 00:00:00</p>
     */
    @NameInMap("GmtDelete")
    public String gmtDelete;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-28T02:25:41Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The publication time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01 00:00:00</p>
     */
    @NameInMap("GmtPublish")
    public String gmtPublish;

    /**
     * <p>The URL of the application icon.</p>
     * 
     * <strong>example:</strong>
     * <p>icon/WS20250626112715000001/thumbnail.jpg</p>
     */
    @NameInMap("IconUrl")
    public String iconUrl;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>docs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The partner details.</p>
     */
    @NameInMap("PartnerDetail")
    public AppInstanceAggregatePartnerDetail partnerDetail;

    /**
     * <p>The configuration and runtime information of the application instance.</p>
     */
    @NameInMap("Profile")
    public AppInstanceProfile profile;

    /**
     * <p>The ID of the enterprise resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2smovqqpvuly</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The website domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd.scd.wanwang.xin</p>
     */
    @NameInMap("SiteHost")
    public String siteHost;

    /**
     * <p>The application identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>31104757</p>
     */
    @NameInMap("Slug")
    public String slug;

    /**
     * <p>The source type.</p>
     * 
     * <strong>example:</strong>
     * <p>MARKET_CLOUD_DREAM</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-24T10:10Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>trial,draft,live,refunded,expired,released</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The status text.</p>
     * 
     * <strong>example:</strong>
     * <p>Published</p>
     */
    @NameInMap("StatusText")
    public String statusText;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<AppInstanceAggregateTags> tags;

    /**
     * <p>The application template record information.</p>
     */
    @NameInMap("TemplateRecord")
    public TemplateRecord templateRecord;

    /**
     * <p>The URL of the application thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p>thumbnails/WS20250626112715000001/thumbnail.jpg</p>
     */
    @NameInMap("ThumbnailUrl")
    public String thumbnailUrl;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123241414</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The version.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-04-02</p>
     */
    @NameInMap("Version")
    public String version;

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

    public AppInstanceAggregate setPartnerDetail(AppInstanceAggregatePartnerDetail partnerDetail) {
        this.partnerDetail = partnerDetail;
        return this;
    }
    public AppInstanceAggregatePartnerDetail getPartnerDetail() {
        return this.partnerDetail;
    }

    public AppInstanceAggregate setProfile(AppInstanceProfile profile) {
        this.profile = profile;
        return this;
    }
    public AppInstanceProfile getProfile() {
        return this.profile;
    }

    public AppInstanceAggregate setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public AppInstanceAggregate setTags(java.util.List<AppInstanceAggregateTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<AppInstanceAggregateTags> getTags() {
        return this.tags;
    }

    public AppInstanceAggregate setTemplateRecord(TemplateRecord templateRecord) {
        this.templateRecord = templateRecord;
        return this;
    }
    public TemplateRecord getTemplateRecord() {
        return this.templateRecord;
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

    public AppInstanceAggregate setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class AppInstanceAggregatePartnerDetailBindData extends TeaModel {
        /**
         * <p>The external business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801153127000002</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1672123722000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>Wed Nov 26 10:15:28 CST 2025</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The record ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The primary key of the parent record.</p>
         * 
         * <strong>example:</strong>
         * <p>1123213</p>
         */
        @NameInMap("ParentPk")
        public String parentPk;

        /**
         * <p>The partner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("PartnerId")
        public String partnerId;

        /**
         * <p>The Alibaba Cloud account ID of the bound user.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static AppInstanceAggregatePartnerDetailBindData build(java.util.Map<String, ?> map) throws Exception {
            AppInstanceAggregatePartnerDetailBindData self = new AppInstanceAggregatePartnerDetailBindData();
            return TeaModel.build(map, self);
        }

        public AppInstanceAggregatePartnerDetailBindData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public AppInstanceAggregatePartnerDetailBindData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AppInstanceAggregatePartnerDetailBindData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AppInstanceAggregatePartnerDetailBindData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AppInstanceAggregatePartnerDetailBindData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public AppInstanceAggregatePartnerDetailBindData setParentPk(String parentPk) {
            this.parentPk = parentPk;
            return this;
        }
        public String getParentPk() {
            return this.parentPk;
        }

        public AppInstanceAggregatePartnerDetailBindData setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public AppInstanceAggregatePartnerDetailBindData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class AppInstanceAggregatePartnerDetail extends TeaModel {
        /**
         * <p>data</p>
         */
        @NameInMap("BindData")
        public AppInstanceAggregatePartnerDetailBindData bindData;

        /**
         * <p>The partner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("PartnerId")
        public String partnerId;

        /**
         * <p>The partner binding status. Valid values: BOUND (bound) and UNBOUND (unbound).</p>
         * 
         * <strong>example:</strong>
         * <p>BOUND</p>
         */
        @NameInMap("Status")
        public String status;

        public static AppInstanceAggregatePartnerDetail build(java.util.Map<String, ?> map) throws Exception {
            AppInstanceAggregatePartnerDetail self = new AppInstanceAggregatePartnerDetail();
            return TeaModel.build(map, self);
        }

        public AppInstanceAggregatePartnerDetail setBindData(AppInstanceAggregatePartnerDetailBindData bindData) {
            this.bindData = bindData;
            return this;
        }
        public AppInstanceAggregatePartnerDetailBindData getBindData() {
            return this.bindData;
        }

        public AppInstanceAggregatePartnerDetail setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public AppInstanceAggregatePartnerDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class AppInstanceAggregateTags extends TeaModel {
        /**
         * <p>The tag key of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>. If you specify this parameter, it cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Group</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>. If you specify this parameter, it can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ufo</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static AppInstanceAggregateTags build(java.util.Map<String, ?> map) throws Exception {
            AppInstanceAggregateTags self = new AppInstanceAggregateTags();
            return TeaModel.build(map, self);
        }

        public AppInstanceAggregateTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public AppInstanceAggregateTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
