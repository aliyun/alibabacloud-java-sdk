// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPdpServicesResponseBody body;

    public static ListPdpServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPdpServicesResponse self = new ListPdpServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListPdpServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPdpServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPdpServicesResponse setBody(ListPdpServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPdpServicesResponseBody getBody() {
        return this.body;
    }

}
