// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowProcessResponseBody body;

    public static GetLinkelinkflowLinkflowProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessResponse self = new GetLinkelinkflowLinkflowProcessResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowProcessResponse setBody(GetLinkelinkflowLinkflowProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowProcessResponseBody getBody() {
        return this.body;
    }

}
