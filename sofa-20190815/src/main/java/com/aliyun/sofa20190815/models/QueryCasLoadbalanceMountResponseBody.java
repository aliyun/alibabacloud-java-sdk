// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceMountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCasLoadbalanceMountResponseBodyData> data;

    public static QueryCasLoadbalanceMountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceMountResponseBody self = new QueryCasLoadbalanceMountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceMountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasLoadbalanceMountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasLoadbalanceMountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasLoadbalanceMountResponseBody setData(java.util.List<QueryCasLoadbalanceMountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasLoadbalanceMountResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        @NameInMap("DeleteWithComputer")
        public Boolean deleteWithComputer;

        @NameInMap("Device")
        public String device;

        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Portable")
        public Boolean portable;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk self = new QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setDeleteWithComputer(Boolean deleteWithComputer) {
            this.deleteWithComputer = deleteWithComputer;
            return this;
        }
        public Boolean getDeleteWithComputer() {
            return this.deleteWithComputer;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryCasLoadbalanceMountResponseBodyDataComputer extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("CommonImage")
        public Boolean commonImage;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("CpuShared")
        public Boolean cpuShared;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ElasticIp")
        public String elasticIp;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("IaasStatus")
        public String iaasStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageIaasId")
        public String imageIaasId;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("Initialized")
        public Boolean initialized;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("LastOpsOrderId")
        public String lastOpsOrderId;

        @NameInMap("LastOpsType")
        public String lastOpsType;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsBit")
        public Long osBit;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("PaasStatus")
        public String paasStatus;

        @NameInMap("Password")
        public String password;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("ProviderId")
        public String providerId;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("SpecIaasId")
        public String specIaasId;

        @NameInMap("Status")
        public String status;

        @NameInMap("ThreadsPerCore")
        public Long threadsPerCore;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("SystemDisk")
        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk systemDisk;

        public static QueryCasLoadbalanceMountResponseBodyDataComputer build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceMountResponseBodyDataComputer self = new QueryCasLoadbalanceMountResponseBodyDataComputer();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setCommonImage(Boolean commonImage) {
            this.commonImage = commonImage;
            return this;
        }
        public Boolean getCommonImage() {
            return this.commonImage;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setCpuShared(Boolean cpuShared) {
            this.cpuShared = cpuShared;
            return this;
        }
        public Boolean getCpuShared() {
            return this.cpuShared;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setElasticIp(String elasticIp) {
            this.elasticIp = elasticIp;
            return this;
        }
        public String getElasticIp() {
            return this.elasticIp;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setIaasStatus(String iaasStatus) {
            this.iaasStatus = iaasStatus;
            return this;
        }
        public String getIaasStatus() {
            return this.iaasStatus;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setImageIaasId(String imageIaasId) {
            this.imageIaasId = imageIaasId;
            return this;
        }
        public String getImageIaasId() {
            return this.imageIaasId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setInitialized(Boolean initialized) {
            this.initialized = initialized;
            return this;
        }
        public Boolean getInitialized() {
            return this.initialized;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setLastOpsOrderId(String lastOpsOrderId) {
            this.lastOpsOrderId = lastOpsOrderId;
            return this;
        }
        public String getLastOpsOrderId() {
            return this.lastOpsOrderId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setLastOpsType(String lastOpsType) {
            this.lastOpsType = lastOpsType;
            return this;
        }
        public String getLastOpsType() {
            return this.lastOpsType;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setOsBit(Long osBit) {
            this.osBit = osBit;
            return this;
        }
        public Long getOsBit() {
            return this.osBit;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setPaasStatus(String paasStatus) {
            this.paasStatus = paasStatus;
            return this;
        }
        public String getPaasStatus() {
            return this.paasStatus;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setSpecIaasId(String specIaasId) {
            this.specIaasId = specIaasId;
            return this;
        }
        public String getSpecIaasId() {
            return this.specIaasId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setThreadsPerCore(Long threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Long getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataComputer setSystemDisk(QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public QueryCasLoadbalanceMountResponseBodyDataComputerSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

    }

    public static class QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Region")
        public String region;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("Zone")
        public String zone;

        public static QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope self = new QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryCasLoadbalanceMountResponseBodyDataLoadbalancer extends TeaModel {
        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterMode")
        public Boolean clusterMode;

        @NameInMap("Id")
        public String id;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("ShareMode")
        public Boolean shareMode;

        @NameInMap("Status")
        public String status;

        @NameInMap("VipAddressType")
        public String vipAddressType;

        @NameInMap("VipType")
        public String vipType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchIaasId")
        public String vswitchIaasId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Domains")
        public java.util.List<String> domains;

        @NameInMap("VipAddresses")
        public java.util.List<String> vipAddresses;

        @NameInMap("Scope")
        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope scope;

        public static QueryCasLoadbalanceMountResponseBodyDataLoadbalancer build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceMountResponseBodyDataLoadbalancer self = new QueryCasLoadbalanceMountResponseBodyDataLoadbalancer();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setShareMode(Boolean shareMode) {
            this.shareMode = shareMode;
            return this;
        }
        public Boolean getShareMode() {
            return this.shareMode;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setVipAddressType(String vipAddressType) {
            this.vipAddressType = vipAddressType;
            return this;
        }
        public String getVipAddressType() {
            return this.vipAddressType;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setVipType(String vipType) {
            this.vipType = vipType;
            return this;
        }
        public String getVipType() {
            return this.vipType;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setVswitchIaasId(String vswitchIaasId) {
            this.vswitchIaasId = vswitchIaasId;
            return this;
        }
        public String getVswitchIaasId() {
            return this.vswitchIaasId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setVipAddresses(java.util.List<String> vipAddresses) {
            this.vipAddresses = vipAddresses;
            return this;
        }
        public java.util.List<String> getVipAddresses() {
            return this.vipAddresses;
        }

        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer setScope(QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope scope) {
            this.scope = scope;
            return this;
        }
        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancerScope getScope() {
            return this.scope;
        }

    }

    public static class QueryCasLoadbalanceMountResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Status")
        public String status;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Computer")
        public QueryCasLoadbalanceMountResponseBodyDataComputer computer;

        @NameInMap("Loadbalancer")
        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer loadbalancer;

        public static QueryCasLoadbalanceMountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceMountResponseBodyData self = new QueryCasLoadbalanceMountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceMountResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryCasLoadbalanceMountResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCasLoadbalanceMountResponseBodyData setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public QueryCasLoadbalanceMountResponseBodyData setComputer(QueryCasLoadbalanceMountResponseBodyDataComputer computer) {
            this.computer = computer;
            return this;
        }
        public QueryCasLoadbalanceMountResponseBodyDataComputer getComputer() {
            return this.computer;
        }

        public QueryCasLoadbalanceMountResponseBodyData setLoadbalancer(QueryCasLoadbalanceMountResponseBodyDataLoadbalancer loadbalancer) {
            this.loadbalancer = loadbalancer;
            return this;
        }
        public QueryCasLoadbalanceMountResponseBodyDataLoadbalancer getLoadbalancer() {
            return this.loadbalancer;
        }

    }

}
