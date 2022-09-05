// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTemplateViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTemplateViewResponseBody body;

    public static GetTemplateViewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateViewResponse self = new GetTemplateViewResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateViewResponse setBody(GetTemplateViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateViewResponseBody getBody() {
        return this.body;
    }

}
