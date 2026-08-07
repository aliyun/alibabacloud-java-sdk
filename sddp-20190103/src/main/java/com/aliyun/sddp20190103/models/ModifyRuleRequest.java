// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    /**
     * <p>The type of the sensitive data detection rule content. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: regular expression.</li>
     * <li><strong>3</strong>: algorithm.</li>
     * <li><strong>5</strong>: keyword.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The content of the sensitive data detection rule. The content can be a regular expression, algorithm, or keyword that is used to match sensitive data fields or text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(?:\\D|^)((?:(?:25[0-4]|2[0-4]\\d|1\\d{2}|[1-9]\\d{1})\\.)(?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){2}(?:25[0-5]|2[0-4]\\d|1[0-9]\\d|[1-9]\\d|[1-9]))(?:\\D|$)</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The unique ID of the sensitive data detection rule.</p>
     * <p>You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to obtain the rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese.</li>
     * <li><strong>en_us</strong>: English (US).</li>
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
     * <li><strong>1</strong>: rule match.</li>
     * <li><strong>2</strong>: dictionary match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>The collection of model IDs associated with the sensitive data audit.</p>
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
     * <p>The resource type of the product that contains the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>MaxCompute</strong></li>
     * <li><strong>OSS</strong></li>
     * <li><strong>ADS</strong></li>
     * <li><strong>OTS</strong></li>
     * <li><strong>RDS</strong></li>
     * <li><strong>SELF_DB</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product ID of the product that contains the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute.</li>
     * <li><strong>2</strong>: OSS.</li>
     * <li><strong>3</strong>: ADS.</li>
     * <li><strong>4</strong>: OTS.</li>
     * <li><strong>5</strong>: RDS.</li>
     * <li><strong>6</strong>: SELF_DB.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The risk level ID of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: N/A. No sensitive data is detected.</li>
     * <li><strong>2</strong>: S1. Level-1 sensitive data.</li>
     * <li><strong>3</strong>: S2. Level-2 sensitive data.</li>
     * <li><strong>4</strong>: S3. Level-3 sensitive data.</li>
     * <li><strong>5</strong>: S4. Level-4 sensitive data.</li>
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
     * <li><strong>1</strong>: data detection rule.</li>
     * <li><strong>2</strong>: audit policy.</li>
     * <li><strong>3</strong>: anomalous activity rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The data asset type supported by the rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: all assets.</li>
     * <li><strong>1</strong>: structured assets.</li>
     * <li><strong>2</strong>: unstructured assets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SupportForm")
    public Integer supportForm;

    /**
     * <p>The collection of template IDs associated with the sensitive data audit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateRuleIds")
    public String templateRuleIds;

    /**
     * <p>The risk level of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: low.</li>
     * <li><strong>2</strong>: medium.</li>
     * <li><strong>3</strong>: high.</li>
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
