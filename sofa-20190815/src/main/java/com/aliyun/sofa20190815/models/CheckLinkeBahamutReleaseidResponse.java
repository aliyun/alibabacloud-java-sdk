// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleaseidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutReleaseidResponseBody body;

    public static CheckLinkeBahamutReleaseidResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleaseidResponse self = new CheckLinkeBahamutReleaseidResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleaseidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutReleaseidResponse setBody(CheckLinkeBahamutReleaseidResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutReleaseidResponseBody getBody() {
        return this.body;
    }

}
