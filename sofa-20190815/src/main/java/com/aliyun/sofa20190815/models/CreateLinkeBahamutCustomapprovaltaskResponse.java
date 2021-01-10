// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCustomapprovaltaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutCustomapprovaltaskResponseBody body;

    public static CreateLinkeBahamutCustomapprovaltaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCustomapprovaltaskResponse self = new CreateLinkeBahamutCustomapprovaltaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCustomapprovaltaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutCustomapprovaltaskResponse setBody(CreateLinkeBahamutCustomapprovaltaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutCustomapprovaltaskResponseBody getBody() {
        return this.body;
    }

}
