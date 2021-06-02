// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessageSubscribeResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Long total;

    @NameInMap("MessageTraceLists")
    public java.util.List<QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists> messageTraceLists;

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

    public QueryMqttTraceMessageSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqttTraceMessageSubscribeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMqttTraceMessageSubscribeResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryMqttTraceMessageSubscribeResponseBody setMessageTraceLists(java.util.List<QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists> messageTraceLists) {
        this.messageTraceLists = messageTraceLists;
        return this;
    }
    public java.util.List<QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists> getMessageTraceLists() {
        return this.messageTraceLists;
    }

    public static class QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists extends TeaModel {
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

        public static QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists build(java.util.Map<String, ?> map) throws Exception {
            QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists self = new QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists();
            return TeaModel.build(map, self);
        }

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
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

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqttTraceMessageSubscribeResponseBodyMessageTraceLists setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

}
