// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutHealthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutHealthResponseBody body;

    public static CheckLinkeBahamutHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutHealthResponse self = new CheckLinkeBahamutHealthResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutHealthResponse setBody(CheckLinkeBahamutHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutHealthResponseBody getBody() {
        return this.body;
    }

}
