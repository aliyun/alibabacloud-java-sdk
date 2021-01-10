// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutWriteflagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutWriteflagResponseBody body;

    public static SetLinkeBahamutWriteflagResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutWriteflagResponse self = new SetLinkeBahamutWriteflagResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutWriteflagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutWriteflagResponse setBody(SetLinkeBahamutWriteflagResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutWriteflagResponseBody getBody() {
        return this.body;
    }

}
