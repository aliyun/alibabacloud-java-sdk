// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobTemplateResponseBody body;

    public static GetJobTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobTemplateResponse self = new GetJobTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetJobTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobTemplateResponse setBody(GetJobTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobTemplateResponseBody getBody() {
        return this.body;
    }

}
