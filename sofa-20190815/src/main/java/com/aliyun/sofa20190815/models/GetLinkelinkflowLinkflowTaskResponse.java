// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowTaskResponseBody body;

    public static GetLinkelinkflowLinkflowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowTaskResponse self = new GetLinkelinkflowLinkflowTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowTaskResponse setBody(GetLinkelinkflowLinkflowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowTaskResponseBody getBody() {
        return this.body;
    }

}
