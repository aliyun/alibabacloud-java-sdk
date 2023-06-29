// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    /**
     * <p>The content type of the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **2**: regular expression</p>
     * <p>*   **3**: algorithm</p>
     * <p>*   **5**: keyword</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The content of the sensitive data detection rule. You can specify a regular expression, an algorithm, or keywords that are used to match sensitive fields or text.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the sensitive data detection rule.</p>
     * <br>
     * <p>You can call the [DescribeRules](~~DescribeRules~~) operation to obtain the rule ID.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The match type. Valid values:</p>
     * <br>
     * <p>*   **1**: rule-based match</p>
     * <p>*   **2**: dictionary-based match</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>The name of the sensitive data detection rule.</p>
     * <br>
     * <p>You can call the [DescribeRules](~~DescribeRules~~) operation to obtain the rule name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The service to which the sensitive data detection rule is applied. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the sensitive data detection rule is applied. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **1**: N/A, which indicates that no sensitive data is detected.</p>
     * <p>*   **2**: S1, which indicates the low sensitivity level.</p>
     * <p>*   **3**: S2, which indicates the medium sensitivity level.</p>
     * <p>*   **4**: S3, which indicates the high sensitivity level.</p>
     * <p>*   **5**: S4, which indicates the highest sensitivity level.</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The type of the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **1**: data detection rule</p>
     * <p>*   **2**: audit rule</p>
     * <p>*   **3**: anomalous event detection rule</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("SupportForm")
    public Integer supportForm;

    /**
     * <p>The risk level of the alert that is triggered by the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **1**: low level</p>
     * <p>*   **2**: medium level</p>
     * <p>*   **3**: high level</p>
     */
    @NameInMap("WarnLevel")
    public Integer warnLevel;

    public static ModifyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleRequest self = new ModifyRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRuleRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public ModifyRuleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ModifyRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRuleRequest setMatchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }
    public Integer getMatchType() {
        return this.matchType;
    }

    public ModifyRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyRuleRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ModifyRuleRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ModifyRuleRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public ModifyRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public ModifyRuleRequest setSupportForm(Integer supportForm) {
        this.supportForm = supportForm;
        return this;
    }
    public Integer getSupportForm() {
        return this.supportForm;
    }

    public ModifyRuleRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

}
