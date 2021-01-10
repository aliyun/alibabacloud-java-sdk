// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetbyreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetbyreleaseResponseBody body;

    public static GetLinkeBahamutIterationgetbyreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetbyreleaseResponse self = new GetLinkeBahamutIterationgetbyreleaseResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetbyreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetbyreleaseResponse setBody(GetLinkeBahamutIterationgetbyreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetbyreleaseResponseBody getBody() {
        return this.body;
    }

}
