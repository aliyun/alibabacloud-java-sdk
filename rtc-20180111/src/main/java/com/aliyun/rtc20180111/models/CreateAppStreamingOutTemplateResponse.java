// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppStreamingOutTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppStreamingOutTemplateResponseBody body;

    public static CreateAppStreamingOutTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppStreamingOutTemplateResponse self = new CreateAppStreamingOutTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppStreamingOutTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppStreamingOutTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppStreamingOutTemplateResponse setBody(CreateAppStreamingOutTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppStreamingOutTemplateResponseBody getBody() {
        return this.body;
    }

}
