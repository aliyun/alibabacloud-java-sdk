// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutStctaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutStctaskResponseBody body;

    public static CheckLinkeBahamutStctaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutStctaskResponse self = new CheckLinkeBahamutStctaskResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutStctaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutStctaskResponse setBody(CheckLinkeBahamutStctaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutStctaskResponseBody getBody() {
        return this.body;
    }

}
