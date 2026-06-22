// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerPluginRuleRequest extends TeaModel {
    /**
     * <p>The language type for requests and responses. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The action mode of the rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Alert.</li>
     * <li><strong>2</strong>: Block.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Mode")
    public Integer mode;

    /**
     * <p>The rule ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2623606.html">ListSasContainerWebDefenseRule</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100012</p>
     */
    @NameInMap("RuleId")
    public Integer ruleId;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: User-defined.</li>
     * <li><strong>1</strong>: System built-in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The list of rule items.</p>
     */
    @NameInMap("SelectedPolicy")
    public java.util.List<String> selectedPolicy;

    /**
     * <p>The list of whitelisted images.</p>
     */
    @NameInMap("WhiteImages")
    public java.util.List<String> whiteImages;

    public static ModifyContainerPluginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerPluginRuleRequest self = new ModifyContainerPluginRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyContainerPluginRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyContainerPluginRuleRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ModifyContainerPluginRuleRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public ModifyContainerPluginRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyContainerPluginRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public ModifyContainerPluginRuleRequest setSelectedPolicy(java.util.List<String> selectedPolicy) {
        this.selectedPolicy = selectedPolicy;
        return this;
    }
    public java.util.List<String> getSelectedPolicy() {
        return this.selectedPolicy;
    }

    public ModifyContainerPluginRuleRequest setWhiteImages(java.util.List<String> whiteImages) {
        this.whiteImages = whiteImages;
        return this;
    }
    public java.util.List<String> getWhiteImages() {
        return this.whiteImages;
    }

}
