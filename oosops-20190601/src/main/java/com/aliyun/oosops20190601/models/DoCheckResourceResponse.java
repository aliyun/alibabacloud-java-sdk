// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DoCheckResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DoCheckResourceResponseBody body;

    public static DoCheckResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DoCheckResourceResponse self = new DoCheckResourceResponse();
        return TeaModel.build(map, self);
    }

    public DoCheckResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoCheckResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DoCheckResourceResponse setBody(DoCheckResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DoCheckResourceResponseBody getBody() {
        return this.body;
    }

}
