// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktAdmincustomfieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktAdmincustomfieldResponseBody body;

    public static UpdateLinkeLinktAdmincustomfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktAdmincustomfieldResponse self = new UpdateLinkeLinktAdmincustomfieldResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktAdmincustomfieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktAdmincustomfieldResponse setBody(UpdateLinkeLinktAdmincustomfieldResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktAdmincustomfieldResponseBody getBody() {
        return this.body;
    }

}
