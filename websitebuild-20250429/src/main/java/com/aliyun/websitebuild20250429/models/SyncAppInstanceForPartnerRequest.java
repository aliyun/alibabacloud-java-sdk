// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SyncAppInstanceForPartnerRequest extends TeaModel {
    @NameInMap("AppInstance")
    public SyncAppInstanceForPartnerRequestAppInstance appInstance;

    /**
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <strong>example:</strong>
     * <p>31104757</p>
     */
    @NameInMap("SourceBizId")
    public String sourceBizId;

    /**
     * <strong>example:</strong>
     * <p>MARKET_CLOUD_DREAM</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static SyncAppInstanceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAppInstanceForPartnerRequest self = new SyncAppInstanceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public SyncAppInstanceForPartnerRequest setAppInstance(SyncAppInstanceForPartnerRequestAppInstance appInstance) {
        this.appInstance = appInstance;
        return this;
    }
    public SyncAppInstanceForPartnerRequestAppInstance getAppInstance() {
        return this.appInstance;
    }

    public SyncAppInstanceForPartnerRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public SyncAppInstanceForPartnerRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SyncAppInstanceForPartnerRequest setSourceBizId(String sourceBizId) {
        this.sourceBizId = sourceBizId;
        return this;
    }
    public String getSourceBizId() {
        return this.sourceBizId;
    }

    public SyncAppInstanceForPartnerRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class SyncAppInstanceForPartnerRequestAppInstanceProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ChineseMainland</p>
         */
        @NameInMap("DeployArea")
        public String deployArea;

        /**
         * <strong>example:</strong>
         * <p>12313213</p>
         */
        @NameInMap("LxInstanceId")
        public String lxInstanceId;

        /**
         * <strong>example:</strong>
         * <p>222217928591</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>Basic_Edition</p>
         */
        @NameInMap("SiteVersion")
        public String siteVersion;

        /**
         * <strong>example:</strong>
         * <p>DC4D30B7BADDAFE9928A6C36416A2A4C</p>
         */
        @NameInMap("TemplateEtag")
        public String templateEtag;

        /**
         * <strong>example:</strong>
         * <p>ST20211231160247sYG4</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static SyncAppInstanceForPartnerRequestAppInstanceProfile build(java.util.Map<String, ?> map) throws Exception {
            SyncAppInstanceForPartnerRequestAppInstanceProfile self = new SyncAppInstanceForPartnerRequestAppInstanceProfile();
            return TeaModel.build(map, self);
        }

        public SyncAppInstanceForPartnerRequestAppInstanceProfile setDeployArea(String deployArea) {
            this.deployArea = deployArea;
            return this;
        }
        public String getDeployArea() {
            return this.deployArea;
        }

        public SyncAppInstanceForPartnerRequestAppInstanceProfile setLxInstanceId(String lxInstanceId) {
            this.lxInstanceId = lxInstanceId;
            return this;
        }
        public String getLxInstanceId() {
            return this.lxInstanceId;
        }

        public SyncAppInstanceForPartnerRequestAppInstanceProfile setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public SyncAppInstanceForPartnerRequestAppInstanceProfile setSiteVersion(String siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public String getSiteVersion() {
            return this.siteVersion;
        }

        public SyncAppInstanceForPartnerRequestAppInstanceProfile setTemplateEtag(String templateEtag) {
            this.templateEtag = templateEtag;
            return this;
        }
        public String getTemplateEtag() {
            return this.templateEtag;
        }

        public SyncAppInstanceForPartnerRequestAppInstanceProfile setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class SyncAppInstanceForPartnerRequestAppInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>WEBSITE</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>WD20250711094503000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>fase</p>
         */
        @NameInMap("Deleted")
        public String deleted;

        /**
         * <strong>example:</strong>
         * <p>alliveout.xntv.tv</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>2024-08-23T02:14:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("GmtDelete")
        public String gmtDelete;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("GmtPublish")
        public String gmtPublish;

        /**
         * <strong>example:</strong>
         * <p>icon/WS20250626112715000001/thumbnail.jpg</p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Profile")
        public SyncAppInstanceForPartnerRequestAppInstanceProfile profile;

        /**
         * <p>siteId</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx.scd.wezhan.cn</p>
         */
        @NameInMap("SiteHost")
        public String siteHost;

        /**
         * <strong>example:</strong>
         * <p>31104757</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <strong>example:</strong>
         * <p>2025-07-15T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Phase\&quot;: \&quot;Running\&quot;, \&quot;SlotNum\&quot;: 1, \&quot;UsedCapacity\&quot;: \&quot;500.0Gi\&quot;}</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>thumbnails/WS20250626112715000001/thumbnail.jpg</p>
         */
        @NameInMap("ThumbnailUrl")
        public String thumbnailUrl;

        /**
         * <p>123123123131232</p>
         * 
         * <strong>example:</strong>
         * <p>12313213131</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static SyncAppInstanceForPartnerRequestAppInstance build(java.util.Map<String, ?> map) throws Exception {
            SyncAppInstanceForPartnerRequestAppInstance self = new SyncAppInstanceForPartnerRequestAppInstance();
            return TeaModel.build(map, self);
        }

        public SyncAppInstanceForPartnerRequestAppInstance setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setGmtDelete(String gmtDelete) {
            this.gmtDelete = gmtDelete;
            return this;
        }
        public String getGmtDelete() {
            return this.gmtDelete;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setGmtPublish(String gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }
        public String getGmtPublish() {
            return this.gmtPublish;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setProfile(SyncAppInstanceForPartnerRequestAppInstanceProfile profile) {
            this.profile = profile;
            return this;
        }
        public SyncAppInstanceForPartnerRequestAppInstanceProfile getProfile() {
            return this.profile;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setSiteHost(String siteHost) {
            this.siteHost = siteHost;
            return this;
        }
        public String getSiteHost() {
            return this.siteHost;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public SyncAppInstanceForPartnerRequestAppInstance setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
