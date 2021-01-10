// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutReleaseResponseBody body;

    public static CreateLinkeBahamutReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutReleaseResponse self = new CreateLinkeBahamutReleaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutReleaseResponse setBody(CreateLinkeBahamutReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutReleaseResponseBody getBody() {
        return this.body;
    }

}
