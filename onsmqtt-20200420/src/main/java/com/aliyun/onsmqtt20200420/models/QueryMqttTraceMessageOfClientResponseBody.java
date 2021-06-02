// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryMqttTraceMessageOfClientResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Long total;

    @NameInMap("MessageOfClientList")
    public java.util.List<QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList> messageOfClientList;

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

    public QueryMqttTraceMessageOfClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqttTraceMessageOfClientResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMqttTraceMessageOfClientResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryMqttTraceMessageOfClientResponseBody setMessageOfClientList(java.util.List<QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList> messageOfClientList) {
        this.messageOfClientList = messageOfClientList;
        return this;
    }
    public java.util.List<QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList> getMessageOfClientList() {
        return this.messageOfClientList;
    }

    public static class QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList extends TeaModel {
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

        public static QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList self = new QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList();
            return TeaModel.build(map, self);
        }

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
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

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqttTraceMessageOfClientResponseBodyMessageOfClientList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

}
