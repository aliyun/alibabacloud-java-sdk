// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleSnapshotResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeRuleSnapshotResponseBodyResultObject resultObject;

    public static DescribeRuleSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleSnapshotResponseBody self = new DescribeRuleSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleSnapshotResponseBody setResultObject(DescribeRuleSnapshotResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRuleSnapshotResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeRuleSnapshotResponseBodyResultObject extends TeaModel {
        /**
         * <p>Business version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("bizVersion")
        public String bizVersion;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Expression for analysis results.</p>
         * 
         * <strong>example:</strong>
         * <p>1&amp;2</p>
         */
        @NameInMap("logicExpression")
        public String logicExpression;

        /**
         * <p>Memo.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Rule actions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;inputs\&quot;:[\&quot;LdShop\&quot;],\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;outputType\&quot;:\&quot;const\&quot;}]</p>
         */
        @NameInMap("ruleActions")
        public String ruleActions;

        /**
         * <p>Expression.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;expressionName\&quot;:\&quot;代下单_记录日志\&quot;,\&quot;itemId\&quot;:1,\&quot;left\&quot;:{\&quot;name\&quot;:\&quot;dhcfX2v7670\&quot;},\&quot;operatorCode\&quot;:\&quot;gte\&quot;,\&quot;operatorName\&quot;:\&quot;大于等于\&quot;,\&quot;right\&quot;:{\&quot;fieldValue\&quot;:\&quot;2\&quot;}}]</p>
         */
        @NameInMap("ruleExpressions")
        public String ruleExpressions;

        /**
         * <p>Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>101804</p>
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

        /**
         * <p>Policy status</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        public static DescribeRuleSnapshotResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleSnapshotResponseBodyResultObject self = new DescribeRuleSnapshotResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRuleSnapshotResponseBodyResultObject setBizVersion(String bizVersion) {
            this.bizVersion = bizVersion;
            return this;
        }
        public String getBizVersion() {
            return this.bizVersion;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setLogicExpression(String logicExpression) {
            this.logicExpression = logicExpression;
            return this;
        }
        public String getLogicExpression() {
            return this.logicExpression;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleActions(String ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public String getRuleActions() {
            return this.ruleActions;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleExpressions(String ruleExpressions) {
            this.ruleExpressions = ruleExpressions;
            return this;
        }
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRuleSnapshotResponseBodyResultObject setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

    }

}
