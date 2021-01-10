// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutIpaytemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutIpaytemplateResponseBody body;

    public static InitLinkeBahamutIpaytemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutIpaytemplateResponse self = new InitLinkeBahamutIpaytemplateResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutIpaytemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutIpaytemplateResponse setBody(InitLinkeBahamutIpaytemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutIpaytemplateResponseBody getBody() {
        return this.body;
    }

}
