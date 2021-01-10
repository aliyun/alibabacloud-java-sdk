// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsClientValueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Clients")
    public java.util.List<QueryMSDdcsClientValueResponseBodyClients> clients;

    public static QueryMSDdcsClientValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsClientValueResponseBody self = new QueryMSDdcsClientValueResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsClientValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSDdcsClientValueResponseBody setClients(java.util.List<QueryMSDdcsClientValueResponseBodyClients> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<QueryMSDdcsClientValueResponseBodyClients> getClients() {
        return this.clients;
    }

    public static class QueryMSDdcsClientValueResponseBodyClients extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMSDdcsClientValueResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            QueryMSDdcsClientValueResponseBodyClients self = new QueryMSDdcsClientValueResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public QueryMSDdcsClientValueResponseBodyClients setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryMSDdcsClientValueResponseBodyClients setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryMSDdcsClientValueResponseBodyClients setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
