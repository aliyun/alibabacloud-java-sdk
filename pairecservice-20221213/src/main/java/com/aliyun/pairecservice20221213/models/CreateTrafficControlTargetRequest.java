// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTrafficControlTargetRequest extends TeaModel {
    /**
     * <p>The end time of the control target. The format is YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-25</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The control target event.</p>
     * 
     * <strong>example:</strong>
     * <p>click</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The item conditions in array format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;status&quot;,&quot;option&quot;:&quot;=&quot;,&quot;value&quot;:&quot;1&quot;}]</p>
     */
    @NameInMap("ItemConditionArray")
    public String itemConditionArray;

    /**
     * <p>The item conditions in expression format.</p>
     * 
     * <strong>example:</strong>
     * <p>status=1</p>
     */
    @NameInMap("ItemConditionExpress")
    public String itemConditionExpress;

    /**
     * <p>The condition type for item control.</p>
     * 
     * <strong>example:</strong>
     * <p>Array</p>
     */
    @NameInMap("ItemConditionType")
    public String itemConditionType;

    /**
     * <p>The name of the traffic control target.</p>
     * 
     * <strong>example:</strong>
     * <p>target-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether the control applies to new products.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NewProductRegulation")
    public Boolean newProductRegulation;

    /**
     * <p>The recall policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>recall-1</p>
     */
    @NameInMap("RecallName")
    public String recallName;

    /**
     * <p>The start time of the control target. The format is YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-25</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The statistical period.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("StatisPeriod")
    public String statisPeriod;

    /**
     * <p>The status of the control target.</p>
     * 
     * <strong>example:</strong>
     * <p>Opened</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tolerance range of the control target.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ToleranceValue")
    public Long toleranceValue;

    /**
     * <p>The ID of the traffic control task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TrafficControlTaskId")
    public String trafficControlTaskId;

    /**
     * <p>The target value.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Value")
    public Float value;

    public static CreateTrafficControlTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlTargetRequest self = new CreateTrafficControlTargetRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlTargetRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateTrafficControlTargetRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public CreateTrafficControlTargetRequest setItemConditionArray(String itemConditionArray) {
        this.itemConditionArray = itemConditionArray;
        return this;
    }
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    public CreateTrafficControlTargetRequest setItemConditionExpress(String itemConditionExpress) {
        this.itemConditionExpress = itemConditionExpress;
        return this;
    }
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    public CreateTrafficControlTargetRequest setItemConditionType(String itemConditionType) {
        this.itemConditionType = itemConditionType;
        return this;
    }
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    public CreateTrafficControlTargetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTrafficControlTargetRequest setNewProductRegulation(Boolean newProductRegulation) {
        this.newProductRegulation = newProductRegulation;
        return this;
    }
    public Boolean getNewProductRegulation() {
        return this.newProductRegulation;
    }

    public CreateTrafficControlTargetRequest setRecallName(String recallName) {
        this.recallName = recallName;
        return this;
    }
    public String getRecallName() {
        return this.recallName;
    }

    public CreateTrafficControlTargetRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateTrafficControlTargetRequest setStatisPeriod(String statisPeriod) {
        this.statisPeriod = statisPeriod;
        return this;
    }
    public String getStatisPeriod() {
        return this.statisPeriod;
    }

    public CreateTrafficControlTargetRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateTrafficControlTargetRequest setToleranceValue(Long toleranceValue) {
        this.toleranceValue = toleranceValue;
        return this;
    }
    public Long getToleranceValue() {
        return this.toleranceValue;
    }

    public CreateTrafficControlTargetRequest setTrafficControlTaskId(String trafficControlTaskId) {
        this.trafficControlTaskId = trafficControlTaskId;
        return this;
    }
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    public CreateTrafficControlTargetRequest setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
