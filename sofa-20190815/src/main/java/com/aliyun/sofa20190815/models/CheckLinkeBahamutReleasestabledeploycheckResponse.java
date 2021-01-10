// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleasestabledeploycheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutReleasestabledeploycheckResponseBody body;

    public static CheckLinkeBahamutReleasestabledeploycheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleasestabledeploycheckResponse self = new CheckLinkeBahamutReleasestabledeploycheckResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponse setBody(CheckLinkeBahamutReleasestabledeploycheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutReleasestabledeploycheckResponseBody getBody() {
        return this.body;
    }

}
