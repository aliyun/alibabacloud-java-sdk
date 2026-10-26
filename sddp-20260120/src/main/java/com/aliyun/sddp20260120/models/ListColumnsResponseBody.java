// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListColumnsResponseBody extends TeaModel {
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
    public java.util.List<ListColumnsResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page in the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which can be used to locate the current API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the current statistics or query scope.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListColumnsResponseBody self = new ListColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListColumnsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListColumnsResponseBody setItems(java.util.List<ListColumnsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListColumnsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListColumnsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListColumnsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListColumnsResponseBodyItems extends TeaModel {
        /**
         * <p>The creation time of the data object. The value is a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1788566400000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The cloud instance identity.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        @NameInMap("DataAssetSourceId")
        public String dataAssetSourceId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>business_db</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The data type of the database column.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The instance identity of the cloud instance to which the column belongs. This is a compatible field.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The compatibility field for the column encryption status. To query column encryption results, call ListDataMaskingColumns.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaskingStatus")
        public Integer maskingStatus;

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
         * <p>The ID of the region where the asset is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The identifier of the detection result correction record.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("RevisionId")
        public Long revisionId;

        /**
         * <p>The correction status of the detection result. Valid values: 0: Not corrected. 1: Corrected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RevisionStatus")
        public Long revisionStatus;

        /**
         * <p>The identifier of the sensitivity level.</p>
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
         * <p>The identifier of the matched detection rule.</p>
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
         * <p>Phone number</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The name of the database schema.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>Indicates whether the data is detected as sensitive data.</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The name of the data table.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListColumnsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListColumnsResponseBodyItems self = new ListColumnsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListColumnsResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListColumnsResponseBodyItems setDataAssetSourceId(String dataAssetSourceId) {
            this.dataAssetSourceId = dataAssetSourceId;
            return this;
        }
        public String getDataAssetSourceId() {
            return this.dataAssetSourceId;
        }

        public ListColumnsResponseBodyItems setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListColumnsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListColumnsResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListColumnsResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListColumnsResponseBodyItems setMaskingStatus(Integer maskingStatus) {
            this.maskingStatus = maskingStatus;
            return this;
        }
        public Integer getMaskingStatus() {
            return this.maskingStatus;
        }

        public ListColumnsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListColumnsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListColumnsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListColumnsResponseBodyItems setRevisionId(Long revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public Long getRevisionId() {
            return this.revisionId;
        }

        public ListColumnsResponseBodyItems setRevisionStatus(Long revisionStatus) {
            this.revisionStatus = revisionStatus;
            return this;
        }
        public Long getRevisionStatus() {
            return this.revisionStatus;
        }

        public ListColumnsResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public ListColumnsResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public ListColumnsResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListColumnsResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListColumnsResponseBodyItems setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListColumnsResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public ListColumnsResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
