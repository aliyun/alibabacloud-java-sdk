// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryResourceControlEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryResourceControlEventsResponseBody body;

    public static QueryResourceControlEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceControlEventsResponse self = new QueryResourceControlEventsResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceControlEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResourceControlEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryResourceControlEventsResponse setBody(QueryResourceControlEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResourceControlEventsResponseBody getBody() {
        return this.body;
    }

}
