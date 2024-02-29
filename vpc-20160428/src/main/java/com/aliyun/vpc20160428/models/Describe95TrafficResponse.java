// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class Describe95TrafficResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Describe95TrafficResponseBody body;

    public static Describe95TrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        Describe95TrafficResponse self = new Describe95TrafficResponse();
        return TeaModel.build(map, self);
    }

    public Describe95TrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Describe95TrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Describe95TrafficResponse setBody(Describe95TrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public Describe95TrafficResponseBody getBody() {
        return this.body;
    }

}
