// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifySlotRequest extends TeaModel {
    @NameInMap("AdSlot")
    public java.util.Map<String, ?> adSlot;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("OriginSiteUserId")
    public String originSiteUserId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static ModifySlotRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySlotRequest self = new ModifySlotRequest();
        return TeaModel.build(map, self);
    }

    public ModifySlotRequest setAdSlot(java.util.Map<String, ?> adSlot) {
        this.adSlot = adSlot;
        return this;
    }
    public java.util.Map<String, ?> getAdSlot() {
        return this.adSlot;
    }

    public ModifySlotRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifySlotRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ModifySlotRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ModifySlotRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public ModifySlotRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifySlotRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ModifySlotRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
