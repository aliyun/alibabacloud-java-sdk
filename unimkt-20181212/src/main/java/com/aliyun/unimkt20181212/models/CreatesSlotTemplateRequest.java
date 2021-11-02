// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreatesSlotTemplateRequest extends TeaModel {
    @NameInMap("AdSlotTemplate")
    public java.util.Map<String, ?> adSlotTemplate;

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

    public static CreatesSlotTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatesSlotTemplateRequest self = new CreatesSlotTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreatesSlotTemplateRequest setAdSlotTemplate(java.util.Map<String, ?> adSlotTemplate) {
        this.adSlotTemplate = adSlotTemplate;
        return this;
    }
    public java.util.Map<String, ?> getAdSlotTemplate() {
        return this.adSlotTemplate;
    }

    public CreatesSlotTemplateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreatesSlotTemplateRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public CreatesSlotTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatesSlotTemplateRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public CreatesSlotTemplateRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public CreatesSlotTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatesSlotTemplateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreatesSlotTemplateRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
