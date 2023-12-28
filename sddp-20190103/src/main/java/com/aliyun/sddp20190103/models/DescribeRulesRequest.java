// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRulesRequest extends TeaModel {
    /**
     * <p>The content type of the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **0**: keyword</p>
     * <p>*   **2**: regular expression</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The type of the content in the sensitive data detection rule. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.</p>
     */
    @NameInMap("ContentCategory")
    public Integer contentCategory;

    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **0**: built-in rule</p>
     * <p>*   **1**: custom rule</p>
     */
    @NameInMap("CustomType")
    public Integer customType;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The parent group type of the rule.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to allow earlier versions of request parameters to support keywords that are supported in later versions of request parameters. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     * <br>
     * <p>> To specify keywords as the content type of the sensitive data detection rule, you can set the Category parameter to 0 for earlier versions of request parameters and set the Category parameter to 5 for later versions of request parameters. You can specify the KeywordCompatible parameter based on your business requirements.</p>
     */
    @NameInMap("KeywordCompatible")
    public Boolean keywordCompatible;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The match type. Valid values:</p>
     * <br>
     * <p>*   1: rule-based match</p>
     * <p>*   2: dictionary-based match</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>The name of the sensitive data detection rule. Fuzzy match is supported.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the service to which the data asset belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.</p>
     */
    @NameInMap("ProductCode")
    public Integer productCode;

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
     * <p>*   **1**: sensitive data detection rule</p>
     * <p>*   **2**: audit rule</p>
     * <p>*   **3**: anomalous event detection rule</p>
     * <p>*   **99**: custom rule</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The status of the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **1**: enabled</p>
     * <p>*   **0**: disabled</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The type of the data asset. Valid values:</p>
     * <br>
     * <p>*   **0**: all data assets</p>
     * <p>*   **1**: structured data asset</p>
     * <p>*   **2**: unstructured data asset</p>
     * <br>
     * <p>> If you set the parameter to 1 or 2, rules that support all data assets and rules that support the queried data asset type are returned.</p>
     */
    @NameInMap("SupportForm")
    public Integer supportForm;

    /**
     * <p>The severity level of the alert. Valid values:</p>
     * <br>
     * <p>*   **1**: low</p>
     * <p>*   **2**: medium</p>
     * <p>*   **3**: high</p>
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
