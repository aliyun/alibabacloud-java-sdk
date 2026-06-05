// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppTemplateResponseBody body;

    public static GetAppTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppTemplateResponse self = new GetAppTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAppTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppTemplateResponse setBody(GetAppTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppTemplateResponseBody getBody() {
        return this.body;
    }

}
