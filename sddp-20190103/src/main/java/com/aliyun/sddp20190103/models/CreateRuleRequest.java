// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("Category")
    public Integer category;

    @NameInMap("Content")
    public String content;

    @NameInMap("StatExpress")
    public String statExpress;

    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("WarnLevel")
    public Integer warnLevel;

    @NameInMap("Description")
    public String description;

    @NameInMap("ContentCategory")
    public Integer contentCategory;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Target")
    public String target;

    public static CreateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleRequest self = new CreateRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public CreateRuleRequest setStatExpress(String statExpress) {
        this.statExpress = statExpress;
        return this;
    }
    public String getStatExpress() {
        return this.statExpress;
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

    public CreateRuleRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

    public CreateRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRuleRequest setContentCategory(Integer contentCategory) {
        this.contentCategory = contentCategory;
        return this;
    }
    public Integer getContentCategory() {
        return this.contentCategory;
    }

    public CreateRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateRuleRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
