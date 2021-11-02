// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifyTenantInfoShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("OriginSiteUserId")
    public String originSiteUserId;

    @NameInMap("Tenant")
    public String tenantShrink;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static ModifyTenantInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInfoShrinkRequest self = new ModifyTenantInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInfoShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyTenantInfoShrinkRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ModifyTenantInfoShrinkRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ModifyTenantInfoShrinkRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public ModifyTenantInfoShrinkRequest setTenantShrink(String tenantShrink) {
        this.tenantShrink = tenantShrink;
        return this;
    }
    public String getTenantShrink() {
        return this.tenantShrink;
    }

    public ModifyTenantInfoShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyTenantInfoShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ModifyTenantInfoShrinkRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
