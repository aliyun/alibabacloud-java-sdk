// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleasebyexternalidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutReleasebyexternalidResponseBody body;

    public static GetLinkeBahamutReleasebyexternalidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleasebyexternalidResponse self = new GetLinkeBahamutReleasebyexternalidResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleasebyexternalidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutReleasebyexternalidResponse setBody(GetLinkeBahamutReleasebyexternalidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutReleasebyexternalidResponseBody getBody() {
        return this.body;
    }

}
