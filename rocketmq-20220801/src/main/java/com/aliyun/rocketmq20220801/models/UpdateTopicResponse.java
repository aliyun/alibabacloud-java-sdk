// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTopicResponseBody body;

    public static UpdateTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicResponse self = new UpdateTopicResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTopicResponse setBody(UpdateTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTopicResponseBody getBody() {
        return this.body;
    }

}
