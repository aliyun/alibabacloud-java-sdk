// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLinkeBahamutSubmitreleasebyenvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushLinkeBahamutSubmitreleasebyenvResponseBody body;

    public static PushLinkeBahamutSubmitreleasebyenvResponse build(java.util.Map<String, ?> map) throws Exception {
        PushLinkeBahamutSubmitreleasebyenvResponse self = new PushLinkeBahamutSubmitreleasebyenvResponse();
        return TeaModel.build(map, self);
    }

    public PushLinkeBahamutSubmitreleasebyenvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushLinkeBahamutSubmitreleasebyenvResponse setBody(PushLinkeBahamutSubmitreleasebyenvResponseBody body) {
        this.body = body;
        return this;
    }
    public PushLinkeBahamutSubmitreleasebyenvResponseBody getBody() {
        return this.body;
    }

}
