// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowTenantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowTenantsResponseBody body;

    public static GetLinkelinkflowLinkflowTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowTenantsResponse self = new GetLinkelinkflowLinkflowTenantsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowTenantsResponse setBody(GetLinkelinkflowLinkflowTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowTenantsResponseBody getBody() {
        return this.body;
    }

}
