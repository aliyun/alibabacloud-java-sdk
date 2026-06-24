// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The details of the columns.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataObjectColumnDetailResponseBodyItems> items;

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
     * <p>8C8036CC-961D-514E-88E8-3088B5A50CA9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>61</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataObjectColumnDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectColumnDetailResponseBody self = new DescribeDataObjectColumnDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectColumnDetailResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectColumnDetailResponseBody setItems(java.util.List<DescribeDataObjectColumnDetailResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataObjectColumnDetailResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataObjectColumnDetailResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectColumnDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataObjectColumnDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataObjectColumnDetailResponseBodyItemsModelTags extends TeaModel {
        /**
         * <p>The ID of the data label. Valid values:</p>
         * <ul>
         * <li><p><strong>101</strong>: Personal sensitive information</p>
         * </li>
         * <li><p><strong>102</strong>: Personal information</p>
         * </li>
         * <li><p><strong>107</strong>: General information</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data label. Valid values:</p>
         * <ul>
         * <li><p><strong>Personal sensitive information</strong></p>
         * </li>
         * <li><p><strong>Personal information</strong></p>
         * </li>
         * <li><p><strong>General information</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>personal sensitive information</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDataObjectColumnDetailResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectColumnDetailResponseBodyItemsModelTags self = new DescribeDataObjectColumnDetailResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectColumnDetailResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataObjectColumnDetailResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDataObjectColumnDetailResponseBodyItems extends TeaModel {
        /**
         * <p>The industry-specific data classifications.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The comment on the column.</p>
         * 
         * <strong>example:</strong>
         * <p>column comment</p>
         */
        @NameInMap("ColumnComment")
        public String columnComment;

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>hide14</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>MariaDB</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>SQLServer</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The ID of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>1509415150052786176</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the instance where the table is located.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-1234</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The data masking status of the column. Valid values:</p>
         * <ul>
         * <li><p><strong>-1</strong>: Not masked</p>
         * </li>
         * <li><p><strong>1</strong>: Masked</p>
         * </li>
         * <li><p><strong>2</strong>: Masking failed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MaskingStatus")
        public Integer maskingStatus;

        /**
         * <p>The data labels.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeDataObjectColumnDetailResponseBodyItemsModelTags> modelTags;

        /**
         * <p>Indicates whether the column is a primary key. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The column is a primary key.</p>
         * </li>
         * <li><p><strong>false</strong>: The column is not a primary key.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PrimaryKey")
        public Boolean primaryKey;

        /**
         * <p>The ID of the service to which the data object belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: MaxCompute</p>
         * </li>
         * <li><p><strong>2</strong>: OSS</p>
         * </li>
         * <li><p><strong>3</strong>: ADB-MYSQL</p>
         * </li>
         * <li><p><strong>4</strong>: Tablestore</p>
         * </li>
         * <li><p><strong>5</strong>: RDS</p>
         * </li>
         * <li><p><strong>6</strong>: SELF_DB</p>
         * </li>
         * <li><p><strong>7</strong>: PolarDB-X</p>
         * </li>
         * <li><p><strong>8</strong>: PolarDB</p>
         * </li>
         * <li><p><strong>9</strong>: ADB-PG</p>
         * </li>
         * <li><p><strong>10</strong>: OceanBase</p>
         * </li>
         * <li><p><strong>11</strong>: MongoDB</p>
         * </li>
         * <li><p><strong>25</strong>: Redis</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>The ID of the region where the data asset is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the sensitivity level. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: N/A</p>
         * </li>
         * <li><p><strong>2</strong>: S1</p>
         * </li>
         * <li><p><strong>3</strong>: S2</p>
         * </li>
         * <li><p><strong>4</strong>: S3</p>
         * </li>
         * <li><p><strong>5</strong>: S4</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level. Valid values:</p>
         * <ul>
         * <li><p><strong>N/A</strong></p>
         * </li>
         * <li><p><strong>S1</strong></p>
         * </li>
         * <li><p><strong>S2</strong></p>
         * </li>
         * <li><p><strong>S3</strong></p>
         * </li>
         * <li><p><strong>S4</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The ID of the sensitive data detection rule that was matched.</p>
         * 
         * <strong>example:</strong>
         * <p>1004</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the sensitive data detection rule that was matched.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>it_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeDataObjectColumnDetailResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectColumnDetailResponseBodyItems self = new DescribeDataObjectColumnDetailResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setMaskingStatus(Integer maskingStatus) {
            this.maskingStatus = maskingStatus;
            return this;
        }
        public Integer getMaskingStatus() {
            return this.maskingStatus;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setModelTags(java.util.List<DescribeDataObjectColumnDetailResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeDataObjectColumnDetailResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDataObjectColumnDetailResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
