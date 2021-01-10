// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetlogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigetlogsResponseBody body;

    public static GetLinkeBahamutWebapigetlogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetlogsResponse self = new GetLinkeBahamutWebapigetlogsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetlogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigetlogsResponse setBody(GetLinkeBahamutWebapigetlogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigetlogsResponseBody getBody() {
        return this.body;
    }

}
