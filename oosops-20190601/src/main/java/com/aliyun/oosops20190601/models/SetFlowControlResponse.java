// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class SetFlowControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetFlowControlResponseBody body;

    public static SetFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        SetFlowControlResponse self = new SetFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public SetFlowControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetFlowControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetFlowControlResponse setBody(SetFlowControlResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFlowControlResponseBody getBody() {
        return this.body;
    }

}
