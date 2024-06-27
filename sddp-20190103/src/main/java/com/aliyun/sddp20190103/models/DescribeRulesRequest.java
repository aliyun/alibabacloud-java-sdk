// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRulesRequest extends TeaModel {
    /**
     * <p>The content type of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: keyword</li>
     * <li><strong>2</strong>: regular expression</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The type of the content in the sensitive data detection rule. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentCategory")
    public Integer contentCategory;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: built-in rule</li>
     * <li><strong>1</strong>: custom rule</li>
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
     * <p>The parent group type of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>4_1</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to allow earlier versions of request parameters to support keywords that are supported in later versions of request parameters. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * <blockquote>
     * <p>To specify keywords as the content type of the sensitive data detection rule, you can set the Category parameter to 0 for earlier versions of request parameters and set the Category parameter to 5 for later versions of request parameters. You can specify the KeywordCompatible parameter based on your business requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("KeywordCompatible")
    public Boolean keywordCompatible;

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
     * <li>1: rule-based match</li>
     * <li>2: dictionary-based match</li>
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
     * <p>\<em>\</em>\* rule</p>
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
     * <p>The name of the service to which the data asset belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductCode")
    public Integer productCode;

    /**
     * <p>The ID of the service to which the sensitive data detection rule is applied. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The status of the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
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
     * <p>The severity level of the alert. Valid values:</p>
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
