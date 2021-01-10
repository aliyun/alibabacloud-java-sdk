// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktCustomfieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktCustomfieldResponseBody body;

    public static UpdateLinkeLinktCustomfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktCustomfieldResponse self = new UpdateLinkeLinktCustomfieldResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktCustomfieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktCustomfieldResponse setBody(UpdateLinkeLinktCustomfieldResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktCustomfieldResponseBody getBody() {
        return this.body;
    }

}
