// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Id")
    public Long id;

    @NameInMap("CustomType")
    public Integer customType;

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

    @NameInMap("Target")
    public String target;

    public static ModifyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleRequest self = new ModifyRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyRuleRequest setCustomType(Integer customType) {
        this.customType = customType;
        return this;
    }
    public Integer getCustomType() {
        return this.customType;
    }

    public ModifyRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public ModifyRuleRequest setStatExpress(String statExpress) {
        this.statExpress = statExpress;
        return this;
    }
    public String getStatExpress() {
        return this.statExpress;
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

    public ModifyRuleRequest setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
        return this;
    }
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

    public ModifyRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyRuleRequest setContentCategory(Integer contentCategory) {
        this.contentCategory = contentCategory;
        return this;
    }
    public Integer getContentCategory() {
        return this.contentCategory;
    }

    public ModifyRuleRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
