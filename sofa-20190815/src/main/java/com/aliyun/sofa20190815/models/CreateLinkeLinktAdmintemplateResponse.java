// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktAdmintemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktAdmintemplateResponseBody body;

    public static CreateLinkeLinktAdmintemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktAdmintemplateResponse self = new CreateLinkeLinktAdmintemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktAdmintemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktAdmintemplateResponse setBody(CreateLinkeLinktAdmintemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktAdmintemplateResponseBody getBody() {
        return this.body;
    }

}
