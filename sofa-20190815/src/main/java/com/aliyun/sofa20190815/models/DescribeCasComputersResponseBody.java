// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeCasComputersResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Data")
    public java.util.List<DescribeCasComputersResponseBodyData> data;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCasComputersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasComputersResponseBody self = new DescribeCasComputersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasComputersResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCasComputersResponseBody setData(java.util.List<DescribeCasComputersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCasComputersResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCasComputersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCasComputersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasComputersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeCasComputersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeCasComputersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCasComputersResponseBodyDataDataDisksComputer extends TeaModel {
        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static DescribeCasComputersResponseBodyDataDataDisksComputer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasComputersResponseBodyDataDataDisksComputer self = new DescribeCasComputersResponseBodyDataDataDisksComputer();
            return TeaModel.build(map, self);
        }

        public DescribeCasComputersResponseBodyDataDataDisksComputer setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public DescribeCasComputersResponseBodyDataDataDisksComputer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCasComputersResponseBodyDataDataDisksComputer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCasComputersResponseBodyDataDataDisksComputer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCasComputersResponseBodyDataDataDisks extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Computer")
        public DescribeCasComputersResponseBodyDataDataDisksComputer computer;

        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        @NameInMap("DeleteWithComputer")
        public Boolean deleteWithComputer;

        @NameInMap("Device")
        public String device;

        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Portable")
        public Boolean portable;

        @NameInMap("ProviderId")
        public String providerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeCasComputersResponseBodyDataDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasComputersResponseBodyDataDataDisks self = new DescribeCasComputersResponseBodyDataDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeCasComputersResponseBodyDataDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setComputer(DescribeCasComputersResponseBodyDataDataDisksComputer computer) {
            this.computer = computer;
            return this;
        }
        public DescribeCasComputersResponseBodyDataDataDisksComputer getComputer() {
            return this.computer;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setDeleteWithComputer(Boolean deleteWithComputer) {
            this.deleteWithComputer = deleteWithComputer;
            return this;
        }
        public Boolean getDeleteWithComputer() {
            return this.deleteWithComputer;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public DescribeCasComputersResponseBodyDataDataDisks setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeCasComputersResponseBodyDataOptions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCasComputersResponseBodyDataOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasComputersResponseBodyDataOptions self = new DescribeCasComputersResponseBodyDataOptions();
            return TeaModel.build(map, self);
        }

        public DescribeCasComputersResponseBodyDataOptions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCasComputersResponseBodyDataOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCasComputersResponseBodyDataSystemDiskComputer extends TeaModel {
        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static DescribeCasComputersResponseBodyDataSystemDiskComputer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasComputersResponseBodyDataSystemDiskComputer self = new DescribeCasComputersResponseBodyDataSystemDiskComputer();
            return TeaModel.build(map, self);
        }

        public DescribeCasComputersResponseBodyDataSystemDiskComputer setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public DescribeCasComputersResponseBodyDataSystemDiskComputer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCasComputersResponseBodyDataSystemDiskComputer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCasComputersResponseBodyDataSystemDiskComputer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCasComputersResponseBodyDataSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Computer")
        public DescribeCasComputersResponseBodyDataSystemDiskComputer computer;

        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        @NameInMap("DeleteWithComputer")
        public Boolean deleteWithComputer;

        @NameInMap("Device")
        public String device;

        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Portable")
        public Boolean portable;

        @NameInMap("ProviderId")
        public String providerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeCasComputersResponseBodyDataSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasComputersResponseBodyDataSystemDisk self = new DescribeCasComputersResponseBodyDataSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setComputer(DescribeCasComputersResponseBodyDataSystemDiskComputer computer) {
            this.computer = computer;
            return this;
        }
        public DescribeCasComputersResponseBodyDataSystemDiskComputer getComputer() {
            return this.computer;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setDeleteWithComputer(Boolean deleteWithComputer) {
            this.deleteWithComputer = deleteWithComputer;
            return this;
        }
        public Boolean getDeleteWithComputer() {
            return this.deleteWithComputer;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public DescribeCasComputersResponseBodyDataSystemDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeCasComputersResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCasComputersResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasComputersResponseBodyDataTags self = new DescribeCasComputersResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeCasComputersResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCasComputersResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCasComputersResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppServiceIds")
        public java.util.List<String> appServiceIds;

        @NameInMap("AssignedAppServiceIds")
        public java.util.List<String> assignedAppServiceIds;

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("AutoRenewPeriod")
        public Long autoRenewPeriod;

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

        @NameInMap("DataDisks")
        public java.util.List<DescribeCasComputersResponseBodyDataDataDisks> dataDisks;

        @NameInMap("DeployMode")
        public String deployMode;

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

        @NameInMap("IaasType")
        public String iaasType;

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

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

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

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Options")
        public java.util.List<DescribeCasComputersResponseBodyDataOptions> options;

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

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("SpecIaasId")
        public String specIaasId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SystemDisk")
        public DescribeCasComputersResponseBodyDataSystemDisk systemDisk;

        @NameInMap("Tags")
        public java.util.List<DescribeCasComputersResponseBodyDataTags> tags;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantId2")
        public String tenantId2;

        @NameInMap("ThreadsPerCore")
        public Long threadsPerCore;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("VSwitchIaasId")
        public String vSwitchIaasId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeCasComputersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasComputersResponseBodyData self = new DescribeCasComputersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCasComputersResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeCasComputersResponseBodyData setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public DescribeCasComputersResponseBodyData setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
            this.assignedAppServiceIds = assignedAppServiceIds;
            return this;
        }
        public java.util.List<String> getAssignedAppServiceIds() {
            return this.assignedAppServiceIds;
        }

        public DescribeCasComputersResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeCasComputersResponseBodyData setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeCasComputersResponseBodyData setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeCasComputersResponseBodyData setCommonImage(Boolean commonImage) {
            this.commonImage = commonImage;
            return this;
        }
        public Boolean getCommonImage() {
            return this.commonImage;
        }

        public DescribeCasComputersResponseBodyData setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public DescribeCasComputersResponseBodyData setCpuShared(Boolean cpuShared) {
            this.cpuShared = cpuShared;
            return this;
        }
        public Boolean getCpuShared() {
            return this.cpuShared;
        }

        public DescribeCasComputersResponseBodyData setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCasComputersResponseBodyData setDataDisks(java.util.List<DescribeCasComputersResponseBodyDataDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DescribeCasComputersResponseBodyDataDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeCasComputersResponseBodyData setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeCasComputersResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCasComputersResponseBodyData setElasticIp(String elasticIp) {
            this.elasticIp = elasticIp;
            return this;
        }
        public String getElasticIp() {
            return this.elasticIp;
        }

        public DescribeCasComputersResponseBodyData setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeCasComputersResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public DescribeCasComputersResponseBodyData setIaasStatus(String iaasStatus) {
            this.iaasStatus = iaasStatus;
            return this;
        }
        public String getIaasStatus() {
            return this.iaasStatus;
        }

        public DescribeCasComputersResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public DescribeCasComputersResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCasComputersResponseBodyData setImageIaasId(String imageIaasId) {
            this.imageIaasId = imageIaasId;
            return this;
        }
        public String getImageIaasId() {
            return this.imageIaasId;
        }

        public DescribeCasComputersResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeCasComputersResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeCasComputersResponseBodyData setInitialized(Boolean initialized) {
            this.initialized = initialized;
            return this;
        }
        public Boolean getInitialized() {
            return this.initialized;
        }

        public DescribeCasComputersResponseBodyData setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeCasComputersResponseBodyData setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeCasComputersResponseBodyData setLastOpsOrderId(String lastOpsOrderId) {
            this.lastOpsOrderId = lastOpsOrderId;
            return this;
        }
        public String getLastOpsOrderId() {
            return this.lastOpsOrderId;
        }

        public DescribeCasComputersResponseBodyData setLastOpsType(String lastOpsType) {
            this.lastOpsType = lastOpsType;
            return this;
        }
        public String getLastOpsType() {
            return this.lastOpsType;
        }

        public DescribeCasComputersResponseBodyData setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeCasComputersResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCasComputersResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeCasComputersResponseBodyData setOptions(java.util.List<DescribeCasComputersResponseBodyDataOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<DescribeCasComputersResponseBodyDataOptions> getOptions() {
            return this.options;
        }

        public DescribeCasComputersResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeCasComputersResponseBodyData setOsBit(Long osBit) {
            this.osBit = osBit;
            return this;
        }
        public Long getOsBit() {
            return this.osBit;
        }

        public DescribeCasComputersResponseBodyData setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeCasComputersResponseBodyData setPaasStatus(String paasStatus) {
            this.paasStatus = paasStatus;
            return this;
        }
        public String getPaasStatus() {
            return this.paasStatus;
        }

        public DescribeCasComputersResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeCasComputersResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeCasComputersResponseBodyData setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public DescribeCasComputersResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeCasComputersResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCasComputersResponseBodyData setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeCasComputersResponseBodyData setSpecIaasId(String specIaasId) {
            this.specIaasId = specIaasId;
            return this;
        }
        public String getSpecIaasId() {
            return this.specIaasId;
        }

        public DescribeCasComputersResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCasComputersResponseBodyData setSystemDisk(DescribeCasComputersResponseBodyDataSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeCasComputersResponseBodyDataSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeCasComputersResponseBodyData setTags(java.util.List<DescribeCasComputersResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeCasComputersResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public DescribeCasComputersResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeCasComputersResponseBodyData setTenantId2(String tenantId2) {
            this.tenantId2 = tenantId2;
            return this;
        }
        public String getTenantId2() {
            return this.tenantId2;
        }

        public DescribeCasComputersResponseBodyData setThreadsPerCore(Long threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Long getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public DescribeCasComputersResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public DescribeCasComputersResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public DescribeCasComputersResponseBodyData setVSwitchIaasId(String vSwitchIaasId) {
            this.vSwitchIaasId = vSwitchIaasId;
            return this;
        }
        public String getVSwitchIaasId() {
            return this.vSwitchIaasId;
        }

        public DescribeCasComputersResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeCasComputersResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public DescribeCasComputersResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
