// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListScenesResponseBody body;

    public static ListScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScenesResponse self = new ListScenesResponse();
        return TeaModel.build(map, self);
    }

    public ListScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScenesResponse setBody(ListScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScenesResponseBody getBody() {
        return this.body;
    }

}
