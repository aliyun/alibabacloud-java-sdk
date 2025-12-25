// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishStatusResponseBody body;

    public static PublishStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishStatusResponse self = new PublishStatusResponse();
        return TeaModel.build(map, self);
    }

    public PublishStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishStatusResponse setBody(PublishStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishStatusResponseBody getBody() {
        return this.body;
    }

}
