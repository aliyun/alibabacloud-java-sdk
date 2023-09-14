// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListParamsResponseBody body;

    public static ListParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParamsResponse self = new ListParamsResponse();
        return TeaModel.build(map, self);
    }

    public ListParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListParamsResponse setBody(ListParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParamsResponseBody getBody() {
        return this.body;
    }

}
