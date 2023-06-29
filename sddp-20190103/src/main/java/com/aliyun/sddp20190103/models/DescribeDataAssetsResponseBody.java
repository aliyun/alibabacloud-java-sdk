// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of data assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataAssetsResponseBodyItems> items;

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
     * <p>The total number of queried data assets that contain sensitive data.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAssetsResponseBody self = new DescribeDataAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataAssetsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataAssetsResponseBody setItems(java.util.List<DescribeDataAssetsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataAssetsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataAssetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataAssetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataAssetsResponseBodyItems extends TeaModel {
        /**
         * <p>The access control list (ACL) that controls the access permissions on the OSS bucket.</p>
         * <br>
         * <p>> This parameter is returned only when you set the parameter **RangeId** to **21**.</p>
         */
        @NameInMap("Acl")
        public String acl;

        /**
         * <p>The time when the data asset was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The data type of the data asset.</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The ID of the data asset.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The sensitivity tag of the data. The value is fixed as **0**. **0**, **1**, **2**, or **3** is returned for this parameter only when you set the parameter **RangeId** to **1**.</p>
         * <br>
         * <p>*   **0**: unclassified</p>
         * <p>*   **1**: confidential</p>
         * <p>*   **2**: sensitive</p>
         * <p>*   **3**: highly sensitive</p>
         */
        @NameInMap("Labelsec")
        public Boolean labelsec;

        /**
         * <p>The name of the data asset.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The key value of the OSS object.</p>
         * <br>
         * <p>> This parameter is returned only when you set the parameter **RangeId** to **22**.</p>
         */
        @NameInMap("ObjectKey")
        public String objectKey;

        /**
         * <p>The sensitivity level of the MaxCompute data asset. Valid values:</p>
         * <br>
         * <p>*   **S1**: low sensitivity level</p>
         * <p>*   **S2**: medium sensitivity level</p>
         * <p>*   **S3**: high sensitivity level</p>
         * <p>*   **S4**: highest sensitivity level</p>
         * <br>
         * <p>> This parameter is returned only when you set the parameter **RangeId** to **1**.</p>
         */
        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        /**
         * <p>The account that owns the data asset.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the service to which the data asset belongs.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the service to which the data asset belongs. Valid values:</p>
         * <br>
         * <p>*   **1**: MaxCompute</p>
         * <p>*   **2**: OSS</p>
         * <p>*   **3**: AnalyticDB for MySQL</p>
         * <p>*   **4**: Tablestore</p>
         * <p>*   **5**: ApsaraDB RDS</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>Indicates whether the data protection mechanism is enabled for the data asset. The value is fixed as **false**. **true** or **false** is returned for this parameter only when you set the parameter **RangeId** to **1**.</p>
         * <br>
         * <p>*   **false**: The data protection mechanism is disabled.</p>
         * <p>*   **true**: The data protection mechanism is enabled. Only data inbound is supported. Data outbound is not supported.</p>
         */
        @NameInMap("Protection")
        public Boolean protection;

        /**
         * <p>The sensitivity level of the data asset. A higher sensitivity level indicates that the identified data is more sensitive. Valid values:</p>
         * <br>
         * <p>*   **1**: No sensitive data is identified.</p>
         * <p>*   **2**: sensitive data at level 1.</p>
         * <p>*   **3**: sensitive data at level 2.</p>
         * <p>*   **3**: sensitive data at level 3.</p>
         * <p>*   **5**: sensitive data at level 4.</p>
         * <p>*   **6**: sensitive data at level 5.</p>
         * <p>*   **7**: sensitive data at level 6.</p>
         * <p>*   **8**: sensitive data at level 7.</p>
         * <p>*   **9**: sensitive data at level 8.</p>
         * <p>*   **10**: sensitive data at level 9.</p>
         * <p>*   **11**: sensitive data at level 10.</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level for the data asset.</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The name of the sensitive data detection rule that the data asset hits.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the data asset contains sensitive data. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The total number of sensitive data assets. For example, the value can be the total number of sensitive MaxCompute projects, packages, or tables, the total number of sensitive ApsaraDB RDS databases or tables, or the total number of sensitive OSS buckets or objects.</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The percentage of sensitive data in all data assets.</p>
         */
        @NameInMap("SensitiveRatio")
        public String sensitiveRatio;

        /**
         * <p>The total number of data assets. For example, the value can be the total number of MaxCompute projects, packages, or tables, the total number of ApsaraDB RDS databases or tables, or the total number of OSS buckets or objects.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDataAssetsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAssetsResponseBodyItems self = new DescribeDataAssetsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataAssetsResponseBodyItems setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public DescribeDataAssetsResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeDataAssetsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataAssetsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataAssetsResponseBodyItems setLabelsec(Boolean labelsec) {
            this.labelsec = labelsec;
            return this;
        }
        public Boolean getLabelsec() {
            return this.labelsec;
        }

        public DescribeDataAssetsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataAssetsResponseBodyItems setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public DescribeDataAssetsResponseBodyItems setOdpsRiskLevelName(String odpsRiskLevelName) {
            this.odpsRiskLevelName = odpsRiskLevelName;
            return this;
        }
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        public DescribeDataAssetsResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeDataAssetsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeDataAssetsResponseBodyItems setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeDataAssetsResponseBodyItems setProtection(Boolean protection) {
            this.protection = protection;
            return this;
        }
        public Boolean getProtection() {
            return this.protection;
        }

        public DescribeDataAssetsResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeDataAssetsResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeDataAssetsResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDataAssetsResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeDataAssetsResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeDataAssetsResponseBodyItems setSensitiveRatio(String sensitiveRatio) {
            this.sensitiveRatio = sensitiveRatio;
            return this;
        }
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        public DescribeDataAssetsResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
