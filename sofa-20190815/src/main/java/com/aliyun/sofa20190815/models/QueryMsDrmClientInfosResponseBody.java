// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmClientInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ClientInfos")
    public java.util.List<QueryMsDrmClientInfosResponseBodyClientInfos> clientInfos;

    public static QueryMsDrmClientInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmClientInfosResponseBody self = new QueryMsDrmClientInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmClientInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsDrmClientInfosResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsDrmClientInfosResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsDrmClientInfosResponseBody setClientInfos(java.util.List<QueryMsDrmClientInfosResponseBodyClientInfos> clientInfos) {
        this.clientInfos = clientInfos;
        return this;
    }
    public java.util.List<QueryMsDrmClientInfosResponseBodyClientInfos> getClientInfos() {
        return this.clientInfos;
    }

    public static class QueryMsDrmClientInfosResponseBodyClientInfos extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("PushValue")
        public String pushValue;

        @NameInMap("Value")
        public String value;

        @NameInMap("Zone")
        public String zone;

        public static QueryMsDrmClientInfosResponseBodyClientInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsDrmClientInfosResponseBodyClientInfos self = new QueryMsDrmClientInfosResponseBodyClientInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsDrmClientInfosResponseBodyClientInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryMsDrmClientInfosResponseBodyClientInfos setPushValue(String pushValue) {
            this.pushValue = pushValue;
            return this;
        }
        public String getPushValue() {
            return this.pushValue;
        }

        public QueryMsDrmClientInfosResponseBodyClientInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryMsDrmClientInfosResponseBodyClientInfos setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
