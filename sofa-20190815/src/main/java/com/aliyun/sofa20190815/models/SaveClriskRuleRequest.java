// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskRuleRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("RuleName")
    public String ruleName;

    public static SaveClriskRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskRuleRequest self = new SaveClriskRuleRequest();
        return TeaModel.build(map, self);
    }

    public SaveClriskRuleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveClriskRuleRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public SaveClriskRuleRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public SaveClriskRuleRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public SaveClriskRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
