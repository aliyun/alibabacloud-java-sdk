// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingInstancesRequest extends TeaModel {
    /**
     * <p>The filter condition for the column name.</p>
     * 
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("ColumnName")
    public String columnName;

    /**
     * <p>The page number of the current query. Pages start from 1.</p>
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
     * <p>The type of the database engine. The value must be consistent with the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The database instance identity. You can obtain the identity from the Items[].InstanceId parameter in the response of the ListDataMaskingInstances operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response description. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The column encryption status filter. Valid values: NotEncrypted: not encrypted. Success: encrypted. Failed: encryption failed.</p>
     * 
     * <strong>example:</strong>
     * <p>NotEncrypted</p>
     */
    @NameInMap("MaskingStatus")
    public String maskingStatus;

    /**
     * <p>The ID of the model tag. This parameter is used to filter data that matches the specified model tag.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ModelTagId")
    public String modelTagId;

    /**
     * <p>The number of entries to return on each page. Keep other filter conditions consistent when querying the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the cloud service. Column encryption supports RDS, POLARDB, and PolarDBX2. If you specify this parameter and ProductId at the same time, the values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the cloud service type. Valid values: 5: RDS. 8: POLARDB. 27: PolarDBX2. If you specify this parameter and ProductCode at the same time, the values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The list of cloud service type IDs. Separate multiple values with commas (,). In column encryption scenarios, the valid values are 5 (RDS), 8 (POLARDB), and 27 (PolarDBX2).</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductIds")
    public String productIds;

    /**
     * <p>The ID of the sensitivity level. You can obtain the ID from the response of the ListRiskLevels operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The list of sensitivity level IDs. Separate multiple values with commas (,). Select the values from the response of the ListRiskLevels operation that corresponds to the same TemplateId.</p>
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
     * <p>The ID of the data classification template. You can obtain the ID from the Items[].Id parameter in the response of the ListTemplates operation. The ID must be consistent with the selected sensitivity level and identification model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The list of identification model IDs. Separate multiple values with commas (,). Select the values from the response of the ListIdentifyModels operation that corresponds to the same TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>1001,1002</p>
     */
    @NameInMap("TemplateRuleIds")
    public String templateRuleIds;

    public static ListDataMaskingInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingInstancesRequest self = new ListDataMaskingInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingInstancesRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListDataMaskingInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataMaskingInstancesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListDataMaskingInstancesRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ListDataMaskingInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDataMaskingInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataMaskingInstancesRequest setMaskingStatus(String maskingStatus) {
        this.maskingStatus = maskingStatus;
        return this;
    }
    public String getMaskingStatus() {
        return this.maskingStatus;
    }

    public ListDataMaskingInstancesRequest setModelTagId(String modelTagId) {
        this.modelTagId = modelTagId;
        return this;
    }
    public String getModelTagId() {
        return this.modelTagId;
    }

    public ListDataMaskingInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataMaskingInstancesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListDataMaskingInstancesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ListDataMaskingInstancesRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

    public ListDataMaskingInstancesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public ListDataMaskingInstancesRequest setRiskLevelIds(String riskLevelIds) {
        this.riskLevelIds = riskLevelIds;
        return this;
    }
    public String getRiskLevelIds() {
        return this.riskLevelIds;
    }

    public ListDataMaskingInstancesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListDataMaskingInstancesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ListDataMaskingInstancesRequest setTemplateRuleIds(String templateRuleIds) {
        this.templateRuleIds = templateRuleIds;
        return this;
    }
    public String getTemplateRuleIds() {
        return this.templateRuleIds;
    }

}
