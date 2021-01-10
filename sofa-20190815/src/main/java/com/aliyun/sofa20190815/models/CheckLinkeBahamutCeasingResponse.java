// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutCeasingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutCeasingResponseBody body;

    public static CheckLinkeBahamutCeasingResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutCeasingResponse self = new CheckLinkeBahamutCeasingResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutCeasingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutCeasingResponse setBody(CheckLinkeBahamutCeasingResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutCeasingResponseBody getBody() {
        return this.body;
    }

}
