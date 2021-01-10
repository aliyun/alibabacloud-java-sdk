// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigeturlsignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigeturlsignResponseBody body;

    public static GetLinkeBahamutWebapigeturlsignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigeturlsignResponse self = new GetLinkeBahamutWebapigeturlsignResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigeturlsignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigeturlsignResponse setBody(GetLinkeBahamutWebapigeturlsignResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigeturlsignResponseBody getBody() {
        return this.body;
    }

}
