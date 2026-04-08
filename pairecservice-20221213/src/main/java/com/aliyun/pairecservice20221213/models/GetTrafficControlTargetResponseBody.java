// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTargetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-04-25</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>click</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <strong>example:</strong>
     * <p>2024-01-03T02:28:00.000Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
     */
    @NameInMap("ItemConditionArray")
    public String itemConditionArray;

    /**
     * <strong>example:</strong>
     * <p>status=1</p>
     */
    @NameInMap("ItemConditionExpress")
    public String itemConditionExpress;

    /**
     * <strong>example:</strong>
     * <p>Array</p>
     */
    @NameInMap("ItemConditionType")
    public String itemConditionType;

    /**
     * <strong>example:</strong>
     * <p>target-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NewProductRegulation")
    public Boolean newProductRegulation;

    /**
     * <strong>example:</strong>
     * <p>recall-1</p>
     */
    @NameInMap("RecallName")
    public String recallName;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SplitParts")
    public GetTrafficControlTargetResponseBodySplitParts splitParts;

    /**
     * <strong>example:</strong>
     * <p>2024-03-25</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("StatisPeriod")
    public String statisPeriod;

    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ToleranceValue")
    public Long toleranceValue;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TrafficControlTargetId")
    public String trafficControlTargetId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TrafficControlTaskId")
    public String trafficControlTaskId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Value")
    public Float value;

    public static GetTrafficControlTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTargetResponseBody self = new GetTrafficControlTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTargetResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTrafficControlTargetResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public GetTrafficControlTargetResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetTrafficControlTargetResponseBody setItemConditionArray(String itemConditionArray) {
        this.itemConditionArray = itemConditionArray;
        return this;
    }
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    public GetTrafficControlTargetResponseBody setItemConditionExpress(String itemConditionExpress) {
        this.itemConditionExpress = itemConditionExpress;
        return this;
    }
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    public GetTrafficControlTargetResponseBody setItemConditionType(String itemConditionType) {
        this.itemConditionType = itemConditionType;
        return this;
    }
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    public GetTrafficControlTargetResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTrafficControlTargetResponseBody setNewProductRegulation(Boolean newProductRegulation) {
        this.newProductRegulation = newProductRegulation;
        return this;
    }
    public Boolean getNewProductRegulation() {
        return this.newProductRegulation;
    }

    public GetTrafficControlTargetResponseBody setRecallName(String recallName) {
        this.recallName = recallName;
        return this;
    }
    public String getRecallName() {
        return this.recallName;
    }

    public GetTrafficControlTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrafficControlTargetResponseBody setSplitParts(GetTrafficControlTargetResponseBodySplitParts splitParts) {
        this.splitParts = splitParts;
        return this;
    }
    public GetTrafficControlTargetResponseBodySplitParts getSplitParts() {
        return this.splitParts;
    }

    public GetTrafficControlTargetResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetTrafficControlTargetResponseBody setStatisPeriod(String statisPeriod) {
        this.statisPeriod = statisPeriod;
        return this;
    }
    public String getStatisPeriod() {
        return this.statisPeriod;
    }

    public GetTrafficControlTargetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTrafficControlTargetResponseBody setToleranceValue(Long toleranceValue) {
        this.toleranceValue = toleranceValue;
        return this;
    }
    public Long getToleranceValue() {
        return this.toleranceValue;
    }

    public GetTrafficControlTargetResponseBody setTrafficControlTargetId(String trafficControlTargetId) {
        this.trafficControlTargetId = trafficControlTargetId;
        return this;
    }
    public String getTrafficControlTargetId() {
        return this.trafficControlTargetId;
    }

    public GetTrafficControlTargetResponseBody setTrafficControlTaskId(String trafficControlTaskId) {
        this.trafficControlTaskId = trafficControlTaskId;
        return this;
    }
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    public GetTrafficControlTargetResponseBody setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

    public static class GetTrafficControlTargetResponseBodySplitParts extends TeaModel {
        @NameInMap("SetPoints")
        public java.util.List<Long> setPoints;

        @NameInMap("SetValues")
        public java.util.List<Long> setValues;

        @NameInMap("TimePoints")
        public java.util.List<Long> timePoints;

        public static GetTrafficControlTargetResponseBodySplitParts build(java.util.Map<String, ?> map) throws Exception {
            GetTrafficControlTargetResponseBodySplitParts self = new GetTrafficControlTargetResponseBodySplitParts();
            return TeaModel.build(map, self);
        }

        public GetTrafficControlTargetResponseBodySplitParts setSetPoints(java.util.List<Long> setPoints) {
            this.setPoints = setPoints;
            return this;
        }
        public java.util.List<Long> getSetPoints() {
            return this.setPoints;
        }

        public GetTrafficControlTargetResponseBodySplitParts setSetValues(java.util.List<Long> setValues) {
            this.setValues = setValues;
            return this;
        }
        public java.util.List<Long> getSetValues() {
            return this.setValues;
        }

        public GetTrafficControlTargetResponseBodySplitParts setTimePoints(java.util.List<Long> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<Long> getTimePoints() {
            return this.timePoints;
        }

    }

}
