// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAITemplateResponseBody body;

    public static GetAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAITemplateResponse self = new GetAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAITemplateResponse setBody(GetAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAITemplateResponseBody getBody() {
        return this.body;
    }

}
