// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByGroupIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MqttClientSetDo")
    public OnsMqttQueryClientByGroupIdResponseBodyMqttClientSetDo mqttClientSetDo;

    public static OnsMqttQueryClientByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByGroupIdResponseBody self = new OnsMqttQueryClientByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMqttQueryClientByGroupIdResponseBody setMqttClientSetDo(OnsMqttQueryClientByGroupIdResponseBodyMqttClientSetDo mqttClientSetDo) {
        this.mqttClientSetDo = mqttClientSetDo;
        return this;
    }
    public OnsMqttQueryClientByGroupIdResponseBodyMqttClientSetDo getMqttClientSetDo() {
        return this.mqttClientSetDo;
    }

    public static class OnsMqttQueryClientByGroupIdResponseBodyMqttClientSetDo extends TeaModel {
        @NameInMap("OnlineCount")
        public Long onlineCount;

        public static OnsMqttQueryClientByGroupIdResponseBodyMqttClientSetDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryClientByGroupIdResponseBodyMqttClientSetDo self = new OnsMqttQueryClientByGroupIdResponseBodyMqttClientSetDo();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryClientByGroupIdResponseBodyMqttClientSetDo setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

    }

}
