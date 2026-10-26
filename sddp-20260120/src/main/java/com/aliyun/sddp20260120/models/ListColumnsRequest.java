// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListColumnsRequest extends TeaModel {
    /**
     * <p>The page number of the current query. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The cloud database instance identity. Set this parameter to the InstanceId in the instance list.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("DataAssetSourceId")
    public String dataAssetSourceId;

    /**
     * <p>The name of the database. Set this parameter to the DbName returned by ListDataSources.</p>
     * 
     * <strong>example:</strong>
     * <p>business_db</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>The type of the database engine. This parameter must be consistent with the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The compatible parameter for the instance identity. DataAssetSourceId takes precedence. If both are specified, DataAssetSourceId is used.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language of the response description. Valid values: zh: Chinese; en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The filter condition for the column name.</p>
     * 
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Keep other filter conditions consistent when querying the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the cloud service. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The identifier of the sensitivity level. You can obtain this value from the return list of ListRiskLevels.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The identifier of the detection rule or model. Set this parameter to the ID of the corresponding detection rule in the target template.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the data table. In PostgreSQL or Oracle scenarios, retain the schema.table format obtained from the table list.</p>
     * 
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The identifier of the data classification and grading template. You can obtain this value from Items[].Id returned by ListTemplates. Keep this parameter consistent with the selected sensitivity level and detection model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ListColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListColumnsRequest self = new ListColumnsRequest();
        return TeaModel.build(map, self);
    }

    public ListColumnsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListColumnsRequest setDataAssetSourceId(String dataAssetSourceId) {
        this.dataAssetSourceId = dataAssetSourceId;
        return this;
    }
    public String getDataAssetSourceId() {
        return this.dataAssetSourceId;
    }

    public ListColumnsRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public ListColumnsRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ListColumnsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListColumnsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListColumnsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListColumnsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListColumnsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListColumnsRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public ListColumnsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ListColumnsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListColumnsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
