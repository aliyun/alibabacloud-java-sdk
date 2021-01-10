// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktImporttemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktImporttemplateResponseBody body;

    public static CreateLinkeLinktImporttemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktImporttemplateResponse self = new CreateLinkeLinktImporttemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktImporttemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktImporttemplateResponse setBody(CreateLinkeLinktImporttemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktImporttemplateResponseBody getBody() {
        return this.body;
    }

}
