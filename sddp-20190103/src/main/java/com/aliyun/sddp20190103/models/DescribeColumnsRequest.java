// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the instance to which data in the column of the table belongs.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~DescribeRules~~) operation to query the IDs of instances.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The name of the instance to which data in the column of the table belongs.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The search keyword. Fuzzy match is supported.</p>
     * <br>
     * <p>For example, if you enter **test**, all columns whose names contain **test** are retrieved.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the service to which data in the column of the table belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **1**: N/A</p>
     * <p>*   **2**: S1</p>
     * <p>*   **3**: S2</p>
     * <p>*   **4**: S3</p>
     * <p>*   **5**: S4</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that data in the column of the table hits.</p>
     * <br>
     * <p>> You can call the [DescribeRules](~~DescribeRules~~) operation to query the IDs of sensitive data detection rules.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the sensitive data detection rule that data in the column of the table hits.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The name of the sensitivity level of the data that hits the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **N/A**: No sensitive data is detected.</p>
     * <p>*   **S1**: indicates the low sensitivity level.</p>
     * <p>*   **S2**: indicates the medium sensitivity level.</p>
     * <p>*   **S3**: indicates the high sensitivity level.</p>
     * <p>*   **S4**: indicates the highest sensitivity level.</p>
     */
    @NameInMap("SensLevelName")
    public String sensLevelName;

    /**
     * <p>The ID of the table to which the column belongs.</p>
     * <br>
     * <p>> You can call the [DescribeTables](~~DescribeTables~~) operation to query the IDs of tables.</p>
     */
    @NameInMap("TableId")
    public Long tableId;

    /**
     * <p>The name of the table.</p>
     */
    @NameInMap("TableName")
    public String tableName;

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

}
