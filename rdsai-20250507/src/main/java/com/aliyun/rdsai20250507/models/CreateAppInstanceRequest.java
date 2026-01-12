// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateAppInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the RDS for PostgreSQL instance with which the RDS Supabase instances are associated.</p>
     * <blockquote>
     * <p>: Only newly purchased empty RDS for PostgreSQL instances are supported. The major engine version must be PostgreSQL 17 and the minor version must be 20250630 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test-supabase</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The name of the new AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("DBInstanceConfig")
    public CreateAppInstanceRequestDBInstanceConfig DBInstanceConfig;

    /**
     * <p>The instance type. Only <strong>rdsai.supabase.basic</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2ze49qv594vi****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The Supabase Dashboard user name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_Password</p>
     */
    @NameInMap("DashboardPassword")
    public String dashboardPassword;

    /**
     * <p>The password used to access the RDS database.</p>
     * <p>The password must be 8 to 32 characters in length and must contain at least three of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("DashboardUsername")
    public String dashboardUsername;

    /**
     * <p>The idempotency token. The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * 
     * <strong>example:</strong>
     * <p>test_Password</p>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    /**
     * <p>Specifies whether to enable public endpoint.</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InitializeWithExistingData")
    public Boolean initializeWithExistingData;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rdsai.supabase.basic</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The billing method of the RDS for PostgreSQL instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicEndpointEnabled")
    public Boolean publicEndpointEnabled;

    /**
     * <p>The Supabase Dashboard password.</p>
     * <p>The password must be 8 to 32 characters in length and must contain at least three of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PublicNetworkAccessEnabled")
    public Boolean publicNetworkAccessEnabled;

    /**
     * <p>Specifies whether to enable the Internet NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enable the Internet NAT gateway.</li>
     * <li><strong>false</strong> (default): disable the Internet NAT gateway.</li>
     * </ul>
     * <blockquote>
     * <p> If an Internet NAT gateway is enabled for the vSwitch that you specify for VSwitchId, select false for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RAGEnabled")
    public Boolean RAGEnabled;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>CreateAppInstance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The application type. Only <strong>supabase</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-9dp2hkpm22gxscfgy****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceRequest self = new CreateAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppInstanceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateAppInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppInstanceRequest setDBInstanceConfig(CreateAppInstanceRequestDBInstanceConfig DBInstanceConfig) {
        this.DBInstanceConfig = DBInstanceConfig;
        return this;
    }
    public CreateAppInstanceRequestDBInstanceConfig getDBInstanceConfig() {
        return this.DBInstanceConfig;
    }

    public CreateAppInstanceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateAppInstanceRequest setDashboardPassword(String dashboardPassword) {
        this.dashboardPassword = dashboardPassword;
        return this;
    }
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    public CreateAppInstanceRequest setDashboardUsername(String dashboardUsername) {
        this.dashboardUsername = dashboardUsername;
        return this;
    }
    public String getDashboardUsername() {
        return this.dashboardUsername;
    }

    public CreateAppInstanceRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public CreateAppInstanceRequest setInitializeWithExistingData(Boolean initializeWithExistingData) {
        this.initializeWithExistingData = initializeWithExistingData;
        return this;
    }
    public Boolean getInitializeWithExistingData() {
        return this.initializeWithExistingData;
    }

    public CreateAppInstanceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateAppInstanceRequest setPublicEndpointEnabled(Boolean publicEndpointEnabled) {
        this.publicEndpointEnabled = publicEndpointEnabled;
        return this;
    }
    public Boolean getPublicEndpointEnabled() {
        return this.publicEndpointEnabled;
    }

    public CreateAppInstanceRequest setPublicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
        this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
        return this;
    }
    public Boolean getPublicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }

    public CreateAppInstanceRequest setRAGEnabled(Boolean RAGEnabled) {
        this.RAGEnabled = RAGEnabled;
        return this;
    }
    public Boolean getRAGEnabled() {
        return this.RAGEnabled;
    }

    public CreateAppInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAppInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateAppInstanceRequestDBInstanceConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pg.n2.2c.1m</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static CreateAppInstanceRequestDBInstanceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceRequestDBInstanceConfig self = new CreateAppInstanceRequestDBInstanceConfig();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceRequestDBInstanceConfig setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public CreateAppInstanceRequestDBInstanceConfig setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public CreateAppInstanceRequestDBInstanceConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

}
