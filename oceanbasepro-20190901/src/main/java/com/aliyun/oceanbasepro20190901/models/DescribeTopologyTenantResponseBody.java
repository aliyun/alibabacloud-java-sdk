// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyTenantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tenant")
    public java.util.List<DescribeTopologyTenantResponseBodyTenant> tenant;

    public static DescribeTopologyTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyTenantResponseBody self = new DescribeTopologyTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopologyTenantResponseBody setTenant(java.util.List<DescribeTopologyTenantResponseBodyTenant> tenant) {
        this.tenant = tenant;
        return this;
    }
    public java.util.List<DescribeTopologyTenantResponseBodyTenant> getTenant() {
        return this.tenant;
    }

    public static class DescribeTopologyTenantResponseBodyTenantUnitInfo extends TeaModel {
        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("IsPrimary")
        public Boolean isPrimary;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("ReplicaType")
        public String replicaType;

        @NameInMap("SnName")
        public String snName;

        public static DescribeTopologyTenantResponseBodyTenantUnitInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopologyTenantResponseBodyTenantUnitInfo self = new DescribeTopologyTenantResponseBodyTenantUnitInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTopologyTenantResponseBodyTenantUnitInfo setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeTopologyTenantResponseBodyTenantUnitInfo setIsPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }
        public Boolean getIsPrimary() {
            return this.isPrimary;
        }

        public DescribeTopologyTenantResponseBodyTenantUnitInfo setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeTopologyTenantResponseBodyTenantUnitInfo setReplicaType(String replicaType) {
            this.replicaType = replicaType;
            return this;
        }
        public String getReplicaType() {
            return this.replicaType;
        }

        public DescribeTopologyTenantResponseBodyTenantUnitInfo setSnName(String snName) {
            this.snName = snName;
            return this;
        }
        public String getSnName() {
            return this.snName;
        }

    }

    public static class DescribeTopologyTenantResponseBodyTenant extends TeaModel {
        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("UnitInfo")
        public java.util.List<DescribeTopologyTenantResponseBodyTenantUnitInfo> unitInfo;

        public static DescribeTopologyTenantResponseBodyTenant build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopologyTenantResponseBodyTenant self = new DescribeTopologyTenantResponseBodyTenant();
            return TeaModel.build(map, self);
        }

        public DescribeTopologyTenantResponseBodyTenant setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTopologyTenantResponseBodyTenant setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeTopologyTenantResponseBodyTenant setUnitInfo(java.util.List<DescribeTopologyTenantResponseBodyTenantUnitInfo> unitInfo) {
            this.unitInfo = unitInfo;
            return this;
        }
        public java.util.List<DescribeTopologyTenantResponseBodyTenantUnitInfo> getUnitInfo() {
            return this.unitInfo;
        }

    }

}
