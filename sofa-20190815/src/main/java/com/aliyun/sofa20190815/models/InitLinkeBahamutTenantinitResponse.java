// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutTenantinitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutTenantinitResponseBody body;

    public static InitLinkeBahamutTenantinitResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutTenantinitResponse self = new InitLinkeBahamutTenantinitResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutTenantinitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutTenantinitResponse setBody(InitLinkeBahamutTenantinitResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutTenantinitResponseBody getBody() {
        return this.body;
    }

}
