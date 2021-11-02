// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateFlowShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Business")
    public String business;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("Flow")
    public String flowShrink;

    @NameInMap("OriginSiteUserId")
    public String originSiteUserId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static CreateFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowShrinkRequest self = new CreateFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateFlowShrinkRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public CreateFlowShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFlowShrinkRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreateFlowShrinkRequest setFlowShrink(String flowShrink) {
        this.flowShrink = flowShrink;
        return this;
    }
    public String getFlowShrink() {
        return this.flowShrink;
    }

    public CreateFlowShrinkRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public CreateFlowShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateFlowShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateFlowShrinkRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
