// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessageSubscribeResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The delivery trace of the queried message.</p>
     */
    @NameInMap("MessageTraceLists")
    public java.util.List<QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists> messageTraceLists;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID that the system generates for the request. You can use the ID to troubleshoot issues. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>4E685844-ADAF-4D85-9EAC-F9471E8C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned delivery traces.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Long total;

    public static QueryMqttTraceMessageSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqttTraceMessageSubscribeResponseBody self = new QueryMqttTraceMessageSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqttTraceMessageSubscribeResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryMqttTraceMessageSubscribeResponseBody setMessageTraceLists(java.util.List<QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists> messageTraceLists) {
        this.messageTraceLists = messageTraceLists;
        return this;
    }
    public java.util.List<QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists> getMessageTraceLists() {
        return this.messageTraceLists;
    }

    public QueryMqttTraceMessageSubscribeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMqttTraceMessageSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqttTraceMessageSubscribeResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists extends TeaModel {
        /**
         * <p>The action on the message. Valid values:</p>
         * <ul>
         * <li><strong>sub</strong>: The ApsaraMQ for MQTT client subscribes to the message.</li>
         * <li><strong>push_offline</strong>: The ApsaraMQ for MQTT broker pushes the offline message to the ApsaraMQ for MQTT client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The code returned for the action on the message. Valid values:</p>
         * <ul>
         * <li><strong>mqtt.trace.action.msg.sub</strong>: The value that is returned if the value of Action is <strong>sub</strong>.</li>
         * <li><strong>mqtt.trace.action.msg.push.offline</strong>: The value that is returned if the value of Action is <strong>push_offline</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mqtt.trace.action.msg.sub</p>
         */
        @NameInMap("ActionCode")
        public String actionCode;

        /**
         * <p>The returned information for the action on the message. Valid values:</p>
         * <ul>
         * <li><strong>Push To Mqtt Client</strong>: The value that is returned if the value of Action is <strong>sub</strong>.</li>
         * <li><strong>Push Offline Msg To Mqtt Client</strong>: The value that is returned if the value of Action is <strong>push_offline</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Push To Mqtt Client</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The ID of the client that subscribes to the message.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test@@@consumer</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AC1EC1B33D5978308DB17F3245E4****</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The time when the message was delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-25 16:46:41.274</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists build(java.util.Map<String, ?> map) throws Exception {
            QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists self = new QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists();
            return TeaModel.build(map, self);
        }

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setActionInfo(String actionInfo) {
            this.actionInfo = actionInfo;
            return this;
        }
        public String getActionInfo() {
            return this.actionInfo;
        }

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
