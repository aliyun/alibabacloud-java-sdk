// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListNotaryInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNotaryInfosResponseBody body;

    public static ListNotaryInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotaryInfosResponse self = new ListNotaryInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListNotaryInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotaryInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNotaryInfosResponse setBody(ListNotaryInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotaryInfosResponseBody getBody() {
        return this.body;
    }

}
