// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByTopicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MqttClientSetDo")
    public OnsMqttQueryClientByTopicResponseBodyMqttClientSetDo mqttClientSetDo;

    public static OnsMqttQueryClientByTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByTopicResponseBody self = new OnsMqttQueryClientByTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMqttQueryClientByTopicResponseBody setMqttClientSetDo(OnsMqttQueryClientByTopicResponseBodyMqttClientSetDo mqttClientSetDo) {
        this.mqttClientSetDo = mqttClientSetDo;
        return this;
    }
    public OnsMqttQueryClientByTopicResponseBodyMqttClientSetDo getMqttClientSetDo() {
        return this.mqttClientSetDo;
    }

    public static class OnsMqttQueryClientByTopicResponseBodyMqttClientSetDo extends TeaModel {
        @NameInMap("OnlineCount")
        public Long onlineCount;

        public static OnsMqttQueryClientByTopicResponseBodyMqttClientSetDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryClientByTopicResponseBodyMqttClientSetDo self = new OnsMqttQueryClientByTopicResponseBodyMqttClientSetDo();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryClientByTopicResponseBodyMqttClientSetDo setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

    }

}
