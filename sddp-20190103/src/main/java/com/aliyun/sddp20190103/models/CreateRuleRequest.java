// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The content type of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: keyword</li>
     * <li><strong>2</strong>: regular expression</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The content of the sensitive data detection rule. You can specify a regular expression or keywords that are used to match sensitive fields or text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(?:\\D|^)((?:(?:25[0-4]|2[0-4]\\d|1\\d{2}|[1-9]\\d{1})\\.)(?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){2}(?:25[0-5]|2[0-4]\\d|1[0-9]\\d|[1-9]\\d|[1-9]))(?:\\D|$)</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The type of the content in the sensitive data detection rule. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.</p>
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
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-tst</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the service to which data in the column of the table belongs. Valid values include <strong>MaxCompute</strong>, <strong>OSS</strong>, <strong>ADS</strong>, <strong>OTS</strong>, and <strong>RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the data asset belongs. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
     * <li><strong>1</strong>: sensitive data detection rule</li>
     * <li><strong>2</strong>: audit rule</li>
     * <li><strong>3</strong>: anomalous event detection rule</li>
     * <li><strong>99</strong>: custom rule</li>
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
     * <p>39.170.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The statistical expression.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatExpress")
    public String statExpress;

    /**
     * <p>Specifies whether to enable the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The type of the data asset. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: all data assets</li>
     * <li><strong>1</strong>: structured data asset</li>
     * <li><strong>2</strong>: unstructured data asset</li>
     * </ul>
     * <blockquote>
     * <p>If you set the parameter to 1 or 2, rules that support all data assets and rules that support the queried data asset type are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SupportForm")
    public Integer supportForm;

    /**
     * <p>The code of the service to which the sensitive data detection rule is applied. Valid values include <strong>MaxCompute</strong>, <strong>OSS</strong>, <strong>ADS</strong>, <strong>OTS</strong>, and <strong>RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The risk level of the alert that is triggered. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: low</li>
     * <li><strong>2</strong>: medium</li>
     * <li><strong>3</strong>: high</li>
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

    public CreateRuleRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

}
