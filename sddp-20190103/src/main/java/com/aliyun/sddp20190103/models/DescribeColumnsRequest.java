// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsRequest extends TeaModel {
    /**
     * <p>The page number for paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Engine type. Valid values:</p>
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
     * <p>The ID of the asset instance to which the column data in the data asset table belongs.</p>
     * <blockquote>
     * <p>Query column data in data asset tables authorized to connect to Data Security Center using the ID of the asset instance to which the column data in the data asset table belongs. Obtain the asset instance ID by calling the <a href="~~DescribeRules~~">DescribeInstances</a> API.</p>
     * </blockquote>
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
     * <p>The language type for requests and responses. The default value is <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Data tag.</p>
     * <ul>
     * <li><p>101: Personal sensitive information</p>
     * </li>
     * <li><p>102: Personal information</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ModelTagId")
    public String modelTagId;

    /**
     * <p>The keyword for search. Supports fuzzy match.</p>
     * <p>For example, entering <strong>test</strong> returns all data containing <strong>test</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of data entries displayed per page in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product name to which the column data in the data asset table belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, RDS</strong>, and others.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID corresponding to the product name to which the data object belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute</p>
     * </li>
     * <li><p><strong>2</strong>: OSS</p>
     * </li>
     * <li><p><strong>3</strong>: ADB-MYSQL</p>
     * </li>
     * <li><p><strong>4</strong>: TableStore</p>
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
    public String productId;

    /**
     * <p>The risk level ID of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: N/A.</p>
     * </li>
     * <li><p><strong>2</strong>: S1.</p>
     * </li>
     * <li><p><strong>3</strong>: S2.</p>
     * </li>
     * <li><p><strong>4</strong>: S3.</p>
     * </li>
     * <li><p><strong>5</strong>: S4.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The unique ID of the sensitive data detection rule hit by the column data in the asset table.</p>
     * <blockquote>
     * <p>Query column data in data asset tables authorized to connect to Data Security Center using the ID of the sensitive data detection rule hit by the column data in the asset table. Obtain the sensitive data detection rule ID by calling the <a href="~~DescribeRules~~">DescribeRules</a> API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the sensitive data detection rule hit by the column data in the data asset table.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Sensitivity level name. Valid values:</p>
     * <ul>
     * <li><p><strong>N/A</strong>: No sensitive data detected.</p>
     * </li>
     * <li><p><strong>S1</strong>: Level 1 sensitive data.</p>
     * </li>
     * <li><p><strong>S2</strong>: Level 2 sensitive data.</p>
     * </li>
     * <li><p><strong>S3</strong>: Level 3 sensitive data.</p>
     * </li>
     * <li><p><strong>S4</strong>: Level 4 sensitive data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>S2</p>
     */
    @NameInMap("SensLevelName")
    public String sensLevelName;

    /**
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The unique ID of the asset table that contains the columns in data asset tables such as MaxCompute and RDS.</p>
     * <blockquote>
     * <p>Query column data in data asset tables authorized to connect to Data Security Center using the asset table ID. Obtain the asset table ID by calling the <a href="~~DescribeTables~~">DescribeTables</a> API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11132334</p>
     */
    @NameInMap("TableId")
    public Long tableId;

    /**
     * <p>The name of the data asset table.</p>
     * 
     * <strong>example:</strong>
     * <p>it_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>Industry template ID.</p>
     * <blockquote>
     * <p>Obtain the industry template ID by calling <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the hit template rule.</p>
     * <blockquote>
     * <p>Obtain the hit template rule ID by calling <a href="https://help.aliyun.com/document_detail/410143.html">DescribeCategoryTemplateRuleList</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1542</p>
     */
    @NameInMap("TemplateRuleId")
    public String templateRuleId;

    public static DescribeColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsRequest self = new DescribeColumnsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeColumnsRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeColumnsRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribeColumnsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeColumnsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeColumnsRequest setModelTagId(String modelTagId) {
        this.modelTagId = modelTagId;
        return this;
    }
    public String getModelTagId() {
        return this.modelTagId;
    }

    public DescribeColumnsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeColumnsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeColumnsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeColumnsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DescribeColumnsRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeColumnsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeColumnsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeColumnsRequest setSensLevelName(String sensLevelName) {
        this.sensLevelName = sensLevelName;
        return this;
    }
    public String getSensLevelName() {
        return this.sensLevelName;
    }

    public DescribeColumnsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeColumnsRequest setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

    public DescribeColumnsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DescribeColumnsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DescribeColumnsRequest setTemplateRuleId(String templateRuleId) {
        this.templateRuleId = templateRuleId;
        return this;
    }
    public String getTemplateRuleId() {
        return this.templateRuleId;
    }

}
