// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerTpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSCrawlerTpsResponseBody body;

    public static GetDWSCrawlerTpsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerTpsResponse self = new GetDWSCrawlerTpsResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerTpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSCrawlerTpsResponse setBody(GetDWSCrawlerTpsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSCrawlerTpsResponseBody getBody() {
        return this.body;
    }

}
