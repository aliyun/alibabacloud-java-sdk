// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateRuleBaseRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Policy primary key ID</p>
     * 
     * <strong>example:</strong>
     * <p>6843</p>
     */
    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_arcehq4370</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("memo")
    public String memo;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>102224</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>Policy name</p>
     * 
     * <strong>example:</strong>
     * <p>营销风险识别</p>
     */
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
