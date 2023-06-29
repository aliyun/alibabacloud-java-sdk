// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribePackagesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the information about the packages.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribePackagesResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The point in time when the MaxCompute package was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The ID of the package.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the instance to which the package belongs.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the package.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The account of the user that owns the package.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The sensitivity level of the package. Valid values:</p>
         * <br>
         * <p>*   **1**: N/A, which indicates that no sensitive data is detected.</p>
         * <p>*   **2**: S1, which indicates the low sensitivity level.</p>
         * <p>*   **3**: S2, which indicates the medium sensitivity level.</p>
         * <p>*   **4**: S3, which indicates the high sensitivity level.</p>
         * <p>*   **5**: S4, which indicates the highest sensitivity level.</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level for the package.</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>Indicates whether the package contains sensitive data. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The total volume of sensitive data in the package. For example, the value can be the total number of sensitive tables in the MaxCompute package.</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The total volume of data in the package. For example, the value can be the total number of tables in the MaxCompute package.</p>
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
