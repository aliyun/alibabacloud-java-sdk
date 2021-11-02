// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CountUserShrinkRequest extends TeaModel {
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

    @NameInMap("SspUser")
    public String sspUserShrink;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static CountUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CountUserShrinkRequest self = new CountUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CountUserShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CountUserShrinkRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public CountUserShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CountUserShrinkRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CountUserShrinkRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public CountUserShrinkRequest setSspUserShrink(String sspUserShrink) {
        this.sspUserShrink = sspUserShrink;
        return this;
    }
    public String getSspUserShrink() {
        return this.sspUserShrink;
    }

    public CountUserShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CountUserShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CountUserShrinkRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
