// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTopicResponseBody body;

    public static GetTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicResponse self = new GetTopicResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTopicResponse setBody(GetTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicResponseBody getBody() {
        return this.body;
    }

}
