// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class OpenServiceGroupForServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenServiceGroupForServiceResponseBody body;

    public static OpenServiceGroupForServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceGroupForServiceResponse self = new OpenServiceGroupForServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenServiceGroupForServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenServiceGroupForServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenServiceGroupForServiceResponse setBody(OpenServiceGroupForServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenServiceGroupForServiceResponseBody getBody() {
        return this.body;
    }

}
