// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAITemplateResponseBody body;

    public static AddAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAITemplateResponse self = new AddAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAITemplateResponse setBody(AddAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAITemplateResponseBody getBody() {
        return this.body;
    }

}
