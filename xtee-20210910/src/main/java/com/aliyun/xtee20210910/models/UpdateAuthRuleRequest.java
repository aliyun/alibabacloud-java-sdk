// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateAuthRuleRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>7088</p>
     */
    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_afghcf6411</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Policy output action</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;inputs\&quot;:[\&quot;auto_accselist\&quot;],\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;outputType\&quot;:\&quot;const\&quot;}]</p>
     */
    @NameInMap("ruleActions")
    public String ruleActions;

    /**
     * <p>Expression</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;expressionName\&quot;:\&quot;设备token不为空\&quot;,\&quot;itemId\&quot;:1,\&quot;left\&quot;:{\&quot;name\&quot;:\&quot;deviceToken\&quot;},\&quot;operatorCode\&quot;:\&quot;isNotEmptyWrapper\&quot;,\&quot;operatorName\&quot;:\&quot;不为空\&quot;}]</p>
     */
    @NameInMap("ruleExpressions")
    public String ruleExpressions;

    /**
     * <p>Policy ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>101544</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>Policy version primary key ID</p>
     * 
     * <strong>example:</strong>
     * <p>5190</p>
     */
    @NameInMap("ruleVersionId")
    public Long ruleVersionId;

    public static UpdateAuthRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthRuleRequest self = new UpdateAuthRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAuthRuleRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public UpdateAuthRuleRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public UpdateAuthRuleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UpdateAuthRuleRequest setRuleActions(String ruleActions) {
        this.ruleActions = ruleActions;
        return this;
    }
    public String getRuleActions() {
        return this.ruleActions;
    }

    public UpdateAuthRuleRequest setRuleExpressions(String ruleExpressions) {
        this.ruleExpressions = ruleExpressions;
        return this;
    }
    public String getRuleExpressions() {
        return this.ruleExpressions;
    }

    public UpdateAuthRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateAuthRuleRequest setRuleVersionId(Long ruleVersionId) {
        this.ruleVersionId = ruleVersionId;
        return this;
    }
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

}
