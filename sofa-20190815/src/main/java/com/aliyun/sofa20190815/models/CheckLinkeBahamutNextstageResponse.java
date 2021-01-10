// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutNextstageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutNextstageResponseBody body;

    public static CheckLinkeBahamutNextstageResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutNextstageResponse self = new CheckLinkeBahamutNextstageResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutNextstageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutNextstageResponse setBody(CheckLinkeBahamutNextstageResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutNextstageResponseBody getBody() {
        return this.body;
    }

}
