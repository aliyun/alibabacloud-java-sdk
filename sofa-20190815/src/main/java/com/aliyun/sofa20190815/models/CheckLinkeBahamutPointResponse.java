// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutPointResponseBody body;

    public static CheckLinkeBahamutPointResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutPointResponse self = new CheckLinkeBahamutPointResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutPointResponse setBody(CheckLinkeBahamutPointResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutPointResponseBody getBody() {
        return this.body;
    }

}
