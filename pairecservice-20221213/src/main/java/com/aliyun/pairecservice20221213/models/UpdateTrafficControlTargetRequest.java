// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTargetRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Event")
    public String event;

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

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StatisPeriod")
    public String statisPeriod;

    @NameInMap("Status")
    public String status;

    @NameInMap("ToleranceValue")
    public Long toleranceValue;

    @NameInMap("Value")
    public Float value;

    @NameInMap("new-param-3")
    public String newParam3;

    public static UpdateTrafficControlTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTargetRequest self = new UpdateTrafficControlTargetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTargetRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateTrafficControlTargetRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public UpdateTrafficControlTargetRequest setItemConditionArray(String itemConditionArray) {
        this.itemConditionArray = itemConditionArray;
        return this;
    }
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    public UpdateTrafficControlTargetRequest setItemConditionExpress(String itemConditionExpress) {
        this.itemConditionExpress = itemConditionExpress;
        return this;
    }
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    public UpdateTrafficControlTargetRequest setItemConditionType(String itemConditionType) {
        this.itemConditionType = itemConditionType;
        return this;
    }
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    public UpdateTrafficControlTargetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTrafficControlTargetRequest setNewProductRegulation(Boolean newProductRegulation) {
        this.newProductRegulation = newProductRegulation;
        return this;
    }
    public Boolean getNewProductRegulation() {
        return this.newProductRegulation;
    }

    public UpdateTrafficControlTargetRequest setRecallName(String recallName) {
        this.recallName = recallName;
        return this;
    }
    public String getRecallName() {
        return this.recallName;
    }

    public UpdateTrafficControlTargetRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateTrafficControlTargetRequest setStatisPeriod(String statisPeriod) {
        this.statisPeriod = statisPeriod;
        return this;
    }
    public String getStatisPeriod() {
        return this.statisPeriod;
    }

    public UpdateTrafficControlTargetRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateTrafficControlTargetRequest setToleranceValue(Long toleranceValue) {
        this.toleranceValue = toleranceValue;
        return this;
    }
    public Long getToleranceValue() {
        return this.toleranceValue;
    }

    public UpdateTrafficControlTargetRequest setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

    public UpdateTrafficControlTargetRequest setNewParam3(String newParam3) {
        this.newParam3 = newParam3;
        return this;
    }
    public String getNewParam3() {
        return this.newParam3;
    }

}
