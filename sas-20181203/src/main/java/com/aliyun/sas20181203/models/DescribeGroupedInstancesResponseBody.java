// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the assets.</p>
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
     * 
     * <strong>example:</strong>
     * <p>52A3AEE6-114A-499D-8990-4BA9B27FE0AA</p>
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
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("AsapVulInstanceCount")
        public Long asapVulInstanceCount;

        /**
         * <p>The number of assets that are protected by the specified edition.</p>
         * 
         * <strong>example:</strong>
         * <p>205</p>
         */
        @NameInMap("AuthVersionCheckCount")
        public Integer authVersionCheckCount;

        /**
         * <p>The name of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>testA</p>
         */
        @NameInMap("FieldAliasName")
        public String fieldAliasName;

        /**
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the default group</li>
         * <li><strong>1</strong>: other group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GroupFlag")
        public Integer groupFlag;

        /**
         * <p>The number of cores of assets in the specified asset type.</p>
         * <blockquote>
         * <p> If the <strong>MachineTypes</strong> request parameter is not specified, the value of the InstanceCoreCount parameter indicates the total number of cores of assets within your account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>610</p>
         */
        @NameInMap("InstanceCoreCount")
        public Long instanceCoreCount;

        /**
         * <p>The total number of assets that belong to the specified type.</p>
         * <blockquote>
         * <p> If the <strong>MachineTypes</strong> request parameter is not specified, the value of the InstanceCount parameter is the total number of your assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>205</p>
         */
        @NameInMap("InstanceCount")
        public String instanceCount;

        /**
         * <p>The operating system type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong></li>
         * <li><strong>linux</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when Lang is set to zh.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The number of assets that are at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>172</p>
         */
        @NameInMap("RiskInstanceCount")
        public String riskInstanceCount;

        /**
         * <p>The number of assets that are not protected by Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
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

        public DescribeGroupedInstancesResponseBodyInstances setInstanceCoreCount(Long instanceCoreCount) {
            this.instanceCoreCount = instanceCoreCount;
            return this;
        }
        public Long getInstanceCoreCount() {
            return this.instanceCoreCount;
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
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
