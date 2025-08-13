// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRuleRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
     * <p>Rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5178</p>
     */
    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    /**
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_acytyt7036</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Event name.</p>
     * 
     * <strong>example:</strong>
     * <p>登录事件</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <p>Policy expression execution logic</p>
     * 
     * <strong>example:</strong>
     * <p>1&amp;2</p>
     */
    @NameInMap("logicExpression")
    public String logicExpression;

    /**
     * <p>Memo</p>
     * 
     * <strong>example:</strong>
     * <p>描述信息</p>
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
     * <p>Policy execution output action</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;inputs&quot;:[&quot;123&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;outputType&quot;:&quot;const&quot;},{&quot;inputs&quot;:[&quot;123&quot;],&quot;name&quot;:&quot;<strong>addDeScore</strong>&quot;,&quot;actionType&quot;:&quot;SCORE&quot;,&quot;outputType&quot;:&quot;const&quot;,&quot;inputTitle&quot;:&quot;123&quot;},{&quot;actionType&quot;:&quot;MIDDLE_VARIABLE&quot;,&quot;fieldValue&quot;:&quot;123&quot;,&quot;inputs&quot;:[&quot;mid1&quot;]},{&quot;actionType&quot;:&quot;VARIABLE&quot;,&quot;inputs&quot;:[&quot;gg&quot;],&quot;name&quot;:&quot;mid1&quot;}]</p>
     */
    @NameInMap("ruleActions")
    public String ruleActions;

    /**
     * <p>DSL policy execution logic</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;elseIfStatement&quot;:[],&quot;elseStatement&quot;:{},&quot;ifStatement&quot;:{&quot;condition&quot;:{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;list&quot;:[{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;deFunctionProcess(ip,\&quot;isIp\&quot;)&quot;,&quot;description&quot;:&quot;判断是否符合IPv4标准&quot;,&quot;displayType&quot;:&quot;SYSTEM_BIND&quot;,&quot;fieldType&quot;:&quot;BOOLEAN&quot;,&quot;functionCode&quot;:&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:false,&quot;name&quot;:&quot;<strong>isIpAddressV4</strong>&quot;,&quot;outputThreshold&quot;:{},&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;IP是否符合IPV4格式&quot;,&quot;type&quot;:&quot;SYSTEM_BIND&quot;},&quot;operatorCode&quot;:&quot;boolIsFalse&quot;,&quot;operatorName&quot;:&quot;为false&quot;,&quot;parentId&quot;:0,&quot;sequence&quot;:1}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;},&quot;then&quot;:[{&quot;inputs&quot;:[&quot;123&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;outputType&quot;:&quot;const&quot;}]}}</p>
     */
    @NameInMap("ruleBody")
    public String ruleBody;

    /**
     * <p>Policy expression</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;expressionName&quot;:&quot;cc&quot;,&quot;itemId&quot;:1,&quot;left&quot;:{&quot;name&quot;:&quot;<strong>ipLocationCityCode</strong>&quot;},&quot;operatorCode&quot;:&quot;equals&quot;,&quot;operatorName&quot;:&quot;等于&quot;,&quot;right&quot;:{&quot;fieldValue&quot;:&quot;a&quot;}}]</p>
     */
    @NameInMap("ruleExpressions")
    public String ruleExpressions;

    /**
     * <p>Policy name</p>
     * 
     * <strong>example:</strong>
     * <p>注册手机号是11位数字</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>Policy status</p>
     * 
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("ruleStatus")
    public String ruleStatus;

    /**
     * <p>Policy type</p>
     * 
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("ruleType")
    public String ruleType;

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

    public CreateRuleRequest setRuleBody(String ruleBody) {
        this.ruleBody = ruleBody;
        return this;
    }
    public String getRuleBody() {
        return this.ruleBody;
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

    public CreateRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
