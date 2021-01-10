// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaluncloseddefectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody body;

    public static GetLinkeBahamutAoneinternaluncloseddefectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaluncloseddefectsResponse self = new GetLinkeBahamutAoneinternaluncloseddefectsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponse setBody(GetLinkeBahamutAoneinternaluncloseddefectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody getBody() {
        return this.body;
    }

}
