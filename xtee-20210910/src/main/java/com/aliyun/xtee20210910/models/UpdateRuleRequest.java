// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateRuleRequest extends TeaModel {
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
     * <p>Primary key ID of the policy</p>
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
     * <p>de_agdxgz0246</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Execution logic</p>
     * 
     * <strong>example:</strong>
     * <p>1&amp;2</p>
     */
    @NameInMap("logicExpression")
    public String logicExpression;

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
     * <p>Output action</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;inputs\&quot;:[\&quot;rn0301\&quot;],\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;outputType\&quot;:\&quot;const\&quot;}]</p>
     */
    @NameInMap("ruleActions")
    public String ruleActions;

    /**
     * <p>DSL policy expression</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;elseIfStatement&quot;: [
     *             {
     *                 &quot;condition&quot;: {
     *                     &quot;currentId&quot;: 0,
     *                     &quot;deepCount&quot;: 1,
     *                     &quot;list&quot;: [
     *                         {
     *                             &quot;currentId&quot;: 0,
     *                             &quot;deepCount&quot;: 1,
     *                             &quot;left&quot;: {
     *                                 &quot;code&quot;: &quot;getLbsRegion(longitude, latitude)?.prov&quot;,
     *                                 &quot;description&quot;: &quot;根据经纬度得到省份信息，比如经度：111.878062，纬度：22.585409，则经过运算，输出”广东省“&quot;,
     *                                 &quot;displayType&quot;: &quot;SELF_BIND&quot;,
     *                                 &quot;fieldType&quot;: &quot;STRING&quot;,
     *                                 &quot;functionCode&quot;: &quot;&quot;,
     *                                 &quot;functionName&quot;: &quot;&quot;,
     *                                 &quot;hasRightVariable&quot;: true,
     *                                 &quot;name&quot;: &quot;sl_S02sHLFT7818&quot;,
     *                                 &quot;outputThreshold&quot;: {</p>
     * <pre><code>                            },
     *                             &quot;sourceType&quot;: &quot;SAF&quot;,
     *                             &quot;title&quot;: &quot;经纬度自定义系统变量&quot;,
     *                             &quot;type&quot;: &quot;SELF_BIND&quot;
     *                         },
     *                         &quot;operatorCode&quot;: &quot;equals&quot;,
     *                         &quot;operatorName&quot;: &quot;等于&quot;,
     *                         &quot;parentId&quot;: 0,
     *                         &quot;right&quot;: {
     *                             &quot;name&quot;: &quot;v&quot;,
     *                             &quot;rightVariableType&quot;: &quot;constant&quot;
     *                         },
     *                         &quot;sequence&quot;: 2
     *                     },
     *                     {
     *                         &quot;currentId&quot;: 0,
     *                         &quot;deepCount&quot;: 1,
     *                         &quot;list&quot;: [
     *                             {
     *                                 &quot;currentId&quot;: 0,
     *                                 &quot;deepCount&quot;: 1,
     *                                 &quot;left&quot;: {
     *                                     &quot;code&quot;: &quot;deReadVelocity(userId,&quot;hK1DMAp1d97&quot;,1,&quot;H&quot;,0,true,&quot;COUNT&quot;)&quot;,
     *                                     &quot;description&quot;: &quot;测试系统变量累计&quot;,
     *                                     &quot;displayType&quot;: &quot;SELF_BIND&quot;,
     *                                     &quot;fieldType&quot;: &quot;DOUBLE&quot;,
     *                                     &quot;functionCode&quot;: &quot;&quot;,
     *                                     &quot;functionName&quot;: &quot;&quot;,
     *                                     &quot;hasRightVariable&quot;: true,
     *                                     &quot;name&quot;: &quot;hK1DMAp1d97&quot;,
     *                                     &quot;outputThreshold&quot;: {
     * 
     *                                     },
     *                                     &quot;sourceType&quot;: &quot;SAF_SELF&quot;,
     *                                     &quot;title&quot;: &quot;测试系统变量累计&quot;,
     *                                     &quot;type&quot;: &quot;SELF_BIND&quot;
     *                                 },
     *                                 &quot;operatorCode&quot;: &quot;equals&quot;,
     *                                 &quot;operatorName&quot;: &quot;等于&quot;,
     *                                 &quot;parentId&quot;: 0,
     *                                 &quot;right&quot;: {
     *                                     &quot;name&quot;: &quot;a&quot;,
     *                                     &quot;rightVariableType&quot;: &quot;constant&quot;
     *                                 },
     *                                 &quot;sequence&quot;: 3
     *                             }
     *                         ],
     *                         &quot;parentId&quot;: 0,
     *                         &quot;relationship&quot;: &quot;and&quot;
     *                     }
     *                 ],
     *                 &quot;parentId&quot;: 0,
     *                 &quot;relationship&quot;: &quot;and&quot;
     *             },
     *             &quot;then&quot;: [
     *                 {
     *                     &quot;inputs&quot;: [
     *                         &quot;123&quot;
     *                     ],
     *                     &quot;name&quot;: &quot;__addDeScore__&quot;,
     *                     &quot;actionType&quot;: &quot;SCORE&quot;,
     *                     &quot;outputType&quot;: &quot;const&quot;,
     *                     &quot;inputTitle&quot;: &quot;123&quot;
     *                 }
     *             ]
     *         }
     *     ],
     *     &quot;elseStatement&quot;: {
     * 
     *     },
     *     &quot;ifStatement&quot;: {
     *         &quot;condition&quot;: {
     *             &quot;currentId&quot;: 0,
     *             &quot;deepCount&quot;: 1,
     *             &quot;list&quot;: [
     *                 {
     *                     &quot;currentId&quot;: 0,
     *                     &quot;deepCount&quot;: 1,
     *                     &quot;left&quot;: {
     *                         &quot;code&quot;: &quot;deFunctionProcess(ip,&quot;isIp&quot;)&quot;,
     *                         &quot;description&quot;: &quot;判断是否符合IPv4标准&quot;,
     *                         &quot;displayType&quot;: &quot;SYSTEM_BIND&quot;,
     *                         &quot;fieldType&quot;: &quot;BOOLEAN&quot;,
     *                         &quot;functionCode&quot;: &quot;&quot;,
     *                         &quot;functionName&quot;: &quot;&quot;,
     *                         &quot;hasRightVariable&quot;: true,
     *                         &quot;name&quot;: &quot;__isIpAddressV4__&quot;,
     *                         &quot;outputThreshold&quot;: {
     * 
     *                         },
     *                         &quot;sourceType&quot;: &quot;SAF&quot;,
     *                         &quot;title&quot;: &quot;IP是否符合IPV4格式&quot;,
     *                         &quot;type&quot;: &quot;SYSTEM_BIND&quot;
     *                     },
     *                     &quot;operatorCode&quot;: &quot;equals&quot;,
     *                     &quot;operatorName&quot;: &quot;等于&quot;,
     *                     &quot;parentId&quot;: 0,
     *                     &quot;right&quot;: {
     *                         &quot;name&quot;: &quot;c
     * </code></pre>
     * <p>d
     * s&quot;,
     *                             &quot;rightVariableType&quot;: &quot;constant&quot;
     *                         },
     *                         &quot;sequence&quot;: 1
     *                     }
     *                 ],
     *                 &quot;parentId&quot;: 0,
     *                 &quot;relationship&quot;: &quot;and&quot;
     *             },
     *             &quot;then&quot;: [
     *                 {
     *                     &quot;inputs&quot;: [
     *                         &quot;22&quot;
     *                     ],
     *                     &quot;name&quot;: &quot;<strong>addDeTags</strong>&quot;,
     *                     &quot;actionType&quot;: &quot;TAG&quot;,
     *                     &quot;outputType&quot;: &quot;const&quot;
     *                 }
     *             ]
     *         }
     *     }</p>
     */
    @NameInMap("ruleBody")
    public String ruleBody;

    /**
     * <p>Policy expression</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;expressionName\&quot;:\&quot;手机号MD5命中人脸测试名单\&quot;,\&quot;itemId\&quot;:1,\&quot;left\&quot;:{\&quot;name\&quot;:\&quot;mobileMd5\&quot;},\&quot;operatorCode\&quot;:\&quot;deInNameList\&quot;,\&quot;operatorName\&quot;:\&quot;在名单中\&quot;,\&quot;right\&quot;:{\&quot;fieldValue\&quot;:\&quot;nl_5tolf69W138c\&quot;}}]</p>
     */
    @NameInMap("ruleExpressions")
    public String ruleExpressions;

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
     * <p>分析中心事件测试_策略01</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>Policy status</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("ruleStatus")
    public String ruleStatus;

    /**
     * <p>Policy type</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("ruleType")
    public String ruleType;

    /**
     * <p>Primary key ID of the policy version</p>
     * 
     * <strong>example:</strong>
     * <p>11519</p>
     */
    @NameInMap("ruleVersionId")
    public Long ruleVersionId;

    public static UpdateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleRequest self = new UpdateRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateRuleRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public UpdateRuleRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public UpdateRuleRequest setLogicExpression(String logicExpression) {
        this.logicExpression = logicExpression;
        return this;
    }
    public String getLogicExpression() {
        return this.logicExpression;
    }

    public UpdateRuleRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public UpdateRuleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UpdateRuleRequest setRuleActions(String ruleActions) {
        this.ruleActions = ruleActions;
        return this;
    }
    public String getRuleActions() {
        return this.ruleActions;
    }

    public UpdateRuleRequest setRuleBody(String ruleBody) {
        this.ruleBody = ruleBody;
        return this;
    }
    public String getRuleBody() {
        return this.ruleBody;
    }

    public UpdateRuleRequest setRuleExpressions(String ruleExpressions) {
        this.ruleExpressions = ruleExpressions;
        return this;
    }
    public String getRuleExpressions() {
        return this.ruleExpressions;
    }

    public UpdateRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateRuleRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public UpdateRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public UpdateRuleRequest setRuleVersionId(Long ruleVersionId) {
        this.ruleVersionId = ruleVersionId;
        return this;
    }
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

}
