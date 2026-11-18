// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ListWarmPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWarmPoolsResponseBody body;

    public static ListWarmPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWarmPoolsResponse self = new ListWarmPoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListWarmPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWarmPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWarmPoolsResponse setBody(ListWarmPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWarmPoolsResponseBody getBody() {
        return this.body;
    }

}
