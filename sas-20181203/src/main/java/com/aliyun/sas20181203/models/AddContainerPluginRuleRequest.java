// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddContainerPluginRuleRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The action that you want to specify for the rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: triggers alerts.</li>
     * <li><strong>2</strong>: blocks escapes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Mode")
    public Integer mode;

    /**
     * <p>The name of the rule. The name must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_). The names of rules that are created for the same user must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tyest111</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The ID of the rule template. You can call the ListSystemClientRules operation to query the ID of the rule template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86863</p>
     */
    @NameInMap("RuleTemplateId")
    public Integer ruleTemplateId;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: custom rule</li>
     * <li><strong>1</strong>: system rule</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The check items that are enabled for the rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SelectedPolicy")
    public java.util.List<String> selectedPolicy;

    /**
     * <p>The images that are added to the whitelist.</p>
     */
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
