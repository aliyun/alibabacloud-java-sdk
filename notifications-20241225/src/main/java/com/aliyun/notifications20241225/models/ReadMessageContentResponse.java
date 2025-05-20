// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadMessageContentResponseBody body;

    public static ReadMessageContentResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageContentResponse self = new ReadMessageContentResponse();
        return TeaModel.build(map, self);
    }

    public ReadMessageContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadMessageContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadMessageContentResponse setBody(ReadMessageContentResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadMessageContentResponseBody getBody() {
        return this.body;
    }

}
