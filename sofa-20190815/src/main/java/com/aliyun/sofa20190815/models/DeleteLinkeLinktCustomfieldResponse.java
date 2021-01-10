// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktCustomfieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktCustomfieldResponseBody body;

    public static DeleteLinkeLinktCustomfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktCustomfieldResponse self = new DeleteLinkeLinktCustomfieldResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktCustomfieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktCustomfieldResponse setBody(DeleteLinkeLinktCustomfieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktCustomfieldResponseBody getBody() {
        return this.body;
    }

}
