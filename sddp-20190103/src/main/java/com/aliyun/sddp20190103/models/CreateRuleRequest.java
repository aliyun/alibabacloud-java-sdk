// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>The content type of the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **0**: keyword</p>
     * <p>*   **2**: regular expression</p>
     */
    @NameInMap("Category")
    public Integer category;

    /**
     * <p>The content of the sensitive data detection rule. You can specify a regular expression or keywords that are used to match sensitive fields or text.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The type of the content in the sensitive data detection rule. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.</p>
     */
    @NameInMap("ContentCategory")
    public Integer contentCategory;

    /**
     * <p>The description of the rule.</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>*   **1**: rule-based match</p>
     * <p>*   **2**: dictionary-based match</p>
     */
    @NameInMap("MatchType")
    public Integer matchType;

    /**
     * <p>The name of the sensitive data detection rule.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the service to which data in the column of the table belongs. Valid values include **MaxCompute**, **OSS**, **ADS**, **OTS**, and **RDS**.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the data asset belongs. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
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
     * <p>The statistical expression.</p>
     */
    @NameInMap("StatExpress")
    public String statExpress;

    /**
     * <p>Specifies whether to enable the sensitive data detection rule. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("SupportForm")
    public Integer supportForm;

    /**
     * <p>The code of the service to which the sensitive data detection rule is applied. Valid values include **MaxCompute**, **OSS**, **ADS**, **OTS**, and **RDS**.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The risk level of the alert that is triggered. Valid values:</p>
     * <br>
     * <p>*   **1**: low</p>
     * <p>*   **2**: medium</p>
     * <p>*   **3**: high</p>
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
