// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutIterationunitcodechangecheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutIterationunitcodechangecheckResponseBody body;

    public static CheckLinkeBahamutIterationunitcodechangecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutIterationunitcodechangecheckResponse self = new CheckLinkeBahamutIterationunitcodechangecheckResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutIterationunitcodechangecheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutIterationunitcodechangecheckResponse setBody(CheckLinkeBahamutIterationunitcodechangecheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutIterationunitcodechangecheckResponseBody getBody() {
        return this.body;
    }

}
