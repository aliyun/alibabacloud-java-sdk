// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutAppsipaytemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutAppsipaytemplateResponseBody body;

    public static InitLinkeBahamutAppsipaytemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutAppsipaytemplateResponse self = new InitLinkeBahamutAppsipaytemplateResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutAppsipaytemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutAppsipaytemplateResponse setBody(InitLinkeBahamutAppsipaytemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutAppsipaytemplateResponseBody getBody() {
        return this.body;
    }

}
