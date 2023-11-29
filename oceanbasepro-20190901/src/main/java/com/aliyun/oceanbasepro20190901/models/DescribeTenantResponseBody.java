// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantResponseBody extends TeaModel {
    /**
     * <p>The zone information of the tenant.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the zone.</p>
     */
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
        /**
         * <p>The primary zone of the tenant.</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The Internet address for accessing the tenant.</p>
         */
        @NameInMap("ConnectionZones")
        public java.util.List<String> connectionZones;

        @NameInMap("EnableTransactionSplit")
        public Boolean enableTransactionSplit;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("InternetAddress")
        public String internetAddress;

        /**
         * <p>实例系列</p>
         */
        @NameInMap("InternetAddressStatus")
        public String internetAddressStatus;

        /**
         * <p>实例类型</p>
         */
        @NameInMap("InternetPort")
        public Integer internetPort;

        /**
         * <p>The deployment type of the cluster. Valid values:  </p>
         * <p>- multiple: multi-IDC deployment   </p>
         * <p>- single: single-IDC deployment   </p>
         * <p>- dual: dual-IDC deployment</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>PayCore business database</p>
         */
        @NameInMap("IntranetAddressMasterZoneId")
        public String intranetAddressMasterZoneId;

        /**
         * <p>The total number of CPU cores of the tenant.</p>
         */
        @NameInMap("IntranetAddressSlaveZoneId")
        public String intranetAddressSlaveZoneId;

        /**
         * <p>付费类型</p>
         */
        @NameInMap("IntranetAddressStatus")
        public String intranetAddressStatus;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("IntranetPort")
        public Integer intranetPort;

        @NameInMap("MaxConnectionNum")
        public Long maxConnectionNum;

        @NameInMap("ParallelQueryDegree")
        public Long parallelQueryDegree;

        @NameInMap("TenantEndpointId")
        public String tenantEndpointId;

        /**
         * <p>The primary zone corresponding to the address for accessing the tenant.</p>
         */
        @NameInMap("TransactionSplit")
        public Boolean transactionSplit;

        /**
         * <p>The connection access information of the tenant.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The service mode of the connection address. Valid values:  </p>
         * <p>ReadWrite: provides strong-consistency read and write services.   </p>
         * <p>ReadOnly: provides the read-only service to ensure ultimate consistency of data.   </p>
         * <p>Clog: provides transaction log services.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantResponseBodyTenantTenantConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantConnections self = new DescribeTenantResponseBodyTenantTenantConnections();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantConnections setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setConnectionZones(java.util.List<String> connectionZones) {
            this.connectionZones = connectionZones;
            return this;
        }
        public java.util.List<String> getConnectionZones() {
            return this.connectionZones;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setEnableTransactionSplit(Boolean enableTransactionSplit) {
            this.enableTransactionSplit = enableTransactionSplit;
            return this;
        }
        public Boolean getEnableTransactionSplit() {
            return this.enableTransactionSplit;
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

        public DescribeTenantResponseBodyTenantTenantConnections setMaxConnectionNum(Long maxConnectionNum) {
            this.maxConnectionNum = maxConnectionNum;
            return this;
        }
        public Long getMaxConnectionNum() {
            return this.maxConnectionNum;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setParallelQueryDegree(Long parallelQueryDegree) {
            this.parallelQueryDegree = parallelQueryDegree;
            return this;
        }
        public Long getParallelQueryDegree() {
            return this.parallelQueryDegree;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setTenantEndpointId(String tenantEndpointId) {
            this.tenantEndpointId = tenantEndpointId;
            return this;
        }
        public String getTenantEndpointId() {
            return this.tenantEndpointId;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setTransactionSplit(Boolean transactionSplit) {
            this.transactionSplit = transactionSplit;
            return this;
        }
        public Boolean getTransactionSplit() {
            return this.transactionSplit;
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

    public static class DescribeTenantResponseBodyTenantTenantResourceCapacityUnit extends TeaModel {
        @NameInMap("MaxCapacityUnit")
        public Integer maxCapacityUnit;

        @NameInMap("MinCapacityUnit")
        public Integer minCapacityUnit;

        @NameInMap("UsedCapacit")
        public Integer usedCapacit;

        public static DescribeTenantResponseBodyTenantTenantResourceCapacityUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResourceCapacityUnit self = new DescribeTenantResponseBodyTenantTenantResourceCapacityUnit();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResourceCapacityUnit setMaxCapacityUnit(Integer maxCapacityUnit) {
            this.maxCapacityUnit = maxCapacityUnit;
            return this;
        }
        public Integer getMaxCapacityUnit() {
            return this.maxCapacityUnit;
        }

        public DescribeTenantResponseBodyTenantTenantResourceCapacityUnit setMinCapacityUnit(Integer minCapacityUnit) {
            this.minCapacityUnit = minCapacityUnit;
            return this;
        }
        public Integer getMinCapacityUnit() {
            return this.minCapacityUnit;
        }

        public DescribeTenantResponseBodyTenantTenantResourceCapacityUnit setUsedCapacit(Integer usedCapacit) {
            this.usedCapacit = usedCapacit;
            return this;
        }
        public Integer getUsedCapacit() {
            return this.usedCapacit;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResourceCpu extends TeaModel {
        /**
         * <p>The data replica distribution mode of the tenant.    </p>
         * <br>
         * <p>- For the high availability version, N-N-N indicates the three-zone mode, and N-N indicates the dual-zone or single-zone mode.</p>
         * <p>- For the basic version, N indicates the single-zone mode. </p>
         * <br>
         * <p>> <br>N represents the number of nodes in a single zone.</p>
         */
        @NameInMap("TotalCpu")
        public Float totalCpu;

        /**
         * <p>The zone corresponding to the tenant connection.</p>
         */
        @NameInMap("UnitCpu")
        public Float unitCpu;

        /**
         * <p>The tenant mode.   </p>
         * <p>Valid values: </p>
         * <p>Oracle   </p>
         * <p>MySQL</p>
         */
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
        /**
         * <p>The total memory size of the tenant, in GB.</p>
         */
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

    public static class DescribeTenantResponseBodyTenantTenantResourceLogDiskSize extends TeaModel {
        @NameInMap("TotalLogDisk")
        public Integer totalLogDisk;

        @NameInMap("UnitLogDisk")
        public Integer unitLogDisk;

        public static DescribeTenantResponseBodyTenantTenantResourceLogDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResourceLogDiskSize self = new DescribeTenantResponseBodyTenantTenantResourceLogDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResourceLogDiskSize setTotalLogDisk(Integer totalLogDisk) {
            this.totalLogDisk = totalLogDisk;
            return this;
        }
        public Integer getTotalLogDisk() {
            return this.totalLogDisk;
        }

        public DescribeTenantResponseBodyTenantTenantResourceLogDiskSize setUnitLogDisk(Integer unitLogDisk) {
            this.unitLogDisk = unitLogDisk;
            return this;
        }
        public Integer getUnitLogDisk() {
            return this.unitLogDisk;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantResourceMemory extends TeaModel {
        /**
         * <p>The information about the memory resources of the tenant.</p>
         */
        @NameInMap("TotalMemory")
        public Float totalMemory;

        /**
         * <p>The time when the tenant was created.</p>
         */
        @NameInMap("UnitMemory")
        public Float unitMemory;

        /**
         * <p>The status of the Internet address for accessing the tenant. Valid values:   </p>
         * <p>Closed: The address is disabled.   </p>
         * <p>- ALLOCATING_INTERNET_ADDRESS: An address is being applied for.   </p>
         * <p>- PENDING_OFFLINE_INTERNET_ADDRESS: The address is being disabled.   </p>
         * <p>- ONLINE: The address is in service.</p>
         */
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
        @NameInMap("CapacityUnit")
        public DescribeTenantResponseBodyTenantTenantResourceCapacityUnit capacityUnit;

        /**
         * <p>The enabling status of the Clog service.  </p>
         * <p>CLOSED: The Clog service is disabled.  </p>
         * <p>- ONLINE: The Clog service is running.</p>
         */
        @NameInMap("Cpu")
        public DescribeTenantResponseBodyTenantTenantResourceCpu cpu;

        /**
         * <p>The status of the intranet address for accessing the tenant.  </p>
         * <p>The value ONLINE indicates that the address is in service.</p>
         */
        @NameInMap("DiskSize")
        public DescribeTenantResponseBodyTenantTenantResourceDiskSize diskSize;

        @NameInMap("LogDiskSize")
        public DescribeTenantResponseBodyTenantTenantResourceLogDiskSize logDiskSize;

        /**
         * <p>The description of the tenant.</p>
         */
        @NameInMap("Memory")
        public DescribeTenantResponseBodyTenantTenantResourceMemory memory;

        /**
         * <p>Alibaba Cloud CLI</p>
         */
        @NameInMap("UnitNum")
        public Integer unitNum;

        public static DescribeTenantResponseBodyTenantTenantResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantResource self = new DescribeTenantResponseBodyTenantTenantResource();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantResource setCapacityUnit(DescribeTenantResponseBodyTenantTenantResourceCapacityUnit capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResourceCapacityUnit getCapacityUnit() {
            return this.capacityUnit;
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

        public DescribeTenantResponseBodyTenantTenantResource setLogDiskSize(DescribeTenantResponseBodyTenantTenantResourceLogDiskSize logDiskSize) {
            this.logDiskSize = logDiskSize;
            return this;
        }
        public DescribeTenantResponseBodyTenantTenantResourceLogDiskSize getLogDiskSize() {
            return this.logDiskSize;
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
        /**
         * <p>是否允许开启读写分离地址</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The intranet port for accessing the tenant.</p>
         */
        @NameInMap("TenantZoneId")
        public String tenantZoneId;

        /**
         * <p>The character set.</p>
         */
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
        /**
         * <p>DescribeTenant</p>
         */
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        /**
         * <p>The number of CPU cores in each resource unit of the tenant.</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <p>地址类型</p>
         */
        @NameInMap("ClogServiceStatus")
        public String clogServiceStatus;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("Collation")
        public String collation;

        /**
         * <p>You can call this operation to create a single tenant in a specific cluster.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The list of zones.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The series of the instance.</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>Indicates whether to enable read/write splitting endpoint.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>You can call this operation to query the information of a specific tenant in a specific cluster.</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>是否可以申请Binlog服务</p>
         */
        @NameInMap("EnableBinlogService")
        public Boolean enableBinlogService;

        /**
         * <p>The intranet address for accessing the tenant.</p>
         */
        @NameInMap("EnableClogService")
        public Boolean enableClogService;

        /**
         * <p>The deployment type of the primary zone.</p>
         */
        @NameInMap("EnableInternetAddressService")
        public Boolean enableInternetAddressService;

        @NameInMap("EnableParallelQuery")
        public Boolean enableParallelQuery;

        @NameInMap("EnableReadWriteSplit")
        public Boolean enableReadWriteSplit;

        /**
         * <p>{</p>
         * <p>    "RequestId": "EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C",</p>
         * <p>    "Tenant": {</p>
         * <p>        "TenantId": "t33h8y08k****",</p>
         * <p>        "TenantName": "pay_online",</p>
         * <p>        "TenantMode": "Oracle",</p>
         * <p>        "VpcId": "vpc-bp1d2q3mhg9i23ofi****",</p>
         * <p>        "Status": "ONLINE",</p>
         * <p>        "PrimaryZone": "cn-hangzhou-i",</p>
         * <p>        "DeployType": "multiple",</p>
         * <p>        "DeployMode": "1-1-1",</p>
         * <p>        "Description": "PayCore business database",</p>
         * <p>        "CreateTime": "2021-09-17 15:52:17",</p>
         * <p>        "TenantResource": {</p>
         * <p>            "UnitNum": 1,</p>
         * <p>            "Cpu": {</p>
         * <p>                "UsedCpu": 8,</p>
         * <p>                "TotalCpu": 10,</p>
         * <p>                "UnitCpu": 8</p>
         * <p>            },</p>
         * <p>            "Memory": {</p>
         * <p>                "UsedMemory": 30,</p>
         * <p>                "TotalMemory": 64,</p>
         * <p>                "UnitMemory": 32</p>
         * <p>            },</p>
         * <p>            "DiskSize": {</p>
         * <p>                "UsedDiskSize": 86</p>
         * <p>            }</p>
         * <p>        },</p>
         * <p>        "TenantConnections": [</p>
         * <p>            {</p>
         * <p>                "ConnectionRole": "ReadWrite",</p>
         * <p>                "IntranetAddress": "t32a7ru5u****.oceanbase.aliyuncs.com",</p>
         * <p>                "IntranetPort": 3306,</p>
         * <p>                "InternetAddress": "t32a7ru5u****mo.oceanbase.aliyuncs.com",</p>
         * <p>                "InternetPort": 3306,</p>
         * <p>                "VpcId": "vpc-bp1qiail1asmfe23t****",</p>
         * <p>                "VSwitchId": "vsw-bp11k1aypnzu1l3whi****",</p>
         * <p>                "IntranetAddressMasterZoneId": "cn-hangzhou-i",</p>
         * <p>                "IntranetAddressSlaveZoneId": "cn-hangzhou-j",</p>
         * <p>                "IntranetAddressStatus": "ONLINE",</p>
         * <p>                "ConnectionZones": [</p>
         * <p>                    "cn-hangzhou-i"</p>
         * <p>                ],</p>
         * <p>                "InternetAddressStatus": "CLOSED"</p>
         * <p>            }</p>
         * <p>        ],</p>
         * <p>        "TenantZones": [</p>
         * <p>            {</p>
         * <p>                "TenantZoneId": "cn-hangzhou-i",</p>
         * <p>                "Region": "cn-hangzhou",</p>
         * <p>                "TenantZoneRole": "ReadOnly"</p>
         * <p>            }</p>
         * <p>        ],</p>
         * <p>        "ClogServiceStatus": "CLOSED"</p>
         * <p>    }</p>
         * <p>}</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>```</p>
         * <p>http(s)://[Endpoint]/?Action=DescribeTenant</p>
         * <p>&InstanceId=ob317v4uif****</p>
         * <p>&TenantId=ob2mr3oae0****</p>
         * <p>&Common request parameters</p>
         * <p>```</p>
         */
        @NameInMap("MasterIntranetAddressZone")
        public String masterIntranetAddressZone;

        @NameInMap("MaxParallelQueryDegree")
        public Long maxParallelQueryDegree;

        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The type of the payment.</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>Example 1</p>
         */
        @NameInMap("PrimaryZoneDeployType")
        public String primaryZoneDeployType;

        /**
         * <p><DescribeTenantResponse></p>
         * <p>    <RequestId>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</RequestId></p>
         * <p>    <Tenant></p>
         * <p>        <TenantId>t33h8y08k****</TenantId></p>
         * <p>        <TenantName>pay_online</TenantName></p>
         * <p>        <TenantMode>Oracle</TenantMode></p>
         * <p>        <VpcId>vpc-bp1d2q3mhg9i23ofi****</VpcId></p>
         * <p>        <Status>ONLINE</Status></p>
         * <p>        <PrimaryZone>cn-hangzhou-i</PrimaryZone></p>
         * <p>        <DeployType>multiple</DeployType></p>
         * <p>        <DeployMode>1-1-1</DeployMode></p>
         * <p>        <Description>PayCore business database</Description></p>
         * <p>        <CreateTime>2021-09-17 15:52:17</CreateTime></p>
         * <p>        <TenantResource></p>
         * <p>            <UnitNum>1</UnitNum></p>
         * <p>            <Cpu></p>
         * <p>                <UsedCpu>8</UsedCpu></p>
         * <p>                <TotalCpu>10</TotalCpu></p>
         * <p>                <UnitCpu>8</UnitCpu></p>
         * <p>            </Cpu></p>
         * <p>            <Memory></p>
         * <p>                <UsedMemory>30</UsedMemory></p>
         * <p>                <TotalMemory>64</TotalMemory></p>
         * <p>                <UnitMemory>32</UnitMemory></p>
         * <p>            </Memory></p>
         * <p>            <DiskSize></p>
         * <p>                <UsedDiskSize>86</UsedDiskSize></p>
         * <p>            </DiskSize></p>
         * <p>        </TenantResource></p>
         * <p>        <TenantConnections></p>
         * <p>            <ConnectionRole>ReadWrite</ConnectionRole></p>
         * <p>            <IntranetAddress>t32a7ru5u****.oceanbase.aliyuncs.com</IntranetAddress></p>
         * <p>            <IntranetPort>3306</IntranetPort></p>
         * <p>            <InternetAddress>t32a7ru5u****mo.oceanbase.aliyuncs.com</InternetAddress></p>
         * <p>            <InternetPort>3306</InternetPort></p>
         * <p>            <VpcId>vpc-bp1qiail1asmfe23t****</VpcId></p>
         * <p>            <VSwitchId>vsw-bp11k1aypnzu1l3whi****</VSwitchId></p>
         * <p>            <IntranetAddressMasterZoneId>cn-hangzhou-i</IntranetAddressMasterZoneId></p>
         * <p>            <IntranetAddressSlaveZoneId>cn-hangzhou-j</IntranetAddressSlaveZoneId></p>
         * <p>            <IntranetAddressStatus>ONLINE</IntranetAddressStatus></p>
         * <p>            <ConnectionZones>cn-hangzhou-i</ConnectionZones></p>
         * <p>            <InternetAddressStatus>CLOSED</InternetAddressStatus></p>
         * <p>        </TenantConnections></p>
         * <p>        <TenantZones></p>
         * <p>            <TenantZoneId>cn-hangzhou-i</TenantZoneId></p>
         * <p>            <Region>cn-hangzhou</Region></p>
         * <p>            <TenantZoneRole>ReadOnly</TenantZoneRole></p>
         * <p>        </TenantZones></p>
         * <p>        <ClogServiceStatus>CLOSED</ClogServiceStatus></p>
         * <p>    </Tenant></p>
         * <p></DescribeTenantResponse></p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>The character set.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of the tenant.   </p>
         * <p>- PENDING_CREATE: The tenant is being created.   </p>
         * <p>- RESTORE: The tenant is being recovered.   </p>
         * <p>- ONLINE: The tenant is running.   </p>
         * <p>- SPEC_MODIFYING: The specification of the tenant is being modified.   </p>
         * <p>- ALLOCATING_INTERNET_ADDRESS: An Internet address is being allocated.  </p>
         * <p>- PENDING_OFFLINE_INTERNET_ADDRESS: The Internet address is being disabled.  </p>
         * <p>- PRIMARY_ZONE_MODIFYING: The tenant is switching to a new primary zone.  </p>
         * <p>- PARAMETER_MODIFYING: Parameters are being modified.   </p>
         * <p>- WHITE_LIST_MODIFYING: The whitelist is being modified.</p>
         */
        @NameInMap("TenantConnections")
        public java.util.List<DescribeTenantResponseBodyTenantTenantConnections> tenantConnections;

        /**
         * <p>The region where the zone of the tenant resides.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The enabling status of the clog service.  </p>
         * <p>- CLOSED: The clog service is disabled.  </p>
         * <p>- ONLINE: The clog service is running.</p>
         */
        @NameInMap("TenantMode")
        public String tenantMode;

        /**
         * <p>The request type of the zone of the tenant.  ReadWrite: The zone supports data reads and writes. ReadOnly: The zone supports only data reads. For a high availability cluster with multiple IDCs, the primary zone provides ReadWrite services, and the standby zone provides ReadOnly services. For a high availability cluster with a single IDC, all zones provide ReadWrite services.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.</p>
         */
        @NameInMap("TenantResource")
        public DescribeTenantResponseBodyTenantTenantResource tenantResource;

        /**
         * <p>The standby zone corresponding to the address for accessing the tenant.</p>
         */
        @NameInMap("TenantZones")
        public java.util.List<DescribeTenantResponseBodyTenantTenantZones> tenantZones;

        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <p>Indicates whether the clog service is available. To enable the clog service, submit a ticket.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantResponseBodyTenant build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenant self = new DescribeTenantResponseBodyTenant();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenant setAvailableZones(java.util.List<String> availableZones) {
            this.availableZones = availableZones;
            return this;
        }
        public java.util.List<String> getAvailableZones() {
            return this.availableZones;
        }

        public DescribeTenantResponseBodyTenant setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeTenantResponseBodyTenant setClogServiceStatus(String clogServiceStatus) {
            this.clogServiceStatus = clogServiceStatus;
            return this;
        }
        public String getClogServiceStatus() {
            return this.clogServiceStatus;
        }

        public DescribeTenantResponseBodyTenant setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
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

        public DescribeTenantResponseBodyTenant setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeTenantResponseBodyTenant setEnableBinlogService(Boolean enableBinlogService) {
            this.enableBinlogService = enableBinlogService;
            return this;
        }
        public Boolean getEnableBinlogService() {
            return this.enableBinlogService;
        }

        public DescribeTenantResponseBodyTenant setEnableClogService(Boolean enableClogService) {
            this.enableClogService = enableClogService;
            return this;
        }
        public Boolean getEnableClogService() {
            return this.enableClogService;
        }

        public DescribeTenantResponseBodyTenant setEnableInternetAddressService(Boolean enableInternetAddressService) {
            this.enableInternetAddressService = enableInternetAddressService;
            return this;
        }
        public Boolean getEnableInternetAddressService() {
            return this.enableInternetAddressService;
        }

        public DescribeTenantResponseBodyTenant setEnableParallelQuery(Boolean enableParallelQuery) {
            this.enableParallelQuery = enableParallelQuery;
            return this;
        }
        public Boolean getEnableParallelQuery() {
            return this.enableParallelQuery;
        }

        public DescribeTenantResponseBodyTenant setEnableReadWriteSplit(Boolean enableReadWriteSplit) {
            this.enableReadWriteSplit = enableReadWriteSplit;
            return this;
        }
        public Boolean getEnableReadWriteSplit() {
            return this.enableReadWriteSplit;
        }

        public DescribeTenantResponseBodyTenant setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeTenantResponseBodyTenant setMasterIntranetAddressZone(String masterIntranetAddressZone) {
            this.masterIntranetAddressZone = masterIntranetAddressZone;
            return this;
        }
        public String getMasterIntranetAddressZone() {
            return this.masterIntranetAddressZone;
        }

        public DescribeTenantResponseBodyTenant setMaxParallelQueryDegree(Long maxParallelQueryDegree) {
            this.maxParallelQueryDegree = maxParallelQueryDegree;
            return this;
        }
        public Long getMaxParallelQueryDegree() {
            return this.maxParallelQueryDegree;
        }

        public DescribeTenantResponseBodyTenant setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeTenantResponseBodyTenant setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        public DescribeTenantResponseBodyTenant setPrimaryZoneDeployType(String primaryZoneDeployType) {
            this.primaryZoneDeployType = primaryZoneDeployType;
            return this;
        }
        public String getPrimaryZoneDeployType() {
            return this.primaryZoneDeployType;
        }

        public DescribeTenantResponseBodyTenant setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
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

        public DescribeTenantResponseBodyTenant setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
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
