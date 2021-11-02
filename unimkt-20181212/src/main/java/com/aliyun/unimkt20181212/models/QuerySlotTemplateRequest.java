// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QuerySlotTemplateRequest extends TeaModel {
    @NameInMap("AdSlotTemplateId")
    public String adSlotTemplateId;

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

    public static QuerySlotTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotTemplateRequest self = new QuerySlotTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlotTemplateRequest setAdSlotTemplateId(String adSlotTemplateId) {
        this.adSlotTemplateId = adSlotTemplateId;
        return this;
    }
    public String getAdSlotTemplateId() {
        return this.adSlotTemplateId;
    }

    public QuerySlotTemplateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QuerySlotTemplateRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public QuerySlotTemplateRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public QuerySlotTemplateRequest setOriginSiteUserId(String originSiteUserId) {
        this.originSiteUserId = originSiteUserId;
        return this;
    }
    public String getOriginSiteUserId() {
        return this.originSiteUserId;
    }

    public QuerySlotTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QuerySlotTemplateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QuerySlotTemplateRequest setUserSite(String userSite) {
        this.userSite = userSite;
        return this;
    }
    public String getUserSite() {
        return this.userSite;
    }

}
