// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListProductEnvsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductEnvsResponseBody body;

    public static ListProductEnvsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvsResponse self = new ListProductEnvsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductEnvsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductEnvsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductEnvsResponse setBody(ListProductEnvsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductEnvsResponseBody getBody() {
        return this.body;
    }

}
