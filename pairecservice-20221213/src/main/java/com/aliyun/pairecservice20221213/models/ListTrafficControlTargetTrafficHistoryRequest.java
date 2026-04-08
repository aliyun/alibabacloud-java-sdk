// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTargetTrafficHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-01-10 13:13:20</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    /**
     * <strong>example:</strong>
     * <p>ER_All</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <strong>example:</strong>
     * <p>pairec-1324***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ItemId")
    public String itemId;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01 13:13:20</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
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
