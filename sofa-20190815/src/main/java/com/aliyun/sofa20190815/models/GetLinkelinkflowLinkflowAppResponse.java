// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowAppResponseBody body;

    public static GetLinkelinkflowLinkflowAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowAppResponse self = new GetLinkelinkflowLinkflowAppResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowAppResponse setBody(GetLinkelinkflowLinkflowAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowAppResponseBody getBody() {
        return this.body;
    }

}
