// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMicroServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MicroServicePageResult body;

    public static ListMicroServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMicroServiceResponse self = new ListMicroServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListMicroServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMicroServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMicroServiceResponse setBody(MicroServicePageResult body) {
        this.body = body;
        return this;
    }
    public MicroServicePageResult getBody() {
        return this.body;
    }

}
