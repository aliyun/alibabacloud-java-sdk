// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    @NameInMap("AdRule")
    public java.util.Map<String, ?> adRule;

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

    public static ModifyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleRequest self = new ModifyRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRuleRequest setAdRule(java.util.Map<String, ?> adRule) {
        this.adRule = adRule;
        return this;
    }
    public java.util.Map<String, ?> getAdRule() {
        return this.adRule;
    }

    public ModifyRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyRuleRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ModifyRuleRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ModifyRuleRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public ModifyRuleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyRuleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ModifyRuleRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
