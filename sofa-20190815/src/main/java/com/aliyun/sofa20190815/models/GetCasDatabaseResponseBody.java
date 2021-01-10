// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasDatabaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetCasDatabaseResponseBodyData data;

    public static GetCasDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCasDatabaseResponseBody self = new GetCasDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCasDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCasDatabaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCasDatabaseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetCasDatabaseResponseBody setData(GetCasDatabaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCasDatabaseResponseBodyData getData() {
        return this.data;
    }

    public static class GetCasDatabaseResponseBodyDataAssignedApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetCasDatabaseResponseBodyDataAssignedApps build(java.util.Map<String, ?> map) throws Exception {
            GetCasDatabaseResponseBodyDataAssignedApps self = new GetCasDatabaseResponseBodyDataAssignedApps();
            return TeaModel.build(map, self);
        }

        public GetCasDatabaseResponseBodyDataAssignedApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCasDatabaseResponseBodyDataAssignedApps setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetCasDatabaseResponseBodyData extends TeaModel {
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
        public java.util.List<GetCasDatabaseResponseBodyDataAssignedApps> assignedApps;

        public static GetCasDatabaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCasDatabaseResponseBodyData self = new GetCasDatabaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCasDatabaseResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public GetCasDatabaseResponseBodyData setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public GetCasDatabaseResponseBodyData setConnectionAddress(String connectionAddress) {
            this.connectionAddress = connectionAddress;
            return this;
        }
        public String getConnectionAddress() {
            return this.connectionAddress;
        }

        public GetCasDatabaseResponseBodyData setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public GetCasDatabaseResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCasDatabaseResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetCasDatabaseResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public GetCasDatabaseResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public GetCasDatabaseResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public GetCasDatabaseResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCasDatabaseResponseBodyData setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public GetCasDatabaseResponseBodyData setMaxConnections(Long maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Long getMaxConnections() {
            return this.maxConnections;
        }

        public GetCasDatabaseResponseBodyData setMaxIops(Long maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Long getMaxIops() {
            return this.maxIops;
        }

        public GetCasDatabaseResponseBodyData setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public GetCasDatabaseResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCasDatabaseResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetCasDatabaseResponseBodyData setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public GetCasDatabaseResponseBodyData setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetCasDatabaseResponseBodyData setSpecIaasId(String specIaasId) {
            this.specIaasId = specIaasId;
            return this;
        }
        public String getSpecIaasId() {
            return this.specIaasId;
        }

        public GetCasDatabaseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCasDatabaseResponseBodyData setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public GetCasDatabaseResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCasDatabaseResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetCasDatabaseResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetCasDatabaseResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetCasDatabaseResponseBodyData setVSwitchIaasId(String vSwitchIaasId) {
            this.vSwitchIaasId = vSwitchIaasId;
            return this;
        }
        public String getVSwitchIaasId() {
            return this.vSwitchIaasId;
        }

        public GetCasDatabaseResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetCasDatabaseResponseBodyData setAppIds(java.util.List<String> appIds) {
            this.appIds = appIds;
            return this;
        }
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        public GetCasDatabaseResponseBodyData setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public GetCasDatabaseResponseBodyData setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public GetCasDatabaseResponseBodyData setSharedWorkspaceIds(java.util.List<String> sharedWorkspaceIds) {
            this.sharedWorkspaceIds = sharedWorkspaceIds;
            return this;
        }
        public java.util.List<String> getSharedWorkspaceIds() {
            return this.sharedWorkspaceIds;
        }

        public GetCasDatabaseResponseBodyData setAssignedApps(java.util.List<GetCasDatabaseResponseBodyDataAssignedApps> assignedApps) {
            this.assignedApps = assignedApps;
            return this;
        }
        public java.util.List<GetCasDatabaseResponseBodyDataAssignedApps> getAssignedApps() {
            return this.assignedApps;
        }

    }

}
