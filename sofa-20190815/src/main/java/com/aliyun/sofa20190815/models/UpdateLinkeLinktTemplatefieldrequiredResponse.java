// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktTemplatefieldrequiredResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktTemplatefieldrequiredResponseBody body;

    public static UpdateLinkeLinktTemplatefieldrequiredResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktTemplatefieldrequiredResponse self = new UpdateLinkeLinktTemplatefieldrequiredResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktTemplatefieldrequiredResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktTemplatefieldrequiredResponse setBody(UpdateLinkeLinktTemplatefieldrequiredResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktTemplatefieldrequiredResponseBody getBody() {
        return this.body;
    }

}
