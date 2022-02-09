// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyTenantPartitionSizeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tenant")
    public java.util.List<DescribeTopologyTenantPartitionSizeResponseBodyTenant> tenant;

    public static DescribeTopologyTenantPartitionSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyTenantPartitionSizeResponseBody self = new DescribeTopologyTenantPartitionSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyTenantPartitionSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopologyTenantPartitionSizeResponseBody setTenant(java.util.List<DescribeTopologyTenantPartitionSizeResponseBodyTenant> tenant) {
        this.tenant = tenant;
        return this;
    }
    public java.util.List<DescribeTopologyTenantPartitionSizeResponseBodyTenant> getTenant() {
        return this.tenant;
    }

    public static class DescribeTopologyTenantPartitionSizeResponseBodyTenant extends TeaModel {
        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeTopologyTenantPartitionSizeResponseBodyTenant build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopologyTenantPartitionSizeResponseBodyTenant self = new DescribeTopologyTenantPartitionSizeResponseBodyTenant();
            return TeaModel.build(map, self);
        }

        public DescribeTopologyTenantPartitionSizeResponseBodyTenant setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeTopologyTenantPartitionSizeResponseBodyTenant setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTopologyTenantPartitionSizeResponseBodyTenant setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
