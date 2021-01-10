// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAuthurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAuthurlResponseBody body;

    public static GetLinkeBahamutAuthurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAuthurlResponse self = new GetLinkeBahamutAuthurlResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAuthurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAuthurlResponse setBody(GetLinkeBahamutAuthurlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAuthurlResponseBody getBody() {
        return this.body;
    }

}
