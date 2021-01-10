// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class FinishLinkeBahamutTenantinitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FinishLinkeBahamutTenantinitResponseBody body;

    public static FinishLinkeBahamutTenantinitResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishLinkeBahamutTenantinitResponse self = new FinishLinkeBahamutTenantinitResponse();
        return TeaModel.build(map, self);
    }

    public FinishLinkeBahamutTenantinitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishLinkeBahamutTenantinitResponse setBody(FinishLinkeBahamutTenantinitResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishLinkeBahamutTenantinitResponseBody getBody() {
        return this.body;
    }

}
