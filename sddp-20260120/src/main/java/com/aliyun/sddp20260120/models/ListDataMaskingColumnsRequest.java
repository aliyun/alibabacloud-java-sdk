// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingColumnsRequest extends TeaModel {
    /**
     * <p>The filter condition for the column name.</p>
     * 
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The current page number for the query. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>business_db</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The type of the database engine. It must be consistent with the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The instance identity of the database. You can obtain it from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response description. Valid values: zh: Chinese; en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The filter for the column encryption status. Valid values: NotEncrypted: not encrypted; Success: encrypted successfully; Failed: encryption failed.</p>
     * 
     * <strong>example:</strong>
     * <p>NotEncrypted</p>
     */
    @NameInMap("MaskingStatus")
    public String maskingStatus;

    /**
     * <p>The number of records to return per page. Keep other filter conditions consistent when querying the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the cloud service. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also provided, the two must correspond to each other.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the cloud service type. Valid values: 5: RDS; 8: POLARDB; 27: PolarDBX2. It must correspond to ProductCode if both are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The compatible parameter for the list of product IDs. For the current column query, use a single ProductId or ProductCode. Call the operation separately to query multiple products.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductIds")
    public String productIds;

    /**
     * <p>The ID of a single sensitivity level. You can obtain it from ListRiskLevels. The uppercase L in the parameter name must be preserved.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLeveLId")
    public Long riskLeveLId;

    /**
     * <p>The list of sensitivity level IDs. Separate multiple values with commas. Select the values from the response of ListRiskLevels corresponding to the same TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("RiskLevelIds")
    public String riskLevelIds;

    /**
     * <p>The name of the table. In PostgreSQL or Oracle scenarios, retain the schema.table format obtained from the table list.</p>
     * 
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the data classification template. You can obtain it from Items[].Id in the response of ListTemplates. It must be consistent with the selected sensitivity level and detection model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The list of detection model IDs. Separate multiple values with commas. Select the values from the response of ListIdentifyModels corresponding to the same TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>1001,1002</p>
     */
    @NameInMap("TemplateRuleIds")
    public String templateRuleIds;

    public static ListDataMaskingColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingColumnsRequest self = new ListDataMaskingColumnsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingColumnsRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListDataMaskingColumnsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataMaskingColumnsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListDataMaskingColumnsRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ListDataMaskingColumnsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDataMaskingColumnsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataMaskingColumnsRequest setMaskingStatus(String maskingStatus) {
        this.maskingStatus = maskingStatus;
        return this;
    }
    public String getMaskingStatus() {
        return this.maskingStatus;
    }

    public ListDataMaskingColumnsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataMaskingColumnsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListDataMaskingColumnsRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ListDataMaskingColumnsRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

    public ListDataMaskingColumnsRequest setRiskLeveLId(Long riskLeveLId) {
        this.riskLeveLId = riskLeveLId;
        return this;
    }
    public Long getRiskLeveLId() {
        return this.riskLeveLId;
    }

    public ListDataMaskingColumnsRequest setRiskLevelIds(String riskLevelIds) {
        this.riskLevelIds = riskLevelIds;
        return this;
    }
    public String getRiskLevelIds() {
        return this.riskLevelIds;
    }

    public ListDataMaskingColumnsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListDataMaskingColumnsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ListDataMaskingColumnsRequest setTemplateRuleIds(String templateRuleIds) {
        this.templateRuleIds = templateRuleIds;
        return this;
    }
    public String getTemplateRuleIds() {
        return this.templateRuleIds;
    }

}
