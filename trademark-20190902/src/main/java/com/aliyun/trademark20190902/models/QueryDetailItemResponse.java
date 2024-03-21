// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryDetailItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDetailItemResponseBody body;

    public static QueryDetailItemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailItemResponse self = new QueryDetailItemResponse();
        return TeaModel.build(map, self);
    }

    public QueryDetailItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDetailItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDetailItemResponse setBody(QueryDetailItemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDetailItemResponseBody getBody() {
        return this.body;
    }

}
