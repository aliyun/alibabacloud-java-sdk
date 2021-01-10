// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapitcdataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapitcdataResponseBody body;

    public static GetLinkeBahamutWebapitcdataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapitcdataResponse self = new GetLinkeBahamutWebapitcdataResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapitcdataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapitcdataResponse setBody(GetLinkeBahamutWebapitcdataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapitcdataResponseBody getBody() {
        return this.body;
    }

}
