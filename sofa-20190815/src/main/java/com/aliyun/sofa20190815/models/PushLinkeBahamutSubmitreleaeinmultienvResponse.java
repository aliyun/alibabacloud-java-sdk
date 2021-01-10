// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLinkeBahamutSubmitreleaeinmultienvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody body;

    public static PushLinkeBahamutSubmitreleaeinmultienvResponse build(java.util.Map<String, ?> map) throws Exception {
        PushLinkeBahamutSubmitreleaeinmultienvResponse self = new PushLinkeBahamutSubmitreleaeinmultienvResponse();
        return TeaModel.build(map, self);
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponse setBody(PushLinkeBahamutSubmitreleaeinmultienvResponseBody body) {
        this.body = body;
        return this;
    }
    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody getBody() {
        return this.body;
    }

}
