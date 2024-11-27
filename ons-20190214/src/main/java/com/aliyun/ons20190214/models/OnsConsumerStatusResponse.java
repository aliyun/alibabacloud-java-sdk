// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnsConsumerStatusResponseBody body;

    public static OnsConsumerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerStatusResponse self = new OnsConsumerStatusResponse();
        return TeaModel.build(map, self);
    }

    public OnsConsumerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsConsumerStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsConsumerStatusResponse setBody(OnsConsumerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsConsumerStatusResponseBody getBody() {
        return this.body;
    }

}
