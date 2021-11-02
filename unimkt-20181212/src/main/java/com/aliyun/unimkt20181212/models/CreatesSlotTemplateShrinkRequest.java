// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreatesSlotTemplateShrinkRequest extends TeaModel {
    @NameInMap("AdSlotTemplate")
    public String adSlotTemplateShrink;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("ClientToken")
    public String clientToken;

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

    public static CreatesSlotTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatesSlotTemplateShrinkRequest self = new CreatesSlotTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatesSlotTemplateShrinkRequest setAdSlotTemplateShrink(String adSlotTemplateShrink) {
        this.adSlotTemplateShrink = adSlotTemplateShrink;
        return this;
    }
    public String getAdSlotTemplateShrink() {
        return this.adSlotTemplateShrink;
    }

    public CreatesSlotTemplateShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreatesSlotTemplateShrinkRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public CreatesSlotTemplateShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatesSlotTemplateShrinkRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreatesSlotTemplateShrinkRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public CreatesSlotTemplateShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatesSlotTemplateShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreatesSlotTemplateShrinkRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
