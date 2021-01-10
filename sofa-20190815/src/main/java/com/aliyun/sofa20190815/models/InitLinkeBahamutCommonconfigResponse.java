// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutCommonconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutCommonconfigResponseBody body;

    public static InitLinkeBahamutCommonconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutCommonconfigResponse self = new InitLinkeBahamutCommonconfigResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutCommonconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutCommonconfigResponse setBody(InitLinkeBahamutCommonconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutCommonconfigResponseBody getBody() {
        return this.body;
    }

}
