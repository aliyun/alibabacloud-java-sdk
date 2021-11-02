// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChangeSlotStatusRequest extends TeaModel {
    @NameInMap("AdSlotCorporateStatus")
    public String adSlotCorporateStatus;

    @NameInMap("AdSlotId")
    public String adSlotId;

    @NameInMap("AdSlotStatus")
    public String adSlotStatus;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("Message")
    public String message;

    @NameInMap("MessageKey")
    public String messageKey;

    @NameInMap("OriginSiteUserId")
    public String originSiteUserId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static ChangeSlotStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSlotStatusRequest self = new ChangeSlotStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSlotStatusRequest setAdSlotCorporateStatus(String adSlotCorporateStatus) {
        this.adSlotCorporateStatus = adSlotCorporateStatus;
        return this;
    }
    public String getAdSlotCorporateStatus() {
        return this.adSlotCorporateStatus;
    }

    public ChangeSlotStatusRequest setAdSlotId(String adSlotId) {
        this.adSlotId = adSlotId;
        return this;
    }
    public String getAdSlotId() {
        return this.adSlotId;
    }

    public ChangeSlotStatusRequest setAdSlotStatus(String adSlotStatus) {
        this.adSlotStatus = adSlotStatus;
        return this;
    }
    public String getAdSlotStatus() {
        return this.adSlotStatus;
    }

    public ChangeSlotStatusRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ChangeSlotStatusRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ChangeSlotStatusRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ChangeSlotStatusRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeSlotStatusRequest setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }
    public String getMessageKey() {
        return this.messageKey;
    }

    public ChangeSlotStatusRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public ChangeSlotStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChangeSlotStatusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ChangeSlotStatusRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
