// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsRequest extends TeaModel {
    /**
     * <p>The page number for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The database engine type. Valid values:</p>
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
     * <p>The ID of the asset instance to which the column data in the data asset table belongs.</p>
     * <blockquote>
     * <p>Queries column data in data asset tables authorized for connection by Data Security Center based on the asset instance ID. You can call the <a href="~~DescribeRules~~">DescribeInstances</a> operation to obtain the instance ID.</p>
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
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese.</li>
     * <li><strong>en_us</strong>: English.</li>
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
     * <li><p>101: personal sensitive information</p>
     * </li>
     * <li><p>102: personal information</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ModelTagId")
    public String modelTagId;

    /**
     * <p>The keyword to search for. Fuzzy match is supported.</p>
     * <p>For example, if you enter <strong>test</strong>, all data entries that contain <strong>test</strong> in the search fields are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the product to which the column data in the data asset table belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, RDS</strong>, and others.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID that corresponds to the product name to which the data object belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute</li>
     * <li><strong>2</strong>: OSS</li>
     * <li><strong>3</strong>: ADB-MYSQL</li>
     * <li><strong>4</strong>: TableStore</li>
     * <li><strong>5</strong>: RDS</li>
     * <li><strong>6</strong>: SELF_DB</li>
     * <li><strong>7</strong>: PolarDB-X</li>
     * <li><strong>8</strong>: PolarDB</li>
     * <li><strong>9</strong>: ADB-PG</li>
     * <li><strong>10</strong>: OceanBase</li>
     * <li><strong>11</strong>: MongoDB</li>
     * <li><strong>25</strong>: Redis</li>
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
     * <li><strong>1</strong>: N/A.</li>
     * <li><strong>2</strong>: S1.</li>
     * <li><strong>3</strong>: S2.</li>
     * <li><strong>4</strong>: S3.</li>
     * <li><strong>5</strong>: S4.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The unique ID of the sensitive data detection rule that the column data matches.</p>
     * <blockquote>
     * <p>Queries column data in data asset tables authorized for connection by Data Security Center based on the ID of the sensitive data detection rule that the column data matches. You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to obtain the rule ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the sensitive data detection rule that the column data in the data asset table matches.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The sensitivity level name. Valid values:</p>
     * <ul>
     * <li><strong>N/A</strong>: No sensitive data is detected.</li>
     * <li><strong>S1</strong>: Level-1 sensitive data.</li>
     * <li><strong>S2</strong>: Level-2 sensitive data.</li>
     * <li><strong>S3</strong>: Level-3 sensitive data.</li>
     * <li><strong>S4</strong>: Level-4 sensitive data.</li>
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
     * <p>The unique ID of the data asset table to which the columns belong in MaxCompute, ApsaraDB RDS, or other assets.</p>
     * <blockquote>
     * <p>Queries column data in data asset tables authorized for connection by Data Security Center based on the table ID. You can call the <a href="~~DescribeTables~~">DescribeTables</a> operation to obtain the table ID.</p>
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
     * <p>The industry template ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a> operation to obtain the industry template ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the matched template rule.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/410143.html">DescribeCategoryTemplateRuleList</a> operation to obtain the matched template rule ID.</p>
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
