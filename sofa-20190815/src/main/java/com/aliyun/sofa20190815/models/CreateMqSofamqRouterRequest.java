// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateMqSofamqRouterRequest extends TeaModel {
    @NameInMap("ConsumerId")
    public String consumerId;

    @NameInMap("ConsumeFromType")
    public Long consumeFromType;

    @NameInMap("ConsumeFromValue")
    public Long consumeFromValue;

    @NameInMap("ConsumeToType")
    public Long consumeToType;

    @NameInMap("ConsumeToValue")
    public Long consumeToValue;

    @NameInMap("Description")
    public String description;

    @NameInMap("DestinationCell")
    public String destinationCell;

    @NameInMap("DestinationInstanceId")
    public String destinationInstanceId;

    @NameInMap("DestinationTopic")
    public String destinationTopic;

    @NameInMap("Disaster")
    public Boolean disaster;

    @NameInMap("DisasterRecoveryDatacenter")
    public String disasterRecoveryDatacenter;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SourceCell")
    public String sourceCell;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("SourceTopic")
    public String sourceTopic;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("TaskStatus")
    public Long taskStatus;

    @NameInMap("TaskType")
    public Long taskType;

    public static CreateMqSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMqSofamqRouterRequest self = new CreateMqSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public CreateMqSofamqRouterRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public CreateMqSofamqRouterRequest setConsumeFromType(Long consumeFromType) {
        this.consumeFromType = consumeFromType;
        return this;
    }
    public Long getConsumeFromType() {
        return this.consumeFromType;
    }

    public CreateMqSofamqRouterRequest setConsumeFromValue(Long consumeFromValue) {
        this.consumeFromValue = consumeFromValue;
        return this;
    }
    public Long getConsumeFromValue() {
        return this.consumeFromValue;
    }

    public CreateMqSofamqRouterRequest setConsumeToType(Long consumeToType) {
        this.consumeToType = consumeToType;
        return this;
    }
    public Long getConsumeToType() {
        return this.consumeToType;
    }

    public CreateMqSofamqRouterRequest setConsumeToValue(Long consumeToValue) {
        this.consumeToValue = consumeToValue;
        return this;
    }
    public Long getConsumeToValue() {
        return this.consumeToValue;
    }

    public CreateMqSofamqRouterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMqSofamqRouterRequest setDestinationCell(String destinationCell) {
        this.destinationCell = destinationCell;
        return this;
    }
    public String getDestinationCell() {
        return this.destinationCell;
    }

    public CreateMqSofamqRouterRequest setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public CreateMqSofamqRouterRequest setDestinationTopic(String destinationTopic) {
        this.destinationTopic = destinationTopic;
        return this;
    }
    public String getDestinationTopic() {
        return this.destinationTopic;
    }

    public CreateMqSofamqRouterRequest setDisaster(Boolean disaster) {
        this.disaster = disaster;
        return this;
    }
    public Boolean getDisaster() {
        return this.disaster;
    }

    public CreateMqSofamqRouterRequest setDisasterRecoveryDatacenter(String disasterRecoveryDatacenter) {
        this.disasterRecoveryDatacenter = disasterRecoveryDatacenter;
        return this;
    }
    public String getDisasterRecoveryDatacenter() {
        return this.disasterRecoveryDatacenter;
    }

    public CreateMqSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMqSofamqRouterRequest setSourceCell(String sourceCell) {
        this.sourceCell = sourceCell;
        return this;
    }
    public String getSourceCell() {
        return this.sourceCell;
    }

    public CreateMqSofamqRouterRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateMqSofamqRouterRequest setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

    public CreateMqSofamqRouterRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateMqSofamqRouterRequest setTaskStatus(Long taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Long getTaskStatus() {
        return this.taskStatus;
    }

    public CreateMqSofamqRouterRequest setTaskType(Long taskType) {
        this.taskType = taskType;
        return this;
    }
    public Long getTaskType() {
        return this.taskType;
    }

}
