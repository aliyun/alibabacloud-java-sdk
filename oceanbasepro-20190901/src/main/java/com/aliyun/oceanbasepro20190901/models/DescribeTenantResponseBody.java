// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 租户信息。
    @NameInMap("Tenant")
    public DescribeTenantResponseBodyTenant tenant;

    public static DescribeTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantResponseBody self = new DescribeTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantResponseBody setTenant(DescribeTenantResponseBodyTenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public DescribeTenantResponseBodyTenant getTenant() {
        return this.tenant;
    }

    public static class DescribeTenantResponseBodyTenantTenantConnections extends TeaModel {
        // 连接地址的服务模式。 ReadWrite：可读可写，提供强一致读写服务 ReadOnly：只读，保证数据最终一致性 Clog：事务日志服务
        @NameInMap("ConnectionRole")
        public String connectionRole;

        // 租户连接对应的访问可用区列表。
        @NameInMap("ConnectionZones")
        public java.util.List<String> connectionZones;

        // 访问租户的公网连接地址。
        @NameInMap("InternetAddress")
        public String internetAddress;

        // 访问租户的公网连接开通状态。 CLOSED：关闭 ALLOCATING_INTERNET_ADDRESS：申请中 PENDING_OFFLINE_INTERNET_ADDRESS: 公网地址关闭中 ONLINE：服务中
        @NameInMap("InternetAddressStatus")
        public String internetAddressStatus;

        // 访问租户的公网连接端口。
        @NameInMap("InternetPort")
        public Integer internetPort;

        // 访问租户的私网连接地址。
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        // 访问租户的连接地址对应的主可用区。
        @NameInMap("IntranetAddressMasterZoneId")
        public String intranetAddressMasterZoneId;

        // 访问租户的连接地址对应的备可用区。
        @NameInMap("IntranetAddressSlaveZoneId")
        public String intranetAddressSlaveZoneId;

        // 访问租户的私网连接地址状态。 ONLINE: 服务中
        @NameInMap("IntranetAddressStatus")
        public String intranetAddressStatus;

        // 访问租户的私网连接端口。
        @NameInMap("IntranetPort")
        public Integer intranetPort;

        // 虚拟交换机（VSwitch） ID。
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // 专有网络（VPC） ID。
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantResponseBodyTenantTenantConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantConnections self = new DescribeTenantResponseBodyTenantTenantConnections();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantConnections setConnectionRole(String connectionRole) {
            this.connectionRole = connectionRole;
            return this;
        }
        public String getConnectionRole() {
            return this.connectionRole;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setConnectionZones(java.util.List<String> connectionZones) {
            this.connectionZones = connectionZones;
            return this;
        }
        public java.util.List<String> getConnectionZones() {
            return this.connectionZones;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetAddressStatus(String internetAddressStatus) {
            this.internetAddressStatus = internetAddressStatus;
            return this;
        }
        public String getInternetAddressStatus() {
            return this.internetAddressStatus;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetPort(Integer internetPort) {
            this.internetPort = internetPort;
            return this;
        }
        public Integer getInternetPort() {
            return this.internetPort;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetAddressMasterZoneId(String intranetAddressMasterZoneId) {
            this.intranetAddressMasterZoneId = intranetAddressMasterZoneId;
            return this;
        }
        public String getIntranetAddressMasterZoneId() {
            return this.intranetAddressMasterZoneId;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetAddressSlaveZoneId(String intranetAddressSlaveZoneId) {
            this.intranetAddressSlaveZoneId = intranetAddressSlaveZoneId;
            return this;
        }
        public String getIntranetAddressSlaveZoneId() {
            return this.intranetAddressSlaveZoneId;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetAddressStatus(String intranetAddressStatus) {
            this.intranetAddressStatus = intranetAddressStatus;
            return this;
        }
        public String getIntranetAddressStatus() {
            return this.intranetAddressStatus;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetPort(Integer intranetPort) {
            this.intranetPort = intranetPort;
            return this;
        }
        public Integer getIntranetPort() {
            return this.intranetPort;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResourceCpu extends TeaModel {
        // 租户总的CPU核数，单位：Core。
        @NameInMap("TotalCpu")
        public Float totalCpu;

        // 租户每个Unit的CPU核数，单位：Core。
        @NameInMap("UnitCpu")
        public Float unitCpu;

        // 租户已使用的CPU核数，单位：Core。
        @NameInMap("UsedCpu")
        public Float usedCpu;

        public static DescribeTenantResponseBodyTenantTenantResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResourceCpu self = new DescribeTenantResponseBodyTenantTenantResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResourceCpu setTotalCpu(Float totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Float getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeTenantResponseBodyTenantTenantResourceCpu setUnitCpu(Float unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeTenantResponseBodyTenantTenantResourceCpu setUsedCpu(Float usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Float getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResourceDiskSize extends TeaModel {
        // 租户已使用的磁盘大小，单位：GB。
        @NameInMap("UsedDiskSize")
        public Float usedDiskSize;

        public static DescribeTenantResponseBodyTenantTenantResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResourceDiskSize self = new DescribeTenantResponseBodyTenantTenantResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResourceDiskSize setUsedDiskSize(Float usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Float getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResourceMemory extends TeaModel {
        // 租户总的内存大小，单位：GB。
        @NameInMap("TotalMemory")
        public Float totalMemory;

        // 租户每个Unit的内存大小，单位：GB。
        @NameInMap("UnitMemory")
        public Float unitMemory;

        // 租户已使用的内存，单位：GB。
        @NameInMap("UsedMemory")
        public Float usedMemory;

        public static DescribeTenantResponseBodyTenantTenantResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResourceMemory self = new DescribeTenantResponseBodyTenantTenantResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResourceMemory setTotalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeTenantResponseBodyTenantTenantResourceMemory setUnitMemory(Float unitMemory) {
            this.unitMemory = unitMemory;
            return this;
        }
        public Float getUnitMemory() {
            return this.unitMemory;
        }

        public DescribeTenantResponseBodyTenantTenantResourceMemory setUsedMemory(Float usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Float getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResource extends TeaModel {
        // 租户的CPU资源信息。
        @NameInMap("Cpu")
        public DescribeTenantResponseBodyTenantTenantResourceCpu cpu;

        // 租户磁盘资源信息。
        @NameInMap("DiskSize")
        public DescribeTenantResponseBodyTenantTenantResourceDiskSize diskSize;

        // 租户内存资源信息。
        @NameInMap("Memory")
        public DescribeTenantResponseBodyTenantTenantResourceMemory memory;

        // 租户的unit个数。
        @NameInMap("UnitNum")
        public Integer unitNum;

        public static DescribeTenantResponseBodyTenantTenantResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResource self = new DescribeTenantResponseBodyTenantTenantResource();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResource setCpu(DescribeTenantResponseBodyTenantTenantResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeTenantResponseBodyTenantTenantResource setDiskSize(DescribeTenantResponseBodyTenantTenantResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeTenantResponseBodyTenantTenantResource setMemory(DescribeTenantResponseBodyTenantTenantResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResourceMemory getMemory() {
            return this.memory;
        }

        public DescribeTenantResponseBodyTenantTenantResource setUnitNum(Integer unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Integer getUnitNum() {
            return this.unitNum;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantZones extends TeaModel {
        // 租户可用区所属的地域。
        @NameInMap("Region")
        public String region;

        // 租户可用区ID。
        @NameInMap("TenantZoneId")
        public String tenantZoneId;

        // 租户可用区的请求类型。 ReadWrite：可读可写 ReadOnly：只读 对于多机房高可用集群，其主可用区为ReadWrite。备可用区为ReadOnly; 对于单机房高可用集群，其所有可用区均为ReadWrite。
        @NameInMap("TenantZoneRole")
        public String tenantZoneRole;

        public static DescribeTenantResponseBodyTenantTenantZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantZones self = new DescribeTenantResponseBodyTenantTenantZones();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantZones setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeTenantResponseBodyTenantTenantZones setTenantZoneId(String tenantZoneId) {
            this.tenantZoneId = tenantZoneId;
            return this;
        }
        public String getTenantZoneId() {
            return this.tenantZoneId;
        }

        public DescribeTenantResponseBodyTenantTenantZones setTenantZoneRole(String tenantZoneRole) {
            this.tenantZoneRole = tenantZoneRole;
            return this;
        }
        public String getTenantZoneRole() {
            return this.tenantZoneRole;
        }

    }

    public static class DescribeTenantResponseBodyTenant extends TeaModel {
        // Clog服务开启状态。 CLOSED: 关闭 ONLINE：服务中
        @NameInMap("ClogServiceStatus")
        public String clogServiceStatus;

        // 租户的创建时间。
        @NameInMap("CreateTime")
        public String createTime;

        // 租户的数据副本模式。 对于高可用版本：三地域为N-N-N，两可用区和单可用区均为N-N； 对于基础版为N。 其中，N为单可用区内的节点数。
        @NameInMap("DeployMode")
        public String deployMode;

        // 集群的部署类型。 multiple：多机房 single：单机房 dual：双机房
        @NameInMap("DeployType")
        public String deployType;

        // 租户描述信息。
        @NameInMap("Description")
        public String description;

        // 是否可使用Clog服务，如需开启，请工单联系。
        @NameInMap("EnableClogService")
        public Boolean enableClogService;

        // 租户的主可用区。
        @NameInMap("PrimaryZone")
        public String primaryZone;

        // 租户的状态。 PENDING_CREATE: 创建中 RESTORE: 恢复中 ONLINE: 运行中 SPEC_MODIFYING: 规格修改中 ALLOCATING_INTERNET_ADDRESS: 公网地址分配中 PENDING_OFFLINE_INTERNET_ADDRESS: 公网地址关闭中 PRIMARY_ZONE_MODIFYING: 切主可用区中 PARAMETER_MODIFYING: 参数修改中 WHITE_LIST_MODIFING: 白名单修改中
        @NameInMap("Status")
        public String status;

        // 租户的连接访问信息。
        @NameInMap("TenantConnections")
        public java.util.List<DescribeTenantResponseBodyTenantTenantConnections> tenantConnections;

        // 租户ID。
        @NameInMap("TenantId")
        public String tenantId;

        // 租户模式。 当前支持： Oracle：Oracle模式 MySQL: MySQL模式
        @NameInMap("TenantMode")
        public String tenantMode;

        // 租户名称。
        @NameInMap("TenantName")
        public String tenantName;

        // 租户的资源信息。
        @NameInMap("TenantResource")
        public DescribeTenantResponseBodyTenantTenantResource tenantResource;

        // 租户可用区信息。
        @NameInMap("TenantZones")
        public java.util.List<DescribeTenantResponseBodyTenantTenantZones> tenantZones;

        // 专有网络（VPC） ID。 如果没有合适的 VPC，请根据页面提示创建一个 VPC，详情参见 什么是专有网络
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantResponseBodyTenant build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenant self = new DescribeTenantResponseBodyTenant();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenant setClogServiceStatus(String clogServiceStatus) {
            this.clogServiceStatus = clogServiceStatus;
            return this;
        }
        public String getClogServiceStatus() {
            return this.clogServiceStatus;
        }

        public DescribeTenantResponseBodyTenant setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTenantResponseBodyTenant setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeTenantResponseBodyTenant setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeTenantResponseBodyTenant setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTenantResponseBodyTenant setEnableClogService(Boolean enableClogService) {
            this.enableClogService = enableClogService;
            return this;
        }
        public Boolean getEnableClogService() {
            return this.enableClogService;
        }

        public DescribeTenantResponseBodyTenant setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        public DescribeTenantResponseBodyTenant setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTenantResponseBodyTenant setTenantConnections(java.util.List<DescribeTenantResponseBodyTenantTenantConnections> tenantConnections) {
            this.tenantConnections = tenantConnections;
            return this;
        }
        public java.util.List<DescribeTenantResponseBodyTenantTenantConnections> getTenantConnections() {
            return this.tenantConnections;
        }

        public DescribeTenantResponseBodyTenant setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTenantResponseBodyTenant setTenantMode(String tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public String getTenantMode() {
            return this.tenantMode;
        }

        public DescribeTenantResponseBodyTenant setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeTenantResponseBodyTenant setTenantResource(DescribeTenantResponseBodyTenantTenantResource tenantResource) {
            this.tenantResource = tenantResource;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResource getTenantResource() {
            return this.tenantResource;
        }

        public DescribeTenantResponseBodyTenant setTenantZones(java.util.List<DescribeTenantResponseBodyTenantTenantZones> tenantZones) {
            this.tenantZones = tenantZones;
            return this;
        }
        public java.util.List<DescribeTenantResponseBodyTenantTenantZones> getTenantZones() {
            return this.tenantZones;
        }

        public DescribeTenantResponseBodyTenant setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
