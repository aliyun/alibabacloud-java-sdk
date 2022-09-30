// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tenants")
    public java.util.List<DescribeTenantsResponseBodyTenants> tenants;

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

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("PrimaryZone")
        public String primaryZone;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantMode")
        public String tenantMode;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("UnitCpu")
        public Integer unitCpu;

        @NameInMap("UnitMem")
        public Integer unitMem;

        @NameInMap("UnitNum")
        public Integer unitNum;

        @NameInMap("UsedDiskSize")
        public Double usedDiskSize;

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
