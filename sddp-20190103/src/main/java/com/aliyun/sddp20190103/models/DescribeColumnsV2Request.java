// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsV2Request extends TeaModel {
    /**
     * <p>When performing a paginated query, sets the current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Engine type. Values:</p>
     * <ul>
     * <li><strong>MySQL</strong>.</li>
     * <li><strong>MariaDB</strong>.</li>
     * <li><strong>Oracle</strong>.</li>
     * <li><strong>PostgreSQL</strong>.</li>
     * <li><strong>SQLServer</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>ID of the asset instance to which the column data in the data asset table belongs.</p>
     * <blockquote>
     * <p>Query the data in the columns of the data assets authorized by the Data Security Center based on the ID of the asset instance to which the column data in the data asset table belongs. The asset instance ID can be obtained by calling the <a href="https://help.aliyun.com/document_detail/141708.html">DescribeInstances</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>Name of the asset instance to which the column data in the data asset table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp17t1htja573l5i8****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Sets the language type for requests and received messages, default is <strong>zh_cn</strong>.
     * Values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese</li>
     * <li><strong>en_us</strong>: English (United States)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Search keyword, supports fuzzy matching.</p>
     * <p>For example, entering <strong>test</strong> will search for all data information containing <strong>test</strong> in the search items.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>When performing a paginated query, sets the maximum number of data asset instances displayed per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Product name to which the column data in the data asset table belongs. Values: <strong>MaxCompute, OSS, ADS, OTS, RDS</strong>, etc.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Risk level ID of the sensitive data recognition rule. Values:</p>
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
     * <p>Unique identifier ID of the sensitive data recognition rule hit by the column data in the asset table.</p>
     * <blockquote>
     * <p>Query the data in the columns of the data assets authorized by the Data Security Center based on the ID of the sensitive data recognition rule hit by the column data in the asset table. The sensitive data recognition rule ID can be obtained by calling the <a href="https://help.aliyun.com/document_detail/141389.html">DescribeRules</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11122200</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>Name of the sensitive data recognition rule hit by the column data in the data asset table.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Sensitive level name. Values:</p>
     * <ul>
     * <li><strong>N/A</strong>: No sensitive data detected.</li>
     * <li><strong>S1</strong>: Level 1 sensitive data.</li>
     * <li><strong>S2</strong>: Level 2 sensitive data.</li>
     * <li><strong>S3</strong>: Level 3 sensitive data.</li>
     * <li><strong>S4</strong>: Level 4 sensitive data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>S2</p>
     */
    @NameInMap("SensLevelName")
    public String sensLevelName;

    /**
     * <p>Unique identifier ID of the asset table to which the column in MaxCompute, RDS, etc., belongs.</p>
     * <blockquote>
     * <p>Query the data in the columns of the data assets authorized by the Data Security Center based on the ID of the asset table. The asset table ID can be obtained by calling the <a href="https://help.aliyun.com/document_detail/141709.html">DescribeTables</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11132334</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
     * <p>Name of the data asset table.</p>
     * 
     * <strong>example:</strong>
     * <p>it_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DescribeColumnsV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsV2Request self = new DescribeColumnsV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsV2Request setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeColumnsV2Request setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeColumnsV2Request setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribeColumnsV2Request setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeColumnsV2Request setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeColumnsV2Request setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeColumnsV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeColumnsV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeColumnsV2Request setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeColumnsV2Request setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeColumnsV2Request setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeColumnsV2Request setSensLevelName(String sensLevelName) {
        this.sensLevelName = sensLevelName;
        return this;
    }
    public String getSensLevelName() {
        return this.sensLevelName;
    }

    public DescribeColumnsV2Request setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public DescribeColumnsV2Request setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
