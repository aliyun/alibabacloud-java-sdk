// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutCodechangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutCodechangeResponseBody body;

    public static CheckLinkeBahamutCodechangeResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutCodechangeResponse self = new CheckLinkeBahamutCodechangeResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutCodechangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutCodechangeResponse setBody(CheckLinkeBahamutCodechangeResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutCodechangeResponseBody getBody() {
        return this.body;
    }

}
