// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutWebapistabledeploycheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutWebapistabledeploycheckResponseBody body;

    public static CheckLinkeBahamutWebapistabledeploycheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutWebapistabledeploycheckResponse self = new CheckLinkeBahamutWebapistabledeploycheckResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponse setBody(CheckLinkeBahamutWebapistabledeploycheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutWebapistabledeploycheckResponseBody getBody() {
        return this.body;
    }

}
