// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessmodelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowProcessmodelResponseBody body;

    public static GetLinkelinkflowLinkflowProcessmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessmodelResponse self = new GetLinkelinkflowLinkflowProcessmodelResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponse setBody(GetLinkelinkflowLinkflowProcessmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowProcessmodelResponseBody getBody() {
        return this.body;
    }

}
