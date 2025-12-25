// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LinkImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LinkImageResponseBody body;

    public static LinkImageResponse build(java.util.Map<String, ?> map) throws Exception {
        LinkImageResponse self = new LinkImageResponse();
        return TeaModel.build(map, self);
    }

    public LinkImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LinkImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LinkImageResponse setBody(LinkImageResponseBody body) {
        this.body = body;
        return this;
    }
    public LinkImageResponseBody getBody() {
        return this.body;
    }

}
