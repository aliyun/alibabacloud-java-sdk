// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Data")
    public java.util.List<QueryCasDatabaseResponseBodyData> data;

    public static QueryCasDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseResponseBody self = new QueryCasDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasDatabaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasDatabaseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasDatabaseResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasDatabaseResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasDatabaseResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryCasDatabaseResponseBody setData(java.util.List<QueryCasDatabaseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasDatabaseResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasDatabaseResponseBodyDataAssignedApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryCasDatabaseResponseBodyDataAssignedApps build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseResponseBodyDataAssignedApps self = new QueryCasDatabaseResponseBodyDataAssignedApps();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseResponseBodyDataAssignedApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryCasDatabaseResponseBodyDataAssignedApps setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryCasDatabaseResponseBodyData extends TeaModel {
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
        public java.util.List<QueryCasDatabaseResponseBodyDataAssignedApps> assignedApps;

        public static QueryCasDatabaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseResponseBodyData self = new QueryCasDatabaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public QueryCasDatabaseResponseBodyData setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public QueryCasDatabaseResponseBodyData setConnectionAddress(String connectionAddress) {
            this.connectionAddress = connectionAddress;
            return this;
        }
        public String getConnectionAddress() {
            return this.connectionAddress;
        }

        public QueryCasDatabaseResponseBodyData setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public QueryCasDatabaseResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasDatabaseResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public QueryCasDatabaseResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public QueryCasDatabaseResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasDatabaseResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public QueryCasDatabaseResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasDatabaseResponseBodyData setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public QueryCasDatabaseResponseBodyData setMaxConnections(Long maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Long getMaxConnections() {
            return this.maxConnections;
        }

        public QueryCasDatabaseResponseBodyData setMaxIops(Long maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Long getMaxIops() {
            return this.maxIops;
        }

        public QueryCasDatabaseResponseBodyData setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public QueryCasDatabaseResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasDatabaseResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryCasDatabaseResponseBodyData setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryCasDatabaseResponseBodyData setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryCasDatabaseResponseBodyData setSpecIaasId(String specIaasId) {
            this.specIaasId = specIaasId;
            return this;
        }
        public String getSpecIaasId() {
            return this.specIaasId;
        }

        public QueryCasDatabaseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasDatabaseResponseBodyData setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public QueryCasDatabaseResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryCasDatabaseResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCasDatabaseResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCasDatabaseResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryCasDatabaseResponseBodyData setVSwitchIaasId(String vSwitchIaasId) {
            this.vSwitchIaasId = vSwitchIaasId;
            return this;
        }
        public String getVSwitchIaasId() {
            return this.vSwitchIaasId;
        }

        public QueryCasDatabaseResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasDatabaseResponseBodyData setAppIds(java.util.List<String> appIds) {
            this.appIds = appIds;
            return this;
        }
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        public QueryCasDatabaseResponseBodyData setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public QueryCasDatabaseResponseBodyData setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public QueryCasDatabaseResponseBodyData setSharedWorkspaceIds(java.util.List<String> sharedWorkspaceIds) {
            this.sharedWorkspaceIds = sharedWorkspaceIds;
            return this;
        }
        public java.util.List<String> getSharedWorkspaceIds() {
            return this.sharedWorkspaceIds;
        }

        public QueryCasDatabaseResponseBodyData setAssignedApps(java.util.List<QueryCasDatabaseResponseBodyDataAssignedApps> assignedApps) {
            this.assignedApps = assignedApps;
            return this;
        }
        public java.util.List<QueryCasDatabaseResponseBodyDataAssignedApps> getAssignedApps() {
            return this.assignedApps;
        }

    }

}
