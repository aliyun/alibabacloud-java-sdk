// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenFlowLogServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenFlowLogServiceResponseBody body;

    public static OpenFlowLogServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenFlowLogServiceResponse self = new OpenFlowLogServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenFlowLogServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenFlowLogServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenFlowLogServiceResponse setBody(OpenFlowLogServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenFlowLogServiceResponseBody getBody() {
        return this.body;
    }

}
