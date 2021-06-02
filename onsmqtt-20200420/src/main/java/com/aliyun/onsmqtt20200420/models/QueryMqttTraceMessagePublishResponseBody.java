// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessagePublishResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageTraceLists")
    public java.util.List<QueryMqttTraceMessagePublishResponseBodyMessageTraceLists> messageTraceLists;

    public static QueryMqttTraceMessagePublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessagePublishResponseBody self = new QueryMqttTraceMessagePublishResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessagePublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqttTraceMessagePublishResponseBody setMessageTraceLists(java.util.List<QueryMqttTraceMessagePublishResponseBodyMessageTraceLists> messageTraceLists) {
        this.messageTraceLists = messageTraceLists;
        return this;
    }
    public java.util.List<QueryMqttTraceMessagePublishResponseBodyMessageTraceLists> getMessageTraceLists() {
        return this.messageTraceLists;
    }

    public static class QueryMqttTraceMessagePublishResponseBodyMessageTraceLists extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Action")
        public String action;

        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("ActionInfo")
        public String actionInfo;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("ClientId")
        public String clientId;

        public static QueryMqttTraceMessagePublishResponseBodyMessageTraceLists build(java.util.Map<String, ?> map) throws Exception {
            QueryMqttTraceMessagePublishResponseBodyMessageTraceLists self = new QueryMqttTraceMessagePublishResponseBodyMessageTraceLists();
            return TeaModel.build(map, self);
        }

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
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

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqttTraceMessagePublishResponseBodyMessageTraceLists setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

}
