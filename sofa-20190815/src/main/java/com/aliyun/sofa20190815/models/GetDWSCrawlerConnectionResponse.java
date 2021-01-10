// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSCrawlerConnectionResponseBody body;

    public static GetDWSCrawlerConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerConnectionResponse self = new GetDWSCrawlerConnectionResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSCrawlerConnectionResponse setBody(GetDWSCrawlerConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSCrawlerConnectionResponseBody getBody() {
        return this.body;
    }

}
