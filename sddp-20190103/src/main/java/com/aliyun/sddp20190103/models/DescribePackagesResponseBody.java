// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribePackagesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The information about the data asset packages.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribePackagesResponseBodyItems> items;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackagesResponseBody self = new DescribePackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackagesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePackagesResponseBody setItems(java.util.List<DescribePackagesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribePackagesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribePackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePackagesResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the data asset package was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The unique ID of the data asset package.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the asset instance to which the data asset package belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>223453332</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the data asset package.</p>
         * 
         * <strong>example:</strong>
         * <p>gxdata</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The account of the data asset package owner.</p>
         * 
         * <strong>example:</strong>
         * <p>cou-2221</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the risk level for the data asset package.</p>
         * <ul>
         * <li><p><strong>1</strong>: N/A: No sensitive data is detected.</p>
         * </li>
         * <li><p><strong>2</strong>: S1: Level 1 sensitive data.</p>
         * </li>
         * <li><p><strong>3</strong>: S2: Level 2 sensitive data.</p>
         * </li>
         * <li><p><strong>4</strong>: S3: Level 3 sensitive data.</p>
         * </li>
         * <li><p><strong>5</strong>: S4: Level 4 sensitive data.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the risk level for the package.</p>
         * 
         * <strong>example:</strong>
         * <p>S3</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>Indicates whether the data asset package contains sensitive data.</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The total number of sensitive data entries in the data asset package. For example, the total number of sensitive tables in MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The total number of data entries in the data asset package. For example, the total number of tables in MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>321</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePackagesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePackagesResponseBodyItems self = new DescribePackagesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribePackagesResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribePackagesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribePackagesResponseBodyItems setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribePackagesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePackagesResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribePackagesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribePackagesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribePackagesResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribePackagesResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribePackagesResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
