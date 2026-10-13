// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateAppInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The name of the AI application to create.</p>
     * 
     * <strong>example:</strong>
     * <p>test-supabase</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application type. Currently, only <strong>supabase</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The client generates the value of this parameter to prevent duplicate requests from being submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of components.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <p>The database instance configuration.</p>
     */
    @NameInMap("DBInstanceConfig")
    public String DBInstanceConfigShrink;

    /**
     * <p>The instance ID of the RDS PostgreSQL database instance to which the AI application connects.</p>
     * <p><notice>Only <strong>newly purchased empty RDS PostgreSQL instances</strong> are supported. The major engine version must be <strong>17</strong>, and the minor engine version must be <strong>20250630 or later</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2ze49qv594vi****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The password for the Supabase Dashboard.</p>
     * <p>The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>test_Password</p>
     */
    @NameInMap("DashboardPassword")
    public String dashboardPassword;

    /**
     * <p>The username for the Supabase Dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("DashboardUsername")
    public String dashboardUsername;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_database_01</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The password for accessing the RDS database.</p>
     * <p>The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>test_Password</p>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    /**
     * <p>Specifies whether to restore from existing PostgreSQL data. Valid values:</p>
     * <ul>
     * <li><p>true: restores from existing data.</p>
     * </li>
     * <li><p>false (default): does not restore from existing data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InitializeWithExistingData")
    public Boolean initializeWithExistingData;

    /**
     * <p>The instance type. Currently, only <strong>rdsai.supabase.basic</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>rdsai.supabase.basic</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>Specifies whether to enable the public network connection endpoint. Valid values:</p>
     * <ul>
     * <li><p>true (default): Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicEndpointEnabled")
    public Boolean publicEndpointEnabled;

    /**
     * <p>Specifies whether to enable the Internet NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the Internet NAT gateway.</li>
     * <li><strong>false</strong> (default): does not enable the Internet NAT gateway.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: If an Internet NAT gateway is already enabled for the vSwitch specified by the <strong>VSwitchId</strong> parameter settings, set this parameter to <strong>false</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PublicNetworkAccessEnabled")
    public Boolean publicNetworkAccessEnabled;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RAGEnabled")
    public Boolean RAGEnabled;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The vSwitch ID.</p>
     * 
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

    public CreateAppInstanceShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
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

    public CreateAppInstanceShrinkRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
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
