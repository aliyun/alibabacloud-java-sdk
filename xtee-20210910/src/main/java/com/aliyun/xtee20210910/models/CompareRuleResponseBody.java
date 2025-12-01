// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CompareRuleResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public CompareRuleResponseBodyResultObject resultObject;

    public static CompareRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareRuleResponseBody self = new CompareRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareRuleResponseBody setResultObject(CompareRuleResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CompareRuleResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CompareRuleResponseBodyResultObjectNewRule extends TeaModel {
        /**
         * <p>Audit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>258</p>
         */
        @NameInMap("auditId")
        public Long auditId;

        /**
         * <p>Authorization type.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>Primary key ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>6760</p>
         */
        @NameInMap("consoleRuleId")
        public Long consoleRuleId;

        /**
         * <p>Creation type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("createType")
        public String createType;

        /**
         * <p>Event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_asssce8122</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册_事件</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1760670462000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1761196952000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Logic of the rule expression execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1&amp;2&amp;3</p>
         */
        @NameInMap("logicExpression")
        public String logicExpression;

        /**
         * <p>Main event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_asssce8122</p>
         */
        @NameInMap("mainEventCode")
        public String mainEventCode;

        /**
         * <p>Memo.</p>
         * 
         * <strong>example:</strong>
         * <p>鸿蒙元服务_交费业务</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Returned rule action structure. Returned when the policy type is DEFAULT.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;TAG&quot;: &quot;[{\&quot;code\&quot;:\&quot;addDeTags\&quot;,\&quot;inputs\&quot;:[\&quot;test\&quot;],\&quot;description\&quot;:\&quot;打标签\&quot;,\&quot;type\&quot;:\&quot;ACTION\&quot;,\&quot;title\&quot;:\&quot;打标签\&quot;,\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;displayType\&quot;:\&quot;ACTION\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;}]&quot;
         * }</p>
         */
        @NameInMap("ruleActionMap")
        public java.util.Map<String, ?> ruleActionMap;

        /**
         * <p>Output actions of the rule execution. Returned when the rule type is DEFAULT.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;actionType&quot;: &quot;TAG&quot;,
         *         &quot;code&quot;: &quot;addDeTags&quot;,
         *         &quot;description&quot;: &quot;打标签&quot;,
         *         &quot;displayType&quot;: &quot;ACTION&quot;,
         *         &quot;fieldType&quot;: &quot;STRING&quot;,
         *         &quot;inputs&quot;: [
         *             &quot;test&quot;
         *         ],
         *         &quot;name&quot;: &quot;<strong>addDeTags</strong>&quot;,
         *         &quot;sourceType&quot;: &quot;SAF&quot;,
         *         &quot;title&quot;: &quot;打标签&quot;,
         *         &quot;type&quot;: &quot;ACTION&quot;
         *     }
         * ]</p>
         */
        @NameInMap("ruleActions")
        public String ruleActions;

        /**
         * <p>Authorization type of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ruleAuthType")
        public String ruleAuthType;

        /**
         * <p>DSL logic for rule execution. Returned when the rule type is DSL.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;elseStatement&quot;: {</p>
         * <pre><code>},
         * &quot;ifStatement&quot;: {
         *     &quot;condition&quot;: {
         *         &quot;currentId&quot;: 0,
         *         &quot;deepCount&quot;: 1,
         *         &quot;list&quot;: [
         *             {
         *                 &quot;sequence&quot;: 1,
         *                 &quot;left&quot;: {
         *                     &quot;displayType&quot;: &quot;NATIVE&quot;,
         *                     &quot;code&quot;: &quot;ip&quot;,
         *                     &quot;functionCode&quot;: &quot;&quot;,
         *                     &quot;functionName&quot;: &quot;&quot;,
         *                     &quot;name&quot;: &quot;ip&quot;,
         *                     &quot;description&quot;: &quot;IP地址&quot;,
         *                     &quot;hasRightVariable&quot;: true,
         *                     &quot;title&quot;: &quot;IP地址&quot;,
         *                     &quot;type&quot;: &quot;NATIVE&quot;,
         *                     &quot;fieldType&quot;: &quot;STRING&quot;
         *                 },
         *                 &quot;currentId&quot;: 0,
         *                 &quot;deepCount&quot;: 1,
         *                 &quot;right&quot;: {
         *                     &quot;name&quot;: &quot;192.168.1.1&quot;,
         *                     &quot;rightVariableType&quot;: &quot;constant&quot;
         *                 },
         *                 &quot;operatorCode&quot;: &quot;equals&quot;,
         *                 &quot;operatorName&quot;: &quot;等于&quot;,
         *                 &quot;parentId&quot;: 0
         *             }
         *         ],
         *         &quot;relationship&quot;: &quot;and&quot;,
         *         &quot;parentId&quot;: 0
         *     },
         *     &quot;then&quot;: [
         *         {
         *             &quot;actionType&quot;: &quot;TAG&quot;,
         *             &quot;displayType&quot;: &quot;ACTION&quot;,
         *             &quot;code&quot;: &quot;addDeTags&quot;,
         *             &quot;sourceType&quot;: &quot;SAF&quot;,
         *             &quot;inputs&quot;: [
         *                 &quot;10&quot;
         *             ],
         *             &quot;name&quot;: &quot;__addDeTags__&quot;,
         *             &quot;description&quot;: &quot;打标签&quot;,
         *             &quot;outputType&quot;: &quot;const&quot;,
         *             &quot;title&quot;: &quot;打标签&quot;,
         *             &quot;type&quot;: &quot;ACTION&quot;,
         *             &quot;fieldType&quot;: &quot;STRING&quot;
         *         }
         *     ],
         *     &quot;expressions&quot;: [
         *         {
         *             &quot;itemId&quot;: 1,
         *             &quot;left&quot;: {
         *                 &quot;displayType&quot;: &quot;NATIVE&quot;,
         *                 &quot;code&quot;: &quot;ip&quot;,
         *                 &quot;functionCode&quot;: &quot;&quot;,
         *                 &quot;functionName&quot;: &quot;&quot;,
         *                 &quot;name&quot;: &quot;ip&quot;,
         *                 &quot;description&quot;: &quot;IP地址&quot;,
         *                 &quot;hasRightVariable&quot;: true,
         *                 &quot;title&quot;: &quot;IP地址&quot;,
         *                 &quot;type&quot;: &quot;NATIVE&quot;,
         *                 &quot;fieldType&quot;: &quot;STRING&quot;
         *             },
         *             &quot;expressionName&quot;: &quot;IP地址 等于 192.168.1.1&quot;,
         *             &quot;rightValue&quot;: &quot;192.168.1.1&quot;,
         *             &quot;right&quot;: {
         *                 &quot;name&quot;: &quot;192.168.1.1&quot;,
         *                 &quot;fieldValue&quot;: &quot;192.168.1.1&quot;
         *             },
         *             &quot;operatorCode&quot;: &quot;equals&quot;,
         *             &quot;operatorName&quot;: &quot;等于&quot;
         *         }
         *     ]
         * },
         * &quot;elseIfStatement&quot;: [
         * 
         * ]
         * </code></pre>
         * <p>}</p>
         */
        @NameInMap("ruleBody")
        public String ruleBody;

        /**
         * <p>Policy expressions. Returned when the policy type is DEFAULT.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;expressionName\&quot;:\&quot;设备token不为空\&quot;,\&quot;itemId\&quot;:1,\&quot;left\&quot;:{\&quot;name\&quot;:\&quot;deviceToken\&quot;},\&quot;operatorCode\&quot;:\&quot;isNotEmptyWrapper\&quot;,\&quot;operatorName\&quot;:\&quot;不为空\&quot;}]</p>
         */
        @NameInMap("ruleExpressions")
        public String ruleExpressions;

        /**
         * <p>Rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101793</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>返回设备信息</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>Policy status.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>Rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>DSL</p>
         */
        @NameInMap("ruleType")
        public String ruleType;

        /**
         * <p>Primary key ID of the rule version.</p>
         * 
         * <strong>example:</strong>
         * <p>11519</p>
         */
        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        /**
         * <p>User UID.</p>
         * 
         * <strong>example:</strong>
         * <p>151222xxxxxxxxx</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("version")
        public Long version;

        public static CompareRuleResponseBodyResultObjectNewRule build(java.util.Map<String, ?> map) throws Exception {
            CompareRuleResponseBodyResultObjectNewRule self = new CompareRuleResponseBodyResultObjectNewRule();
            return TeaModel.build(map, self);
        }

        public CompareRuleResponseBodyResultObjectNewRule setAuditId(Long auditId) {
            this.auditId = auditId;
            return this;
        }
        public Long getAuditId() {
            return this.auditId;
        }

        public CompareRuleResponseBodyResultObjectNewRule setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CompareRuleResponseBodyResultObjectNewRule setConsoleRuleId(Long consoleRuleId) {
            this.consoleRuleId = consoleRuleId;
            return this;
        }
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        public CompareRuleResponseBodyResultObjectNewRule setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public CompareRuleResponseBodyResultObjectNewRule setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public CompareRuleResponseBodyResultObjectNewRule setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public CompareRuleResponseBodyResultObjectNewRule setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CompareRuleResponseBodyResultObjectNewRule setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CompareRuleResponseBodyResultObjectNewRule setLogicExpression(String logicExpression) {
            this.logicExpression = logicExpression;
            return this;
        }
        public String getLogicExpression() {
            return this.logicExpression;
        }

        public CompareRuleResponseBodyResultObjectNewRule setMainEventCode(String mainEventCode) {
            this.mainEventCode = mainEventCode;
            return this;
        }
        public String getMainEventCode() {
            return this.mainEventCode;
        }

        public CompareRuleResponseBodyResultObjectNewRule setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleActionMap(java.util.Map<String, ?> ruleActionMap) {
            this.ruleActionMap = ruleActionMap;
            return this;
        }
        public java.util.Map<String, ?> getRuleActionMap() {
            return this.ruleActionMap;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleActions(String ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public String getRuleActions() {
            return this.ruleActions;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleAuthType(String ruleAuthType) {
            this.ruleAuthType = ruleAuthType;
            return this;
        }
        public String getRuleAuthType() {
            return this.ruleAuthType;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleBody(String ruleBody) {
            this.ruleBody = ruleBody;
            return this;
        }
        public String getRuleBody() {
            return this.ruleBody;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleExpressions(String ruleExpressions) {
            this.ruleExpressions = ruleExpressions;
            return this;
        }
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public CompareRuleResponseBodyResultObjectNewRule setRuleVersionId(Long ruleVersionId) {
            this.ruleVersionId = ruleVersionId;
            return this;
        }
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        public CompareRuleResponseBodyResultObjectNewRule setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public CompareRuleResponseBodyResultObjectNewRule setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class CompareRuleResponseBodyResultObjectOldRule extends TeaModel {
        /**
         * <p>Audit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>257</p>
         */
        @NameInMap("auditId")
        public Long auditId;

        /**
         * <p>Authorization type.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>Primary key ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>6760</p>
         */
        @NameInMap("consoleRuleId")
        public Long consoleRuleId;

        /**
         * <p>Creation type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("createType")
        public String createType;

        /**
         * <p>Event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_asssce8122</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册_事件</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1760670462000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1760670462000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Execution logic of the policy expression.</p>
         * 
         * <strong>example:</strong>
         * <p>1&amp;2</p>
         */
        @NameInMap("logicExpression")
        public String logicExpression;

        /**
         * <p>Main event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_asssce8122</p>
         */
        @NameInMap("mainEventCode")
        public String mainEventCode;

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>鸿蒙元服务_交费业务</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Returned rule action structure. Returned when the policy type is DEFAULT.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;TAG&quot;: &quot;[{\&quot;code\&quot;:\&quot;addDeTags\&quot;,\&quot;inputs\&quot;:[\&quot;test\&quot;],\&quot;description\&quot;:\&quot;打标签\&quot;,\&quot;type\&quot;:\&quot;ACTION\&quot;,\&quot;title\&quot;:\&quot;打标签\&quot;,\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;displayType\&quot;:\&quot;ACTION\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;}]&quot;
         * }</p>
         */
        @NameInMap("ruleActionMap")
        public java.util.Map<String, ?> ruleActionMap;

        /**
         * <p>Policy execution output actions. Returned when the policy type is DEFAULT.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;actionType&quot;: &quot;TAG&quot;,
         *         &quot;code&quot;: &quot;addDeTags&quot;,
         *         &quot;description&quot;: &quot;打标签&quot;,
         *         &quot;displayType&quot;: &quot;ACTION&quot;,
         *         &quot;fieldType&quot;: &quot;STRING&quot;,
         *         &quot;inputs&quot;: [
         *             &quot;test&quot;
         *         ],
         *         &quot;name&quot;: &quot;<strong>addDeTags</strong>&quot;,
         *         &quot;sourceType&quot;: &quot;SAF&quot;,
         *         &quot;title&quot;: &quot;打标签&quot;,
         *         &quot;type&quot;: &quot;ACTION&quot;
         *     }
         * ]</p>
         */
        @NameInMap("ruleActions")
        public String ruleActions;

        /**
         * <p>Policy authorization type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ruleAuthType")
        public String ruleAuthType;

        /**
         * <p>DSL policy execution logic. Returned when the policy type is DSL.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;elseStatement&quot;: {</p>
         * <pre><code>},
         * &quot;ifStatement&quot;: {
         *     &quot;condition&quot;: {
         *         &quot;currentId&quot;: 0,
         *         &quot;deepCount&quot;: 1,
         *         &quot;list&quot;: [
         *             {
         *                 &quot;sequence&quot;: 1,
         *                 &quot;left&quot;: {
         *                     &quot;displayType&quot;: &quot;NATIVE&quot;,
         *                     &quot;code&quot;: &quot;ip&quot;,
         *                     &quot;functionCode&quot;: &quot;&quot;,
         *                     &quot;functionName&quot;: &quot;&quot;,
         *                     &quot;name&quot;: &quot;ip&quot;,
         *                     &quot;description&quot;: &quot;IP地址&quot;,
         *                     &quot;hasRightVariable&quot;: true,
         *                     &quot;title&quot;: &quot;IP地址&quot;,
         *                     &quot;type&quot;: &quot;NATIVE&quot;,
         *                     &quot;fieldType&quot;: &quot;STRING&quot;
         *                 },
         *                 &quot;currentId&quot;: 0,
         *                 &quot;deepCount&quot;: 1,
         *                 &quot;right&quot;: {
         *                     &quot;name&quot;: &quot;192.168.1.1&quot;,
         *                     &quot;rightVariableType&quot;: &quot;constant&quot;
         *                 },
         *                 &quot;operatorCode&quot;: &quot;equals&quot;,
         *                 &quot;operatorName&quot;: &quot;等于&quot;,
         *                 &quot;parentId&quot;: 0
         *             }
         *         ],
         *         &quot;relationship&quot;: &quot;and&quot;,
         *         &quot;parentId&quot;: 0
         *     },
         *     &quot;then&quot;: [
         *         {
         *             &quot;actionType&quot;: &quot;TAG&quot;,
         *             &quot;displayType&quot;: &quot;ACTION&quot;,
         *             &quot;code&quot;: &quot;addDeTags&quot;,
         *             &quot;sourceType&quot;: &quot;SAF&quot;,
         *             &quot;inputs&quot;: [
         *                 &quot;10&quot;
         *             ],
         *             &quot;name&quot;: &quot;__addDeTags__&quot;,
         *             &quot;description&quot;: &quot;打标签&quot;,
         *             &quot;outputType&quot;: &quot;const&quot;,
         *             &quot;title&quot;: &quot;打标签&quot;,
         *             &quot;type&quot;: &quot;ACTION&quot;,
         *             &quot;fieldType&quot;: &quot;STRING&quot;
         *         }
         *     ],
         *     &quot;expressions&quot;: [
         *         {
         *             &quot;itemId&quot;: 1,
         *             &quot;left&quot;: {
         *                 &quot;displayType&quot;: &quot;NATIVE&quot;,
         *                 &quot;code&quot;: &quot;ip&quot;,
         *                 &quot;functionCode&quot;: &quot;&quot;,
         *                 &quot;functionName&quot;: &quot;&quot;,
         *                 &quot;name&quot;: &quot;ip&quot;,
         *                 &quot;description&quot;: &quot;IP地址&quot;,
         *                 &quot;hasRightVariable&quot;: true,
         *                 &quot;title&quot;: &quot;IP地址&quot;,
         *                 &quot;type&quot;: &quot;NATIVE&quot;,
         *                 &quot;fieldType&quot;: &quot;STRING&quot;
         *             },
         *             &quot;expressionName&quot;: &quot;IP地址 等于 192.168.1.1&quot;,
         *             &quot;rightValue&quot;: &quot;192.168.1.1&quot;,
         *             &quot;right&quot;: {
         *                 &quot;name&quot;: &quot;192.168.1.1&quot;,
         *                 &quot;fieldValue&quot;: &quot;192.168.1.1&quot;
         *             },
         *             &quot;operatorCode&quot;: &quot;equals&quot;,
         *             &quot;operatorName&quot;: &quot;等于&quot;
         *         }
         *     ]
         * },
         * &quot;elseIfStatement&quot;: [
         * 
         * ]
         * </code></pre>
         * <p>}</p>
         */
        @NameInMap("ruleBody")
        public String ruleBody;

        /**
         * <p>Policy expression. Returned when the policy type is DEFAULT.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;expressionName\&quot;:\&quot;设备token不为空\&quot;,\&quot;itemId\&quot;:1,\&quot;left\&quot;:{\&quot;name\&quot;:\&quot;deviceToken\&quot;},\&quot;operatorCode\&quot;:\&quot;isNotEmptyWrapper\&quot;,\&quot;operatorName\&quot;:\&quot;不为空\&quot;}]</p>
         */
        @NameInMap("ruleExpressions")
        public String ruleExpressions;

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101793</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>返回设备信息</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>Policy status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>Policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>DSL</p>
         */
        @NameInMap("ruleType")
        public String ruleType;

        /**
         * <p>Primary key ID of the policy version.</p>
         * 
         * <strong>example:</strong>
         * <p>11518</p>
         */
        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        /**
         * <p>User UID.</p>
         * 
         * <strong>example:</strong>
         * <p>151222xxxxxxxxx</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("version")
        public Long version;

        public static CompareRuleResponseBodyResultObjectOldRule build(java.util.Map<String, ?> map) throws Exception {
            CompareRuleResponseBodyResultObjectOldRule self = new CompareRuleResponseBodyResultObjectOldRule();
            return TeaModel.build(map, self);
        }

        public CompareRuleResponseBodyResultObjectOldRule setAuditId(Long auditId) {
            this.auditId = auditId;
            return this;
        }
        public Long getAuditId() {
            return this.auditId;
        }

        public CompareRuleResponseBodyResultObjectOldRule setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CompareRuleResponseBodyResultObjectOldRule setConsoleRuleId(Long consoleRuleId) {
            this.consoleRuleId = consoleRuleId;
            return this;
        }
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        public CompareRuleResponseBodyResultObjectOldRule setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public CompareRuleResponseBodyResultObjectOldRule setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public CompareRuleResponseBodyResultObjectOldRule setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public CompareRuleResponseBodyResultObjectOldRule setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CompareRuleResponseBodyResultObjectOldRule setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CompareRuleResponseBodyResultObjectOldRule setLogicExpression(String logicExpression) {
            this.logicExpression = logicExpression;
            return this;
        }
        public String getLogicExpression() {
            return this.logicExpression;
        }

        public CompareRuleResponseBodyResultObjectOldRule setMainEventCode(String mainEventCode) {
            this.mainEventCode = mainEventCode;
            return this;
        }
        public String getMainEventCode() {
            return this.mainEventCode;
        }

        public CompareRuleResponseBodyResultObjectOldRule setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleActionMap(java.util.Map<String, ?> ruleActionMap) {
            this.ruleActionMap = ruleActionMap;
            return this;
        }
        public java.util.Map<String, ?> getRuleActionMap() {
            return this.ruleActionMap;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleActions(String ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public String getRuleActions() {
            return this.ruleActions;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleAuthType(String ruleAuthType) {
            this.ruleAuthType = ruleAuthType;
            return this;
        }
        public String getRuleAuthType() {
            return this.ruleAuthType;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleBody(String ruleBody) {
            this.ruleBody = ruleBody;
            return this;
        }
        public String getRuleBody() {
            return this.ruleBody;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleExpressions(String ruleExpressions) {
            this.ruleExpressions = ruleExpressions;
            return this;
        }
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public CompareRuleResponseBodyResultObjectOldRule setRuleVersionId(Long ruleVersionId) {
            this.ruleVersionId = ruleVersionId;
            return this;
        }
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        public CompareRuleResponseBodyResultObjectOldRule setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public CompareRuleResponseBodyResultObjectOldRule setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class CompareRuleResponseBodyResultObject extends TeaModel {
        /**
         * <p>New policy object.</p>
         */
        @NameInMap("newRule")
        public CompareRuleResponseBodyResultObjectNewRule newRule;

        /**
         * <p>Old policy object.</p>
         */
        @NameInMap("oldRule")
        public CompareRuleResponseBodyResultObjectOldRule oldRule;

        public static CompareRuleResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CompareRuleResponseBodyResultObject self = new CompareRuleResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CompareRuleResponseBodyResultObject setNewRule(CompareRuleResponseBodyResultObjectNewRule newRule) {
            this.newRule = newRule;
            return this;
        }
        public CompareRuleResponseBodyResultObjectNewRule getNewRule() {
            return this.newRule;
        }

        public CompareRuleResponseBodyResultObject setOldRule(CompareRuleResponseBodyResultObjectOldRule oldRule) {
            this.oldRule = oldRule;
            return this;
        }
        public CompareRuleResponseBodyResultObjectOldRule getOldRule() {
            return this.oldRule;
        }

    }

}
