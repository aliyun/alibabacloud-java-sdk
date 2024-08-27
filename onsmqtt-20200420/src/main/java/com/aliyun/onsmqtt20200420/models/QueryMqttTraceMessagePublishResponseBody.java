// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessagePublishResponseBody extends TeaModel {
    /**
     * <p>The message traces.</p>
     */
    @NameInMap("MessageTraceLists")
    public java.util.List<QueryMqttTraceMessagePublishResponseBodyMessageTraceLists> messageTraceLists;

    /**
     * <p>The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>69AD5550-BF22-438A-9202-A6E89185****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMqttTraceMessagePublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessagePublishResponseBody self = new QueryMqttTraceMessagePublishResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessagePublishResponseBody setMessageTraceLists(java.util.List<QueryMqttTraceMessagePublishResponseBodyMessageTraceLists> messageTraceLists) {
        this.messageTraceLists = messageTraceLists;
        return this;
    }
    public java.util.List<QueryMqttTraceMessagePublishResponseBodyMessageTraceLists> getMessageTraceLists() {
        return this.messageTraceLists;
    }

    public QueryMqttTraceMessagePublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMqttTraceMessagePublishResponseBodyMessageTraceLists extends TeaModel {
        /**
         * <p>The action on the message. Valid values:</p>
         * <ul>
         * <li><strong>pub_mqtt</strong>: indicates that the message was sent by an ApsaraMQ for MQTT client.</li>
         * <li><strong>pub_mq</strong>: indicates that the message was sent by an ApsaraMQ for RocketMQ client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pub_mqtt</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The returned code for the action on the message. Valid values:</p>
         * <ul>
         * <li><strong>mqtt.trace.action.msg.pub.mqtt</strong>: This value is returned if the value of Action is <strong>pub_mqtt</strong>.</li>
         * <li><strong>mqtt.trace.action.msg.pub.mq</strong>: This value is returned if the value of Action is <strong>pub_mq</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mqtt.trace.action.msg.pub.mqtt</p>
         */
        @NameInMap("ActionCode")
        public String actionCode;

        /**
         * <p>The returned information for the action on the message. Valid values:</p>
         * <ul>
         * <li><strong>Pub From Mqtt Client</strong>: This value is returned if the value of Action is <strong>pub_mqtt</strong>.</li>
         * <li><strong>Pub From MQ</strong>: This value is returned if the value of Action is <strong>pub_mq</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pub From Mqtt Client</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The ID of the client that sends the message.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test@@@producer</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AC1EC0030EAB78308DB16A3EC773BD95</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The time when the message was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21 15:08:19.210</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryMqttTraceMessagePublishResponseBodyMessageTraceLists build(java.util.Map<String, ?> map) throws Exception {
            QueryMqttTraceMessagePublishResponseBodyMessageTraceLists self = new QueryMqttTraceMessagePublishResponseBodyMessageTraceLists();
            return TeaModel.build(map, self);
        }

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setActionInfo(String actionInfo) {
            this.actionInfo = actionInfo;
            return this;
        }
        public String getActionInfo() {
            return this.actionInfo;
        }

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
