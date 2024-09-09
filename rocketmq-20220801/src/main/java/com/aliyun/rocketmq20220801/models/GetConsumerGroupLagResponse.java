// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupLagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerGroupLagResponseBody body;

    public static GetConsumerGroupLagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerGroupLagResponse self = new GetConsumerGroupLagResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerGroupLagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerGroupLagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerGroupLagResponse setBody(GetConsumerGroupLagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerGroupLagResponseBody getBody() {
        return this.body;
    }

}
