// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeTablesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of tables.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeTablesResponseBodyItems> items;

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

    public static DescribeTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesResponseBody self = new DescribeTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTablesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTablesResponseBody setItems(java.util.List<DescribeTablesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeTablesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTablesResponseBodyItemsRuleList extends TeaModel {
        /**
         * <p>The total number of rules.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
         * <br>
         * <p>*   **1**: N/A, which indicates that no sensitive data is detected.</p>
         * <p>*   **2**: S1, which indicates the low sensitivity level.</p>
         * <p>*   **3**: S2, which indicates the medium sensitivity level.</p>
         * <p>*   **4**: S3, which indicates the high sensitivity level.</p>
         * <p>*   **5**: S4, which indicates the highest sensitivity level.</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        public static DescribeTablesResponseBodyItemsRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseBodyItemsRuleList self = new DescribeTablesResponseBodyItemsRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseBodyItemsRuleList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeTablesResponseBodyItemsRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTablesResponseBodyItemsRuleList setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

    }

    public static class DescribeTablesResponseBodyItems extends TeaModel {
        /**
         * <p>The point in time when the table was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The ID of the table.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the data asset.</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The ID of the data asset to which the table belongs.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the data asset to which the table belongs.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud account to which the table belongs.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the service to which the table belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**. For more information about the types of data assets from which DSC can scan for sensitive data, see [Supported data assets](~~212906~~).</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the service to which the table belongs.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The sensitivity level of the table. Each sensitivity level ID corresponds to a sensitivity level name. Valid values:</p>
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
         * <p>The name of the sensitivity level for the table. Valid values:</p>
         * <br>
         * <p>*   **N/A**: indicates that no sensitive data is detected.</p>
         * <p>*   **S1**: indicates the low sensitivity level.</p>
         * <p>*   **S2**: indicates the medium sensitivity level.</p>
         * <p>*   **S3**: indicates the high sensitivity level.</p>
         * <p>*   **S4**: indicates the highest sensitivity level.</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The information about the sensitive data detection rules that are hit.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<DescribeTablesResponseBodyItemsRuleList> ruleList;

        /**
         * <p>Indicates whether the table contains sensitive fields. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The total number of sensitive fields in the table.</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The percentage of sensitive fields in the table.</p>
         */
        @NameInMap("SensitiveRatio")
        public String sensitiveRatio;

        /**
         * <p>The name of the tenant.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The total number of fields in the table.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeTablesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseBodyItems self = new DescribeTablesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeTablesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTablesResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeTablesResponseBodyItems setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeTablesResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTablesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTablesResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeTablesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeTablesResponseBodyItems setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeTablesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeTablesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeTablesResponseBodyItems setRuleList(java.util.List<DescribeTablesResponseBodyItemsRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeTablesResponseBodyItemsRuleList> getRuleList() {
            return this.ruleList;
        }

        public DescribeTablesResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeTablesResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeTablesResponseBodyItems setSensitiveRatio(String sensitiveRatio) {
            this.sensitiveRatio = sensitiveRatio;
            return this;
        }
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        public DescribeTablesResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeTablesResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
