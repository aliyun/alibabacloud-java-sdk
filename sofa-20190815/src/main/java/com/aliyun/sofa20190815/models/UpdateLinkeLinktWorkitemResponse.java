// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktWorkitemResponseBody body;

    public static UpdateLinkeLinktWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktWorkitemResponse self = new UpdateLinkeLinktWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktWorkitemResponse setBody(UpdateLinkeLinktWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktWorkitemResponseBody getBody() {
        return this.body;
    }

}
