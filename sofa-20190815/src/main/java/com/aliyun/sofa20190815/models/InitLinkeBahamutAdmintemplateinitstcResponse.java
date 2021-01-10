// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutAdmintemplateinitstcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutAdmintemplateinitstcResponseBody body;

    public static InitLinkeBahamutAdmintemplateinitstcResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutAdmintemplateinitstcResponse self = new InitLinkeBahamutAdmintemplateinitstcResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutAdmintemplateinitstcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutAdmintemplateinitstcResponse setBody(InitLinkeBahamutAdmintemplateinitstcResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutAdmintemplateinitstcResponseBody getBody() {
        return this.body;
    }

}
