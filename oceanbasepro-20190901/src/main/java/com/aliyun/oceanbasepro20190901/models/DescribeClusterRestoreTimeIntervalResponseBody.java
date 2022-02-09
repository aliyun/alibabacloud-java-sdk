// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeClusterRestoreTimeIntervalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tenants")
    public java.util.List<DescribeClusterRestoreTimeIntervalResponseBodyTenants> tenants;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeClusterRestoreTimeIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterRestoreTimeIntervalResponseBody self = new DescribeClusterRestoreTimeIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterRestoreTimeIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterRestoreTimeIntervalResponseBody setTenants(java.util.List<DescribeClusterRestoreTimeIntervalResponseBodyTenants> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<DescribeClusterRestoreTimeIntervalResponseBodyTenants> getTenants() {
        return this.tenants;
    }

    public DescribeClusterRestoreTimeIntervalResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeClusterRestoreTimeIntervalResponseBodyTenants extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeClusterRestoreTimeIntervalResponseBodyTenants build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterRestoreTimeIntervalResponseBodyTenants self = new DescribeClusterRestoreTimeIntervalResponseBodyTenants();
            return TeaModel.build(map, self);
        }

        public DescribeClusterRestoreTimeIntervalResponseBodyTenants setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeClusterRestoreTimeIntervalResponseBodyTenants setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeClusterRestoreTimeIntervalResponseBodyTenants setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeClusterRestoreTimeIntervalResponseBodyTenants setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
