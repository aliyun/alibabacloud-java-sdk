// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class FinishLinkelinkflowLinkflowTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FinishLinkelinkflowLinkflowTaskResponseBody body;

    public static FinishLinkelinkflowLinkflowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishLinkelinkflowLinkflowTaskResponse self = new FinishLinkelinkflowLinkflowTaskResponse();
        return TeaModel.build(map, self);
    }

    public FinishLinkelinkflowLinkflowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishLinkelinkflowLinkflowTaskResponse setBody(FinishLinkelinkflowLinkflowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishLinkelinkflowLinkflowTaskResponseBody getBody() {
        return this.body;
    }

}
