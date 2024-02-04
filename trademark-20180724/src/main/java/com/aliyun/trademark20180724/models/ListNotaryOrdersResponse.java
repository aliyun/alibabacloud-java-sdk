// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListNotaryOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNotaryOrdersResponseBody body;

    public static ListNotaryOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotaryOrdersResponse self = new ListNotaryOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListNotaryOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotaryOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNotaryOrdersResponse setBody(ListNotaryOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotaryOrdersResponseBody getBody() {
        return this.body;
    }

}
