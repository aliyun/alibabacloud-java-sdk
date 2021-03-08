// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDefaultAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDefaultAITemplateResponseBody body;

    public static GetDefaultAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAITemplateResponse self = new GetDefaultAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultAITemplateResponse setBody(GetDefaultAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultAITemplateResponseBody getBody() {
        return this.body;
    }

}
