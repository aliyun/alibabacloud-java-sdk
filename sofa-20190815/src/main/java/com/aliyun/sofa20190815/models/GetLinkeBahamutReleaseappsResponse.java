// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleaseappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutReleaseappsResponseBody body;

    public static GetLinkeBahamutReleaseappsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleaseappsResponse self = new GetLinkeBahamutReleaseappsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleaseappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutReleaseappsResponse setBody(GetLinkeBahamutReleaseappsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutReleaseappsResponseBody getBody() {
        return this.body;
    }

}
