// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsMqttGroupIdListResponseBodyData data;

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

    public OnsMqttGroupIdListResponseBody setData(OnsMqttGroupIdListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMqttGroupIdListResponseBodyData getData() {
        return this.data;
    }

    public static class OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo extends TeaModel {
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

        public static OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo self = new OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo();
            return TeaModel.build(map, self);
        }

        public OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class OnsMqttGroupIdListResponseBodyData extends TeaModel {
        @NameInMap("MqttGroupIdDo")
        public java.util.List<OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo> mqttGroupIdDo;

        public static OnsMqttGroupIdListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttGroupIdListResponseBodyData self = new OnsMqttGroupIdListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMqttGroupIdListResponseBodyData setMqttGroupIdDo(java.util.List<OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo> mqttGroupIdDo) {
            this.mqttGroupIdDo = mqttGroupIdDo;
            return this;
        }
        public java.util.List<OnsMqttGroupIdListResponseBodyDataMqttGroupIdDo> getMqttGroupIdDo() {
            return this.mqttGroupIdDo;
        }

    }

}
