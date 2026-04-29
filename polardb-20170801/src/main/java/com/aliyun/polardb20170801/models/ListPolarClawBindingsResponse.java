// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListPolarClawBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolarClawBindingsResponseBody body;

    public static ListPolarClawBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolarClawBindingsResponse self = new ListPolarClawBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListPolarClawBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolarClawBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolarClawBindingsResponse setBody(ListPolarClawBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolarClawBindingsResponseBody getBody() {
        return this.body;
    }

}
