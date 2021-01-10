// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleaselinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutReleaselinkResponseBody body;

    public static GetLinkeBahamutReleaselinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleaselinkResponse self = new GetLinkeBahamutReleaselinkResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleaselinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutReleaselinkResponse setBody(GetLinkeBahamutReleaselinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutReleaselinkResponseBody getBody() {
        return this.body;
    }

}
