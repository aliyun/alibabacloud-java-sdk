// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateAppInstanceRequest extends TeaModel {
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
    public CreateAppInstanceRequestDBInstanceConfig DBInstanceConfig;

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
