// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReplaceLinkelinkflowLinkflowTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceLinkelinkflowLinkflowTaskResponseBody body;

    public static ReplaceLinkelinkflowLinkflowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceLinkelinkflowLinkflowTaskResponse self = new ReplaceLinkelinkflowLinkflowTaskResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceLinkelinkflowLinkflowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceLinkelinkflowLinkflowTaskResponse setBody(ReplaceLinkelinkflowLinkflowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceLinkelinkflowLinkflowTaskResponseBody getBody() {
        return this.body;
    }

}
