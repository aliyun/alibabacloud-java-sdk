// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPbcSubscribeResponseBody body;

    public static ListPbcSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPbcSubscribeResponse self = new ListPbcSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public ListPbcSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPbcSubscribeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPbcSubscribeResponse setBody(ListPbcSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPbcSubscribeResponseBody getBody() {
        return this.body;
    }

}
