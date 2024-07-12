// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetUserExecutionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserExecutionTemplateResponseBody body;

    public static GetUserExecutionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserExecutionTemplateResponse self = new GetUserExecutionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetUserExecutionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserExecutionTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserExecutionTemplateResponse setBody(GetUserExecutionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserExecutionTemplateResponseBody getBody() {
        return this.body;
    }

}
