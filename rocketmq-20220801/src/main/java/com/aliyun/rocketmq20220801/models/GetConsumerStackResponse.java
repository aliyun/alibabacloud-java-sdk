// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerStackResponseBody body;

    public static GetConsumerStackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerStackResponse self = new GetConsumerStackResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerStackResponse setBody(GetConsumerStackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerStackResponseBody getBody() {
        return this.body;
    }

}
