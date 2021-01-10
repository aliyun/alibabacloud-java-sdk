// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTaskbykeywordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutTaskbykeywordResponseBody body;

    public static GetLinkeBahamutTaskbykeywordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTaskbykeywordResponse self = new GetLinkeBahamutTaskbykeywordResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTaskbykeywordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutTaskbykeywordResponse setBody(GetLinkeBahamutTaskbykeywordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutTaskbykeywordResponseBody getBody() {
        return this.body;
    }

}
