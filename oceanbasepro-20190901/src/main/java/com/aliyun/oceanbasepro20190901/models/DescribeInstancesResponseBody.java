// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstancesResourceCpu extends TeaModel {
        @NameInMap("TotalCpu")
        public Long totalCpu;

        @NameInMap("UnitCpu")
        public Long unitCpu;

        @NameInMap("UsedCpu")
        public Long usedCpu;

        public static DescribeInstancesResponseBodyInstancesResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceCpu self = new DescribeInstancesResponseBodyInstancesResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setTotalCpu(Long totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Long getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setUnitCpu(Long unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Long getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setUsedCpu(Long usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Long getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceDiskSize extends TeaModel {
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstancesResponseBodyInstancesResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceDiskSize self = new DescribeInstancesResponseBodyInstancesResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setUnitDiskSize(Long unitDiskSize) {
            this.unitDiskSize = unitDiskSize;
            return this;
        }
        public Long getUnitDiskSize() {
            return this.unitDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setUsedDiskSize(Long usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceMemory extends TeaModel {
        @NameInMap("TotalMemory")
        public Long totalMemory;

        @NameInMap("UnitMemory")
        public Long unitMemory;

        @NameInMap("UsedMemory")
        public Long usedMemory;

        public static DescribeInstancesResponseBodyInstancesResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceMemory self = new DescribeInstancesResponseBodyInstancesResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setUnitMemory(Long unitMemory) {
            this.unitMemory = unitMemory;
            return this;
        }
        public Long getUnitMemory() {
            return this.unitMemory;
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setUsedMemory(Long usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Long getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResource extends TeaModel {
        @NameInMap("Cpu")
        public DescribeInstancesResponseBodyInstancesResourceCpu cpu;

        @NameInMap("DiskSize")
        public DescribeInstancesResponseBodyInstancesResourceDiskSize diskSize;

        @NameInMap("Memory")
        public DescribeInstancesResponseBodyInstancesResourceMemory memory;

        @NameInMap("UnitCount")
        public Long unitCount;

        public static DescribeInstancesResponseBodyInstancesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResource self = new DescribeInstancesResponseBodyInstancesResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResource setCpu(DescribeInstancesResponseBodyInstancesResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesResource setDiskSize(DescribeInstancesResponseBodyInstancesResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstancesResponseBodyInstancesResource setMemory(DescribeInstancesResponseBodyInstancesResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceMemory getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseBodyInstancesResource setUnitCount(Long unitCount) {
            this.unitCount = unitCount;
            return this;
        }
        public Long getUnitCount() {
            return this.unitCount;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("DiskSize")
        public String diskSize;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("EnableUpgradeNodes")
        public Boolean enableUpgradeNodes;

        @NameInMap("ExpireSeconds")
        public Integer expireSeconds;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("Mem")
        public Long mem;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Resource")
        public DescribeInstancesResponseBodyInstancesResource resource;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityIps")
        public java.util.List<String> securityIps;

        @NameInMap("Series")
        public String series;

        @NameInMap("State")
        public String state;

        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setAvailableZones(java.util.List<String> availableZones) {
            this.availableZones = availableZones;
            return this;
        }
        public java.util.List<String> getAvailableZones() {
            return this.availableZones;
        }

        public DescribeInstancesResponseBodyInstances setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeInstancesResponseBodyInstances setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstancesResponseBodyInstances setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeInstancesResponseBodyInstances setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeInstancesResponseBodyInstances setDiskSize(String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public String getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstancesResponseBodyInstances setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeInstancesResponseBodyInstances setEnableUpgradeNodes(Boolean enableUpgradeNodes) {
            this.enableUpgradeNodes = enableUpgradeNodes;
            return this;
        }
        public Boolean getEnableUpgradeNodes() {
            return this.enableUpgradeNodes;
        }

        public DescribeInstancesResponseBodyInstances setExpireSeconds(Integer expireSeconds) {
            this.expireSeconds = expireSeconds;
            return this;
        }
        public Integer getExpireSeconds() {
            return this.expireSeconds;
        }

        public DescribeInstancesResponseBodyInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseBodyInstances setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeInstancesResponseBodyInstances setMem(Long mem) {
            this.mem = mem;
            return this;
        }
        public Long getMem() {
            return this.mem;
        }

        public DescribeInstancesResponseBodyInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeInstancesResponseBodyInstances setResource(DescribeInstancesResponseBodyInstancesResource resource) {
            this.resource = resource;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResource getResource() {
            return this.resource;
        }

        public DescribeInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstances setSecurityIps(java.util.List<String> securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public java.util.List<String> getSecurityIps() {
            return this.securityIps;
        }

        public DescribeInstancesResponseBodyInstances setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeInstancesResponseBodyInstances setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeInstancesResponseBodyInstances setUsedDiskSize(Long usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public DescribeInstancesResponseBodyInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeInstancesResponseBodyInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
