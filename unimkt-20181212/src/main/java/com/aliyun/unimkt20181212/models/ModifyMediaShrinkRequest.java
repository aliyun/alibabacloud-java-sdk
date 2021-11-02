// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifyMediaShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("Media")
    public String mediaShrink;

    @NameInMap("OriginSiteUserId")
    public String originSiteUserId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static ModifyMediaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMediaShrinkRequest self = new ModifyMediaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMediaShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyMediaShrinkRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ModifyMediaShrinkRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ModifyMediaShrinkRequest setMediaShrink(String mediaShrink) {
        this.mediaShrink = mediaShrink;
        return this;
    }
    public String getMediaShrink() {
        return this.mediaShrink;
    }

    public ModifyMediaShrinkRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public ModifyMediaShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyMediaShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ModifyMediaShrinkRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
