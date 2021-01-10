// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutAdmininitunitactivestageinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutAdmininitunitactivestageinfoResponseBody body;

    public static InitLinkeBahamutAdmininitunitactivestageinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutAdmininitunitactivestageinfoResponse self = new InitLinkeBahamutAdmininitunitactivestageinfoResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutAdmininitunitactivestageinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutAdmininitunitactivestageinfoResponse setBody(InitLinkeBahamutAdmininitunitactivestageinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutAdmininitunitactivestageinfoResponseBody getBody() {
        return this.body;
    }

}
