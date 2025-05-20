// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadNumGroupByClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadNumGroupByClassResponseBody body;

    public static ReadNumGroupByClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadNumGroupByClassResponse self = new ReadNumGroupByClassResponse();
        return TeaModel.build(map, self);
    }

    public ReadNumGroupByClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadNumGroupByClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadNumGroupByClassResponse setBody(ReadNumGroupByClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadNumGroupByClassResponseBody getBody() {
        return this.body;
    }

}
