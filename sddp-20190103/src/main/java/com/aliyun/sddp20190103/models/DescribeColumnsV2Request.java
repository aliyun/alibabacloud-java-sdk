// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsV2Request extends TeaModel {
    /**
     * <p>The page number in a paged query. Default value: <strong>1</strong>.</p>
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
     * <p>The ID of the asset instance to which the column data in the data asset table belongs.</p>
     * <blockquote>
     * <p>Queries column data in data asset tables that are connected to and authorized by Data Security Center based on the asset instance ID. You can call the <a href="https://help.aliyun.com/document_detail/141708.html">DescribeInstances</a> operation to obtain the instance ID.</p>
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
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese (Simplified).</li>
     * <li><strong>en_us</strong>: English (US).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

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
     * <p>The maximum number of entries per page in a paged query. Default value: <strong>10</strong>.</p>
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
     * <p>Queries column data in data asset tables that are connected to and authorized by Data Security Center based on the ID of the sensitive data detection rule that the column data matches. You can call the <a href="https://help.aliyun.com/document_detail/141389.html">DescribeRules</a> operation to obtain the rule ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11122200</p>
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
     * <li><strong>N/A</strong>: no sensitive data detected.</li>
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
     * <p>The unique ID of the data asset table to which the columns belong in MaxCompute, ApsaraDB RDS, or other data assets.</p>
     * <blockquote>
     * <p>Queries column data in data asset tables that are connected to and authorized by Data Security Center based on the table ID. You can call the <a href="https://help.aliyun.com/document_detail/141709.html">DescribeTables</a> operation to obtain the table ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11132334</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
     * <p>The name of the data asset table.</p>
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
