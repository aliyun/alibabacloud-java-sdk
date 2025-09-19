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
         * <p>DSL rule expression. This field is required when ruleType is DSL.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;elseIfStatement\&quot;:[{\&quot;condition\&quot;:{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;list\&quot;:[{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;left\&quot;:{\&quot;code\&quot;:\&quot;getLbsRegion(longitude, latitude)?.prov\&quot;,\&quot;description\&quot;:\&quot;根据经纬度得到省份信息，比如经度：111.878062，纬度：22.585409，则经过运算，输出”广东省“\&quot;,\&quot;displayType\&quot;:\&quot;SELF_BIND\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;functionCode\&quot;:\&quot;\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;hasRightVariable\&quot;:true,\&quot;name\&quot;:\&quot;sl_S02sHLFT7818\&quot;,\&quot;outputThreshold\&quot;:{},\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;经纬度自定义系统变量\&quot;,\&quot;type\&quot;:\&quot;SELF_BIND\&quot;},\&quot;operatorCode\&quot;:\&quot;equals\&quot;,\&quot;operatorName\&quot;:\&quot;等于\&quot;,\&quot;parentId\&quot;:0,\&quot;right\&quot;:{\&quot;name\&quot;:\&quot;cc\&quot;,\&quot;rightVariableType\&quot;:\&quot;constant\&quot;},\&quot;sequence\&quot;:5}],\&quot;parentId\&quot;:0,\&quot;relationship\&quot;:\&quot;and\&quot;},\&quot;then\&quot;:[{\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;code\&quot;:\&quot;addDeTags\&quot;,\&quot;description\&quot;:\&quot;打标签\&quot;,\&quot;displayType\&quot;:\&quot;ACTION\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;inputs\&quot;:[\&quot;332\&quot;],\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;outputType\&quot;:\&quot;const\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;打标签\&quot;,\&quot;type\&quot;:\&quot;ACTION\&quot;}]}],\&quot;elseStatement\&quot;:{\&quot;then\&quot;:[{\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;code\&quot;:\&quot;addDeTags\&quot;,\&quot;description\&quot;:\&quot;打标签\&quot;,\&quot;displayType\&quot;:\&quot;ACTION\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;inputs\&quot;:[\&quot;321\&quot;],\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;outputType\&quot;:\&quot;const\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;打标签\&quot;,\&quot;type\&quot;:\&quot;ACTION\&quot;}]},\&quot;ifStatement\&quot;:{\&quot;condition\&quot;:{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;list\&quot;:[{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;left\&quot;:{\&quot;code\&quot;:\&quot;queryPhoneSimulatorInfo(deviceToken)?.brand\&quot;,\&quot;description\&quot;:\&quot;设备信息-终端品牌\&quot;,\&quot;displayType\&quot;:\&quot;DEVICE\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;functionCode\&quot;:\&quot;\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;hasRightVariable\&quot;:true,\&quot;name\&quot;:\&quot;<strong>device_brand</strong>\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;设备信息-终端品牌-brand\&quot;,\&quot;type\&quot;:\&quot;DEVICE\&quot;},\&quot;operatorCode\&quot;:\&quot;deInNameList\&quot;,\&quot;operatorName\&quot;:\&quot;在名单中\&quot;,\&quot;parentId\&quot;:0,\&quot;right\&quot;:{\&quot;code\&quot;:\&quot;nl_UN8otElLb490\&quot;,\&quot;description\&quot;:\&quot;描述11\&quot;,\&quot;displayType\&quot;:\&quot;NAME_LIST\&quot;,\&quot;name\&quot;:\&quot;nl_UN8otElLb490\&quot;,\&quot;rightVariableType\&quot;:\&quot;constant\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;wtz_名单新建测试02\&quot;,\&quot;type\&quot;:\&quot;NAME_LIST\&quot;},\&quot;sequence\&quot;:1},{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;left\&quot;:{\&quot;code\&quot;:\&quot;deFunctionProcess(ip,\\\&quot;isIp\\\&quot;)\&quot;,\&quot;description\&quot;:\&quot;判断是否符合IPv4标准\&quot;,\&quot;displayType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;fieldType\&quot;:\&quot;BOOLEAN\&quot;,\&quot;functionCode\&quot;:\&quot;\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;hasRightVariable\&quot;:false,\&quot;name\&quot;:\&quot;<strong>isIpAddressV4</strong>\&quot;,\&quot;outputThreshold\&quot;:{},\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;IP是否符合IPV4格式\&quot;,\&quot;type\&quot;:\&quot;SYSTEM_BIND\&quot;},\&quot;operatorCode\&quot;:\&quot;boolIsTrue\&quot;,\&quot;operatorName\&quot;:\&quot;为true\&quot;,\&quot;parentId\&quot;:0,\&quot;right\&quot;:{\&quot;name\&quot;:\&quot;\&quot;,\&quot;rightVariableType\&quot;:\&quot;constant\&quot;},\&quot;sequence\&quot;:2},{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;list\&quot;:[{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;left\&quot;:{\&quot;code\&quot;:\&quot;parseIpV2(ip)?.cityId\&quot;,\&quot;description\&quot;:\&quot;通过IP地址库解析IP所在的城市Code，例如，输入“42.120.74.211”，经过该变量运算，输出“330100”。\&quot;,\&quot;displayType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;functionCode\&quot;:\&quot;\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;hasRightVariable\&quot;:true,\&quot;name\&quot;:\&quot;<strong>ipLocationCityCode</strong>\&quot;,\&quot;outputThreshold\&quot;:{},\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;IP所在地_城市Code\&quot;,\&quot;type\&quot;:\&quot;SYSTEM_BIND\&quot;},\&quot;operatorCode\&quot;:\&quot;equals\&quot;,\&quot;operatorName\&quot;:\&quot;等于\&quot;,\&quot;parentId\&quot;:0,\&quot;right\&quot;:{\&quot;code\&quot;:\&quot;deFunctionProcess(ip,\\\&quot;getCountry\\\&quot;)\&quot;,\&quot;description\&quot;:\&quot;通过IP地址库解析IP所在的城市名称，例如，输入“42.120.74.211”，经过该变量运算，输出“CN”。\&quot;,\&quot;displayType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;functionCode\&quot;:\&quot;\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;name\&quot;:\&quot;<strong>ipLocationCountryId</strong>\&quot;,\&quot;outputThreshold\&quot;:{},\&quot;rightVariableType\&quot;:\&quot;variable\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;IP所在地_国家Code\&quot;,\&quot;type\&quot;:\&quot;SYSTEM_BIND\&quot;},\&quot;sequence\&quot;:3},{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;list\&quot;:[{\&quot;currentId\&quot;:0,\&quot;deepCount\&quot;:1,\&quot;left\&quot;:{\&quot;code\&quot;:\&quot;parseIpV2(ip)?.cityId\&quot;,\&quot;description\&quot;:\&quot;通过IP地址库解析IP所在的城市Code，例如，输入“42.120.74.211”，经过该变量运算，输出“330100”。\&quot;,\&quot;displayType\&quot;:\&quot;SYSTEM_BIND\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;functionCode\&quot;:\&quot;\&quot;,\&quot;functionName\&quot;:\&quot;\&quot;,\&quot;hasRightVariable\&quot;:true,\&quot;name\&quot;:\&quot;<strong>ipLocationCityCode</strong>\&quot;,\&quot;outputThreshold\&quot;:{\&quot;$ref\&quot;:\&quot;$.ifStatement.condition.list[2].list[0].left.outputThreshold\&quot;},\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;IP所在地_城市Code\&quot;,\&quot;type\&quot;:\&quot;SYSTEM_BIND\&quot;},\&quot;operatorCode\&quot;:\&quot;deInNameList\&quot;,\&quot;operatorName\&quot;:\&quot;在名单中\&quot;,\&quot;parentId\&quot;:0,\&quot;right\&quot;:{\&quot;code\&quot;:\&quot;nl_NsVwBD2s11e0\&quot;,\&quot;displayType\&quot;:\&quot;NAME_LIST\&quot;,\&quot;name\&quot;:\&quot;nl_NsVwBD2s11e0\&quot;,\&quot;rightVariableType\&quot;:\&quot;constant\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;device_block_list\&quot;,\&quot;type\&quot;:\&quot;NAME_LIST\&quot;},\&quot;sequence\&quot;:4}],\&quot;parentId\&quot;:0,\&quot;relationship\&quot;:\&quot;and\&quot;}],\&quot;parentId\&quot;:0,\&quot;relationship\&quot;:\&quot;and\&quot;}],\&quot;parentId\&quot;:0,\&quot;relationship\&quot;:\&quot;and\&quot;},\&quot;then\&quot;:[{\&quot;actionType\&quot;:\&quot;TAG\&quot;,\&quot;code\&quot;:\&quot;addDeTags\&quot;,\&quot;description\&quot;:\&quot;打标签\&quot;,\&quot;displayType\&quot;:\&quot;ACTION\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;inputs\&quot;:[\&quot;123\&quot;],\&quot;name\&quot;:\&quot;<strong>addDeTags</strong>\&quot;,\&quot;outputType\&quot;:\&quot;const\&quot;,\&quot;sourceType\&quot;:\&quot;SAF\&quot;,\&quot;title\&quot;:\&quot;打标签\&quot;,\&quot;type\&quot;:\&quot;ACTION\&quot;}]}}</p>
         */
        @NameInMap("ruleBody")
        public String ruleBody;

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

        /**
         * <p>Rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>DSL</p>
         */
        @NameInMap("ruleType")
        public String ruleType;

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

        public DescribeRuleSnapshotResponseBodyResultObject setRuleBody(String ruleBody) {
            this.ruleBody = ruleBody;
            return this;
        }
        public String getRuleBody() {
            return this.ruleBody;
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

        public DescribeRuleSnapshotResponseBodyResultObject setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

}
