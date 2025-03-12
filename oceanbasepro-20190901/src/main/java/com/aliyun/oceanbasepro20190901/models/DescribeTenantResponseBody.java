// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the tenant.</p>
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

    public static class DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit extends TeaModel {
        /**
         * <p>The maximum number of capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MaxCapacityUnit")
        public Integer maxCapacityUnit;

        /**
         * <p>The minimum number of capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinCapacityUnit")
        public Integer minCapacityUnit;

        /**
         * <p>The number of used capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UsedCapacit")
        public Integer usedCapacit;

        public static DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit self = new DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit setMaxCapacityUnit(Integer maxCapacityUnit) {
            this.maxCapacityUnit = maxCapacityUnit;
            return this;
        }
        public Integer getMaxCapacityUnit() {
            return this.maxCapacityUnit;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit setMinCapacityUnit(Integer minCapacityUnit) {
            this.minCapacityUnit = minCapacityUnit;
            return this;
        }
        public Integer getMinCapacityUnit() {
            return this.minCapacityUnit;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit setUsedCapacit(Integer usedCapacit) {
            this.usedCapacit = usedCapacit;
            return this;
        }
        public Integer getUsedCapacit() {
            return this.usedCapacit;
        }

    }

    public static class DescribeTenantResponseBodyTenantReadOnlyResourceCpu extends TeaModel {
        /**
         * <p>The total number of CPU cores of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCpu")
        public Float totalCpu;

        /**
         * <p>The number of CPU cores in each resource unit of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("UnitCpu")
        public Float unitCpu;

        /**
         * <p>The number of CPU cores used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("UsedCpu")
        public Float usedCpu;

        public static DescribeTenantResponseBodyTenantReadOnlyResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantReadOnlyResourceCpu self = new DescribeTenantResponseBodyTenantReadOnlyResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceCpu setTotalCpu(Float totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Float getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceCpu setUnitCpu(Float unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceCpu setUsedCpu(Float usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Float getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeTenantResponseBodyTenantReadOnlyResourceDiskSize extends TeaModel {
        /**
         * <p>The size of disk space used by the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("UsedDiskSize")
        public Float usedDiskSize;

        public static DescribeTenantResponseBodyTenantReadOnlyResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantReadOnlyResourceDiskSize self = new DescribeTenantResponseBodyTenantReadOnlyResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceDiskSize setUsedDiskSize(Float usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Float getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize extends TeaModel {
        /**
         * <p>The total log disk size of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("TotalLogDisk")
        public Integer totalLogDisk;

        /**
         * <p>The log disk size of each resource unit of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("UnitLogDisk")
        public Integer unitLogDisk;

        public static DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize self = new DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize setTotalLogDisk(Integer totalLogDisk) {
            this.totalLogDisk = totalLogDisk;
            return this;
        }
        public Integer getTotalLogDisk() {
            return this.totalLogDisk;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize setUnitLogDisk(Integer unitLogDisk) {
            this.unitLogDisk = unitLogDisk;
            return this;
        }
        public Integer getUnitLogDisk() {
            return this.unitLogDisk;
        }

    }

    public static class DescribeTenantResponseBodyTenantReadOnlyResourceMemory extends TeaModel {
        /**
         * <p>The total memory size of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("TotalMemory")
        public Float totalMemory;

        /**
         * <p>The memory size of each resource unit of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("UnitMemory")
        public Float unitMemory;

        /**
         * <p>The size of memory used by the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UsedMemory")
        public Float usedMemory;

        public static DescribeTenantResponseBodyTenantReadOnlyResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantReadOnlyResourceMemory self = new DescribeTenantResponseBodyTenantReadOnlyResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceMemory setTotalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceMemory setUnitMemory(Float unitMemory) {
            this.unitMemory = unitMemory;
            return this;
        }
        public Float getUnitMemory() {
            return this.unitMemory;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResourceMemory setUsedMemory(Float usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Float getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeTenantResponseBodyTenantReadOnlyResource extends TeaModel {
        /**
         * <p>The information about capacity units.</p>
         */
        @NameInMap("CapacityUnit")
        public DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit capacityUnit;

        /**
         * <p>The number of CPU cores of each replica node in the cluster.</p>
         */
        @NameInMap("Cpu")
        public DescribeTenantResponseBodyTenantReadOnlyResourceCpu cpu;

        /**
         * <p>The size of the data disk.</p>
         */
        @NameInMap("DiskSize")
        public DescribeTenantResponseBodyTenantReadOnlyResourceDiskSize diskSize;

        /**
         * <p>The information about the log disk resources of the tenant.</p>
         */
        @NameInMap("LogDiskSize")
        public DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize logDiskSize;

        /**
         * <p>The information about the memory resources of the cluster.</p>
         */
        @NameInMap("Memory")
        public DescribeTenantResponseBodyTenantReadOnlyResourceMemory memory;

        /**
         * <p>The number of resource units in the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnitNum")
        public Integer unitNum;

        public static DescribeTenantResponseBodyTenantReadOnlyResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantReadOnlyResource self = new DescribeTenantResponseBodyTenantReadOnlyResource();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantReadOnlyResource setCapacityUnit(DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public DescribeTenantResponseBodyTenantReadOnlyResourceCapacityUnit getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResource setCpu(DescribeTenantResponseBodyTenantReadOnlyResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeTenantResponseBodyTenantReadOnlyResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResource setDiskSize(DescribeTenantResponseBodyTenantReadOnlyResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeTenantResponseBodyTenantReadOnlyResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResource setLogDiskSize(DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize logDiskSize) {
            this.logDiskSize = logDiskSize;
            return this;
        }
        public DescribeTenantResponseBodyTenantReadOnlyResourceLogDiskSize getLogDiskSize() {
            return this.logDiskSize;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResource setMemory(DescribeTenantResponseBodyTenantReadOnlyResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeTenantResponseBodyTenantReadOnlyResourceMemory getMemory() {
            return this.memory;
        }

        public DescribeTenantResponseBodyTenantReadOnlyResource setUnitNum(Integer unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Integer getUnitNum() {
            return this.unitNum;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantConnections extends TeaModel {
        /**
         * <p>The type of the address.</p>
         * <ul>
         * <li>MASTER: the primary address, which supports both data read and write.</li>
         * <li>READONLY: a read-only address.</li>
         * <li>READWRITE: a read/write splitting address.</li>
         * <li>CLOGSERVICE: a clog service address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READONLY</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The logical zones of the endpoints.</p>
         */
        @NameInMap("ConnectionLogicalZones")
        public java.util.List<String> connectionLogicalZones;

        /**
         * <p>The type of the replica corresponding to the tenant connection.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        @NameInMap("ConnectionReplicaType")
        public String connectionReplicaType;

        /**
         * <p>The list of zones corresponding to the tenant connection.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cn-hangzhou-i&quot;, &quot;cn-hangzhou-j&quot;]</p>
         */
        @NameInMap("ConnectionZones")
        public java.util.List<String> connectionZones;

        /**
         * <p>Specifies whether to enable transaction splitting.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableTransactionSplit")
        public Boolean enableTransactionSplit;

        /**
         * <p>The Internet address for accessing the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>t32a7ru5u****mo.oceanbase.aliyuncs.com</p>
         */
        @NameInMap("InternetAddress")
        public String internetAddress;

        /**
         * <p>The status of the Internet address for accessing the tenant. Valid values:   </p>
         * <ul>
         * <li>CLOSED: The address is disabled.   </li>
         * <li>ALLOCATING_INTERNET_ADDRESS: An address is being applied for.   </li>
         * <li>PENDING_OFFLINE_INTERNET_ADDRESS: The address is being disabled.   </li>
         * <li>ONLINE: The address is in service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOSED</p>
         */
        @NameInMap("InternetAddressStatus")
        public String internetAddressStatus;

        /**
         * <p>The upper limit of the maximum number of public connections.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("InternetMaxConnectionLimit")
        public Long internetMaxConnectionLimit;

        /**
         * <p>The current value set for the maximum number of public connections.</p>
         * 
         * <strong>example:</strong>
         * <p>2500</p>
         */
        @NameInMap("InternetMaxConnectionNum")
        public Long internetMaxConnectionNum;

        /**
         * <p>The Internet port for accessing the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("InternetPort")
        public Integer internetPort;

        /**
         * <p>The port for direct loads of public connections.</p>
         * 
         * <strong>example:</strong>
         * <p>3307</p>
         */
        @NameInMap("InternetRpcPort")
        public Integer internetRpcPort;

        /**
         * <p>The intranet address for accessing the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>t4nunwxr0****.oceanbase.aliyuncs.com</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The primary zone corresponding to the address for accessing the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("IntranetAddressMasterZoneId")
        public String intranetAddressMasterZoneId;

        /**
         * <p>The standby zone corresponding to the address for accessing the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("IntranetAddressSlaveZoneId")
        public String intranetAddressSlaveZoneId;

        /**
         * <p>The status of the intranet address for accessing the tenant.<br>The value ONLINE indicates that the address is in service.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("IntranetAddressStatus")
        public String intranetAddressStatus;

        /**
         * <p>The intranet port for accessing the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>2983</p>
         */
        @NameInMap("IntranetPort")
        public Integer intranetPort;

        /**
         * <p>The port for direct loads of private connections.</p>
         * 
         * <strong>example:</strong>
         * <p>3307</p>
         */
        @NameInMap("IntranetRpcPort")
        public Integer intranetRpcPort;

        /**
         * <p>The port of private SQL connections.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("IntranetSqlPort")
        public Integer intranetSqlPort;

        /**
         * <p>The current value set for the maximum number of private connections.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxConnectionLimit")
        public Long maxConnectionLimit;

        /**
         * <p>The maximum number of connections.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("MaxConnectionNum")
        public Long maxConnectionNum;

        /**
         * <p>The ODP version.</p>
         * 
         * <strong>example:</strong>
         * <p>4.3.1-xxxxxxxxx</p>
         */
        @NameInMap("OdpVersion")
        public String odpVersion;

        /**
         * <p>The degree of parallelism (DOP).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParallelQueryDegree")
        public Long parallelQueryDegree;

        /**
         * <p>The ID of the OceanBase Database Proxy (ODP) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-xxxxxxx</p>
         */
        @NameInMap("ProxyClusterId")
        public String proxyClusterId;

        /**
         * <p>The ID of the tenant endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>obe-4tw51gp7****</p>
         */
        @NameInMap("TenantEndpointId")
        public String tenantEndpointId;

        /**
         * <p>Specifies whether to enable transaction splitting.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TransactionSplit")
        public Boolean transactionSplit;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1i7b94u2et716yl****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1qiail1asmfe23t****</p>
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

        public DescribeTenantResponseBodyTenantTenantConnections setConnectionLogicalZones(java.util.List<String> connectionLogicalZones) {
            this.connectionLogicalZones = connectionLogicalZones;
            return this;
        }
        public java.util.List<String> getConnectionLogicalZones() {
            return this.connectionLogicalZones;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setConnectionReplicaType(String connectionReplicaType) {
            this.connectionReplicaType = connectionReplicaType;
            return this;
        }
        public String getConnectionReplicaType() {
            return this.connectionReplicaType;
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

        public DescribeTenantResponseBodyTenantTenantConnections setInternetMaxConnectionLimit(Long internetMaxConnectionLimit) {
            this.internetMaxConnectionLimit = internetMaxConnectionLimit;
            return this;
        }
        public Long getInternetMaxConnectionLimit() {
            return this.internetMaxConnectionLimit;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetMaxConnectionNum(Long internetMaxConnectionNum) {
            this.internetMaxConnectionNum = internetMaxConnectionNum;
            return this;
        }
        public Long getInternetMaxConnectionNum() {
            return this.internetMaxConnectionNum;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetPort(Integer internetPort) {
            this.internetPort = internetPort;
            return this;
        }
        public Integer getInternetPort() {
            return this.internetPort;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setInternetRpcPort(Integer internetRpcPort) {
            this.internetRpcPort = internetRpcPort;
            return this;
        }
        public Integer getInternetRpcPort() {
            return this.internetRpcPort;
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

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetRpcPort(Integer intranetRpcPort) {
            this.intranetRpcPort = intranetRpcPort;
            return this;
        }
        public Integer getIntranetRpcPort() {
            return this.intranetRpcPort;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setIntranetSqlPort(Integer intranetSqlPort) {
            this.intranetSqlPort = intranetSqlPort;
            return this;
        }
        public Integer getIntranetSqlPort() {
            return this.intranetSqlPort;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setMaxConnectionLimit(Long maxConnectionLimit) {
            this.maxConnectionLimit = maxConnectionLimit;
            return this;
        }
        public Long getMaxConnectionLimit() {
            return this.maxConnectionLimit;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setMaxConnectionNum(Long maxConnectionNum) {
            this.maxConnectionNum = maxConnectionNum;
            return this;
        }
        public Long getMaxConnectionNum() {
            return this.maxConnectionNum;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setOdpVersion(String odpVersion) {
            this.odpVersion = odpVersion;
            return this;
        }
        public String getOdpVersion() {
            return this.odpVersion;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setParallelQueryDegree(Long parallelQueryDegree) {
            this.parallelQueryDegree = parallelQueryDegree;
            return this;
        }
        public Long getParallelQueryDegree() {
            return this.parallelQueryDegree;
        }

        public DescribeTenantResponseBodyTenantTenantConnections setProxyClusterId(String proxyClusterId) {
            this.proxyClusterId = proxyClusterId;
            return this;
        }
        public String getProxyClusterId() {
            return this.proxyClusterId;
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
        /**
         * <p>The maximum number of capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MaxCapacityUnit")
        public Integer maxCapacityUnit;

        /**
         * <p>The minimum number of capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinCapacityUnit")
        public Integer minCapacityUnit;

        /**
         * <p>The number of used capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
         * <p>The total number of CPU cores of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCpu")
        public Float totalCpu;

        /**
         * <p>The number of CPU cores in each resource unit of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("UnitCpu")
        public Float unitCpu;

        /**
         * <p>The number of used CPU cores of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
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
         * <p>The size of used disk space of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
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
        /**
         * <p>The total size of log disk of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("TotalLogDisk")
        public Integer totalLogDisk;

        /**
         * <p>The log disk size of each resource unit of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
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
         * <p>The total memory size of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("TotalMemory")
        public Float totalMemory;

        /**
         * <p>The memory size of each resource unit of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("UnitMemory")
        public Float unitMemory;

        /**
         * <p>The size of used memory of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
        /**
         * <p>The information about capacity units.</p>
         */
        @NameInMap("CapacityUnit")
        public DescribeTenantResponseBodyTenantTenantResourceCapacityUnit capacityUnit;

        /**
         * <p>The information about the CPU resources of the tenant.</p>
         */
        @NameInMap("Cpu")
        public DescribeTenantResponseBodyTenantTenantResourceCpu cpu;

        /**
         * <p>The information about the disk resources of the tenant.</p>
         */
        @NameInMap("DiskSize")
        public DescribeTenantResponseBodyTenantTenantResourceDiskSize diskSize;

        /**
         * <p>The information about the log disk resources of the tenant.</p>
         */
        @NameInMap("LogDiskSize")
        public DescribeTenantResponseBodyTenantTenantResourceLogDiskSize logDiskSize;

        /**
         * <p>The information about the memory resources of the tenant.</p>
         */
        @NameInMap("Memory")
        public DescribeTenantResponseBodyTenantTenantResourceMemory memory;

        /**
         * <p>The number of resource units for the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

    public static class DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas extends TeaModel {
        /**
         * <p>The ID of the full-featured replica.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FullCopyId")
        public Integer fullCopyId;

        /**
         * <p>The name of the logical zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f-z0</p>
         */
        @NameInMap("LogicZoneName")
        public String logicZoneName;

        /**
         * <p>The ID of the read-only replica.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReadOnlyCopyId")
        public String readOnlyCopyId;

        /**
         * <p>The type of the read-only replica.</p>
         * 
         * <strong>example:</strong>
         * <p>ROW_STORE</p>
         */
        @NameInMap("ReadOnlyReplicaType")
        public String readOnlyReplicaType;

        /**
         * <p>The ID of the zone replica.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ZoneCopyId")
        public Integer zoneCopyId;

        /**
         * <p>The number of nodes in the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ZoneNodes")
        public Long zoneNodes;

        /**
         * <p>The type of the zone replica.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        @NameInMap("ZoneReplicaType")
        public String zoneReplicaType;

        public static DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas self = new DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas();
            return TeaModel.build(map, self);
        }

        public DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas setFullCopyId(Integer fullCopyId) {
            this.fullCopyId = fullCopyId;
            return this;
        }
        public Integer getFullCopyId() {
            return this.fullCopyId;
        }

        public DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas setLogicZoneName(String logicZoneName) {
            this.logicZoneName = logicZoneName;
            return this;
        }
        public String getLogicZoneName() {
            return this.logicZoneName;
        }

        public DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas setReadOnlyCopyId(String readOnlyCopyId) {
            this.readOnlyCopyId = readOnlyCopyId;
            return this;
        }
        public String getReadOnlyCopyId() {
            return this.readOnlyCopyId;
        }

        public DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas setReadOnlyReplicaType(String readOnlyReplicaType) {
            this.readOnlyReplicaType = readOnlyReplicaType;
            return this;
        }
        public String getReadOnlyReplicaType() {
            return this.readOnlyReplicaType;
        }

        public DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas setZoneCopyId(Integer zoneCopyId) {
            this.zoneCopyId = zoneCopyId;
            return this;
        }
        public Integer getZoneCopyId() {
            return this.zoneCopyId;
        }

        public DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas setZoneNodes(Long zoneNodes) {
            this.zoneNodes = zoneNodes;
            return this;
        }
        public Long getZoneNodes() {
            return this.zoneNodes;
        }

        public DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas setZoneReplicaType(String zoneReplicaType) {
            this.zoneReplicaType = zoneReplicaType;
            return this;
        }
        public String getZoneReplicaType() {
            return this.zoneReplicaType;
        }

    }

    public static class DescribeTenantResponseBodyTenantTenantZones extends TeaModel {
        /**
         * <p>The region where the zone of the tenant resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("TenantZoneId")
        public String tenantZoneId;

        /**
         * <p>The zone replicas of the tenant.</p>
         */
        @NameInMap("TenantZoneReplicas")
        public java.util.List<DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas> tenantZoneReplicas;

        /**
         * <p>The role of the zone of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
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

        public DescribeTenantResponseBodyTenantTenantZones setTenantZoneReplicas(java.util.List<DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas> tenantZoneReplicas) {
            this.tenantZoneReplicas = tenantZoneReplicas;
            return this;
        }
        public java.util.List<DescribeTenantResponseBodyTenantTenantZonesTenantZoneReplicas> getTenantZoneReplicas() {
            return this.tenantZoneReplicas;
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
         * <p>The list of zones.</p>
         */
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        /**
         * <p>The character set.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <p>The enabling status of the clog service.  </p>
         * <ul>
         * <li>CLOSED: The clog service is disabled.  </li>
         * <li>ONLINE: The clog service is running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOSED</p>
         */
        @NameInMap("ClogServiceStatus")
        public String clogServiceStatus;

        /**
         * <p>The collation.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4_general_ci</p>
         */
        @NameInMap("Collation")
        public String collation;

        /**
         * <p>The time when the tenant was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-21 11:15:47.0</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The major compaction time of the tenant. This parameter is supported only in OceanBase Database V4.0.0 and later.</p>
         * 
         * <strong>example:</strong>
         * <p>02:36Z</p>
         */
        @NameInMap("DataMergeTime")
        public String dataMergeTime;

        /**
         * <p>The data replica distribution mode of the tenant.    </p>
         * <ul>
         * <li>For the high availability version, N-N-N indicates the three-zone mode, and N-N indicates the dual-zone or single-zone mode.</li>
         * <li>For the basic version, N indicates the single-zone mode.</li>
         * </ul>
         * <blockquote>
         * <p><br>N represents the number of nodes in a single zone.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1-1-1</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The deployment type of the cluster. Valid values:  </p>
         * <ul>
         * <li>multiple: multi-IDC deployment   </li>
         * <li>single: single-IDC deployment   </li>
         * <li>dual: dual-IDC deployment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>multiple</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The description of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>paycore database</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd_pl1</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>Indicates whether the binlog service is available for application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableBinlogService")
        public Boolean enableBinlogService;

        /**
         * <p>Indicates whether the clog service is available. To enable the clog service, submit a ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClogService")
        public Boolean enableClogService;

        /**
         * <p>Indicates whether the Internet address can be enabled for the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableInternetAddressService")
        public Boolean enableInternetAddressService;

        /**
         * <p>Indicates whether parallel query can be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableParallelQuery")
        public Boolean enableParallelQuery;

        /**
         * <p>Indicates whether read-only replicas are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableReadOnlyReplica")
        public Boolean enableReadOnlyReplica;

        /**
         * <p>Indicates whether to enable read/write splitting endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableReadWriteSplit")
        public Boolean enableReadWriteSplit;

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>KAFKA_PUBLIC</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the table name is case-sensitive. Valid values: </p>
         * <ul>
         * <li><strong>1</strong>: The table name is case-insensitive. </li>
         * <li><strong>0</strong>: The table name is case-sensitive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LowerCaseTableNames")
        public Integer lowerCaseTableNames;

        /**
         * <p>The zone where the primary node is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("MasterIntranetAddressZone")
        public String masterIntranetAddressZone;

        /**
         * <p>The maximum value of DOP.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("MaxParallelQueryDegree")
        public Long maxParallelQueryDegree;

        /**
         * <p>The ODP version.</p>
         * 
         * <strong>example:</strong>
         * <p>4.3.1-xxxxxxxxx</p>
         */
        @NameInMap("OdpVersion")
        public String odpVersion;

        /**
         * <p>The parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>express_oltp</p>
         */
        @NameInMap("ParameterTemplate")
        public String parameterTemplate;

        /**
         * <p>The type of the payment.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The primary zone of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>The deployment type of the primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>RANDOM</p>
         */
        @NameInMap("PrimaryZoneDeployType")
        public String primaryZoneDeployType;

        /**
         * <p>The information about read-only resources.</p>
         */
        @NameInMap("ReadOnlyResource")
        public DescribeTenantResponseBodyTenantReadOnlyResource readOnlyResource;

        /**
         * <p>The status of the recycle bin in the tenant. Valid values: </p>
         * <ul>
         * <li>ON: The recycly bin is enabled. </li>
         * <li>OFF: The recycle bin is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("RecycleBinStatus")
        public String recycleBinStatus;

        /**
         * <p>The series of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>The status of the tenant.</p>
         * <ul>
         * <li><p>ONLINE: The tenant is running.</p>
         * </li>
         * <li><p>PENDING_CREATE: The tenant is being created.</p>
         * </li>
         * <li><p>WAITING_ALLOCATE_MASTER_ADDRESS: The standby cluster is waiting for the primary address to be created.</p>
         * </li>
         * <li><p>ALLOCATING_MASTER_ADDRESS: The primary address is being created.</p>
         * </li>
         * <li><p>DELETING_MASTER_ADDRESS: The primary address is being deleted.</p>
         * </li>
         * <li><p>ALLOCATING_INTERNET_ADDRESS: The Internet address is being created.</p>
         * </li>
         * <li><p>PENDING_OFFLINE_INTERNET_ADDRESS: The Internet address is being deleted.</p>
         * </li>
         * <li><p>ALLOCATING_READONLY_ADDRESS: The read-only address is being created.</p>
         * </li>
         * <li><p>DELETING_READONLY_ADDRESS: The read-only address is being deleted.</p>
         * </li>
         * <li><p>ALLOCATING_READWRITE_ADDRESS: The read/write splitting address is being created.</p>
         * </li>
         * <li><p>DELETING_READWRITE_ADDRESS: The read/write splitting address is being deleted.</p>
         * </li>
         * <li><p>ALLOCATING_CLOGSERVICE_ADDRESS: The clog address is being created.</p>
         * </li>
         * <li><p>DELETING_CLOGSERVICE_ADDRESS: The clog address is being deleted.</p>
         * </li>
         * <li><p>MODIFYING_ADDRESS: The domain name of the address is being modified.</p>
         * </li>
         * <li><p>MODIFYING_PRIMARY_ZONE: The primary zone is being switched.</p>
         * </li>
         * <li><p>MODIFYING_READONLY_ADDRESS: The read-only address is being modified.</p>
         * </li>
         * <li><p>MODIFYING_READWRITE_ADDRESS: The read/write splitting address is being modified.</p>
         * </li>
         * <li><p>SPEC_MODIFYING: The specifications of the tenant are being modified.</p>
         * </li>
         * <li><p>WHITE_LIST_MODIFYING: The allowlist is being modified.</p>
         * </li>
         * <li><p>CREATING_BINLOG: Binlogs are being created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The connection information of the tenant.</p>
         */
        @NameInMap("TenantConnections")
        public java.util.List<DescribeTenantResponseBodyTenantTenantConnections> tenantConnections;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>t4louaeei****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The maximum number of connections allowed in the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1600</p>
         */
        @NameInMap("TenantMaxConnections")
        public String tenantMaxConnections;

        /**
         * <p>The mode of the tenant.
         * Valid values:</p>
         * <ul>
         * <li>Oracle   </li>
         * <li>MySQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("TenantMode")
        public String tenantMode;

        /**
         * <p>The name of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>forMySQLTenant</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The resource information of the tenant.</p>
         */
        @NameInMap("TenantResource")
        public DescribeTenantResponseBodyTenantTenantResource tenantResource;

        /**
         * <p>The information about zones in the tenant.</p>
         */
        @NameInMap("TenantZones")
        public java.util.List<DescribeTenantResponseBodyTenantTenantZones> tenantZones;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <p>The version information.</p>
         * 
         * <strong>example:</strong>
         * <p>4.2.1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The Virtual Private Cloud (VPC) ID of the tenant. If no suitable VPC is available, create a VPC as prompted. For more information, see &quot;What is a VPC&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1d2q3mhg9i23ofi****</p>
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

        public DescribeTenantResponseBodyTenant setDataMergeTime(String dataMergeTime) {
            this.dataMergeTime = dataMergeTime;
            return this;
        }
        public String getDataMergeTime() {
            return this.dataMergeTime;
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

        public DescribeTenantResponseBodyTenant setEnableReadOnlyReplica(Boolean enableReadOnlyReplica) {
            this.enableReadOnlyReplica = enableReadOnlyReplica;
            return this;
        }
        public Boolean getEnableReadOnlyReplica() {
            return this.enableReadOnlyReplica;
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

        public DescribeTenantResponseBodyTenant setLowerCaseTableNames(Integer lowerCaseTableNames) {
            this.lowerCaseTableNames = lowerCaseTableNames;
            return this;
        }
        public Integer getLowerCaseTableNames() {
            return this.lowerCaseTableNames;
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

        public DescribeTenantResponseBodyTenant setOdpVersion(String odpVersion) {
            this.odpVersion = odpVersion;
            return this;
        }
        public String getOdpVersion() {
            return this.odpVersion;
        }

        public DescribeTenantResponseBodyTenant setParameterTemplate(String parameterTemplate) {
            this.parameterTemplate = parameterTemplate;
            return this;
        }
        public String getParameterTemplate() {
            return this.parameterTemplate;
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

        public DescribeTenantResponseBodyTenant setReadOnlyResource(DescribeTenantResponseBodyTenantReadOnlyResource readOnlyResource) {
            this.readOnlyResource = readOnlyResource;
            return this;
        }
        public DescribeTenantResponseBodyTenantReadOnlyResource getReadOnlyResource() {
            return this.readOnlyResource;
        }

        public DescribeTenantResponseBodyTenant setRecycleBinStatus(String recycleBinStatus) {
            this.recycleBinStatus = recycleBinStatus;
            return this;
        }
        public String getRecycleBinStatus() {
            return this.recycleBinStatus;
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

        public DescribeTenantResponseBodyTenant setTenantMaxConnections(String tenantMaxConnections) {
            this.tenantMaxConnections = tenantMaxConnections;
            return this;
        }
        public String getTenantMaxConnections() {
            return this.tenantMaxConnections;
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

        public DescribeTenantResponseBodyTenant setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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
