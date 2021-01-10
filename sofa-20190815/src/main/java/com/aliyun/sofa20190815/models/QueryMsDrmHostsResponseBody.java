// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmHostsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ClientInfos")
    public java.util.List<QueryMsDrmHostsResponseBodyClientInfos> clientInfos;

    public static QueryMsDrmHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmHostsResponseBody self = new QueryMsDrmHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsDrmHostsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsDrmHostsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsDrmHostsResponseBody setClientInfos(java.util.List<QueryMsDrmHostsResponseBodyClientInfos> clientInfos) {
        this.clientInfos = clientInfos;
        return this;
    }
    public java.util.List<QueryMsDrmHostsResponseBodyClientInfos> getClientInfos() {
        return this.clientInfos;
    }

    public static class QueryMsDrmHostsResponseBodyClientInfos extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("PushValue")
        public String pushValue;

        @NameInMap("Value")
        public String value;

        @NameInMap("Zone")
        public String zone;

        public static QueryMsDrmHostsResponseBodyClientInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsDrmHostsResponseBodyClientInfos self = new QueryMsDrmHostsResponseBodyClientInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsDrmHostsResponseBodyClientInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryMsDrmHostsResponseBodyClientInfos setPushValue(String pushValue) {
            this.pushValue = pushValue;
            return this;
        }
        public String getPushValue() {
            return this.pushValue;
        }

        public QueryMsDrmHostsResponseBodyClientInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryMsDrmHostsResponseBodyClientInfos setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
