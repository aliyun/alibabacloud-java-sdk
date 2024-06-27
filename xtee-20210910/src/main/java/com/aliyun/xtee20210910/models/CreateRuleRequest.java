// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    @NameInMap("createType")
    public String createType;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("eventName")
    public String eventName;

    @NameInMap("logicExpression")
    public String logicExpression;

    @NameInMap("memo")
    public String memo;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleActions")
    public String ruleActions;

    @NameInMap("ruleExpressions")
    public String ruleExpressions;

    @NameInMap("ruleName")
    public String ruleName;

    @NameInMap("ruleStatus")
    public String ruleStatus;

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

    public CreateRuleRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public CreateRuleRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateRuleRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public CreateRuleRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateRuleRequest setLogicExpression(String logicExpression) {
        this.logicExpression = logicExpression;
        return this;
    }
    public String getLogicExpression() {
        return this.logicExpression;
    }

    public CreateRuleRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateRuleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateRuleRequest setRuleActions(String ruleActions) {
        this.ruleActions = ruleActions;
        return this;
    }
    public String getRuleActions() {
        return this.ruleActions;
    }

    public CreateRuleRequest setRuleExpressions(String ruleExpressions) {
        this.ruleExpressions = ruleExpressions;
        return this;
    }
    public String getRuleExpressions() {
        return this.ruleExpressions;
    }

    public CreateRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRuleRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

}
