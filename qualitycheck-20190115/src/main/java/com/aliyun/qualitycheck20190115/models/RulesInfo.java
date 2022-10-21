// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RulesInfo extends TeaModel {
    @NameInMap("Conditions")
    public java.util.List<ConditionBasicInfo> conditions;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Dialogues")
    public java.util.List<RuleTestDialogue> dialogues;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Rules")
    public java.util.List<RuleInfo> rules;

    public static RulesInfo build(java.util.Map<String, ?> map) throws Exception {
        RulesInfo self = new RulesInfo();
        return TeaModel.build(map, self);
    }

    public RulesInfo setConditions(java.util.List<ConditionBasicInfo> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<ConditionBasicInfo> getConditions() {
        return this.conditions;
    }

    public RulesInfo setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RulesInfo setDialogues(java.util.List<RuleTestDialogue> dialogues) {
        this.dialogues = dialogues;
        return this;
    }
    public java.util.List<RuleTestDialogue> getDialogues() {
        return this.dialogues;
    }

    public RulesInfo setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public RulesInfo setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public RulesInfo setRules(java.util.List<RuleInfo> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<RuleInfo> getRules() {
        return this.rules;
    }

}
