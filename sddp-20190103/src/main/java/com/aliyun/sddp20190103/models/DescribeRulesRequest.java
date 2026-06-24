// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRulesRequest extends TeaModel {
    /**
     * <p>The type of content in the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: keyword</p>
     * </li>
     * <li><p><strong>2</strong>: regular expression</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The content type. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: SQL injection exploits</p>
     * </li>
     * <li><p><strong>2</strong>: SQL injection bypass attempts</p>
     * </li>
     * <li><p><strong>3</strong>: stored procedure abuse</p>
     * </li>
     * <li><p><strong>4</strong>: buffer overflows</p>
     * </li>
     * <li><p><strong>5</strong>: error-based SQL injections</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentCategory")
    public Integer contentCategory;

    /**
     * <p>The source of the external cooperation request. Valid values:</p>
     * <ul>
     * <li><p>DAS</p>
     * </li>
     * <li><p>YAOCHI</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAS</p>
     */
    @NameInMap("CooperationChannel")
    public String cooperationChannel;

    /**
     * <p>The page number of the paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: built-in</p>
     * </li>
     * <li><p><strong>1</strong>: custom</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomType")
    public Integer customType;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The parent group of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>4_1</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether the keyword is compatible with earlier versions. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>In earlier versions, the Category parameter for keywords had a value of 0. In the current version, it has a value of 5. Enable this parameter based on your business needs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("KeywordCompatible")
    public Boolean keywordCompatible;

    /**
     * <p>The language of the request and response messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
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
     * <li><p>1: rule-based match</p>
     * </li>
     * <li><p>2: dictionary-based match</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>The name of the sensitive data detection rule. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>***Rule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the service to which the data asset belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>MaxCompute</strong></p>
     * </li>
     * <li><p><strong>OSS</strong></p>
     * </li>
     * <li><p><strong>ADS</strong></p>
     * </li>
     * <li><p><strong>OTS</strong></p>
     * </li>
     * <li><p><strong>RDS</strong></p>
     * </li>
     * <li><p><strong>SELF_DB</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductCode")
    public Integer productCode;

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
     * <p>1</p>
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
     * <p>The type of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: data detection rule</p>
     * </li>
     * <li><p><strong>2</strong>: audit policy</p>
     * </li>
     * <li><p><strong>3</strong>: anomaly detection rule</p>
     * </li>
     * <li><p><strong>99</strong>: custom rule</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>Specifies whether to return a simplified version of the rule that contains only the rule name. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Simplify")
    public Boolean simplify;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Normal</p>
     * </li>
     * <li><p><strong>0</strong>: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The type of data asset that the rule supports. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: all assets</p>
     * </li>
     * <li><p><strong>1</strong>: structured assets</p>
     * </li>
     * <li><p><strong>2</strong>: unstructured assets</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When you query for rules that support structured or unstructured assets, the response also includes rules that support all asset types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SupportForm")
    public Integer supportForm;

    /**
     * <p>The risk level.</p>
     * <ul>
     * <li><p><strong>1</strong>: Low</p>
     * </li>
     * <li><p><strong>2</strong>: Medium</p>
     * </li>
     * <li><p><strong>3</strong>: High</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("WarnLevel")
    public Integer warnLevel;

    public static DescribeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesRequest self = new DescribeRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRulesRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public DescribeRulesRequest setContentCategory(Integer contentCategory) {
        this.contentCategory = contentCategory;
        return this;
    }
    public Integer getContentCategory() {
        return this.contentCategory;
    }

    public DescribeRulesRequest setCooperationChannel(String cooperationChannel) {
        this.cooperationChannel = cooperationChannel;
        return this;
    }
    public String getCooperationChannel() {
        return this.cooperationChannel;
    }

    public DescribeRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRulesRequest setCustomType(Integer customType) {
        this.customType = customType;
        return this;
    }
    public Integer getCustomType() {
        return this.customType;
    }

    public DescribeRulesRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeRulesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeRulesRequest setKeywordCompatible(Boolean keywordCompatible) {
        this.keywordCompatible = keywordCompatible;
        return this;
    }
    public Boolean getKeywordCompatible() {
        return this.keywordCompatible;
    }

    public DescribeRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRulesRequest setMatchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }
    public Integer getMatchType() {
        return this.matchType;
    }

    public DescribeRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRulesRequest setProductCode(Integer productCode) {
        this.productCode = productCode;
        return this;
    }
    public Integer getProductCode() {
        return this.productCode;
    }

    public DescribeRulesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeRulesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeRulesRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public DescribeRulesRequest setSimplify(Boolean simplify) {
        this.simplify = simplify;
        return this;
    }
    public Boolean getSimplify() {
        return this.simplify;
    }

    public DescribeRulesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeRulesRequest setSupportForm(Integer supportForm) {
        this.supportForm = supportForm;
        return this;
    }
    public Integer getSupportForm() {
        return this.supportForm;
    }

    public DescribeRulesRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

}
