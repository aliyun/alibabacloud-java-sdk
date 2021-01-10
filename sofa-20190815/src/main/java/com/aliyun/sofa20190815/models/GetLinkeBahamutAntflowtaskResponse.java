// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAntflowtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAntflowtaskResponseBody body;

    public static GetLinkeBahamutAntflowtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAntflowtaskResponse self = new GetLinkeBahamutAntflowtaskResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAntflowtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAntflowtaskResponse setBody(GetLinkeBahamutAntflowtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAntflowtaskResponseBody getBody() {
        return this.body;
    }

}
