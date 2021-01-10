// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigClientValuesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Clients")
    public java.util.List<QueryMsConfigClientValuesResponseBodyClients> clients;

    public static QueryMsConfigClientValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigClientValuesResponseBody self = new QueryMsConfigClientValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigClientValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsConfigClientValuesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsConfigClientValuesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsConfigClientValuesResponseBody setClients(java.util.List<QueryMsConfigClientValuesResponseBodyClients> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<QueryMsConfigClientValuesResponseBodyClients> getClients() {
        return this.clients;
    }

    public static class QueryMsConfigClientValuesResponseBodyClients extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMsConfigClientValuesResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            QueryMsConfigClientValuesResponseBodyClients self = new QueryMsConfigClientValuesResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public QueryMsConfigClientValuesResponseBodyClients setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryMsConfigClientValuesResponseBodyClients setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryMsConfigClientValuesResponseBodyClients setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
