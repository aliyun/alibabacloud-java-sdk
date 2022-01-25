// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkFlowResponseBody body;

    public static GetWorkFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkFlowResponse self = new GetWorkFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkFlowResponse setBody(GetWorkFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkFlowResponseBody getBody() {
        return this.body;
    }

}
