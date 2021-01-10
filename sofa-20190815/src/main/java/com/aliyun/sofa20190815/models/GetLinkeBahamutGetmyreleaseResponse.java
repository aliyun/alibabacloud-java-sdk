// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetmyreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutGetmyreleaseResponseBody body;

    public static GetLinkeBahamutGetmyreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetmyreleaseResponse self = new GetLinkeBahamutGetmyreleaseResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetmyreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutGetmyreleaseResponse setBody(GetLinkeBahamutGetmyreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutGetmyreleaseResponseBody getBody() {
        return this.body;
    }

}
