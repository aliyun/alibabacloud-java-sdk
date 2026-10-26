// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingColumnsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of records returned by the current query.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListDataMaskingColumnsResponseBodyItems> items;

    /**
     * <p>The number of records per page for the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request. It can be used to locate the current API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that meet the current statistics or query scope.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDataMaskingColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingColumnsResponseBody self = new ListDataMaskingColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingColumnsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataMaskingColumnsResponseBody setItems(java.util.List<ListDataMaskingColumnsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListDataMaskingColumnsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListDataMaskingColumnsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataMaskingColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataMaskingColumnsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataMaskingColumnsResponseBodyItemsModelTags extends TeaModel {
        /**
         * <p>The ID of the model tag.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the model tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal information</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDataMaskingColumnsResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            ListDataMaskingColumnsResponseBodyItemsModelTags self = new ListDataMaskingColumnsResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public ListDataMaskingColumnsResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataMaskingColumnsResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDataMaskingColumnsResponseBodyItems extends TeaModel {
        /**
         * <p>The data type of the database column.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>business_db</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The business error code of the record or operation. It can be empty if no error occurs. Evaluate it together with ErrorMessage.</p>
         * 
         * <strong>example:</strong>
         * <p>data_masking_not_running</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The business error message of the record or operation.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance is not in the running state</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the column record.</p>
         * 
         * <strong>example:</strong>
         * <p>column-example-001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The database instance identity.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The column encryption status. Valid values: NotEncrypted: not encrypted; Processing: processing; Success: encrypted successfully; Failed: encryption failed; Deleting: disabling; DeleteFailed: disabling failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("MaskingStatus")
        public String maskingStatus;

        /**
         * <p>The list of matched model tags.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<ListDataMaskingColumnsResponseBodyItemsModelTags> modelTags;

        /**
         * <p>The name of the data column.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The code of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the cloud service type. Valid values: 5: RDS; 8: POLARDB; 27: PolarDBX2.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>The ID of the region where the asset is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The ID of the matched detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the matched detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Mobile phone number</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListDataMaskingColumnsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListDataMaskingColumnsResponseBodyItems self = new ListDataMaskingColumnsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListDataMaskingColumnsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListDataMaskingColumnsResponseBodyItems setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListDataMaskingColumnsResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListDataMaskingColumnsResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataMaskingColumnsResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataMaskingColumnsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataMaskingColumnsResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDataMaskingColumnsResponseBodyItems setMaskingStatus(String maskingStatus) {
            this.maskingStatus = maskingStatus;
            return this;
        }
        public String getMaskingStatus() {
            return this.maskingStatus;
        }

        public ListDataMaskingColumnsResponseBodyItems setModelTags(java.util.List<ListDataMaskingColumnsResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<ListDataMaskingColumnsResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public ListDataMaskingColumnsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataMaskingColumnsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListDataMaskingColumnsResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ListDataMaskingColumnsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDataMaskingColumnsResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public ListDataMaskingColumnsResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public ListDataMaskingColumnsResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListDataMaskingColumnsResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListDataMaskingColumnsResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
