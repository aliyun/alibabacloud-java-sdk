// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerPluginRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Mode")
    public Integer mode;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleTemplateId")
    public Integer ruleTemplateId;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("SelectedPolicy")
    public java.util.List<String> selectedPolicy;

    @NameInMap("WhiteImages")
    public java.util.List<String> whiteImages;

    public static AddContainerPluginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContainerPluginRuleRequest self = new AddContainerPluginRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddContainerPluginRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddContainerPluginRuleRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public AddContainerPluginRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddContainerPluginRuleRequest setRuleTemplateId(Integer ruleTemplateId) {
        this.ruleTemplateId = ruleTemplateId;
        return this;
    }
    public Integer getRuleTemplateId() {
        return this.ruleTemplateId;
    }

    public AddContainerPluginRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public AddContainerPluginRuleRequest setSelectedPolicy(java.util.List<String> selectedPolicy) {
        this.selectedPolicy = selectedPolicy;
        return this;
    }
    public java.util.List<String> getSelectedPolicy() {
        return this.selectedPolicy;
    }

    public AddContainerPluginRuleRequest setWhiteImages(java.util.List<String> whiteImages) {
        this.whiteImages = whiteImages;
        return this;
    }
    public java.util.List<String> getWhiteImages() {
        return this.whiteImages;
    }

}
