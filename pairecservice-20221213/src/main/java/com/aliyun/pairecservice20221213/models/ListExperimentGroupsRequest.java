// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentGroupsRequest extends TeaModel {
    /**
     * <p>The instance ID. You can get this ID by calling the ListInstances operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The layer ID. You can get this ID by calling the ListLayers operation.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LayerId")
    public String layerId;

    /**
     * <p>The status of the experiment group. Valid values: Offline, Online, and Pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The end time for filtering experiment groups.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-31 12:00:00</p>
     */
    @NameInMap("TimeRangeEnd")
    public String timeRangeEnd;

    /**
     * <p>The start time for filtering experiment groups.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-30 12:00:00</p>
     */
    @NameInMap("TimeRangeStart")
    public String timeRangeStart;

    public static ListExperimentGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentGroupsRequest self = new ListExperimentGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListExperimentGroupsRequest setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public ListExperimentGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListExperimentGroupsRequest setTimeRangeEnd(String timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public ListExperimentGroupsRequest setTimeRangeStart(String timeRangeStart) {
        this.timeRangeStart = timeRangeStart;
        return this;
    }
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

}
