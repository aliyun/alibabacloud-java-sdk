// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryCommunicationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCommunicationLogsResponseBody body;

    public static QueryCommunicationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommunicationLogsResponse self = new QueryCommunicationLogsResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommunicationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommunicationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommunicationLogsResponse setBody(QueryCommunicationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommunicationLogsResponseBody getBody() {
        return this.body;
    }

}
