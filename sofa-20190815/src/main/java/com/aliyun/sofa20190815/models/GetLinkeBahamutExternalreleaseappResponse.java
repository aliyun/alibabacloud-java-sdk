// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutExternalreleaseappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutExternalreleaseappResponseBody body;

    public static GetLinkeBahamutExternalreleaseappResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutExternalreleaseappResponse self = new GetLinkeBahamutExternalreleaseappResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutExternalreleaseappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutExternalreleaseappResponse setBody(GetLinkeBahamutExternalreleaseappResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutExternalreleaseappResponseBody getBody() {
        return this.body;
    }

}
