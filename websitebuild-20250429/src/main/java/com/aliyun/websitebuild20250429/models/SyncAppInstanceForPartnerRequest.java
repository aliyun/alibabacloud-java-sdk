// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SyncAppInstanceForPartnerRequest extends TeaModel {
    /**
     * <p>Application instance object data</p>
     */
    @NameInMap("AppInstance")
    public SyncAppInstanceForPartnerRequestAppInstance appInstance;

    /**
     * <p>Type of system event. CREATE, UPDATE, COMPLETE</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>Operator ID</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Source business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31104757</p>
     */
    @NameInMap("SourceBizId")
    public String sourceBizId;

    /**
     * <p>Source: MARKET_CLOUD_DREAM</p>
     * 
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
         * <p>Deployment region</p>
         * 
         * <strong>example:</strong>
         * <p>ChineseMainland</p>
         */
        @NameInMap("DeployArea")
        public String deployArea;

        /**
         * <p>Lingxiao instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>12313213</p>
         */
        @NameInMap("LxInstanceId")
        public String lxInstanceId;

        /**
         * <p>Order ID</p>
         * 
         * <strong>example:</strong>
         * <p>222217928591</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>Version</p>
         * 
         * <strong>example:</strong>
         * <p>Basic_Edition</p>
         */
        @NameInMap("SiteVersion")
        public String siteVersion;

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>DC4D30B7BADDAFE9928A6C36416A2A4C</p>
         */
        @NameInMap("TemplateEtag")
        public String templateEtag;

        /**
         * <p>Model template ID</p>
         * 
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
         * <p>Application Type: WEBSITE</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSITE</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>Website business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250711094503000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>Logical deletion</p>
         * 
         * <strong>example:</strong>
         * <p>fase</p>
         */
        @NameInMap("Deleted")
        public String deleted;

        /**
         * <p>Domain name</p>
         * 
         * <strong>example:</strong>
         * <p>alliveout.xntv.tv</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Event end time (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-23T02:14:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Deletion time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("GmtDelete")
        public String gmtDelete;

        /**
         * <p>Vulnerability published UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("GmtPublish")
        public String gmtPublish;

        /**
         * <p>Application icon URL.</p>
         * 
         * <strong>example:</strong>
         * <p>icon/WS20250626112715000001/thumbnail.jpg</p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <p>Website name</p>
         * 
         * <strong>example:</strong>
         * <p>AI建站</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Website configuration information</p>
         * 
         * <strong>example:</strong>
         * <p>网站配置信息</p>
         */
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
         * <p>Website SiteID</p>
         * 
         * <strong>example:</strong>
         * <p>31104757</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <p>Query start time. If no start and end times are provided, all historical deployment records of the instance are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-15T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Instance running status.  </p>
         * <ul>
         * <li>NotRun: Not running  </li>
         * <li>Running: Running  </li>
         * <li>WaitTime: Waiting for TriggerTime  </li>
         * <li>CheckingCondition: Checking branch conditions  </li>
         * <li>WaitResource: Waiting for resources  </li>
         * <li>Failure: Execution failed  </li>
         * <li>Success: Execution succeeded  </li>
         * <li>Checking: Sent to Data Quality check</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Phase\&quot;: \&quot;Running\&quot;, \&quot;SlotNum\&quot;: 1, \&quot;UsedCapacity\&quot;: \&quot;500.0Gi\&quot;}</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Thumbnail URL.</p>
         * 
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
