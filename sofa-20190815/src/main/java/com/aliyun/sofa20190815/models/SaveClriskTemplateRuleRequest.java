// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskTemplateRuleRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static SaveClriskTemplateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskTemplateRuleRequest self = new SaveClriskTemplateRuleRequest();
        return TeaModel.build(map, self);
    }

    public SaveClriskTemplateRuleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveClriskTemplateRuleRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public SaveClriskTemplateRuleRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public SaveClriskTemplateRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public SaveClriskTemplateRuleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
