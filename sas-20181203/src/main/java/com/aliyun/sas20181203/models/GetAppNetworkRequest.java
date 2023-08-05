// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAppNetworkRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end timestamp of the query. Unit: milliseconds.</p>
     * <br>
     * <p>> The days between the start timestamp and the end timestamp cannot exceed **seven** days.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The start timestamp of the query. Unit: milliseconds.</p>
     * <br>
     * <p>> The days between the start timestamp and the end timestamp cannot exceed **seven** days.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetAppNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppNetworkRequest self = new GetAppNetworkRequest();
        return TeaModel.build(map, self);
    }

    public GetAppNetworkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetAppNetworkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAppNetworkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
