// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerGroupResponseBody body;

    public static GetConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerGroupResponse self = new GetConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerGroupResponse setBody(GetConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
