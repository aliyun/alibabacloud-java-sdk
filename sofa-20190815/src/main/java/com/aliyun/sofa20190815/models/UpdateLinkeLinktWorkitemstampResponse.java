// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktWorkitemstampResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktWorkitemstampResponseBody body;

    public static UpdateLinkeLinktWorkitemstampResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktWorkitemstampResponse self = new UpdateLinkeLinktWorkitemstampResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktWorkitemstampResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktWorkitemstampResponse setBody(UpdateLinkeLinktWorkitemstampResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktWorkitemstampResponseBody getBody() {
        return this.body;
    }

}
