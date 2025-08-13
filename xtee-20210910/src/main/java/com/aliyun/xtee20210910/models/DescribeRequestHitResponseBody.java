// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRequestHitResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public DescribeRequestHitResponseBodyResultObject resultObject;

    public static DescribeRequestHitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestHitResponseBody self = new DescribeRequestHitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestHitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRequestHitResponseBody setResultObject(DescribeRequestHitResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRequestHitResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeRequestHitResponseBodyResultObjectRuleHitRecords extends TeaModel {
        /**
         * <p>Duration</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <p>Whether the rule was hit.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hitSuccessful")
        public Boolean hitSuccessful;

        /**
         * <p>Whether to show details</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isShowDetail")
        public Boolean isShowDetail;

        /**
         * <p>Order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>101544</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Policy name</p>
         * 
         * <strong>example:</strong>
         * <p>注册手机号是11位数字</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>Rule snapshot ID</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("ruleSnapshotId")
        public String ruleSnapshotId;

        /**
         * <p>Policy status</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        public static DescribeRequestHitResponseBodyResultObjectRuleHitRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestHitResponseBodyResultObjectRuleHitRecords self = new DescribeRequestHitResponseBodyResultObjectRuleHitRecords();
            return TeaModel.build(map, self);
        }

        public DescribeRequestHitResponseBodyResultObjectRuleHitRecords setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public DescribeRequestHitResponseBodyResultObjectRuleHitRecords setHitSuccessful(Boolean hitSuccessful) {
            this.hitSuccessful = hitSuccessful;
            return this;
        }
        public Boolean getHitSuccessful() {
            return this.hitSuccessful;
        }

        public DescribeRequestHitResponseBodyResultObjectRuleHitRecords setIsShowDetail(Boolean isShowDetail) {
            this.isShowDetail = isShowDetail;
            return this;
        }
        public Boolean getIsShowDetail() {
            return this.isShowDetail;
        }

        public DescribeRequestHitResponseBodyResultObjectRuleHitRecords setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeRequestHitResponseBodyResultObjectRuleHitRecords setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRequestHitResponseBodyResultObjectRuleHitRecords setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRequestHitResponseBodyResultObjectRuleHitRecords setRuleSnapshotId(String ruleSnapshotId) {
            this.ruleSnapshotId = ruleSnapshotId;
            return this;
        }
        public String getRuleSnapshotId() {
            return this.ruleSnapshotId;
        }

        public DescribeRequestHitResponseBodyResultObjectRuleHitRecords setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

    }

    public static class DescribeRequestHitResponseBodyResultObject extends TeaModel {
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
         * <p>Input parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;eventCode\&quot;:\&quot;de_afghcf6411\&quot;,\&quot;ip\&quot;:\&quot;196.168.0.1\&quot;,\&quot;DEtest222\&quot;:9007199254740999,\&quot;age\&quot;:20}</p>
         */
        @NameInMap("inputs")
        public String inputs;

        /**
         * <p>Output parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;tags\&quot;:\&quot;rm0102,test_tag,age\&quot;,\&quot;score\&quot;:\&quot;30.0\&quot;,\&quot;extend\&quot;:\&quot;{\\\&quot;OUT_V01\\\&quot;:\\\&quot;Maritime\\\&quot;,\\\&quot;OUT_V02\\\&quot;:\\\&quot;Lome\\\&quot;,\\\&quot;OUT_V03\\\&quot;:\\\&quot;196.168.0.1_A\\\&quot;}\&quot;,\&quot;finalDecision\&quot;:\&quot;REJECT\&quot;}</p>
         */
        @NameInMap("outputs")
        public String outputs;

        /**
         * <p>Timestamp of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1752571330000</p>
         */
        @NameInMap("requestTime")
        public Long requestTime;

        /**
         * <p>Details of the executed rules.</p>
         */
        @NameInMap("ruleHitRecords")
        public java.util.List<DescribeRequestHitResponseBodyResultObjectRuleHitRecords> ruleHitRecords;

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>60C97040-D5D5-4906-9522-B9B413730CAA</p>
         */
        @NameInMap("sRequestId")
        public String sRequestId;

        /**
         * <p>Total amount of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("totalCost")
        public Long totalCost;

        public static DescribeRequestHitResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestHitResponseBodyResultObject self = new DescribeRequestHitResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRequestHitResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeRequestHitResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRequestHitResponseBodyResultObject setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public DescribeRequestHitResponseBodyResultObject setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public DescribeRequestHitResponseBodyResultObject setRequestTime(Long requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public Long getRequestTime() {
            return this.requestTime;
        }

        public DescribeRequestHitResponseBodyResultObject setRuleHitRecords(java.util.List<DescribeRequestHitResponseBodyResultObjectRuleHitRecords> ruleHitRecords) {
            this.ruleHitRecords = ruleHitRecords;
            return this;
        }
        public java.util.List<DescribeRequestHitResponseBodyResultObjectRuleHitRecords> getRuleHitRecords() {
            return this.ruleHitRecords;
        }

        public DescribeRequestHitResponseBodyResultObject setSRequestId(String sRequestId) {
            this.sRequestId = sRequestId;
            return this;
        }
        public String getSRequestId() {
            return this.sRequestId;
        }

        public DescribeRequestHitResponseBodyResultObject setTotalCost(Long totalCost) {
            this.totalCost = totalCost;
            return this;
        }
        public Long getTotalCost() {
            return this.totalCost;
        }

    }

}
