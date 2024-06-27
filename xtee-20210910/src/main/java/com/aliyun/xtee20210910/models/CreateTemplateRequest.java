// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

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

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTemplateRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateTemplateRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public CreateTemplateRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateTemplateRequest setLogicExpression(String logicExpression) {
        this.logicExpression = logicExpression;
        return this;
    }
    public String getLogicExpression() {
        return this.logicExpression;
    }

    public CreateTemplateRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateTemplateRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateTemplateRequest setRuleActions(String ruleActions) {
        this.ruleActions = ruleActions;
        return this;
    }
    public String getRuleActions() {
        return this.ruleActions;
    }

    public CreateTemplateRequest setRuleExpressions(String ruleExpressions) {
        this.ruleExpressions = ruleExpressions;
        return this;
    }
    public String getRuleExpressions() {
        return this.ruleExpressions;
    }

    public CreateTemplateRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateTemplateRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

}
