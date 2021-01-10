// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Data")
    public java.util.List<QueryCasDatabaseAccountResponseBodyData> data;

    public static QueryCasDatabaseAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseAccountResponseBody self = new QueryCasDatabaseAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasDatabaseAccountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasDatabaseAccountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasDatabaseAccountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryCasDatabaseAccountResponseBody setData(java.util.List<QueryCasDatabaseAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasDatabaseAccountResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps self = new QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryCasDatabaseAccountResponseBodyDataDatabase extends TeaModel {
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
        public java.util.List<QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps> assignedApps;

        public static QueryCasDatabaseAccountResponseBodyDataDatabase build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseAccountResponseBodyDataDatabase self = new QueryCasDatabaseAccountResponseBodyDataDatabase();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setConnectionAddress(String connectionAddress) {
            this.connectionAddress = connectionAddress;
            return this;
        }
        public String getConnectionAddress() {
            return this.connectionAddress;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setMaxConnections(Long maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Long getMaxConnections() {
            return this.maxConnections;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setMaxIops(Long maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Long getMaxIops() {
            return this.maxIops;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setSpecIaasId(String specIaasId) {
            this.specIaasId = specIaasId;
            return this;
        }
        public String getSpecIaasId() {
            return this.specIaasId;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setVSwitchIaasId(String vSwitchIaasId) {
            this.vSwitchIaasId = vSwitchIaasId;
            return this;
        }
        public String getVSwitchIaasId() {
            return this.vSwitchIaasId;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setAppIds(java.util.List<String> appIds) {
            this.appIds = appIds;
            return this;
        }
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setSharedWorkspaceIds(java.util.List<String> sharedWorkspaceIds) {
            this.sharedWorkspaceIds = sharedWorkspaceIds;
            return this;
        }
        public java.util.List<String> getSharedWorkspaceIds() {
            return this.sharedWorkspaceIds;
        }

        public QueryCasDatabaseAccountResponseBodyDataDatabase setAssignedApps(java.util.List<QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps> assignedApps) {
            this.assignedApps = assignedApps;
            return this;
        }
        public java.util.List<QueryCasDatabaseAccountResponseBodyDataDatabaseAssignedApps> getAssignedApps() {
            return this.assignedApps;
        }

    }

    public static class QueryCasDatabaseAccountResponseBodyData extends TeaModel {
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
        public QueryCasDatabaseAccountResponseBodyDataDatabase database;

        public static QueryCasDatabaseAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseAccountResponseBodyData self = new QueryCasDatabaseAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseAccountResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasDatabaseAccountResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasDatabaseAccountResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasDatabaseAccountResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasDatabaseAccountResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryCasDatabaseAccountResponseBodyData setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

        public QueryCasDatabaseAccountResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasDatabaseAccountResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasDatabaseAccountResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasDatabaseAccountResponseBodyData setDatabase(QueryCasDatabaseAccountResponseBodyDataDatabase database) {
            this.database = database;
            return this;
        }
        public QueryCasDatabaseAccountResponseBodyDataDatabase getDatabase() {
            return this.database;
        }

    }

}
