// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowVariablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowVariablesResponseBody body;

    public static GetLinkelinkflowLinkflowVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowVariablesResponse self = new GetLinkelinkflowLinkflowVariablesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowVariablesResponse setBody(GetLinkelinkflowLinkflowVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowVariablesResponseBody getBody() {
        return this.body;
    }

}
