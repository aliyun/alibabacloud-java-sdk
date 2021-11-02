// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class DeleteRuleRequest extends TeaModel {
    @NameInMap("AdRule")
    public java.util.Map<String, ?> adRule;

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

    public static DeleteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleRequest self = new DeleteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleRequest setAdRule(java.util.Map<String, ?> adRule) {
        this.adRule = adRule;
        return this;
    }
    public java.util.Map<String, ?> getAdRule() {
        return this.adRule;
    }

    public DeleteRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteRuleRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public DeleteRuleRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public DeleteRuleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRuleRequest setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }
    public String getMessageKey() {
        return this.messageKey;
    }

    public DeleteRuleRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public DeleteRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DeleteRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeleteRuleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteRuleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteRuleRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
