// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListLayersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLayersResponseBody body;

    public static ListLayersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLayersResponse self = new ListLayersResponse();
        return TeaModel.build(map, self);
    }

    public ListLayersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLayersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLayersResponse setBody(ListLayersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLayersResponseBody getBody() {
        return this.body;
    }

}
