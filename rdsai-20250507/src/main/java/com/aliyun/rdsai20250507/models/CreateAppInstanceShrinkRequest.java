// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateAppInstanceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-supabase</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceConfig")
    public String DBInstanceConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>pgm-2ze49qv594vi****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>test_Password</p>
     */
    @NameInMap("DashboardPassword")
    public String dashboardPassword;

    /**
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("DashboardUsername")
    public String dashboardUsername;

    /**
     * <strong>example:</strong>
     * <p>test_Password</p>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    @NameInMap("InitializeWithExistingData")
    public Boolean initializeWithExistingData;

    /**
     * <strong>example:</strong>
     * <p>rdsai.supabase.basic</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("PublicEndpointEnabled")
    public Boolean publicEndpointEnabled;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PublicNetworkAccessEnabled")
    public Boolean publicNetworkAccessEnabled;

    @NameInMap("RAGEnabled")
    public Boolean RAGEnabled;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>vsw-9dp2hkpm22gxscfgy****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateAppInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceShrinkRequest self = new CreateAppInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppInstanceShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateAppInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppInstanceShrinkRequest setDBInstanceConfigShrink(String DBInstanceConfigShrink) {
        this.DBInstanceConfigShrink = DBInstanceConfigShrink;
        return this;
    }
    public String getDBInstanceConfigShrink() {
        return this.DBInstanceConfigShrink;
    }

    public CreateAppInstanceShrinkRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateAppInstanceShrinkRequest setDashboardPassword(String dashboardPassword) {
        this.dashboardPassword = dashboardPassword;
        return this;
    }
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    public CreateAppInstanceShrinkRequest setDashboardUsername(String dashboardUsername) {
        this.dashboardUsername = dashboardUsername;
        return this;
    }
    public String getDashboardUsername() {
        return this.dashboardUsername;
    }

    public CreateAppInstanceShrinkRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public CreateAppInstanceShrinkRequest setInitializeWithExistingData(Boolean initializeWithExistingData) {
        this.initializeWithExistingData = initializeWithExistingData;
        return this;
    }
    public Boolean getInitializeWithExistingData() {
        return this.initializeWithExistingData;
    }

    public CreateAppInstanceShrinkRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateAppInstanceShrinkRequest setPublicEndpointEnabled(Boolean publicEndpointEnabled) {
        this.publicEndpointEnabled = publicEndpointEnabled;
        return this;
    }
    public Boolean getPublicEndpointEnabled() {
        return this.publicEndpointEnabled;
    }

    public CreateAppInstanceShrinkRequest setPublicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
        this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
        return this;
    }
    public Boolean getPublicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }

    public CreateAppInstanceShrinkRequest setRAGEnabled(Boolean RAGEnabled) {
        this.RAGEnabled = RAGEnabled;
        return this;
    }
    public Boolean getRAGEnabled() {
        return this.RAGEnabled;
    }

    public CreateAppInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAppInstanceShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
