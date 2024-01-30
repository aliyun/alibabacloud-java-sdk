// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeregisterResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeregisterResourceTypeResponseBody body;

    public static DeregisterResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterResourceTypeResponse self = new DeregisterResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeregisterResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeregisterResourceTypeResponse setBody(DeregisterResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterResourceTypeResponseBody getBody() {
        return this.body;
    }

}
