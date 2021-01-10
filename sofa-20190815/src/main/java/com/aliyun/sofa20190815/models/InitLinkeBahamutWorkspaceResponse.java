// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutWorkspaceResponseBody body;

    public static InitLinkeBahamutWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutWorkspaceResponse self = new InitLinkeBahamutWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutWorkspaceResponse setBody(InitLinkeBahamutWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutWorkspaceResponseBody getBody() {
        return this.body;
    }

}
