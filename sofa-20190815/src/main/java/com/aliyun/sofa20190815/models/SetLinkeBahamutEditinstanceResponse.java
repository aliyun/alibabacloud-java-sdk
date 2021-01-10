// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutEditinstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutEditinstanceResponseBody body;

    public static SetLinkeBahamutEditinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutEditinstanceResponse self = new SetLinkeBahamutEditinstanceResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutEditinstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutEditinstanceResponse setBody(SetLinkeBahamutEditinstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutEditinstanceResponseBody getBody() {
        return this.body;
    }

}
