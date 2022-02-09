// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantsResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 租户的列表信息。
    @NameInMap("Tenants")
    public java.util.List<DescribeTenantsResponseBodyTenants> tenants;

    // 查询到的指定Oceanbase集群的租户总数。
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
        // 租户总的CPU核数，单位：Core。
        @NameInMap("Cpu")
        public Integer cpu;

        // 租户的创建时间。
        @NameInMap("CreateTime")
        public String createTime;

        // 租户的数据副本模式。 对于高可用版本：三地域为N-N-N，两可用区和单可用区均为N-N； 对于基础版为N。 其中，N为单可用区内的节点数。
        @NameInMap("DeployMode")
        public String deployMode;

        // 租户的部署类型。 multiple：多机房 single：单机房 dual：双机房
        @NameInMap("DeployType")
        public String deployType;

        // 租户描述信息。
        @NameInMap("Description")
        public String description;

        // 租户总的内存大小，单位：GB。
        @NameInMap("Mem")
        public Integer mem;

        // 租户的主可用区。
        @NameInMap("PrimaryZone")
        public String primaryZone;

        // 租户的状态。 PENDING_CREATE: 创建中 RESTORE: 恢复中 ONLINE: 运行中 SPEC_MODIFYING: 规格修改中 ALLOCATING_INTERNET_ADDRESS: 公网地址分配中 PENDING_OFFLINE_INTERNET_ADDRESS: 公网地址关闭中 PRIMARY_ZONE_MODIFYING: 切主可用区中 PARAMETER_MODIFYING: 参数修改中 WHITE_LIST_MODIFING: 白名单修改中
        @NameInMap("Status")
        public String status;

        // 租户ID。
        @NameInMap("TenantId")
        public String tenantId;

        // 租户模式。 当前支持： Oracle：Oracle模式 MySQL: MySQL模式
        @NameInMap("TenantMode")
        public String tenantMode;

        // 租户名称。
        @NameInMap("TenantName")
        public String tenantName;

        // 租户每个Unit的CPU核数，单位：Core。
        @NameInMap("UnitCpu")
        public Integer unitCpu;

        // 租户每个Unit的内存大小，单位：GB。
        @NameInMap("UnitMem")
        public Integer unitMem;

        // 租户的unit个数。
        @NameInMap("UnitNum")
        public Integer unitNum;

        // 租户已使用磁盘量
        @NameInMap("UsedDiskSize")
        public Double usedDiskSize;

        // 专有网络（VPC） ID。 如果没有合适的 VPC，请根据页面提示创建一个 VPC，详情参见 什么是专有网络
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantsResponseBodyTenants build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantsResponseBodyTenants self = new DescribeTenantsResponseBodyTenants();
            return TeaModel.build(map, self);
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
