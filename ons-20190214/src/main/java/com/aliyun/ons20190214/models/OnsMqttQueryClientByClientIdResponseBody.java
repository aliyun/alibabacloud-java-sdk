// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByClientIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MqttClientInfoDo")
    public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo mqttClientInfoDo;

    public static OnsMqttQueryClientByClientIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByClientIdResponseBody self = new OnsMqttQueryClientByClientIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByClientIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMqttQueryClientByClientIdResponseBody setMqttClientInfoDo(OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo mqttClientInfoDo) {
        this.mqttClientInfoDo = mqttClientInfoDo;
        return this;
    }
    public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo getMqttClientInfoDo() {
        return this.mqttClientInfoDo;
    }

    public static class OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo extends TeaModel {
        @NameInMap("SubTopic")
        public String subTopic;

        @NameInMap("ParentTopic")
        public String parentTopic;

        @NameInMap("Qos")
        public Integer qos;

        public static OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo self = new OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo setSubTopic(String subTopic) {
            this.subTopic = subTopic;
            return this;
        }
        public String getSubTopic() {
            return this.subTopic;
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo setParentTopic(String parentTopic) {
            this.parentTopic = parentTopic;
            return this;
        }
        public String getParentTopic() {
            return this.parentTopic;
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo setQos(Integer qos) {
            this.qos = qos;
            return this;
        }
        public Integer getQos() {
            return this.qos;
        }

    }

    public static class OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonData extends TeaModel {
        @NameInMap("SubscriptionDo")
        public java.util.List<OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo> subscriptionDo;

        public static OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonData build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonData self = new OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonData();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonData setSubscriptionDo(java.util.List<OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo> subscriptionDo) {
            this.subscriptionDo = subscriptionDo;
            return this;
        }
        public java.util.List<OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonDataSubscriptionDo> getSubscriptionDo() {
            return this.subscriptionDo;
        }

    }

    public static class OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo extends TeaModel {
        @NameInMap("Online")
        public Boolean online;

        @NameInMap("LastTouch")
        public Long lastTouch;

        @NameInMap("SocketChannel")
        public String socketChannel;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("SubScriptonData")
        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonData subScriptonData;

        public static OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo self = new OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo setLastTouch(Long lastTouch) {
            this.lastTouch = lastTouch;
            return this;
        }
        public Long getLastTouch() {
            return this.lastTouch;
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo setSocketChannel(String socketChannel) {
            this.socketChannel = socketChannel;
            return this;
        }
        public String getSocketChannel() {
            return this.socketChannel;
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDo setSubScriptonData(OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonData subScriptonData) {
            this.subScriptonData = subScriptonData;
            return this;
        }
        public OnsMqttQueryClientByClientIdResponseBodyMqttClientInfoDoSubScriptonData getSubScriptonData() {
            return this.subScriptonData;
        }

    }

}
