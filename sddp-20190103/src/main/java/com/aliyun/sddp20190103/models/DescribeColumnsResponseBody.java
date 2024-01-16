// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A list of columns.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeColumnsResponseBodyItems> items;

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

    public static DescribeColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsResponseBody self = new DescribeColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeColumnsResponseBody setItems(java.util.List<DescribeColumnsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeColumnsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeColumnsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeColumnsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeColumnsResponseBodyItemsModelTags extends TeaModel {
        /**
         * <p>The tag ID.</p>
         * <br>
         * <p>*   **101**: sensitive personal information</p>
         * <p>*   **102**: personal information</p>
         * <p>*   **103**: important information</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The tag name.</p>
         * <br>
         * <p>*   Sensitive personal information</p>
         * <p>*   Personal information</p>
         * <p>*   Important information</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeColumnsResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsResponseBodyItemsModelTags self = new DescribeColumnsResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeColumnsResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeColumnsResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the data in the column of the table is created. Unit: milliseconds.</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The type of data in the column of the table.</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The ID of the column of the table.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the instance to which data in the column of the table belongs.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the instance to which data in the column of the table belongs.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>A list of tags for data that hits the recognition model.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeColumnsResponseBodyItemsModelTags> modelTags;

        /**
         * <p>The name of the column of the table.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the sensitivity level for asset. Valid values:</p>
         * <br>
         * <p>*   **N/A**: indicates that no sensitive data is detected.</p>
         * <p>*   **S1**: indicates the low sensitivity level.</p>
         * <p>*   **S2**: indicates the medium sensitivity level.</p>
         * <p>*   **S3**: indicates the high sensitivity level.</p>
         * <p>*   **S4**: indicates the highest sensitivity level.</p>
         */
        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        /**
         * <p>The ID of the sensitivity level of the asset. Valid values:</p>
         * <br>
         * <p>*   **1**: N/A</p>
         * <p>*   **2**: S1</p>
         * <p>*   **3**: S2</p>
         * <p>*   **4**: S3</p>
         * <p>*   **5**: S4</p>
         */
        @NameInMap("OdpsRiskLevelValue")
        public Integer odpsRiskLevelValue;

        /**
         * <p>The name of the service to which data in the column of the table belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the revision record.</p>
         */
        @NameInMap("RevisionId")
        public Long revisionId;

        /**
         * <p>Indicates whether the column is revised. Valid values:</p>
         * <br>
         * <p>*   1: yes</p>
         * <p>*   0: no</p>
         */
        @NameInMap("RevisionStatus")
        public Long revisionStatus;

        /**
         * <p>The ID of the sensitivity level of data in the column of the table. Valid values:</p>
         * <br>
         * <p>*   **1**: N/A</p>
         * <p>*   **2**: S1</p>
         * <p>*   **3**: S2</p>
         * <p>*   **4**: S3</p>
         * <p>*   **5**: S4</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level for data in the column of the table. Valid values:</p>
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
         * <p>The ID of the sensitive data detection rule that data in the column of the table hits.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the sensitive data detection rule that data in the column of the table hits.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The name of the sensitivity level. Valid values:</p>
         * <br>
         * <p>*   **N/A**: indicates that no sensitive data is detected.</p>
         * <p>*   **S1**: indicates the low sensitivity level.</p>
         * <p>*   **S2**: indicates the medium sensitivity level.</p>
         * <p>*   **S3**: indicates the high sensitivity level.</p>
         * <p>*   **S4**: indicates the highest sensitivity level.</p>
         */
        @NameInMap("SensLevelName")
        public String sensLevelName;

        /**
         * <p>Indicates whether the column contains sensitive data. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The ID of the table.</p>
         */
        @NameInMap("TableId")
        public Long tableId;

        /**
         * <p>The name of the table to which the revised column belongs.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeColumnsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsResponseBodyItems self = new DescribeColumnsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeColumnsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeColumnsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeColumnsResponseBodyItems setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeColumnsResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeColumnsResponseBodyItems setModelTags(java.util.List<DescribeColumnsResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeColumnsResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeColumnsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeColumnsResponseBodyItems setOdpsRiskLevelName(String odpsRiskLevelName) {
            this.odpsRiskLevelName = odpsRiskLevelName;
            return this;
        }
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        public DescribeColumnsResponseBodyItems setOdpsRiskLevelValue(Integer odpsRiskLevelValue) {
            this.odpsRiskLevelValue = odpsRiskLevelValue;
            return this;
        }
        public Integer getOdpsRiskLevelValue() {
            return this.odpsRiskLevelValue;
        }

        public DescribeColumnsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeColumnsResponseBodyItems setRevisionId(Long revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public Long getRevisionId() {
            return this.revisionId;
        }

        public DescribeColumnsResponseBodyItems setRevisionStatus(Long revisionStatus) {
            this.revisionStatus = revisionStatus;
            return this;
        }
        public Long getRevisionStatus() {
            return this.revisionStatus;
        }

        public DescribeColumnsResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeColumnsResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeColumnsResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeColumnsResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeColumnsResponseBodyItems setSensLevelName(String sensLevelName) {
            this.sensLevelName = sensLevelName;
            return this;
        }
        public String getSensLevelName() {
            return this.sensLevelName;
        }

        public DescribeColumnsResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeColumnsResponseBodyItems setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public DescribeColumnsResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
