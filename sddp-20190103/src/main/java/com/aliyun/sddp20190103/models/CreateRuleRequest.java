// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The content type of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: keyword.</p>
     * </li>
     * <li><p><strong>2</strong>: regular expression.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The content of the sensitive data detection rule. The content can be a regular expression or a keyword that is used to match sensitive data fields or text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(?:\\D|^)((?:(?:25[0-4]|2[0-4]\\d|1\\d{2}|[1-9]\\d{1})\\.)(?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){2}(?:25[0-5]|2[0-4]\\d|1[0-9]\\d|[1-9]\\d|[1-9]))(?:\\D|$)</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The content type. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: SQL injection exploit.</p>
     * </li>
     * <li><p><strong>2</strong>: SQL injection bypass.</p>
     * </li>
     * <li><p><strong>3</strong>: stored procedure abuse.</p>
     * </li>
     * <li><p><strong>4</strong>: buffer overflow.</p>
     * </li>
     * <li><p><strong>5</strong>: error-based SQL injection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentCategory")
    public Integer contentCategory;

    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ID card</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The language of the content in the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
     * <p>The IDs of the model rules for sensitive data auditing.</p>
     * 
     * <strong>example:</strong>
     * <p>1452</p>
     */
    @NameInMap("ModelRuleIds")
    public String modelRuleIds;

    /**
     * <p>The name of the sensitive data detection rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-tst</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the service to which the data asset belongs. Valid values: <strong>MaxCompute</strong>, <strong>OSS</strong>, <strong>ADS</strong>, <strong>OTS</strong>, and <strong>RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the data asset belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute</p>
     * </li>
     * <li><p><strong>2</strong>: OSS</p>
     * </li>
     * <li><p><strong>3</strong>: ADS</p>
     * </li>
     * <li><p><strong>4</strong>: OTS</p>
     * </li>
     * <li><p><strong>5</strong>: RDS</p>
     * </li>
     * <li><p><strong>6</strong>: SELF_DB</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The sensitivity level ID of the sensitive data detection rule. Valid values:</p>
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
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: data detection rule.</p>
     * </li>
     * <li><p><strong>2</strong>: audit policy.</p>
     * </li>
     * <li><p><strong>3</strong>: anomaly detection rule.</p>
     * </li>
     * <li><p><strong>99</strong>: custom rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>106.11.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The statistical expression.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time&quot;:&quot;24&quot;,&quot;groupby&quot;:&quot;1003&quot;,&quot;having&quot;:[{&quot;key&quot;:&quot;2001&quot;,&quot;value&quot;:&quot;50&quot;}]}</p>
     */
    @NameInMap("StatExpress")
    public String statExpress;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The type of data assets that the rule supports. Valid values:</p>
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
     * <p>The code of the service to which the rule applies. Valid values: <strong>MaxCompute</strong>, <strong>OSS</strong>, <strong>ADS</strong>, <strong>OTS</strong>, and <strong>RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The IDs of the template rules for sensitive data auditing.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateRuleIds")
    public String templateRuleIds;

    /**
     * <p>The risk level. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Low.</p>
     * </li>
     * <li><p><strong>2</strong>: Medium.</p>
     * </li>
     * <li><p><strong>3</strong>: High.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("WarnLevel")
    public Integer warnLevel;

    public static CreateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleRequest self = new CreateRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public CreateRuleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateRuleRequest setContentCategory(Integer contentCategory) {
        this.contentCategory = contentCategory;
        return this;
    }
    public Integer getContentCategory() {
        return this.contentCategory;
    }

    public CreateRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateRuleRequest setMatchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }
    public Integer getMatchType() {
        return this.matchType;
    }

    public CreateRuleRequest setModelRuleIds(String modelRuleIds) {
        this.modelRuleIds = modelRuleIds;
        return this;
    }
    public String getModelRuleIds() {
        return this.modelRuleIds;
    }

    public CreateRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRuleRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateRuleRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public CreateRuleRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public CreateRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public CreateRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateRuleRequest setStatExpress(String statExpress) {
        this.statExpress = statExpress;
        return this;
    }
    public String getStatExpress() {
        return this.statExpress;
    }

    public CreateRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateRuleRequest setSupportForm(Integer supportForm) {
        this.supportForm = supportForm;
        return this;
    }
    public Integer getSupportForm() {
        return this.supportForm;
    }

    public CreateRuleRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public CreateRuleRequest setTemplateRuleIds(String templateRuleIds) {
        this.templateRuleIds = templateRuleIds;
        return this;
    }
    public String getTemplateRuleIds() {
        return this.templateRuleIds;
    }

    public CreateRuleRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

}
