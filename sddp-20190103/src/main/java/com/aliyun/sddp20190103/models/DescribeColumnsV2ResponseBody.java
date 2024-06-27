// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsV2ResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A list of column recognition results of the data table.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeColumnsV2ResponseBodyItems> items;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
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
     * <p>B1F2BB1F-04EC-5D36-B136-B4DE17FD8DE0</p>
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

    public static DescribeColumnsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsV2ResponseBody self = new DescribeColumnsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsV2ResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeColumnsV2ResponseBody setItems(java.util.List<DescribeColumnsV2ResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeColumnsV2ResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeColumnsV2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeColumnsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeColumnsV2ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeColumnsV2ResponseBodyItemsModelTags extends TeaModel {
        /**
         * <p>The tag ID. Valid values:</p>
         * <ul>
         * <li><strong>101</strong>: personal sensitive information</li>
         * <li><strong>102</strong>: personal information</li>
         * <li><strong>107</strong>: general information</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The tag name. Valid values:</p>
         * <ul>
         * <li>Personal sensitive information</li>
         * <li>Personal information</li>
         * <li>General information</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>personal sensitive information</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeColumnsV2ResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsV2ResponseBodyItemsModelTags self = new DescribeColumnsV2ResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsV2ResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeColumnsV2ResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeColumnsV2ResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the data in the column of the table is created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The type of data in the column of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The ID of the column of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the instance to which data in the column of the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1232122</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the instance to which data in the column of the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-1234</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>A list of data tags.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeColumnsV2ResponseBodyItemsModelTags> modelTags;

        /**
         * <p>The name of the column of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>obj_id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the sensitivity level for asset. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: indicates that no sensitive data is detected.</li>
         * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
         * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
         * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
         * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S4</p>
         */
        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        /**
         * <p>The ID of the sensitivity level of the asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A</li>
         * <li><strong>2</strong>: S1</li>
         * <li><strong>3</strong>: S2</li>
         * <li><strong>4</strong>: S3</li>
         * <li><strong>5</strong>: S4<blockquote>
         * <p>The return value &lt;=1 means N/A.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OdpsRiskLevelValue")
        public Integer odpsRiskLevelValue;

        /**
         * <p>The name of the service to which data in the column of the table belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the revision record.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RevisionId")
        public Long revisionId;

        /**
         * <p>Indicates whether the column is revised. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RevisionStatus")
        public Long revisionStatus;

        /**
         * <p>The ID of the sensitivity level of data in the column of the table. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A</li>
         * <li><strong>2</strong>: S1</li>
         * <li><strong>3</strong>: S2</li>
         * <li><strong>4</strong>: S3</li>
         * <li><strong>5</strong>: S4</li>
         * </ul>
         * <blockquote>
         * <p>The return value &lt;=1 means N/A.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level for data in the column of the table. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: indicates that no sensitive data is detected.</li>
         * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
         * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
         * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
         * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The ID of the sensitive data detection rule that data in the column of the table hits.</p>
         * 
         * <strong>example:</strong>
         * <p>1004</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the sensitive data detection rule that data in the column of the table hits.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The name of the sensitivity level. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: indicates that no sensitive data is detected.</li>
         * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
         * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
         * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
         * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("SensLevelName")
        public String sensLevelName;

        /**
         * <p>Indicates whether the column contains sensitive data. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TableId")
        public Long tableId;

        /**
         * <p>The name of the table to which the revised column belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>it_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeColumnsV2ResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsV2ResponseBodyItems self = new DescribeColumnsV2ResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsV2ResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeColumnsV2ResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeColumnsV2ResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeColumnsV2ResponseBodyItems setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeColumnsV2ResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeColumnsV2ResponseBodyItems setModelTags(java.util.List<DescribeColumnsV2ResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeColumnsV2ResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeColumnsV2ResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeColumnsV2ResponseBodyItems setOdpsRiskLevelName(String odpsRiskLevelName) {
            this.odpsRiskLevelName = odpsRiskLevelName;
            return this;
        }
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        public DescribeColumnsV2ResponseBodyItems setOdpsRiskLevelValue(Integer odpsRiskLevelValue) {
            this.odpsRiskLevelValue = odpsRiskLevelValue;
            return this;
        }
        public Integer getOdpsRiskLevelValue() {
            return this.odpsRiskLevelValue;
        }

        public DescribeColumnsV2ResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeColumnsV2ResponseBodyItems setRevisionId(Long revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public Long getRevisionId() {
            return this.revisionId;
        }

        public DescribeColumnsV2ResponseBodyItems setRevisionStatus(Long revisionStatus) {
            this.revisionStatus = revisionStatus;
            return this;
        }
        public Long getRevisionStatus() {
            return this.revisionStatus;
        }

        public DescribeColumnsV2ResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeColumnsV2ResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeColumnsV2ResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeColumnsV2ResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeColumnsV2ResponseBodyItems setSensLevelName(String sensLevelName) {
            this.sensLevelName = sensLevelName;
            return this;
        }
        public String getSensLevelName() {
            return this.sensLevelName;
        }

        public DescribeColumnsV2ResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeColumnsV2ResponseBodyItems setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public DescribeColumnsV2ResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
