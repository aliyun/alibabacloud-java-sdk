// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppInstanceProfile extends TeaModel {
    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("ApplicationTypeText")
    public String applicationTypeText;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CustomerService")
    public String customerService;

    @NameInMap("DeployArea")
    public String deployArea;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrdTime")
    public String ordTime;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PayTime")
    public String payTime;

    @NameInMap("SeoSite")
    public String seoSite;

    @NameInMap("SiteVersion")
    public String siteVersion;

    @NameInMap("SiteVersionText")
    public String siteVersionText;

    @NameInMap("Source")
    public String source;

    @NameInMap("TemplateEtag")
    public String templateEtag;

    @NameInMap("TemplateId")
    public String templateId;

    public static AppInstanceProfile build(java.util.Map<String, ?> map) throws Exception {
        AppInstanceProfile self = new AppInstanceProfile();
        return TeaModel.build(map, self);
    }

    public AppInstanceProfile setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public AppInstanceProfile setApplicationTypeText(String applicationTypeText) {
        this.applicationTypeText = applicationTypeText;
        return this;
    }
    public String getApplicationTypeText() {
        return this.applicationTypeText;
    }

    public AppInstanceProfile setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppInstanceProfile setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public AppInstanceProfile setCustomerService(String customerService) {
        this.customerService = customerService;
        return this;
    }
    public String getCustomerService() {
        return this.customerService;
    }

    public AppInstanceProfile setDeployArea(String deployArea) {
        this.deployArea = deployArea;
        return this;
    }
    public String getDeployArea() {
        return this.deployArea;
    }

    public AppInstanceProfile setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppInstanceProfile setOrdTime(String ordTime) {
        this.ordTime = ordTime;
        return this;
    }
    public String getOrdTime() {
        return this.ordTime;
    }

    public AppInstanceProfile setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AppInstanceProfile setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }
    public String getPayTime() {
        return this.payTime;
    }

    public AppInstanceProfile setSeoSite(String seoSite) {
        this.seoSite = seoSite;
        return this;
    }
    public String getSeoSite() {
        return this.seoSite;
    }

    public AppInstanceProfile setSiteVersion(String siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public String getSiteVersion() {
        return this.siteVersion;
    }

    public AppInstanceProfile setSiteVersionText(String siteVersionText) {
        this.siteVersionText = siteVersionText;
        return this;
    }
    public String getSiteVersionText() {
        return this.siteVersionText;
    }

    public AppInstanceProfile setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AppInstanceProfile setTemplateEtag(String templateEtag) {
        this.templateEtag = templateEtag;
        return this;
    }
    public String getTemplateEtag() {
        return this.templateEtag;
    }

    public AppInstanceProfile setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
