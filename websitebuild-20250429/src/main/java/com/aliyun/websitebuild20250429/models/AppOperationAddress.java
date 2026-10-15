// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppOperationAddress extends TeaModel {
    /**
     * <p>The operation button list.</p>
     */
    @NameInMap("Actions")
    public java.util.List<AppOperateAction> actions;

    /**
     * <p>The customer service design URL.</p>
     */
    @NameInMap("AiCustomerConfigUrl")
    public String aiCustomerConfigUrl;

    /**
     * <p>The AI design URL.</p>
     */
    @NameInMap("AiDesignUrl")
    public String aiDesignUrl;

    /**
     * <p>The application publishing URL.</p>
     */
    @NameInMap("AppPublishUrl")
    public String appPublishUrl;

    /**
     * <p>The overview page operation button list.</p>
     */
    @NameInMap("DashboardActions")
    public java.util.List<AppOperateAction> dashboardActions;

    /**
     * <p>The professional design URL.</p>
     */
    @NameInMap("DesignUrl")
    public String designUrl;

    /**
     * <p>The application instance logon URL.</p>
     */
    @NameInMap("InstanceLoginUrl")
    public String instanceLoginUrl;

    /**
     * <p>The renewal purchase URL.</p>
     */
    @NameInMap("RenewBuyUrl")
    public String renewBuyUrl;

    /**
     * <p>The service delivery URL.</p>
     */
    @NameInMap("ServerDeliveryUrl")
    public String serverDeliveryUrl;

    /**
     * <p>The upgrade purchase URL.</p>
     */
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
