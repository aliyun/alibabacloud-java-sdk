// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChangeSetsResponseBody body;

    public static ListChangeSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsResponse self = new ListChangeSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListChangeSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChangeSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChangeSetsResponse setBody(ListChangeSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChangeSetsResponseBody getBody() {
        return this.body;
    }

}
