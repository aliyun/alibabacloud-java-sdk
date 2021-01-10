// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktAdmincustomfieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktAdmincustomfieldResponseBody body;

    public static DeleteLinkeLinktAdmincustomfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktAdmincustomfieldResponse self = new DeleteLinkeLinktAdmincustomfieldResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktAdmincustomfieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktAdmincustomfieldResponse setBody(DeleteLinkeLinktAdmincustomfieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktAdmincustomfieldResponseBody getBody() {
        return this.body;
    }

}
