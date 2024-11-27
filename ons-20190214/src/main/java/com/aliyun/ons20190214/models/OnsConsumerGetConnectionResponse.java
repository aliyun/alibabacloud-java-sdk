// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerGetConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnsConsumerGetConnectionResponseBody body;

    public static OnsConsumerGetConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerGetConnectionResponse self = new OnsConsumerGetConnectionResponse();
        return TeaModel.build(map, self);
    }

    public OnsConsumerGetConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsConsumerGetConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsConsumerGetConnectionResponse setBody(OnsConsumerGetConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsConsumerGetConnectionResponseBody getBody() {
        return this.body;
    }

}
