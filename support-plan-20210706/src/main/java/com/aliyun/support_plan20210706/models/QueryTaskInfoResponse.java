// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class QueryTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTaskInfoResponseBody body;

    public static QueryTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoResponse self = new QueryTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskInfoResponse setBody(QueryTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskInfoResponseBody getBody() {
        return this.body;
    }

}
