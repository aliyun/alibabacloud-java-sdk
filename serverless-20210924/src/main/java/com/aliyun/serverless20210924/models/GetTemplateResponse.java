// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class GetTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Template body;

    public static GetTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponse self = new GetTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateResponse setBody(Template body) {
        this.body = body;
        return this;
    }
    public Template getBody() {
        return this.body;
    }

}
