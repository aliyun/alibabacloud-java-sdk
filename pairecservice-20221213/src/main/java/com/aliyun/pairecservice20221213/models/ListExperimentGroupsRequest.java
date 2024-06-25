// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListExperimentGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LayerId")
    public String layerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("TimeRangeEnd")
    public String timeRangeEnd;

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

    public ListExperimentGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
