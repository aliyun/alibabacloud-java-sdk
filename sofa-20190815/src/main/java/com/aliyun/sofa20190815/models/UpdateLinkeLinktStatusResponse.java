// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktStatusResponseBody body;

    public static UpdateLinkeLinktStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktStatusResponse self = new UpdateLinkeLinktStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktStatusResponse setBody(UpdateLinkeLinktStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktStatusResponseBody getBody() {
        return this.body;
    }

}
