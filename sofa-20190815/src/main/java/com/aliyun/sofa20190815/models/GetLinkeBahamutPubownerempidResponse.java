// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPubownerempidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPubownerempidResponseBody body;

    public static GetLinkeBahamutPubownerempidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPubownerempidResponse self = new GetLinkeBahamutPubownerempidResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPubownerempidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPubownerempidResponse setBody(GetLinkeBahamutPubownerempidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPubownerempidResponseBody getBody() {
        return this.body;
    }

}
