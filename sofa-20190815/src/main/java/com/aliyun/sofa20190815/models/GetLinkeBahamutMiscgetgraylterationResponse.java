// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetgraylterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutMiscgetgraylterationResponseBody body;

    public static GetLinkeBahamutMiscgetgraylterationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetgraylterationResponse self = new GetLinkeBahamutMiscgetgraylterationResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetgraylterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutMiscgetgraylterationResponse setBody(GetLinkeBahamutMiscgetgraylterationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutMiscgetgraylterationResponseBody getBody() {
        return this.body;
    }

}
