// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsResponseBody extends TeaModel {
    /**
     * <p>The page number of the current page in the results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The column data in the data asset tables.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeColumnsResponseBodyItems> items;

    /**
     * <p>The number of entries per page in the results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-4******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the results.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
         * <p>The data tag ID of the detection model. Valid values:</p>
         * <ul>
         * <li><strong>101</strong>: Personal sensitive information.</li>
         * <li><strong>102</strong>: Personal information.</li>
         * <li><strong>103</strong>: Important data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The data tag name of the detection model. Valid values:</p>
         * <ul>
         * <li>Personal sensitive information.</li>
         * <li>Personal information.</li>
         * <li>Important data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>personal sensitive data</p>
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
         * <p>The creation time of the column data in the data asset table. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The data type of the column data in the data asset table.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The unique ID of the column in the data asset table.</p>
         * 
         * <strong>example:</strong>
         * <p>268</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance ID of the asset to which the column data in the data asset table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the asset instance to which the column data in the data asset table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp17t1htja573l5i8****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The encryption status of the column. Valid values:</p>
         * <ul>
         * <li><p><strong>-1</strong>: Not encrypted.</p>
         * </li>
         * <li><p><strong>1</strong>: Encryption succeeded.</p>
         * </li>
         * <li><p><strong>2</strong>: Encryption failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MaskingStatus")
        public Integer maskingStatus;

        /**
         * <p>The list of data tags for the matched detection model.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeColumnsResponseBodyItemsModelTags> modelTags;

        /**
         * <p>The name of the column in the data asset table.</p>
         * 
         * <strong>example:</strong>
         * <p>gxdata</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The risk level name of the asset. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: No sensitive data is detected.</li>
         * <li><strong>S1</strong>: Level-1 sensitive data.</li>
         * <li><strong>S2</strong>: Level-2 sensitive data.</li>
         * <li><strong>S3</strong>: Level-3 sensitive data.</li>
         * <li><strong>S4</strong>: Level-4 sensitive data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S3</p>
         */
        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        /**
         * <p>The risk level code of the asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A.</li>
         * <li><strong>2</strong>: S1.</li>
         * <li><strong>3</strong>: S2.</li>
         * <li><strong>4</strong>: S3.</li>
         * <li><strong>5</strong>: S4.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OdpsRiskLevelValue")
        public Integer odpsRiskLevelValue;

        /**
         * <p>The name of the product to which the column data in the data asset table belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, RDS</strong>, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID that corresponds to the product name to which the data object belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute</li>
         * <li><strong>2</strong>: OSS</li>
         * <li><strong>3</strong>: ADB-MYSQL</li>
         * <li><strong>4</strong>: TableStore</li>
         * <li><strong>5</strong>: RDS</li>
         * <li><strong>6</strong>: SELF_DB</li>
         * <li><strong>7</strong>: PolarDB-X</li>
         * <li><strong>8</strong>: PolarDB</li>
         * <li><strong>9</strong>: ADB-PG</li>
         * <li><strong>10</strong>: OceanBase</li>
         * <li><strong>11</strong>: MongoDB</li>
         * <li><strong>25</strong>: Redis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>The region where the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-***</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The revision record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RevisionId")
        public Long revisionId;

        /**
         * <p>The revision status. Valid values:</p>
         * <ul>
         * <li>1: Revised.</li>
         * <li>0: Not revised.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RevisionStatus")
        public Long revisionStatus;

        /**
         * <p>The risk level ID of the column data in the data asset table. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A.</li>
         * <li><strong>2</strong>: S1.</li>
         * <li><strong>3</strong>: S2.</li>
         * <li><strong>4</strong>: S3.</li>
         * <li><strong>5</strong>: S4.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The risk level name of the column data in the data asset table. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: No sensitive data is detected.</li>
         * <li><strong>S1</strong>: Level-1 sensitive data.</li>
         * <li><strong>S2</strong>: Level-2 sensitive data.</li>
         * <li><strong>S3</strong>: Level-3 sensitive data.</li>
         * <li><strong>S4</strong>: Level-4 sensitive data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The ID of the sensitive data detection rule that the column data in the data asset table matches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the sensitive data detection rule that the column data in the data asset table matches.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The sensitivity level name. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: No sensitive data is detected.</li>
         * <li><strong>S1</strong>: Level-1 sensitive data.</li>
         * <li><strong>S2</strong>: Level-2 sensitive data.</li>
         * <li><strong>S3</strong>: Level-3 sensitive data.</li>
         * <li><strong>S4</strong>: Level-4 sensitive data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("SensLevelName")
        public String sensLevelName;

        /**
         * <p>Indicates whether the column data in the data asset table contains sensitive data. Valid values:</p>
         * <ul>
         * <li>true: The column data contains sensitive data.</li>
         * <li>false: The column data does not contain sensitive data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The ID of the data asset table to which the column data belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TableId")
        public Long tableId;

        /**
         * <p>The name of the table to which the revised target column belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>it_table</p>
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

        public DescribeColumnsResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
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

        public DescribeColumnsResponseBodyItems setMaskingStatus(Integer maskingStatus) {
            this.maskingStatus = maskingStatus;
            return this;
        }
        public Integer getMaskingStatus() {
            return this.maskingStatus;
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

        public DescribeColumnsResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public DescribeColumnsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
