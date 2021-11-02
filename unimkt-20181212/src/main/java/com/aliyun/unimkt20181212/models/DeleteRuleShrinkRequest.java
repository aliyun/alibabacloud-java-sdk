// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class DeleteRuleShrinkRequest extends TeaModel {
    @NameInMap("AdRule")
    public String adRuleShrink;

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

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSite")
    public String userSite;

    public static DeleteRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleShrinkRequest self = new DeleteRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleShrinkRequest setAdRuleShrink(String adRuleShrink) {
        this.adRuleShrink = adRuleShrink;
        return this;
    }
    public String getAdRuleShrink() {
        return this.adRuleShrink;
    }

    public DeleteRuleShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteRuleShrinkRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public DeleteRuleShrinkRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public DeleteRuleShrinkRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRuleShrinkRequest setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }
    public String getMessageKey() {
        return this.messageKey;
    }

    public DeleteRuleShrinkRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public DeleteRuleShrinkRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DeleteRuleShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeleteRuleShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteRuleShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteRuleShrinkRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
