// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqConsumerConnectionResponseBodyData data;

    public static QueryMqSofamqConsumerConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerConnectionResponseBody self = new QueryMqSofamqConsumerConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqConsumerConnectionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqConsumerConnectionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqConsumerConnectionResponseBody setData(QueryMqSofamqConsumerConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqConsumerConnectionResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList extends TeaModel {
        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("Language")
        public String language;

        @NameInMap("RemoteIp")
        public String remoteIp;

        @NameInMap("Version")
        public String version;

        public static QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList self = new QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryMqSofamqConsumerConnectionResponseBodyData extends TeaModel {
        @NameInMap("ConnectionList")
        public java.util.List<QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList> connectionList;

        public static QueryMqSofamqConsumerConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqConsumerConnectionResponseBodyData self = new QueryMqSofamqConsumerConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqConsumerConnectionResponseBodyData setConnectionList(java.util.List<QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList> connectionList) {
            this.connectionList = connectionList;
            return this;
        }
        public java.util.List<QueryMqSofamqConsumerConnectionResponseBodyDataConnectionList> getConnectionList() {
            return this.connectionList;
        }

    }

}
