// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktTemplateResponseBody body;

    public static GetLinkeLinktTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktTemplateResponse self = new GetLinkeLinktTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktTemplateResponse setBody(GetLinkeLinktTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktTemplateResponseBody getBody() {
        return this.body;
    }

}
