// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppOperationAddress extends TeaModel {
    @NameInMap("Actions")
    public java.util.List<AppOperateAction> actions;

    @NameInMap("AiCustomerConfigUrl")
    public String aiCustomerConfigUrl;

    @NameInMap("AiDesignUrl")
    public String aiDesignUrl;

    @NameInMap("AppPublishUrl")
    public String appPublishUrl;

    @NameInMap("DashboardActions")
    public java.util.List<AppOperateAction> dashboardActions;

    @NameInMap("DesignUrl")
    public String designUrl;

    @NameInMap("InstanceLoginUrl")
    public String instanceLoginUrl;

    @NameInMap("RenewBuyUrl")
    public String renewBuyUrl;

    @NameInMap("ServerDeliveryUrl")
    public String serverDeliveryUrl;

    @NameInMap("UpgradeBuyUrl")
    public String upgradeBuyUrl;

    public static AppOperationAddress build(java.util.Map<String, ?> map) throws Exception {
        AppOperationAddress self = new AppOperationAddress();
        return TeaModel.build(map, self);
    }

    public AppOperationAddress setActions(java.util.List<AppOperateAction> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<AppOperateAction> getActions() {
        return this.actions;
    }

    public AppOperationAddress setAiCustomerConfigUrl(String aiCustomerConfigUrl) {
        this.aiCustomerConfigUrl = aiCustomerConfigUrl;
        return this;
    }
    public String getAiCustomerConfigUrl() {
        return this.aiCustomerConfigUrl;
    }

    public AppOperationAddress setAiDesignUrl(String aiDesignUrl) {
        this.aiDesignUrl = aiDesignUrl;
        return this;
    }
    public String getAiDesignUrl() {
        return this.aiDesignUrl;
    }

    public AppOperationAddress setAppPublishUrl(String appPublishUrl) {
        this.appPublishUrl = appPublishUrl;
        return this;
    }
    public String getAppPublishUrl() {
        return this.appPublishUrl;
    }

    public AppOperationAddress setDashboardActions(java.util.List<AppOperateAction> dashboardActions) {
        this.dashboardActions = dashboardActions;
        return this;
    }
    public java.util.List<AppOperateAction> getDashboardActions() {
        return this.dashboardActions;
    }

    public AppOperationAddress setDesignUrl(String designUrl) {
        this.designUrl = designUrl;
        return this;
    }
    public String getDesignUrl() {
        return this.designUrl;
    }

    public AppOperationAddress setInstanceLoginUrl(String instanceLoginUrl) {
        this.instanceLoginUrl = instanceLoginUrl;
        return this;
    }
    public String getInstanceLoginUrl() {
        return this.instanceLoginUrl;
    }

    public AppOperationAddress setRenewBuyUrl(String renewBuyUrl) {
        this.renewBuyUrl = renewBuyUrl;
        return this;
    }
    public String getRenewBuyUrl() {
        return this.renewBuyUrl;
    }

    public AppOperationAddress setServerDeliveryUrl(String serverDeliveryUrl) {
        this.serverDeliveryUrl = serverDeliveryUrl;
        return this;
    }
    public String getServerDeliveryUrl() {
        return this.serverDeliveryUrl;
    }

    public AppOperationAddress setUpgradeBuyUrl(String upgradeBuyUrl) {
        this.upgradeBuyUrl = upgradeBuyUrl;
        return this;
    }
    public String getUpgradeBuyUrl() {
        return this.upgradeBuyUrl;
    }

}
