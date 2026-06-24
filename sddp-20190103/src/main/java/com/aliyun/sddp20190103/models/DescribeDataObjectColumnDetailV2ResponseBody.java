// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailV2ResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of detection results for the columns in the data table.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
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
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>231</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataObjectColumnDetailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectColumnDetailV2ResponseBody self = new DescribeDataObjectColumnDetailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setItems(java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataObjectColumnDetailV2ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags extends TeaModel {
        /**
         * <p>The ID of the data tag. Valid values:</p>
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
         * <p>The name of the data tag. Valid values:</p>
         * <ul>
         * <li><p>Personal sensitive information</p>
         * </li>
         * <li><p>Personal information</p>
         * </li>
         * <li><p>General information</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>personal sensitive information</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags self = new DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDataObjectColumnDetailV2ResponseBodyItems extends TeaModel {
        /**
         * <p>The list of industry-specific categories for the sensitive data.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The comments on the column.</p>
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
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong>.</p>
         * </li>
         * <li><p><strong>MariaDB</strong>.</p>
         * </li>
         * <li><p><strong>Oracle</strong>.</p>
         * </li>
         * <li><p><strong>PostgreSQL</strong>.</p>
         * </li>
         * <li><p><strong>SQLServer</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The unique ID of the data object.</p>
         * 
         * <strong>example:</strong>
         * <p>1392973973691383808</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the instance for the data asset table.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp17t1htja573l5i8****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The encryption status of the column. Valid values:</p>
         * <ul>
         * <li><p><strong>-1</strong>: Not encrypted</p>
         * </li>
         * <li><p><strong>1</strong>: Encrypted</p>
         * </li>
         * <li><p><strong>2</strong>: Encryption failed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MaskingStatus")
        public Integer maskingStatus;

        /**
         * <p>The list of data tags.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags> modelTags;

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
         * <p>The ID of the product to which the data object belongs. Valid values:</p>
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
         * <p>The region where the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the sensitivity level. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: N/A: No sensitive data is detected.</p>
         * </li>
         * <li><p><strong>2</strong>: S1: level-1 sensitive data.</p>
         * </li>
         * <li><p><strong>3</strong>: S2: level-2 sensitive data.</p>
         * </li>
         * <li><p><strong>4</strong>: S3: level-3 sensitive data.</p>
         * </li>
         * <li><p><strong>5</strong>: S4: level-4 sensitive data.</p>
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
         * <li><p><strong>N/A</strong>: No sensitive data is detected.</p>
         * </li>
         * <li><p><strong>S1</strong>: level-1 sensitive data.</p>
         * </li>
         * <li><p><strong>S2</strong>: level-2 sensitive data.</p>
         * </li>
         * <li><p><strong>S3</strong>: level-3 sensitive data.</p>
         * </li>
         * <li><p><strong>S4</strong>: level-4 sensitive data.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The ID of the hit detection model.</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the hit detection model.</p>
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

        public static DescribeDataObjectColumnDetailV2ResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataObjectColumnDetailV2ResponseBodyItems self = new DescribeDataObjectColumnDetailV2ResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setMaskingStatus(Integer maskingStatus) {
            this.maskingStatus = maskingStatus;
            return this;
        }
        public Integer getMaskingStatus() {
            return this.maskingStatus;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setModelTags(java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeDataObjectColumnDetailV2ResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDataObjectColumnDetailV2ResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
