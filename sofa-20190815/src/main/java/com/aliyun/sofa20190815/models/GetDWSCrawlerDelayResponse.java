// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerDelayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSCrawlerDelayResponseBody body;

    public static GetDWSCrawlerDelayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerDelayResponse self = new GetDWSCrawlerDelayResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerDelayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSCrawlerDelayResponse setBody(GetDWSCrawlerDelayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSCrawlerDelayResponseBody getBody() {
        return this.body;
    }

}
