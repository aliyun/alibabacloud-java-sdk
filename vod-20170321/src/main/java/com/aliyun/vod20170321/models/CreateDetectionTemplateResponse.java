// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateDetectionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDetectionTemplateResponseBody body;

    public static CreateDetectionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectionTemplateResponse self = new CreateDetectionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateDetectionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDetectionTemplateResponse setBody(CreateDetectionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDetectionTemplateResponseBody getBody() {
        return this.body;
    }

}
