// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllCasLoadbalanceMountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AllCasLoadbalanceMountResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AllCasLoadbalanceMountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllCasLoadbalanceMountResponseBody self = new AllCasLoadbalanceMountResponseBody();
        return TeaModel.build(map, self);
    }

    public AllCasLoadbalanceMountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllCasLoadbalanceMountResponseBody setData(java.util.List<AllCasLoadbalanceMountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AllCasLoadbalanceMountResponseBodyData> getData() {
        return this.data;
    }

    public AllCasLoadbalanceMountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AllCasLoadbalanceMountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk extends TeaModel {
        @NameInMap("SnapshotSequence")
        public String snapshotSequence;

        @NameInMap("Device")
        public String device;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SpecId")
        public String specId;

        public static AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk self = new AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk();
            return TeaModel.build(map, self);
        }

        public AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk setSnapshotSequence(String snapshotSequence) {
            this.snapshotSequence = snapshotSequence;
            return this;
        }
        public String getSnapshotSequence() {
            return this.snapshotSequence;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

    }

    public static class AllCasLoadbalanceMountResponseBodyDataComputer extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("OsBit")
        public Long osBit;

        @NameInMap("Password")
        public String password;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ImageIaasId")
        public String imageIaasId;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("LastOpsType")
        public String lastOpsType;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("SpecIaasId")
        public String specIaasId;

        @NameInMap("CommonImage")
        public Boolean commonImage;

        @NameInMap("Os")
        public String os;

        @NameInMap("Initialized")
        public Boolean initialized;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("ElasticIp")
        public String elasticIp;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("CpuShared")
        public Boolean cpuShared;

        @NameInMap("ThreadsPerCore")
        public Long threadsPerCore;

        @NameInMap("Id")
        public String id;

        @NameInMap("SystemDisk")
        public AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk systemDisk;

        @NameInMap("LastOpsOrderId")
        public String lastOpsOrderId;

        public static AllCasLoadbalanceMountResponseBodyDataComputer build(java.util.Map<String, ?> map) throws Exception {
            AllCasLoadbalanceMountResponseBodyDataComputer self = new AllCasLoadbalanceMountResponseBodyDataComputer();
            return TeaModel.build(map, self);
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setOsBit(Long osBit) {
            this.osBit = osBit;
            return this;
        }
        public Long getOsBit() {
            return this.osBit;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setImageIaasId(String imageIaasId) {
            this.imageIaasId = imageIaasId;
            return this;
        }
        public String getImageIaasId() {
            return this.imageIaasId;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setLastOpsType(String lastOpsType) {
            this.lastOpsType = lastOpsType;
            return this;
        }
        public String getLastOpsType() {
            return this.lastOpsType;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setSpecIaasId(String specIaasId) {
            this.specIaasId = specIaasId;
            return this;
        }
        public String getSpecIaasId() {
            return this.specIaasId;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setCommonImage(Boolean commonImage) {
            this.commonImage = commonImage;
            return this;
        }
        public Boolean getCommonImage() {
            return this.commonImage;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setInitialized(Boolean initialized) {
            this.initialized = initialized;
            return this;
        }
        public Boolean getInitialized() {
            return this.initialized;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setElasticIp(String elasticIp) {
            this.elasticIp = elasticIp;
            return this;
        }
        public String getElasticIp() {
            return this.elasticIp;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setCpuShared(Boolean cpuShared) {
            this.cpuShared = cpuShared;
            return this;
        }
        public Boolean getCpuShared() {
            return this.cpuShared;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setThreadsPerCore(Long threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Long getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setSystemDisk(AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public AllCasLoadbalanceMountResponseBodyDataComputerSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public AllCasLoadbalanceMountResponseBodyDataComputer setLastOpsOrderId(String lastOpsOrderId) {
            this.lastOpsOrderId = lastOpsOrderId;
            return this;
        }
        public String getLastOpsOrderId() {
            return this.lastOpsOrderId;
        }

    }

    public static class AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope extends TeaModel {
        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Region")
        public String region;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("Cell")
        public String cell;

        public static AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope build(java.util.Map<String, ?> map) throws Exception {
            AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope self = new AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope();
            return TeaModel.build(map, self);
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

    }

    public static class AllCasLoadbalanceMountResponseBodyDataLoadbalancer extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VswitchIaasId")
        public String vswitchIaasId;

        @NameInMap("VipAddresses")
        public java.util.List<String> vipAddresses;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("ShareMode")
        public Boolean shareMode;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Domains")
        public java.util.List<String> domains;

        @NameInMap("VipAddressType")
        public String vipAddressType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("VipType")
        public String vipType;

        @NameInMap("Scope")
        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope scope;

        @NameInMap("Name")
        public String name;

        @NameInMap("ClusterMode")
        public Boolean clusterMode;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClusterId")
        public String clusterId;

        public static AllCasLoadbalanceMountResponseBodyDataLoadbalancer build(java.util.Map<String, ?> map) throws Exception {
            AllCasLoadbalanceMountResponseBodyDataLoadbalancer self = new AllCasLoadbalanceMountResponseBodyDataLoadbalancer();
            return TeaModel.build(map, self);
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setVswitchIaasId(String vswitchIaasId) {
            this.vswitchIaasId = vswitchIaasId;
            return this;
        }
        public String getVswitchIaasId() {
            return this.vswitchIaasId;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setVipAddresses(java.util.List<String> vipAddresses) {
            this.vipAddresses = vipAddresses;
            return this;
        }
        public java.util.List<String> getVipAddresses() {
            return this.vipAddresses;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setShareMode(Boolean shareMode) {
            this.shareMode = shareMode;
            return this;
        }
        public Boolean getShareMode() {
            return this.shareMode;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setVipAddressType(String vipAddressType) {
            this.vipAddressType = vipAddressType;
            return this;
        }
        public String getVipAddressType() {
            return this.vipAddressType;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setVipType(String vipType) {
            this.vipType = vipType;
            return this;
        }
        public String getVipType() {
            return this.vipType;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setScope(AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope scope) {
            this.scope = scope;
            return this;
        }
        public AllCasLoadbalanceMountResponseBodyDataLoadbalancerScope getScope() {
            return this.scope;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class AllCasLoadbalanceMountResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Computer")
        public AllCasLoadbalanceMountResponseBodyDataComputer computer;

        @NameInMap("Loadbalancer")
        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer loadbalancer;

        public static AllCasLoadbalanceMountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AllCasLoadbalanceMountResponseBodyData self = new AllCasLoadbalanceMountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AllCasLoadbalanceMountResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AllCasLoadbalanceMountResponseBodyData setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public AllCasLoadbalanceMountResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public AllCasLoadbalanceMountResponseBodyData setComputer(AllCasLoadbalanceMountResponseBodyDataComputer computer) {
            this.computer = computer;
            return this;
        }
        public AllCasLoadbalanceMountResponseBodyDataComputer getComputer() {
            return this.computer;
        }

        public AllCasLoadbalanceMountResponseBodyData setLoadbalancer(AllCasLoadbalanceMountResponseBodyDataLoadbalancer loadbalancer) {
            this.loadbalancer = loadbalancer;
            return this;
        }
        public AllCasLoadbalanceMountResponseBodyDataLoadbalancer getLoadbalancer() {
            return this.loadbalancer;
        }

    }

}
