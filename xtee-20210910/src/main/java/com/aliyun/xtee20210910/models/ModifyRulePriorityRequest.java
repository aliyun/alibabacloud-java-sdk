// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyRulePriorityRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    @NameInMap("priority")
    public Integer priority;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleId")
    public Long ruleId;

    public static ModifyRulePriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRulePriorityRequest self = new ModifyRulePriorityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRulePriorityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRulePriorityRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public ModifyRulePriorityRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyRulePriorityRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyRulePriorityRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
