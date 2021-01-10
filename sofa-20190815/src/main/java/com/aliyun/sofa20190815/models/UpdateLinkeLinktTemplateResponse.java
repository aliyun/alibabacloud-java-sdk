// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktTemplateResponseBody body;

    public static UpdateLinkeLinktTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktTemplateResponse self = new UpdateLinkeLinktTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktTemplateResponse setBody(UpdateLinkeLinktTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktTemplateResponseBody getBody() {
        return this.body;
    }

}
