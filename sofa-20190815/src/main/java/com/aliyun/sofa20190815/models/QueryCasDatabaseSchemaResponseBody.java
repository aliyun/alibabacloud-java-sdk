// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Data")
    public java.util.List<QueryCasDatabaseSchemaResponseBodyData> data;

    public static QueryCasDatabaseSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseSchemaResponseBody self = new QueryCasDatabaseSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasDatabaseSchemaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasDatabaseSchemaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasDatabaseSchemaResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryCasDatabaseSchemaResponseBody setData(java.util.List<QueryCasDatabaseSchemaResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasDatabaseSchemaResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps self = new QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("AutoRenewPeriod")
        public Long autoRenewPeriod;

        @NameInMap("ConnectionAddress")
        public String connectionAddress;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("Description")
        public String description;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("IaasType")
        public String iaasType;

        @NameInMap("Id")
        public String id;

        @NameInMap("MasterZoneId")
        public String masterZoneId;

        @NameInMap("MaxConnections")
        public Long maxConnections;

        @NameInMap("MaxIops")
        public Long maxIops;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public Long port;

        @NameInMap("SpecIaasId")
        public String specIaasId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Storage")
        public Long storage;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VSwitchIaasId")
        public String vSwitchIaasId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("AppIds")
        public java.util.List<String> appIds;

        @NameInMap("AppServiceIds")
        public java.util.List<String> appServiceIds;

        @NameInMap("AssignedAppServiceIds")
        public java.util.List<String> assignedAppServiceIds;

        @NameInMap("SharedWorkspaceIds")
        public java.util.List<String> sharedWorkspaceIds;

        @NameInMap("AssignedApps")
        public java.util.List<QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps> assignedApps;

        public static QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase self = new QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setConnectionAddress(String connectionAddress) {
            this.connectionAddress = connectionAddress;
            return this;
        }
        public String getConnectionAddress() {
            return this.connectionAddress;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setMaxConnections(Long maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Long getMaxConnections() {
            return this.maxConnections;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setMaxIops(Long maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Long getMaxIops() {
            return this.maxIops;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setSpecIaasId(String specIaasId) {
            this.specIaasId = specIaasId;
            return this;
        }
        public String getSpecIaasId() {
            return this.specIaasId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setVSwitchIaasId(String vSwitchIaasId) {
            this.vSwitchIaasId = vSwitchIaasId;
            return this;
        }
        public String getVSwitchIaasId() {
            return this.vSwitchIaasId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setAppIds(java.util.List<String> appIds) {
            this.appIds = appIds;
            return this;
        }
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setSharedWorkspaceIds(java.util.List<String> sharedWorkspaceIds) {
            this.sharedWorkspaceIds = sharedWorkspaceIds;
            return this;
        }
        public java.util.List<String> getSharedWorkspaceIds() {
            return this.sharedWorkspaceIds;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase setAssignedApps(java.util.List<QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps> assignedApps) {
            this.assignedApps = assignedApps;
            return this;
        }
        public java.util.List<QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabaseAssignedApps> getAssignedApps() {
            return this.assignedApps;
        }

    }

    public static class QueryCasDatabaseSchemaResponseBodyDataGrantsAccount extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("IaasType")
        public String iaasType;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Password")
        public String password;

        @NameInMap("Privilege")
        public String privilege;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Database")
        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase database;

        public static QueryCasDatabaseSchemaResponseBodyDataGrantsAccount build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseSchemaResponseBodyDataGrantsAccount self = new QueryCasDatabaseSchemaResponseBodyDataGrantsAccount();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount setDatabase(QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase database) {
            this.database = database;
            return this;
        }
        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccountDatabase getDatabase() {
            return this.database;
        }

    }

    public static class QueryCasDatabaseSchemaResponseBodyDataGrants extends TeaModel {
        @NameInMap("Privilege")
        public String privilege;

        @NameInMap("Account")
        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount account;

        public static QueryCasDatabaseSchemaResponseBodyDataGrants build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseSchemaResponseBodyDataGrants self = new QueryCasDatabaseSchemaResponseBodyDataGrants();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrants setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

        public QueryCasDatabaseSchemaResponseBodyDataGrants setAccount(QueryCasDatabaseSchemaResponseBodyDataGrantsAccount account) {
            this.account = account;
            return this;
        }
        public QueryCasDatabaseSchemaResponseBodyDataGrantsAccount getAccount() {
            return this.account;
        }

    }

    public static class QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps self = new QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryCasDatabaseSchemaResponseBodyDataDatabase extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("AutoRenewPeriod")
        public Long autoRenewPeriod;

        @NameInMap("ConnectionAddress")
        public String connectionAddress;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("Description")
        public String description;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("IaasType")
        public String iaasType;

        @NameInMap("Id")
        public String id;

        @NameInMap("MasterZoneId")
        public String masterZoneId;

        @NameInMap("MaxConnections")
        public Long maxConnections;

        @NameInMap("MaxIops")
        public Long maxIops;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public Long port;

        @NameInMap("SpecIaasId")
        public String specIaasId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Storage")
        public Long storage;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VSwitchIaasId")
        public String vSwitchIaasId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("AppIds")
        public java.util.List<String> appIds;

        @NameInMap("AppServiceIds")
        public java.util.List<String> appServiceIds;

        @NameInMap("AssignedAppServiceIds")
        public java.util.List<String> assignedAppServiceIds;

        @NameInMap("SharedWorkspaceIds")
        public java.util.List<String> sharedWorkspaceIds;

        @NameInMap("AssignedApps")
        public java.util.List<QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps> assignedApps;

        public static QueryCasDatabaseSchemaResponseBodyDataDatabase build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseSchemaResponseBodyDataDatabase self = new QueryCasDatabaseSchemaResponseBodyDataDatabase();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setConnectionAddress(String connectionAddress) {
            this.connectionAddress = connectionAddress;
            return this;
        }
        public String getConnectionAddress() {
            return this.connectionAddress;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setMaxConnections(Long maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Long getMaxConnections() {
            return this.maxConnections;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setMaxIops(Long maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Long getMaxIops() {
            return this.maxIops;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setSpecIaasId(String specIaasId) {
            this.specIaasId = specIaasId;
            return this;
        }
        public String getSpecIaasId() {
            return this.specIaasId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setVSwitchIaasId(String vSwitchIaasId) {
            this.vSwitchIaasId = vSwitchIaasId;
            return this;
        }
        public String getVSwitchIaasId() {
            return this.vSwitchIaasId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setAppIds(java.util.List<String> appIds) {
            this.appIds = appIds;
            return this;
        }
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setSharedWorkspaceIds(java.util.List<String> sharedWorkspaceIds) {
            this.sharedWorkspaceIds = sharedWorkspaceIds;
            return this;
        }
        public java.util.List<String> getSharedWorkspaceIds() {
            return this.sharedWorkspaceIds;
        }

        public QueryCasDatabaseSchemaResponseBodyDataDatabase setAssignedApps(java.util.List<QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps> assignedApps) {
            this.assignedApps = assignedApps;
            return this;
        }
        public java.util.List<QueryCasDatabaseSchemaResponseBodyDataDatabaseAssignedApps> getAssignedApps() {
            return this.assignedApps;
        }

    }

    public static class QueryCasDatabaseSchemaResponseBodyData extends TeaModel {
        @NameInMap("CharSet")
        public String charSet;

        @NameInMap("Description")
        public String description;

        @NameInMap("IaasType")
        public String iaasType;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Grants")
        public java.util.List<QueryCasDatabaseSchemaResponseBodyDataGrants> grants;

        @NameInMap("Database")
        public QueryCasDatabaseSchemaResponseBodyDataDatabase database;

        public static QueryCasDatabaseSchemaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseSchemaResponseBodyData self = new QueryCasDatabaseSchemaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseSchemaResponseBodyData setCharSet(String charSet) {
            this.charSet = charSet;
            return this;
        }
        public String getCharSet() {
            return this.charSet;
        }

        public QueryCasDatabaseSchemaResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasDatabaseSchemaResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasDatabaseSchemaResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasDatabaseSchemaResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasDatabaseSchemaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasDatabaseSchemaResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasDatabaseSchemaResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasDatabaseSchemaResponseBodyData setGrants(java.util.List<QueryCasDatabaseSchemaResponseBodyDataGrants> grants) {
            this.grants = grants;
            return this;
        }
        public java.util.List<QueryCasDatabaseSchemaResponseBodyDataGrants> getGrants() {
            return this.grants;
        }

        public QueryCasDatabaseSchemaResponseBodyData setDatabase(QueryCasDatabaseSchemaResponseBodyDataDatabase database) {
            this.database = database;
            return this;
        }
        public QueryCasDatabaseSchemaResponseBodyDataDatabase getDatabase() {
            return this.database;
        }

    }

}
