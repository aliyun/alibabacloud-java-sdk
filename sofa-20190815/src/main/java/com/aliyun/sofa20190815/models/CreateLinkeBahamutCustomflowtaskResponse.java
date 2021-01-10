// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCustomflowtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutCustomflowtaskResponseBody body;

    public static CreateLinkeBahamutCustomflowtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCustomflowtaskResponse self = new CreateLinkeBahamutCustomflowtaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCustomflowtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutCustomflowtaskResponse setBody(CreateLinkeBahamutCustomflowtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutCustomflowtaskResponseBody getBody() {
        return this.body;
    }

}
