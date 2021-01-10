// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktWorkflowResponseBody body;

    public static GetLinkeLinktWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktWorkflowResponse self = new GetLinkeLinktWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktWorkflowResponse setBody(GetLinkeLinktWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktWorkflowResponseBody getBody() {
        return this.body;
    }

}
