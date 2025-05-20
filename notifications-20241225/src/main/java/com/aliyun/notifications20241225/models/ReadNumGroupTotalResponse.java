// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadNumGroupTotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadNumGroupTotalResponseBody body;

    public static ReadNumGroupTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadNumGroupTotalResponse self = new ReadNumGroupTotalResponse();
        return TeaModel.build(map, self);
    }

    public ReadNumGroupTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadNumGroupTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadNumGroupTotalResponse setBody(ReadNumGroupTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadNumGroupTotalResponseBody getBody() {
        return this.body;
    }

}
