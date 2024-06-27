// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    /**
     * <p>The content type of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: regular expression</li>
     * <li><strong>3</strong>: algorithm</li>
     * <li><strong>5</strong>: keyword</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The content of the sensitive data detection rule. You can specify a regular expression, an algorithm, or keywords that are used to match sensitive fields or text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(?:\\D|^)((?:(?:25[0-4]|2[0-4]\\d|1\\d{2}|[1-9]\\d{1})\\.)(?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){2}(?:25[0-5]|2[0-4]\\d|1[0-9]\\d|[1-9]\\d|[1-9]))(?:\\D|$)</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the sensitive data detection rule.</p>
     * <p>You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to obtain the rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The match type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: rule-based match</li>
     * <li><strong>2</strong>: dictionary-based match</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>The name of the sensitive data detection rule.</p>
     * <p>You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to obtain the rule name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esw</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The service to which the sensitive data detection rule is applied. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the sensitive data detection rule is applied. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
     * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
     * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
     * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
     * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The type of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: data detection rule</li>
     * <li><strong>2</strong>: audit rule</li>
     * <li><strong>3</strong>: anomalous event detection rule</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The data assets supported by the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: all data assets</li>
     * <li><strong>1</strong>: structured data assets</li>
     * <li><strong>2</strong>: unstructured data assets</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SupportForm")
    public Integer supportForm;

    /**
     * <p>The risk level of the alert that is triggered by the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: low level</li>
     * <li><strong>2</strong>: medium level</li>
     * <li><strong>3</strong>: high level</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
