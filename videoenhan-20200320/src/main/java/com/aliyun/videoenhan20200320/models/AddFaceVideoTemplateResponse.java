// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceVideoTemplateResponseBody body;

    public static AddFaceVideoTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceVideoTemplateResponse self = new AddFaceVideoTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceVideoTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceVideoTemplateResponse setBody(AddFaceVideoTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceVideoTemplateResponseBody getBody() {
        return this.body;
    }

}
