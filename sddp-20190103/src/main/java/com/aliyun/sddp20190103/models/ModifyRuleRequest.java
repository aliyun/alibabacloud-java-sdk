// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    /**
     * <p>The type of the content in the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>2</strong>: regular expression.</p>
     * </li>
     * <li><p><strong>3</strong>: algorithm.</p>
     * </li>
     * <li><p><strong>5</strong>: keyword.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The content of the sensitive data detection rule. The rule can be a regular expression, an algorithm, or a keyword, and matches fields or text that contain sensitive data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(?:\\D|^)((?:(?:25[0-4]|2[0-4]\\d|1\\d{2}|[1-9]\\d{1})\\.)(?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){2}(?:25[0-5]|2[0-4]\\d|1[0-9]\\d|[1-9]\\d|[1-9]))(?:\\D|$)</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The unique ID of the sensitive data detection rule.</p>
     * <p>You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. The default value is <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Simplified Chinese.</p>
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
     * <p>The match type. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: rule-based match.</p>
     * </li>
     * <li><p><strong>2</strong>: dictionary-based match.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>A collection of model IDs for sensitive data auditing.</p>
     * 
     * <strong>example:</strong>
     * <p>1452</p>
     */
    @NameInMap("ModelRuleIds")
    public String modelRuleIds;

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
     * <p>The type of the product resource that contains the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>MaxCompute</strong>.</p>
     * </li>
     * <li><p><strong>OSS</strong>.</p>
     * </li>
     * <li><p><strong>ADS</strong>.</p>
     * </li>
     * <li><p><strong>OTS</strong>.</p>
     * </li>
     * <li><p><strong>RDS</strong>.</p>
     * </li>
     * <li><p><strong>SELF_DB</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the product that contains the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute.</p>
     * </li>
     * <li><p><strong>2</strong>: OSS.</p>
     * </li>
     * <li><p><strong>3</strong>: ADS.</p>
     * </li>
     * <li><p><strong>4</strong>: OTS.</p>
     * </li>
     * <li><p><strong>5</strong>: RDS.</p>
     * </li>
     * <li><p><strong>6</strong>: SELF_DB.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The ID of the risk level for the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: N/A. No sensitive data is detected.</p>
     * </li>
     * <li><p><strong>2</strong>: S1. Level 1 sensitive data.</p>
     * </li>
     * <li><p><strong>3</strong>: S2. Level 2 sensitive data.</p>
     * </li>
     * <li><p><strong>4</strong>: S3. Level 3 sensitive data.</p>
     * </li>
     * <li><p><strong>5</strong>: S4. Level 4 sensitive data.</p>
     * </li>
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
     * <li><p><strong>1</strong>: data detection rule.</p>
     * </li>
     * <li><p><strong>2</strong>: audit policy.</p>
     * </li>
     * <li><p><strong>3</strong>: abnormal event rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The type of data asset that the rule supports. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: all assets.</p>
     * </li>
     * <li><p><strong>1</strong>: structured assets.</p>
     * </li>
     * <li><p><strong>2</strong>: unstructured assets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SupportForm")
    public Integer supportForm;

    /**
     * <p>A collection of template IDs for sensitive data auditing.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateRuleIds")
    public String templateRuleIds;

    /**
     * <p>The risk level of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: low.</p>
     * </li>
     * <li><p><strong>2</strong>: medium.</p>
     * </li>
     * <li><p><strong>3</strong>: high.</p>
     * </li>
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

    public ModifyRuleRequest setModelRuleIds(String modelRuleIds) {
        this.modelRuleIds = modelRuleIds;
        return this;
    }
    public String getModelRuleIds() {
        return this.modelRuleIds;
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

    public ModifyRuleRequest setTemplateRuleIds(String templateRuleIds) {
        this.templateRuleIds = templateRuleIds;
        return this;
    }
    public String getTemplateRuleIds() {
        return this.templateRuleIds;
    }

    public ModifyRuleRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

}
