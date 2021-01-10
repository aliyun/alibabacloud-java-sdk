// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowStartformmodelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowStartformmodelResponseBody body;

    public static GetLinkelinkflowLinkflowStartformmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowStartformmodelResponse self = new GetLinkelinkflowLinkflowStartformmodelResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowStartformmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowStartformmodelResponse setBody(GetLinkelinkflowLinkflowStartformmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowStartformmodelResponseBody getBody() {
        return this.body;
    }

}
