// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessageOfClientResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The returned messages.</p>
     */
    @NameInMap("MessageOfClientList")
    public java.util.List<QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList> messageOfClientList;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>B096B9D6-62F3-4567-BB59-58D1362E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of messages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Total")
    public Long total;

    public static QueryMqttTraceMessageOfClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessageOfClientResponseBody self = new QueryMqttTraceMessageOfClientResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessageOfClientResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMqttTraceMessageOfClientResponseBody setMessageOfClientList(java.util.List<QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList> messageOfClientList) {
        this.messageOfClientList = messageOfClientList;
        return this;
    }
    public java.util.List<QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList> getMessageOfClientList() {
        return this.messageOfClientList;
    }

    public QueryMqttTraceMessageOfClientResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMqttTraceMessageOfClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqttTraceMessageOfClientResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList extends TeaModel {
        /**
         * <p>The action on the message. Valid values:</p>
         * <ul>
         * <li><strong>pub_mqtt</strong>: The ApsaraMQ for MQTT client sends the message.</li>
         * <li><strong>sub</strong>: The ApsaraMQ for MQTT client subscribes to the message.</li>
         * <li><strong>push_offline</strong>: The ApsaraMQ for MQTT broker pushes the offline message to the ApsaraMQ for MQTT client.</li>
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
         * <li><strong>mqtt.trace.action.msg.sub</strong>: This value is returned if the value of Action is <strong>sub</strong>.</li>
         * <li><strong>mqtt.trace.action.msg.push.offline</strong>: This value is returned if the value of Action is <strong>push_offline</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mqtt.trace.action.msg.pub.mqtt</p>
         */
        @NameInMap("ActionCode")
        public String actionCode;

        /**
         * <p>The information returned for the action on the message. Valid values:</p>
         * <ul>
         * <li><strong>Pub From Mqtt Client</strong>: This value is returned if the value of Action is <strong>pub_mqtt</strong>.</li>
         * <li><strong>Push To Mqtt Client</strong>: This value is returned if the value of Action is <strong>sub</strong>.</li>
         * <li><strong>Push Offline Msg To Mqtt Client</strong>: This value is returned if the value of Action is <strong>push_offline</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pub From Mqtt Client</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The client ID of the device.</p>
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
         * <p>AC1EC0030EAB78308DB16A3EC773****</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The time when the message was sent or received.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21 15:08:19.234</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList self = new QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList();
            return TeaModel.build(map, self);
        }

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setActionInfo(String actionInfo) {
            this.actionInfo = actionInfo;
            return this;
        }
        public String getActionInfo() {
            return this.actionInfo;
        }

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
