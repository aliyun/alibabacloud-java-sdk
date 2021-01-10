// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutFabricconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutFabricconfigResponseBody body;

    public static CheckLinkeBahamutFabricconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutFabricconfigResponse self = new CheckLinkeBahamutFabricconfigResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutFabricconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutFabricconfigResponse setBody(CheckLinkeBahamutFabricconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutFabricconfigResponseBody getBody() {
        return this.body;
    }

}
