// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutTenantstorageconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitLinkeBahamutTenantstorageconfigResponseBody body;

    public static InitLinkeBahamutTenantstorageconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutTenantstorageconfigResponse self = new InitLinkeBahamutTenantstorageconfigResponse();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutTenantstorageconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLinkeBahamutTenantstorageconfigResponse setBody(InitLinkeBahamutTenantstorageconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLinkeBahamutTenantstorageconfigResponseBody getBody() {
        return this.body;
    }

}
