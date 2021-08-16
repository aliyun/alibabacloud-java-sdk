// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestorePlansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeRestorePlansResponseBodyPageInfo pageInfo;

    @NameInMap("RestorePlans")
    public java.util.List<DescribeRestorePlansResponseBodyRestorePlans> restorePlans;

    public static DescribeRestorePlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorePlansResponseBody self = new DescribeRestorePlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestorePlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestorePlansResponseBody setPageInfo(DescribeRestorePlansResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeRestorePlansResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeRestorePlansResponseBody setRestorePlans(java.util.List<DescribeRestorePlansResponseBodyRestorePlans> restorePlans) {
        this.restorePlans = restorePlans;
        return this;
    }
    public java.util.List<DescribeRestorePlansResponseBodyRestorePlans> getRestorePlans() {
        return this.restorePlans;
    }

    public static class DescribeRestorePlansResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeRestorePlansResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorePlansResponseBodyPageInfo self = new DescribeRestorePlansResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRestorePlansResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeRestorePlansResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestorePlansResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeRestorePlansResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeRestorePlansResponseBodyRestorePlans extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("RestorePoint")
        public Long restorePoint;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        @NameInMap("TargetDatabaseName")
        public String targetDatabaseName;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyId")
        public Long policyId;

        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        @NameInMap("CreatedTime")
        public Long createdTime;

        public static DescribeRestorePlansResponseBodyRestorePlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorePlansResponseBodyRestorePlans self = new DescribeRestorePlansResponseBodyRestorePlans();
            return TeaModel.build(map, self);
        }

        public DescribeRestorePlansResponseBodyRestorePlans setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setRestorePoint(Long restorePoint) {
            this.restorePoint = restorePoint;
            return this;
        }
        public Long getRestorePoint() {
            return this.restorePoint;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setTargetDatabaseName(String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }
        public String getTargetDatabaseName() {
            return this.targetDatabaseName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

    }

}
