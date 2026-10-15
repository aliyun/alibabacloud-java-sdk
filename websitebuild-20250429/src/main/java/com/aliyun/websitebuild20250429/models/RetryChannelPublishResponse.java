// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RetryChannelPublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryChannelPublishResponseBody body;

    public static RetryChannelPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryChannelPublishResponse self = new RetryChannelPublishResponse();
        return TeaModel.build(map, self);
    }

    public RetryChannelPublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryChannelPublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryChannelPublishResponse setBody(RetryChannelPublishResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryChannelPublishResponseBody getBody() {
        return this.body;
    }

}
