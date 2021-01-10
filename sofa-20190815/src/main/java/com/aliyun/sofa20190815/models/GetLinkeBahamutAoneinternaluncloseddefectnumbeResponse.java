// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody body;

    public static GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse self = new GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponse setBody(GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody getBody() {
        return this.body;
    }

}
