// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTagOptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTagOptionsResponseBody body;

    public static ListTagOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagOptionsResponse self = new ListTagOptionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTagOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagOptionsResponse setBody(ListTagOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagOptionsResponseBody getBody() {
        return this.body;
    }

}
