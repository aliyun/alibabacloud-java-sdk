// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcInvokesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPbcInvokesResponseBody body;

    public static ListPbcInvokesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPbcInvokesResponse self = new ListPbcInvokesResponse();
        return TeaModel.build(map, self);
    }

    public ListPbcInvokesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPbcInvokesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPbcInvokesResponse setBody(ListPbcInvokesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPbcInvokesResponseBody getBody() {
        return this.body;
    }

}
