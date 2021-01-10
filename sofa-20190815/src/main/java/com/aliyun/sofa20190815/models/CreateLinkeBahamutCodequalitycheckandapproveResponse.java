// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCodequalitycheckandapproveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutCodequalitycheckandapproveResponseBody body;

    public static CreateLinkeBahamutCodequalitycheckandapproveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCodequalitycheckandapproveResponse self = new CreateLinkeBahamutCodequalitycheckandapproveResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCodequalitycheckandapproveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutCodequalitycheckandapproveResponse setBody(CreateLinkeBahamutCodequalitycheckandapproveResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutCodequalitycheckandapproveResponseBody getBody() {
        return this.body;
    }

}
