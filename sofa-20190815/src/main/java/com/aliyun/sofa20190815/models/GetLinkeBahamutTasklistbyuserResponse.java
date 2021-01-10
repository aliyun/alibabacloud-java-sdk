// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTasklistbyuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutTasklistbyuserResponseBody body;

    public static GetLinkeBahamutTasklistbyuserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTasklistbyuserResponse self = new GetLinkeBahamutTasklistbyuserResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTasklistbyuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutTasklistbyuserResponse setBody(GetLinkeBahamutTasklistbyuserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutTasklistbyuserResponseBody getBody() {
        return this.body;
    }

}
