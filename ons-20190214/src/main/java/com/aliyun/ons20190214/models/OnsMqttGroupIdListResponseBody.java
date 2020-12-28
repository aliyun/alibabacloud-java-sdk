// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<OnsMqttGroupIdListResponseBodyData> data;

    public static OnsMqttGroupIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdListResponseBody self = new OnsMqttGroupIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMqttGroupIdListResponseBody setData(java.util.List<OnsMqttGroupIdListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OnsMqttGroupIdListResponseBodyData> getData() {
        return this.data;
    }

    public static class OnsMqttGroupIdListResponseBodyData extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        public static OnsMqttGroupIdListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttGroupIdListResponseBodyData self = new OnsMqttGroupIdListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMqttGroupIdListResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public OnsMqttGroupIdListResponseBodyData setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsMqttGroupIdListResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsMqttGroupIdListResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsMqttGroupIdListResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
