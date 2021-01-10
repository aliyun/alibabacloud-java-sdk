// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutIterationsdocreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutIterationsdocreateResponseBody body;

    public static CreateLinkeBahamutIterationsdocreateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutIterationsdocreateResponse self = new CreateLinkeBahamutIterationsdocreateResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutIterationsdocreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutIterationsdocreateResponse setBody(CreateLinkeBahamutIterationsdocreateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutIterationsdocreateResponseBody getBody() {
        return this.body;
    }

}
