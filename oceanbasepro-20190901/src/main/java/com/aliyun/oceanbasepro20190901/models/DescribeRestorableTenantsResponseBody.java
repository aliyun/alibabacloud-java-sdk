// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableTenantsResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tenants")
    public java.util.List<DescribeRestorableTenantsResponseBodyTenants> tenants;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRestorableTenantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableTenantsResponseBody self = new DescribeRestorableTenantsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableTenantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestorableTenantsResponseBody setTenants(java.util.List<DescribeRestorableTenantsResponseBodyTenants> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<DescribeRestorableTenantsResponseBodyTenants> getTenants() {
        return this.tenants;
    }

    public DescribeRestorableTenantsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList self = new DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList();
            return TeaModel.build(map, self);
        }

        public DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeRestorableTenantsResponseBodyTenants extends TeaModel {
        @NameInMap("Method")
        public String method;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("TimeIntervalList")
        public java.util.List<DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList> timeIntervalList;

        public static DescribeRestorableTenantsResponseBodyTenants build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorableTenantsResponseBodyTenants self = new DescribeRestorableTenantsResponseBodyTenants();
            return TeaModel.build(map, self);
        }

        public DescribeRestorableTenantsResponseBodyTenants setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTimeIntervalList(java.util.List<DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList> timeIntervalList) {
            this.timeIntervalList = timeIntervalList;
            return this;
        }
        public java.util.List<DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList> getTimeIntervalList() {
            return this.timeIntervalList;
        }

    }

}
