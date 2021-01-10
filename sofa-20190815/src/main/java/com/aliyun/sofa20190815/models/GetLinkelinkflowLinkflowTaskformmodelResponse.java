// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowTaskformmodelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowTaskformmodelResponseBody body;

    public static GetLinkelinkflowLinkflowTaskformmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowTaskformmodelResponse self = new GetLinkelinkflowLinkflowTaskformmodelResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowTaskformmodelResponse setBody(GetLinkelinkflowLinkflowTaskformmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowTaskformmodelResponseBody getBody() {
        return this.body;
    }

}
