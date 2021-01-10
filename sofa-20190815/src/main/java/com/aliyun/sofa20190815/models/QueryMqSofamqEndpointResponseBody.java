// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqEndpointResponseBodyData data;

    public static QueryMqSofamqEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqEndpointResponseBody self = new QueryMqSofamqEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqEndpointResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqEndpointResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqEndpointResponseBody setData(QueryMqSofamqEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqEndpointResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqEndpointResponseBodyData extends TeaModel {
        @NameInMap("Doc")
        public String doc;

        @NameInMap("HttpsInternet")
        public String httpsInternet;

        @NameInMap("HttpInternal")
        public String httpInternal;

        @NameInMap("HttpInternet")
        public String httpInternet;

        @NameInMap("Tcp")
        public String tcp;

        public static QueryMqSofamqEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqEndpointResponseBodyData self = new QueryMqSofamqEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqEndpointResponseBodyData setDoc(String doc) {
            this.doc = doc;
            return this;
        }
        public String getDoc() {
            return this.doc;
        }

        public QueryMqSofamqEndpointResponseBodyData setHttpsInternet(String httpsInternet) {
            this.httpsInternet = httpsInternet;
            return this;
        }
        public String getHttpsInternet() {
            return this.httpsInternet;
        }

        public QueryMqSofamqEndpointResponseBodyData setHttpInternal(String httpInternal) {
            this.httpInternal = httpInternal;
            return this;
        }
        public String getHttpInternal() {
            return this.httpInternal;
        }

        public QueryMqSofamqEndpointResponseBodyData setHttpInternet(String httpInternet) {
            this.httpInternet = httpInternet;
            return this;
        }
        public String getHttpInternet() {
            return this.httpInternet;
        }

        public QueryMqSofamqEndpointResponseBodyData setTcp(String tcp) {
            this.tcp = tcp;
            return this;
        }
        public String getTcp() {
            return this.tcp;
        }

    }

}
