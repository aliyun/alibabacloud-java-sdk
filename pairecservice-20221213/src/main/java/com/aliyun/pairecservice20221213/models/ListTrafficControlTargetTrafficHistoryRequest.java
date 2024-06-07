// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTargetTrafficHistoryRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Threshold")
    public String threshold;

    public static ListTrafficControlTargetTrafficHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficControlTargetTrafficHistoryRequest self = new ListTrafficControlTargetTrafficHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListTrafficControlTargetTrafficHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTrafficControlTargetTrafficHistoryRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListTrafficControlTargetTrafficHistoryRequest setExperimentGroupId(String experimentGroupId) {
        this.experimentGroupId = experimentGroupId;
        return this;
    }
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    public ListTrafficControlTargetTrafficHistoryRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public ListTrafficControlTargetTrafficHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTrafficControlTargetTrafficHistoryRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public ListTrafficControlTargetTrafficHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTrafficControlTargetTrafficHistoryRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

}
