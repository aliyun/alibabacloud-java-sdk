// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutIterationunitnextstagecheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody body;

    public static CheckLinkeBahamutIterationunitnextstagecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutIterationunitnextstagecheckResponse self = new CheckLinkeBahamutIterationunitnextstagecheckResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckResponse setBody(CheckLinkeBahamutIterationunitnextstagecheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutIterationunitnextstagecheckResponseBody getBody() {
        return this.body;
    }

}
