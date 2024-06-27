// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRequestHitResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("cost")
        public Integer cost;

        @NameInMap("hitSuccessful")
        public Boolean hitSuccessful;

        @NameInMap("isShowDetail")
        public Boolean isShowDetail;

        @NameInMap("order")
        public Integer order;

        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleName")
        public String ruleName;

        @NameInMap("ruleSnapshotId")
        public String ruleSnapshotId;

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
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("inputs")
        public String inputs;

        @NameInMap("outputs")
        public String outputs;

        @NameInMap("requestTime")
        public Long requestTime;

        @NameInMap("ruleHitRecords")
        public java.util.List<DescribeRequestHitResponseBodyResultObjectRuleHitRecords> ruleHitRecords;

        @NameInMap("sRequestId")
        public String sRequestId;

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
