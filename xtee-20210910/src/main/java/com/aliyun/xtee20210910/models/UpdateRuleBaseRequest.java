// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateRuleBaseRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("memo")
    public String memo;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleId")
    public String ruleId;

    @NameInMap("ruleName")
    public String ruleName;

    public static UpdateRuleBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleBaseRequest self = new UpdateRuleBaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleBaseRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateRuleBaseRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public UpdateRuleBaseRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public UpdateRuleBaseRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public UpdateRuleBaseRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UpdateRuleBaseRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateRuleBaseRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
