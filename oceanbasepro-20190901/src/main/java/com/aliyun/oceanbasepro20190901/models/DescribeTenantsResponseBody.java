// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of tenants.</p>
     */
    @NameInMap("Tenants")
    public java.util.List<DescribeTenantsResponseBodyTenants> tenants;

    /**
     * <p>The total number of tenants in the specified OceanBase cluster.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTenantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantsResponseBody self = new DescribeTenantsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantsResponseBody setTenants(java.util.List<DescribeTenantsResponseBodyTenants> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<DescribeTenantsResponseBodyTenants> getTenants() {
        return this.tenants;
    }

    public DescribeTenantsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTenantsResponseBodyTenants extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("Collation")
        public String collation;

        /**
         * <p>The total number of CPU cores of the tenant.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the tenant was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The data replica distribution mode of the tenant.   </p>
         * <br>
         * <p>- For the high availability version, N-N-N indicates the three-zone mode, and N-N indicates the dual-zone or single-zone mode.</p>
         * <p>- For the basic version, N indicates the single-zone mode. </p>
         * <br>
         * <p>> <br>N represents the number of nodes in a single zone.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The deployment type of the tenant. <br></p>
         * <p>- multiple: multi-IDC deployment</p>
         * <p>- single: single-IDC deployment</p>
         * <p>- dual: dual-IDC deployment</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The description of the tenant.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The total memory size of the tenant, in GB.</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The primary zone of the tenant.</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>The status of the tenant.  <br></p>
         * <p>- PENDING_CREATE: The tenant is being created.</p>
         * <p>- RESTORE: The tenant is being recovered.</p>
         * <p>- ONLINE: The tenant is running.</p>
         * <p>- SPEC_MODIFYING: The specification of the tenant is being modified.</p>
         * <p>ALLOCATING_INTERNET_ADDRESS: An Internet address is being allocated.</p>
         * <p>PENDING_OFFLINE_INTERNET_ADDRESS: The Internet address is being disabled.</p>
         * <p>- PRIMARY_ZONE_MODIFYING: The tenant is switching to a new primary zone.</p>
         * <p>- PARAMETER_MODIFYING: Parameters are being modified.</p>
         * <p>- WHITE_LIST_MODIFYING: The whitelist is being modified.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The tenant mode.   </p>
         * <p>Valid values:   </p>
         * <p>Oracle</p>
         * <p>MySQL</p>
         */
        @NameInMap("TenantMode")
        public String tenantMode;

        /**
         * <p>The name of the tenant.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The number of CPU cores in each resource unit of the tenant.</p>
         */
        @NameInMap("UnitCpu")
        public Integer unitCpu;

        /**
         * <p>The memory size of each resource unit of the tenant, in GB.</p>
         */
        @NameInMap("UnitMem")
        public Integer unitMem;

        /**
         * <p>The number of resource units in the tenant.</p>
         */
        @NameInMap("UnitNum")
        public Integer unitNum;

        /**
         * <p>The number of used disks of the tenant.</p>
         */
        @NameInMap("UsedDiskSize")
        public Double usedDiskSize;

        /**
         * <p>The ID of the VPC.   <br>If no suitable VPC is available, create a VPC as prompted. For more information, see "What is a VPC".</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantsResponseBodyTenants build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantsResponseBodyTenants self = new DescribeTenantsResponseBodyTenants();
            return TeaModel.build(map, self);
        }

        public DescribeTenantsResponseBodyTenants setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeTenantsResponseBodyTenants setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public DescribeTenantsResponseBodyTenants setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeTenantsResponseBodyTenants setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTenantsResponseBodyTenants setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeTenantsResponseBodyTenants setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeTenantsResponseBodyTenants setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTenantsResponseBodyTenants setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public DescribeTenantsResponseBodyTenants setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        public DescribeTenantsResponseBodyTenants setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTenantsResponseBodyTenants setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTenantsResponseBodyTenants setTenantMode(String tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public String getTenantMode() {
            return this.tenantMode;
        }

        public DescribeTenantsResponseBodyTenants setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeTenantsResponseBodyTenants setUnitCpu(Integer unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Integer getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeTenantsResponseBodyTenants setUnitMem(Integer unitMem) {
            this.unitMem = unitMem;
            return this;
        }
        public Integer getUnitMem() {
            return this.unitMem;
        }

        public DescribeTenantsResponseBodyTenants setUnitNum(Integer unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Integer getUnitNum() {
            return this.unitNum;
        }

        public DescribeTenantsResponseBodyTenants setUsedDiskSize(Double usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Double getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public DescribeTenantsResponseBodyTenants setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
