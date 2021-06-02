// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class LinkImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public LinkImageResponse setBody(LinkImageResponseBody body) {
        this.body = body;
        return this;
    }
    public LinkImageResponseBody getBody() {
        return this.body;
    }

}
