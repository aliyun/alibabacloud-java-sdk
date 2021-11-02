// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeGroupedInstancesResponseBodyInstances> instances;

    @NameInMap("PageInfo")
    public DescribeGroupedInstancesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedInstancesResponseBody self = new DescribeGroupedInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedInstancesResponseBody setInstances(java.util.List<DescribeGroupedInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeGroupedInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeGroupedInstancesResponseBody setPageInfo(DescribeGroupedInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeGroupedInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeGroupedInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupedInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("AsapVulInstanceCount")
        public Long asapVulInstanceCount;

        @NameInMap("FieldAliasName")
        public String fieldAliasName;

        @NameInMap("GroupFlag")
        public Integer groupFlag;

        @NameInMap("InstanceCount")
        public String instanceCount;

        @NameInMap("RiskInstanceCount")
        public String riskInstanceCount;

        @NameInMap("UnProtectedInstanceCount")
        public String unProtectedInstanceCount;

        public static DescribeGroupedInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedInstancesResponseBodyInstances self = new DescribeGroupedInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedInstancesResponseBodyInstances setAsapVulInstanceCount(Long asapVulInstanceCount) {
            this.asapVulInstanceCount = asapVulInstanceCount;
            return this;
        }
        public Long getAsapVulInstanceCount() {
            return this.asapVulInstanceCount;
        }

        public DescribeGroupedInstancesResponseBodyInstances setFieldAliasName(String fieldAliasName) {
            this.fieldAliasName = fieldAliasName;
            return this;
        }
        public String getFieldAliasName() {
            return this.fieldAliasName;
        }

        public DescribeGroupedInstancesResponseBodyInstances setGroupFlag(Integer groupFlag) {
            this.groupFlag = groupFlag;
            return this;
        }
        public Integer getGroupFlag() {
            return this.groupFlag;
        }

        public DescribeGroupedInstancesResponseBodyInstances setInstanceCount(String instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public String getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeGroupedInstancesResponseBodyInstances setRiskInstanceCount(String riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }
        public String getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        public DescribeGroupedInstancesResponseBodyInstances setUnProtectedInstanceCount(String unProtectedInstanceCount) {
            this.unProtectedInstanceCount = unProtectedInstanceCount;
            return this;
        }
        public String getUnProtectedInstanceCount() {
            return this.unProtectedInstanceCount;
        }

    }

    public static class DescribeGroupedInstancesResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeGroupedInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedInstancesResponseBodyPageInfo self = new DescribeGroupedInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeGroupedInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeGroupedInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeGroupedInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
