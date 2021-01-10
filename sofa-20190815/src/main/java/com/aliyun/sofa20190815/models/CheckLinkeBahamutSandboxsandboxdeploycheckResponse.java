// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutSandboxsandboxdeploycheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutSandboxsandboxdeploycheckResponseBody body;

    public static CheckLinkeBahamutSandboxsandboxdeploycheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutSandboxsandboxdeploycheckResponse self = new CheckLinkeBahamutSandboxsandboxdeploycheckResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutSandboxsandboxdeploycheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutSandboxsandboxdeploycheckResponse setBody(CheckLinkeBahamutSandboxsandboxdeploycheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutSandboxsandboxdeploycheckResponseBody getBody() {
        return this.body;
    }

}
