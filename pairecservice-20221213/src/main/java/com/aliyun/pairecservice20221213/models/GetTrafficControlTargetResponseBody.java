// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTargetResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Event")
    public String event;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("ItemConditionArray")
    public String itemConditionArray;

    @NameInMap("ItemConditionExpress")
    public String itemConditionExpress;

    @NameInMap("ItemConditionType")
    public String itemConditionType;

    @NameInMap("Name")
    public String name;

    @NameInMap("NewProductRegulation")
    public Boolean newProductRegulation;

    @NameInMap("RecallName")
    public String recallName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SplitParts")
    public GetTrafficControlTargetResponseBodySplitParts splitParts;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StatisPeriod")
    public String statisPeriod;

    @NameInMap("Status")
    public String status;

    @NameInMap("ToleranceValue")
    public Long toleranceValue;

    @NameInMap("TrafficControlTargetId")
    public String trafficControlTargetId;

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
