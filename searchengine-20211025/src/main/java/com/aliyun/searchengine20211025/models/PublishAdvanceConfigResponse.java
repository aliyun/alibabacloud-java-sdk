// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PublishAdvanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishAdvanceConfigResponseBody body;

    public static PublishAdvanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishAdvanceConfigResponse self = new PublishAdvanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public PublishAdvanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishAdvanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishAdvanceConfigResponse setBody(PublishAdvanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishAdvanceConfigResponseBody getBody() {
        return this.body;
    }

}
