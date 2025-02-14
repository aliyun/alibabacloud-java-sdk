// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The engine type. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>MariaDB</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The ID of the instance to which data in the column of the table belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeRules~~">DescribeInstances</a> operation to query the IDs of instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The name of the instance to which data in the column of the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp17t1htja573l5i8****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The data tag.</p>
     * <ul>
     * <li>101: personal sensitive information</li>
     * <li>102: personal information</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ModelTagId")
    public String modelTagId;

    /**
     * <p>The search keyword. Fuzzy match is supported.</p>
     * <p>For example, if you enter <strong>test</strong>, all columns whose names contain <strong>test</strong> are retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the service to which data in the column of the table belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the data object belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute</li>
     * <li><strong>2</strong>: Object Storage Service (OSS)</li>
     * <li><strong>3</strong>: AnalyticDB for MySQL</li>
     * <li><strong>4</strong>: Tablestore (OTS)</li>
     * <li><strong>5</strong>: ApsaraDB RDS</li>
     * <li><strong>6</strong>: self-managed database</li>
     * <li><strong>7</strong>: PolarDB for Xscale (PolarDB-X)</li>
     * <li><strong>8</strong>: PolarDB</li>
     * <li><strong>9</strong>: AnalyticDB for PostgreSQL</li>
     * <li><strong>10</strong>: ApsaraDB for OceanBase</li>
     * <li><strong>11</strong>: ApsaraDB for MongoDB</li>
     * <li><strong>25</strong>: ApsaraDB for Redis</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: N/A</li>
     * <li><strong>2</strong>: S1</li>
     * <li><strong>3</strong>: S2</li>
     * <li><strong>4</strong>: S3</li>
     * <li><strong>5</strong>: S4</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that data in the column of the table hits.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to query the IDs of sensitive data detection rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the sensitive data detection rule that data in the column of the table hits.</p>
     * 
     * <strong>example:</strong>
     * <p>ID card number (the Chinese mainland)</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The name of the sensitivity level of the data that hits the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>N/A</strong>: No sensitive data is detected.</li>
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
     * <p>The ID of the table to which the column belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeTables~~">DescribeTables</a> operation to query the IDs of tables.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11132334</p>
     */
    @NameInMap("TableId")
    public Long tableId;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>it_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the industry-specific classification template.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a> operation to obtain the IDs of industry-specific classification templates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the template rule that is hit.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/410143.html">DescribeCategoryTemplateRuleList</a> operation to obtain the IDs of hit template rules.</p>
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
