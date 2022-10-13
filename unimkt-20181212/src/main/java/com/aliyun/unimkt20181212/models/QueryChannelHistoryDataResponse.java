// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryChannelHistoryDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryChannelHistoryDataResponseBody body;

    public static QueryChannelHistoryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChannelHistoryDataResponse self = new QueryChannelHistoryDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryChannelHistoryDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChannelHistoryDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChannelHistoryDataResponse setBody(QueryChannelHistoryDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChannelHistoryDataResponseBody getBody() {
        return this.body;
    }

}
