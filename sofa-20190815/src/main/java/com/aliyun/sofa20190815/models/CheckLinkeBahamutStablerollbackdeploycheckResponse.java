// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutStablerollbackdeploycheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody body;

    public static CheckLinkeBahamutStablerollbackdeploycheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutStablerollbackdeploycheckResponse self = new CheckLinkeBahamutStablerollbackdeploycheckResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponse setBody(CheckLinkeBahamutStablerollbackdeploycheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody getBody() {
        return this.body;
    }

}
