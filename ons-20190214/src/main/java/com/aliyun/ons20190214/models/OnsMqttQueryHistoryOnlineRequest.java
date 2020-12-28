// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryHistoryOnlineRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMqttQueryHistoryOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryHistoryOnlineRequest self = new OnsMqttQueryHistoryOnlineRequest();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryHistoryOnlineRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsMqttQueryHistoryOnlineRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsMqttQueryHistoryOnlineRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsMqttQueryHistoryOnlineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
