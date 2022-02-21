// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDevicesDataRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDevicesDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDevicesDataRequest self = new DescribeVsDevicesDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDevicesDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDevicesDataRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeVsDevicesDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDevicesDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
