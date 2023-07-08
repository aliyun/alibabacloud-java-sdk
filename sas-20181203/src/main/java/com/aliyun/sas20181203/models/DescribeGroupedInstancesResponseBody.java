// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about the assets.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeGroupedInstancesResponseBodyInstances> instances;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeGroupedInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The number of assets on which high-risk vulnerabilities are detected.</p>
         */
        @NameInMap("AsapVulInstanceCount")
        public Long asapVulInstanceCount;

        @NameInMap("AuthVersionCheckCount")
        public Integer authVersionCheckCount;

        /**
         * <p>The name of the server group.</p>
         */
        @NameInMap("FieldAliasName")
        public String fieldAliasName;

        /**
         * <p>The type of the server group. Valid values:</p>
         * <br>
         * <p>*   **0**: the default group</p>
         * <p>*   **1**: other group</p>
         */
        @NameInMap("GroupFlag")
        public Integer groupFlag;

        /**
         * <p>The total number of assets that belong to the specified type.</p>
         * <br>
         * <p>>  If the **MachineTypes** request parameter is not specified, the value of the InstanceCount parameter is the total number of your assets.</p>
         */
        @NameInMap("InstanceCount")
        public String instanceCount;

        @NameInMap("Os")
        public String os;

        /**
         * <p>The number of assets that are at risk.</p>
         */
        @NameInMap("RiskInstanceCount")
        public String riskInstanceCount;

        /**
         * <p>The number of assets that are not protected by Security Center.</p>
         */
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

        public DescribeGroupedInstancesResponseBodyInstances setAuthVersionCheckCount(Integer authVersionCheckCount) {
            this.authVersionCheckCount = authVersionCheckCount;
            return this;
        }
        public Integer getAuthVersionCheckCount() {
            return this.authVersionCheckCount;
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

        public DescribeGroupedInstancesResponseBodyInstances setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
